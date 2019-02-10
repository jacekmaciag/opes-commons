package pl.jdev.opes_commons.domain.instrument;

import lombok.Data;

@Data
public class Instrument {

    enum InstrumentType {
        CURRENCY, CFD, METAL
    }

    private String name;
    private InstrumentType type;
    private String displayName;
}