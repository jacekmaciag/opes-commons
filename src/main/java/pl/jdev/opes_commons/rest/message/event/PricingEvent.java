package pl.jdev.opes_commons.rest.message.event;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.jdev.opes_commons.domain.pricing.Price;

import java.util.Map;

public class PricingEvent extends Event<Price> {

    public PricingEvent(Price payload) {
        super(payload);
    }
}
