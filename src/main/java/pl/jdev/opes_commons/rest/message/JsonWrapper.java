package pl.jdev.opes_commons.rest.message;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonWrapper {
    public static Map<String, Object> wrap(Object object) {
        Map<String, Object> map = new HashMap<>();
        Class objectClass = object.getClass();
        String key = objectClass.getSimpleName().toLowerCase();
        if (objectClass.isInstance(Collection.class) ||
                objectClass.isInstance(List.class)) {
            System.out.println("boop");

            key = objectClass.getTypeParameters()[0].getTypeName() + "s";
        } else if (objectClass.isInstance(Map.class)) {
            System.out.println("boop");
            key = objectClass.getTypeParameters()[1].getTypeName() + "s";
        }
        map.put(key, object);
        return map;
    }
}