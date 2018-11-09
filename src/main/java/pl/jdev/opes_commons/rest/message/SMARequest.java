package pl.jdev.opes_commons.rest.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import pl.jdev.opes_commons.domain.instrument.Candlestick;

import java.util.Collection;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class SMARequest implements DataRequest {
    private final Collection<Candlestick> candles;
    private int numOfSMAs;
    private int numOfTimePeriods;
}
