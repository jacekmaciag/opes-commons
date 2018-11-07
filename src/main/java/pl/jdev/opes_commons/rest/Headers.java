package pl.jdev.opes_commons.rest;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class Headers {
    private MultiValueMap<String, String> headers;

    public Headers() {
        this.headers = new LinkedMultiValueMap<>();
    }

    public MultiValueMap getHeaders() {
        return headers;
    }

    public void addHeader(String key, String value) {
        headers.add(key, value);
    }
}