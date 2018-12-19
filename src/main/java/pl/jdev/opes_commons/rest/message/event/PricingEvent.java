package pl.jdev.opes_commons.rest.message.event;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

@Getter
@AllArgsConstructor(onConstructor = @__({@JsonCreator}))
public class PricingEvent implements Event {
    private String instrument;
    private Map<String, Double> instrumentPrice;
}
