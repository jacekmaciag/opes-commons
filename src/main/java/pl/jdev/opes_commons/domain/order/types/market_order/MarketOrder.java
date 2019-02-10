package pl.jdev.opes_commons.domain.order.types.market_order;

import lombok.Data;
import pl.jdev.opes_commons.domain.ClientExtensions;
import pl.jdev.opes_commons.domain.order.FillingOrderDetails;
import pl.jdev.opes_commons.domain.order.OrderPositionFill;
import pl.jdev.opes_commons.domain.order.OrderType;
import pl.jdev.opes_commons.domain.order.TimeInForce;

import java.util.Date;
import java.util.List;

@Data
public class MarketOrder {
    private OrderType type;
    private String instrument;
    private String units;
    private TimeInForce timeInForce;
    private String priceBound;
    private OrderPositionFill positionFill;
    private MarketOrderTradeClose tradeClose;
    private MarketOrderPositionCloseout longPositionCloseout;
    private MarketOrderPositionCloseout shortPositionCloseout;
    private MarketOrderMarginCloseout marginCloseout;
    private MarketOrderDelayedTradeClose delayedTradeClose;
    private FillingOrderDetails takeProfitOnFill;
    private FillingOrderDetails stopLossOnFill;
    private FillingOrderDetails trailingStopLossOnFill;
    private ClientExtensions tradeClientExtensions;
    private String fillingTransactionID;
    private Date filledTime;
    private String tradeOpenedID;
    private String tradeReducedID;
    private List<String> tradeClosedIDs;
    private String cancellingTransactionID;
    private Date cancelledTime;

}
