package pl.jdev.opes_commons.domain.account;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.jdev.opes_commons.domain.broker.BrokerName;
import pl.jdev.opes_commons.rest.json.AccountViews;
import pl.jdev.opes_commons.rest.validation.AccountSyncCriteria;
import pl.jdev.opes_commons.validation.Broker;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Currency;
import java.util.UUID;


@Data
//@Builder
//@JsonRootName("account")
@NoArgsConstructor
@AllArgsConstructor
public class Account implements Serializable {
    private UUID id;
    @JsonView({AccountViews.Sync.class})
    @NotNull(groups = AccountSyncCriteria.class)
    @NotEmpty(groups = AccountSyncCriteria.class)
    private String extId;
    private Currency currency;
    private Double balance;
    @JsonView({AccountViews.Sync.class})
    @NotNull(groups = AccountSyncCriteria.class)
    @Broker
    private BrokerName broker;

    public Account(UUID id, String extId) {
        this.id = id;
        this.extId = extId;
    }
}