package pl.jdev.opes_commons.rest.interceptor;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

import static java.lang.String.format;

@Log4j2(topic = "REST")
public class RestLoggingInterceptor implements ClientHttpRequestInterceptor {
    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        logRequest(request, body);
        ClientHttpResponse response = execution.execute(request, body);
        logResponse(response);
        return response;
    }

    private synchronized void logRequest(HttpRequest request, byte[] body) {
        log.info("Request\n"
                + "======================REQUEST BEGIN======================\n"
                + format("URI         : %s\n", request.getURI())
                + format("Method      : %s\n", request.getMethod())
                + format("Headers     : %s\n", request.getHeaders().toSingleValueMap())
                + format("Request Body: %s\n", new String(body))
                + "======================REQUEST END========================");
    }

    private synchronized void logResponse(ClientHttpResponse response) throws IOException {
        log.info("Response\n"
                + "======================RESPONSE BEGIN=====================\n"
                + format("Status Code  : %s\n", response.getStatusCode())
                + format("Status Text  : %s\n", response.getStatusText())
                + format("Headers      : %s\n", response.getHeaders().toSingleValueMap())
                + format("Response Body: %s\n", StreamUtils.copyToString(response.getBody(), Charset.defaultCharset()))
                + "======================RESPONSE END=======================");
    }
}
