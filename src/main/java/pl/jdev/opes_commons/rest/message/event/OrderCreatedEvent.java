package pl.jdev.opes_commons.rest.message.event;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@JsonRootName("orderCreated")
@RequiredArgsConstructor
public class OrderCreatedEvent implements DomainEvent {
    @Getter
    private final UUID orderId;
}
