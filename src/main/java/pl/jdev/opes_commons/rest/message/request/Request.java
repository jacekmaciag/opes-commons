package pl.jdev.opes_commons.rest.message.request;

import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.GenericMessage;

import java.util.Map;

public abstract class Request<T> extends GenericMessage {
    public Request(T payload) {
        super(payload);
    }

    public Request(T payload, Map headers) {
        super(payload, headers);
    }

    public Request(T payload, MessageHeaders headers) {
        super(payload, headers);
    }
}