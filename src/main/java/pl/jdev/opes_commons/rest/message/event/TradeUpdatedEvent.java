package pl.jdev.opes_commons.rest.message.event;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.MessageHeaders;
import pl.jdev.opes_commons.domain.trade.Trade;

import java.util.Map;
import java.util.UUID;

public class TradeUpdatedEvent extends Event<Trade> {

    public TradeUpdatedEvent(Trade payload) {
        super(payload);
    }

    public TradeUpdatedEvent(Trade payload, Map headers) {
        super(payload, headers);
    }

    public TradeUpdatedEvent(Trade payload, MessageHeaders headers) {
        super(payload, headers);
    }
}
