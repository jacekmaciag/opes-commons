package pl.jdev.opes_commons.rest.message.event;

import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.GenericMessage;

import java.util.Map;

abstract class Event<T> extends GenericMessage {
    Event(T payload) {
        super(payload);
    }

    Event(T payload, Map headers) {
        super(payload, headers);
    }

    Event(T payload, MessageHeaders headers) {
        super(payload, headers);
    }
}
