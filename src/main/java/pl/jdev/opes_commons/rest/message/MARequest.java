package pl.jdev.opes_commons.rest.message;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.jdev.opes_commons.domain.instrument.Candlestick;

import java.util.Collection;

@Getter
@AllArgsConstructor(onConstructor = @__({@JsonCreator}))
public class MARequest implements DataRequest {
    private final Collection<Candlestick> candles;
    private int amtOfIndics;
    private int amtOfPeriods;
}