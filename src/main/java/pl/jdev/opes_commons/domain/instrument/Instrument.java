package pl.jdev.opes_commons.domain.instrument;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Instrument implements Serializable {
    private String name;
    private InstrumentType type;
    private String displayName;
    private Boolean isTracked;
    private Boolean isTradable;

    public Instrument(String name) {
        this.name = name;
        this.type = null;
        this.displayName = null;
    }
}