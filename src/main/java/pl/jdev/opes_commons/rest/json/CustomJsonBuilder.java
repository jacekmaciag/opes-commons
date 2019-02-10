package pl.jdev.opes_commons.rest.json;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomJsonBuilder {
    private ObjectMapper mapper;
    private List<Class> views;
    private Map<String, Object> extraAttributes;

    public CustomJsonBuilder(ObjectMapper mapper) {
        this.mapper = mapper;
        this.views = new ArrayList<>();
        this.extraAttributes = new HashMap<>();
    }

    public CustomJsonBuilder includeView(Class view) {
        mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, false);
        views.add(view);
        return this;
    }

    public CustomJsonBuilder add(String attribure, Object withValue) {
        return replace(attribure, withValue);
    }

    public CustomJsonBuilder replace(String attribute, Object withValue) {
//        mapper.configure(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS, true);
//        mapper.configure(MapperFeature.INFER_PROPERTY_MUTATORS, true);
        extraAttributes.put(attribute, withValue);
        extraAttributes.put("test", "Test");
        return this;
    }

    public String buildForObject(Object object) throws IOException {
        System.out.println(views.toArray());
        System.out.println(extraAttributes.toString());
        System.out.println(mapper.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION));
        ObjectWriter writer = mapper.writerFor(object.getClass());
        for (Class view : views) {
            writer = writer.withView(view);
        }

        String json = writer.writeValueAsString(object);
        System.out.println(json);

        JsonFactory jFactory = new JsonFactory();
        StringWriter wr = new StringWriter();
        JsonGenerator gen = jFactory.createGenerator(wr);
        gen.writeStartObject();

        JsonParser parser = jFactory.createParser(json);
        JsonToken currToken = null;
        currToken = parser.nextToken();
        System.out.println("currToken: " + currToken);

        while (parser.nextToken() != JsonToken.END_OBJECT) {
            currToken = parser.currentToken();
            System.out.println("currToken: " + currToken);
            String currFieldName = parser.currentName();
            System.out.println("currField: " + currFieldName);

            if (currToken == JsonToken.FIELD_NAME && extraAttributes.keySet().contains(currFieldName)) {
                System.out.println("add repl");
                gen.writeStringField(currFieldName, extraAttributes.get(currFieldName).toString());
                extraAttributes.remove(currFieldName);
            } else if (currToken == JsonToken.VALUE_NUMBER_FLOAT) {
                System.out.println("add foatl");
                gen.writeNumberField(currFieldName, parser.getFloatValue());
            } else if (currToken == JsonToken.VALUE_NUMBER_INT) {
                System.out.println("add int");
                gen.writeNumberField(currFieldName, parser.getIntValue());
            } else if (currToken == JsonToken.VALUE_TRUE) {
                System.out.println("add true");
                gen.writeBooleanField(currFieldName, true);
            } else if (currToken == JsonToken.VALUE_FALSE) {
                System.out.println("add false");
                gen.writeBooleanField(currFieldName, false);
            } else if (currToken == JsonToken.VALUE_STRING) {
                gen.writeStringField(currFieldName, parser.getValueAsString());
            } else if (currToken == JsonToken.VALUE_NULL) {
                System.out.println("add null");
                gen.writeNullField(currFieldName);
            } else if (!currToken.isScalarValue()) {
                System.out.println("add nonscal");
                gen.copyCurrentStructure(parser);
            }
//            else if (currToken == JsonToken.START_OBJECT) {
//                gen.writeObjectFieldStart(currFieldName);
//            } else if (currToken == JsonToken.END_OBJECT) {
//                gen.writeEndObject();
//            }
            System.out.println("---\n" + wr.toString());
        }
        extraAttributes.forEach((attr, val) -> {
            try {
                gen.writeStringField(attr, val.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        gen.close();
        wr.close();
        String value = wr.toString();
        System.out.println(value);
        return value;
    }
}