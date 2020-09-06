package pl.jdev.opes_commons.rest.client;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.Message;
import org.springframework.web.client.RestTemplate;
import pl.jdev.opes_commons.rest.RestService;

public class IntegrationClient extends RestService {

    public IntegrationClient(RestTemplate restTemplate, String integrationHostUrl) {
        super(restTemplate, integrationHostUrl);
    }

    public ResponseEntity request(final Message request, final Class responseType) {
        return send("/request", request, HttpMethod.POST, responseType);
    }

    public ResponseEntity request(final Message request) {
        return send("/request", request, HttpMethod.POST, String.class);
    }

    public ResponseEntity post(final Message event) {
        return send("/event", event, HttpMethod.POST, Void.class);
    }

}