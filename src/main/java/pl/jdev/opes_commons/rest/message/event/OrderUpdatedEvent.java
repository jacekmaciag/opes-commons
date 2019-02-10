package pl.jdev.opes_commons.rest.message.event;

import org.springframework.messaging.MessageHeaders;
import pl.jdev.opes_commons.domain.order.Order;

import java.util.Map;

public class OrderUpdatedEvent extends Event<Order> {

    public OrderUpdatedEvent(Order payload) {
        super(payload);
    }

    public OrderUpdatedEvent(Order payload, Map headers) {
        super(payload, headers);
    }

    public OrderUpdatedEvent(Order payload, MessageHeaders headers) {
        super(payload, headers);
    }
}
