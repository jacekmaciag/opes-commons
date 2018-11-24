package pl.jdev.opes_commons.rest.message;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

@Getter
@AllArgsConstructor(onConstructor = @__({@JsonCreator}))
public class PricingEvent extends AbstractEvent{
    private Map<String, Double> instrumentPrice;
}
