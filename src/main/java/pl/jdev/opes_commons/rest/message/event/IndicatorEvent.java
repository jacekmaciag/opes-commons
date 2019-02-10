package pl.jdev.opes_commons.rest.message.event;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(onConstructor = @__({@JsonCreator}))
@JsonRootName("indicatorEvent")
public class IndicatorEvent  {
    private String boop;
}
