package pl.jdev.opes_commons.rest.message.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.jdev.opes_commons.domain.instrument.Candlestick;
import pl.jdev.opes_commons.domain.instrument.Instrument;

import java.util.List;

@Getter
@AllArgsConstructor
public class CandlestickUpdatedPayload {
    private Instrument instrument;
    private List<Candlestick> candlesticks;
}
