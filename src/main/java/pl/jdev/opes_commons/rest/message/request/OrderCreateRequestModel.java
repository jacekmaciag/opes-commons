package pl.jdev.opes_commons.rest.message.request;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import pl.jdev.opes_commons.domain.instrument.Instrument;
import pl.jdev.opes_commons.domain.order.OrderType;

import java.util.UUID;


@Getter
@RequiredArgsConstructor
public class OrderCreateRequestModel {
    private final UUID accountId;
    private final Double units;
    private final Instrument instrument;
    private final OrderType type;
}
