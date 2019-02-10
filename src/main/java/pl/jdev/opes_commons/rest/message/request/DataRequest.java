package pl.jdev.opes_commons.rest.message.request;

import org.springframework.messaging.MessageHeaders;

import java.util.Map;

public abstract class DataRequest<T> extends Request<T> {
    public DataRequest(T payload) {
        super(payload);
    }

    public DataRequest(T payload, Map headers) {
        super(payload, headers);
    }

    public DataRequest(T payload, MessageHeaders headers) {
        super(payload, headers);
    }
}
