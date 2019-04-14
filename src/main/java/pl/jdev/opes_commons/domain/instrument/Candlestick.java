package pl.jdev.opes_commons.domain.instrument;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Comparator;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Candlestick implements Cloneable {
    private String instrument;
    private CandlestickGranularity granularity;
    private String time;
    private CandlestickData bid;
    private CandlestickData ask;
    private CandlestickData mid;
    private int volume;
    private boolean complete;

    public static Comparator<Candlestick> TimeComparator = (o1, o2) -> {
        Instant thisTime = Instant.parse(o1.getTime());
        Instant otherTime = Instant.parse(o2.getTime());
        return thisTime.compareTo(otherTime);
    };

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
