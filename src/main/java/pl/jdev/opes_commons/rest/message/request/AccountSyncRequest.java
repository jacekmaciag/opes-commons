package pl.jdev.opes_commons.rest.message.request;

import org.springframework.messaging.MessageHeaders;

import java.util.Map;

public class AccountSyncRequest extends Request<String> {

    public AccountSyncRequest(String payload) {
        super(payload);
    }

    public AccountSyncRequest(String payload, Map headers) {
        super(payload, headers);
    }

    public AccountSyncRequest(String payload, MessageHeaders headers) {
        super(payload, headers);
    }
}