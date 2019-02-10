package pl.jdev.opes_commons.rest.message.event;

import org.springframework.messaging.MessageHeaders;
import pl.jdev.opes_commons.domain.account.Account;

import java.util.Map;

public class AccountUpdatedEvent extends Event<Account> {
    public AccountUpdatedEvent(Account payload) {
        super(payload);
    }

    public AccountUpdatedEvent(Account payload, Map headers) {
        super(payload, headers);
    }

    public AccountUpdatedEvent(Account payload, MessageHeaders headers) {
        super(payload, headers);
    }
}