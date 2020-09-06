package pl.jdev.opes_commons.rest.client;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.Message;
import org.springframework.web.client.RestTemplate;
import pl.jdev.opes_commons.rest.RestService;

public class AbacusClient extends RestService {

    public AbacusClient(final RestTemplate restTemplate, final String abacusHostUrl) {
        super(restTemplate, abacusHostUrl);
    }

    public ResponseEntity calculate(final Message request) {
        return send("/calculate", request, HttpMethod.POST, String.class);
    }

}
