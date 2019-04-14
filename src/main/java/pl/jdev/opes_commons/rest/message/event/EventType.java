package pl.jdev.opes_commons.rest.message.event;

public enum EventType {
    ACCOUNT_SYNCED("account.synced"),
    ACCOUNT_UNSYNCED("account.unsynced"),
    ACCOUNT_UPDATED("account.updated"),
    ORDER_CREATED("order.created"),
    ORDER_CANCELLED("order.cancelled"),
    ORDER_UPDATED("order.updated"),
    TRADE_OPEN("trade.open"),
    TRADE_CLOSED("trade.closed"),
    TRADE_UPDATED("trade.updated");

    private String key;

    EventType(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

}
