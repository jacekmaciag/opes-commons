package pl.jdev.opes_commons.domain.account;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.jdev.opes_commons.domain.broker.BrokerName;

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
    private String extId;
    private Currency currency;
    private Double balance;
    private BrokerName broker;

    public Account(UUID id, String extId) {
        this.id = id;
        this.extId = extId;
    }
}