package pl.jdev.opes_commons.rest.message.event;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@JsonRootName("tradeClosed")
@RequiredArgsConstructor
public class TradeClosedEvent implements DomainEvent {
    @Getter
    private final UUID tradeId;
}
