package pl.jdev.opes_commons.rest.message.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.jdev.opes_commons.domain.instrument.CandlestickGranularity;
import pl.jdev.opes_commons.domain.instrument.CandlestickPriceType;

@Getter
@AllArgsConstructor(onConstructor = @__({@JsonCreator}))
public class CandlesRequest implements DataRequest {
    private String instrument;
    private CandlestickPriceType priceType;
    private CandlestickGranularity granularity;
    private int count;
    private String from;
    private String to;

    public CandlesRequest(String instrument, CandlestickPriceType priceType, CandlestickGranularity granularity, int count) {
        this.instrument = instrument;
        this.priceType = priceType;
        this.granularity = granularity;
        this.count = count;
    }

    public CandlesRequest(String instrument, CandlestickPriceType priceType, CandlestickGranularity granularity, String from, String to) {
        this.instrument = instrument;
        this.priceType = priceType;
        this.granularity = granularity;
        this.from = from;
        this.to = to;
    }
}
