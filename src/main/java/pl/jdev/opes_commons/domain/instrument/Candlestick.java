package pl.jdev.opes_commons.domain.instrument;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.TypeAlias;

@Data
@Builder
@TypeAlias("candle")
public class Candlestick {
    private String time;
    private CandlestickData bid;
    private CandlestickData ask;
    private CandlestickData mid;
    private int volume;
    private boolean complete;
}
