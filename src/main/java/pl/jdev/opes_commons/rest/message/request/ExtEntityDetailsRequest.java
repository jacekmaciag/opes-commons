package pl.jdev.opes_commons.rest.message.request;

import org.springframework.messaging.MessageHeaders;

import java.util.Map;

public class ExtEntityDetailsRequest extends Request<String> {
    public ExtEntityDetailsRequest(String extId) {
        super(extId);
    }

    public ExtEntityDetailsRequest(String extId, Map headers) {
        super(extId, headers);
    }

    public ExtEntityDetailsRequest(String extId, MessageHeaders headers) {
        super(extId, headers);
    }
}
