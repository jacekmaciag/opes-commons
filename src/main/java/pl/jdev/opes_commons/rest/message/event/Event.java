package pl.jdev.opes_commons.rest.message.event;

import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.GenericMessage;

import java.util.Map;

public abstract class Event<T> extends GenericMessage {
    public Event(T payload) {
        super(payload);
    }

    public Event(T payload, Map headers) {
        super(payload, headers);
    }

    public Event(T payload, MessageHeaders headers) {
        super(payload, headers);
    }
}
