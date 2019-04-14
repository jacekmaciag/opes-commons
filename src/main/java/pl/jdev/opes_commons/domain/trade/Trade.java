package pl.jdev.opes_commons.domain.trade;

import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Data
public class Trade {
    private UUID id;
    private String extId;
    private UUID accountId;
    private TradeState state;
    private String instrument;
    private Double price;
    private Date openTime;
    private Date closeTime;
    private Double realizedPL;
    private Double unrealizedPL;
    private List<String> comments;
    private Set<String> tags;
}