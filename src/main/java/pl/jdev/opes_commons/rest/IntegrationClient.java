package pl.jdev.opes_commons.rest;

import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import java.util.List;

import static org.springframework.http.HttpMethod.POST;

public class IntegrationClient extends HttpService {

    private String integrationHost;

    public IntegrationClient(RestTemplate restTemplate, String integrationHostUrl) {
        super(restTemplate);
        this.integrationHost = integrationHostUrl;
    }

    public ResponseEntity request(final Message request, final Class responseType) {
        return execute("/request", request, responseType);
    }

    public ResponseEntity request(final Message request) {
        return execute("/request", request, String.class);
    }


    public ResponseEntity post(final Message event) {
        return execute("/event", event, Void.class);
    }

    private ResponseEntity execute(String endpoint, Message message, Class responseType) {
        HttpHeaders headers = convertToHttpHeaders(message.getHeaders());
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        headers.setAccept(List.of(MediaType.APPLICATION_JSON_UTF8));
        return this.restTemplate
                .exchange(UriComponentsBuilder.newInstance()
                                .scheme(ReferenceUriSchemesSupported.HTTP.toString())
                                .host(integrationHost)
                                .path(endpoint)
                                .build()
                                .toString(),
                        POST,
                        new HttpEntity<>(message.getPayload(), headers),
                        responseType);
    }

    private HttpHeaders convertToHttpHeaders(MessageHeaders headers) {
        HttpHeaders result = new HttpHeaders();
        headers.forEach((key, value) -> result.set(key, value.toString()));
        return result;
    }
}