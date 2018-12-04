package pl.jdev.opes_commons.rest.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import pl.jdev.opes_commons.rest.HttpHeaders;

import java.io.IOException;

public class AuthInterceptor implements ClientHttpRequestInterceptor {

    @Autowired
    String auth;

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        request.getHeaders().set(HttpHeaders.AUTHORIZATION, auth);
        return execution.execute(request, body);
    }
}
