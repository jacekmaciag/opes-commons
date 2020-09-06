package pl.jdev.opes_commons.rest.message.event;

import org.springframework.messaging.MessageHeaders;

import java.util.Map;

public class CandlesticksUpdatedEvent extends Event<CandlestickUpdatedPayload> {
    public CandlesticksUpdatedEvent(CandlestickUpdatedPayload payload) {
        super(payload);
    }

    public CandlesticksUpdatedEvent(CandlestickUpdatedPayload payload, Map headers) {
        super(payload, headers);
    }

    public CandlesticksUpdatedEvent(CandlestickUpdatedPayload payload, MessageHeaders headers) {
        super(payload, headers);
    }
}
