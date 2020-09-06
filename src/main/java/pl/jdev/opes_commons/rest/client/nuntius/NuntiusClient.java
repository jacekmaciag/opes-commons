package pl.jdev.opes_commons.rest.client.nuntius;

import org.springframework.http.ResponseEntity;
import org.springframework.messaging.Message;
import org.springframework.web.client.RestTemplate;
import pl.jdev.opes_commons.domain.account.Account;
import pl.jdev.opes_commons.rest.RestService;

import static org.springframework.http.HttpMethod.POST;

public class NuntiusClient extends RestService {

    public NuntiusClient(RestTemplate restTemplate, String host) {
        super(restTemplate, host);
    }

    public ResponseEntity getAccount(final Message body) {
        return send("/", body, POST, Account.class);
    }
}
