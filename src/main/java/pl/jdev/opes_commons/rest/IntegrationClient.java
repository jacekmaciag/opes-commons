package pl.jdev.opes_commons.rest;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import pl.jdev.opes_commons.rest.message.Action;
import pl.jdev.opes_commons.rest.message.event.Event;
import pl.jdev.opes_commons.rest.message.request.DataRequest;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import java.io.Serializable;

import static org.springframework.http.HttpMethod.POST;

public class IntegrationClient extends HttpService {

    private String integrationHost;

    public IntegrationClient(RestTemplate restTemplate, String integrationHostUrl) {
        super(restTemplate);
        this.integrationHost = integrationHostUrl;
    }

    public ResponseEntity requestData(final DataRequest dataRequest, final HttpHeaders headers, final Class responseType) {
        return post("/data", dataRequest, headers, responseType);
    }

    public ResponseEntity perform(final Action action, final HttpHeaders headers) {
        return post("/action", action, headers, ResponseEntity.class);
    }


    public ResponseEntity postEvent(final Event event, final HttpHeaders headers) {
        return post("/event", event, headers, ResponseEntity.class);
    }

    private ResponseEntity post(String endpoint, Serializable message, HttpHeaders headers, Class responseType) {
        return this.restTemplate
                .exchange(UriComponentsBuilder.newInstance()
                                .scheme(ReferenceUriSchemesSupported.HTTP.toString())
                                .host(integrationHost)
                                .path(endpoint)
                                .build()
                                .toString(),
                        POST,
                        new HttpEntity<>(message, headers),
                        responseType);
    }
}