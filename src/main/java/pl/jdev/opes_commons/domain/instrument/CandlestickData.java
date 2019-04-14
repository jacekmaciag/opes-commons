package pl.jdev.opes_commons.domain.instrument;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandlestickData {
    private Double o;
    private Double h;
    private Double l;
    private Double c;
}
