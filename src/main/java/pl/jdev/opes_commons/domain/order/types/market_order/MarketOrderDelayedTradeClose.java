package pl.jdev.opes_commons.domain.order.types.market_order;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
class MarketOrderDelayedTradeClose {
    private String tradeID;
    private String clientTradeID;
    private String units;
}
