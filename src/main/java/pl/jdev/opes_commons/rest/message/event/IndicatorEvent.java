package pl.jdev.opes_commons.rest.message.event;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(onConstructor = @__({@JsonCreator}))
public class IndicatorEvent implements Event {
    private String boop;
}
