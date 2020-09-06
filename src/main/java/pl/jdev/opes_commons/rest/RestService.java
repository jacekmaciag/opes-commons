package pl.jdev.opes_commons.rest;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import java.util.List;

public abstract class RestService {
    protected RestTemplate restTemplate;
    protected String host;

    public RestService(final RestTemplate restTemplate, final String host) {
        this.restTemplate = restTemplate;
        this.host = host;
    }

    private HttpHeaders toHttpHeaders(MessageHeaders messageHeaders) {
        HttpHeaders httpHeaders = new HttpHeaders();
        messageHeaders.forEach((key, value) -> httpHeaders.set(key, value.toString()));
        return httpHeaders;
    }

    protected <R> ResponseEntity send(final String endpoint, final Message message, final HttpMethod method, final R responseType) {
        HttpHeaders headers = toHttpHeaders(message.getHeaders());
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        return this.restTemplate
                .exchange(UriComponentsBuilder.newInstance()
                                .scheme(ReferenceUriSchemesSupported.HTTP.toString())
                                .host(host)
                                .path(endpoint)
                                .build()
                                .toString(),
                        method,
                        new HttpEntity<>(message.getPayload(), headers),
                        responseType.getClass());
    }

}