package pl.jdev.opes_commons.rest;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import pl.jdev.opes_commons.rest.message.DataRequest;
import pl.jdev.opes_commons.rest.message.Event;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import java.util.Map;

import static java.util.Objects.requireNonNull;
import static org.springframework.http.HttpMethod.POST;

public class IntegrationClient extends HttpService {

    private String integrationHost;

    public IntegrationClient(RestTemplate restTemplate, String integrationHostUrl) {
        super(restTemplate);
        this.integrationHost = integrationHostUrl;
    }

    public ResponseEntity requestData(final DataRequest dataRequest, final Map<HttpHeaders, String> headers) {
        MultiValueMap<String, String> stringHeaders = new LinkedMultiValueMap<>();
        headers.forEach((key, value) -> stringHeaders.add(key.toString(), value));
        return requireNonNull(this.restTemplate
                .exchange(UriComponentsBuilder.newInstance()
                                .scheme(ReferenceUriSchemesSupported.HTTP.toString())
                                .host(integrationHost)
                                .path("/data")
                                .build()
                                .toString(),
                        POST,
                        new HttpEntity<>(dataRequest, stringHeaders),
                        ResponseEntity.class));
    }

    public void postEvent(final Event event, final Map<HttpHeaders, String> headers) {
        MultiValueMap<String, String> stringHeaders = new LinkedMultiValueMap<>();
        headers.forEach((key, value) -> stringHeaders.add(key.toString(), value));
        this.restTemplate.exchange(UriComponentsBuilder.newInstance()
                        .scheme(ReferenceUriSchemesSupported.HTTP.toString())
                        .host(integrationHost)
                        .path("/event")
                        .build()
                        .toString(),
                POST,
                new HttpEntity<>(event, stringHeaders),
                Map.class);
    }
}