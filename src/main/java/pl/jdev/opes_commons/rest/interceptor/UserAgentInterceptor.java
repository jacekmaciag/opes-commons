package pl.jdev.opes_commons.rest.interceptor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import pl.jdev.opes_commons.rest.HttpHeaders;

import java.io.IOException;

public class UserAgentInterceptor implements ClientHttpRequestInterceptor {

    @Value("${id}")
    private String id;
    @Value("${version}")
    private String version;

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        request.getHeaders().set(HttpHeaders.USER_AGENT, String.format("%s %s", id, version));
        return execution.execute(request, body);
    }
}
