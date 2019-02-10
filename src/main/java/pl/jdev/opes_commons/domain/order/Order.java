package pl.jdev.opes_commons.domain.order;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;
import pl.jdev.opes_commons.domain.instrument.Instrument;
import pl.jdev.opes_commons.rest.json.OrderViews;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Data
//@JsonRootName("order")
public class Order implements Serializable {
    private UUID id;
    private String extId;
    @JsonView(OrderViews.CoreCreate.class)
    private UUID accountId;
    private OrderState state;
    @JsonView({OrderViews.CoreCreate.class,
            OrderViews.OandaCreate.class})
    private OrderType type;
    @JsonView({OrderViews.CoreCreate.class,
            OrderViews.OandaCreate.class})
    private Double units;
    @JsonView({OrderViews.CoreCreate.class,
            OrderViews.OandaCreate.class})
    private Instrument instrument;
    private List<String> comments;
    private Set<String> tags;
}