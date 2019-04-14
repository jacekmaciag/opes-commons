package pl.jdev.opes_commons.domain.account;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.jdev.opes_commons.domain.broker.BrokerName;
import pl.jdev.opes_commons.rest.json.AccountViews;

import java.io.Serializable;
import java.util.Currency;
import java.util.UUID;


@Data
//@Builder
//@JsonRootName("account")
@NoArgsConstructor
//@RequiredArgsConstructor
public class Account implements Serializable {
    private UUID id;
    @JsonView({AccountViews.Sync.class})
    private String extId;
    private Currency currency;
    private Double balance;
    @JsonView({AccountViews.Sync.class})
    private BrokerName broker;

    public Account(UUID id, String extId) {
        this.id = id;
        this.extId = extId;
    }
}