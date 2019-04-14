package pl.jdev.opes_commons.rest;

import org.springframework.lang.Nullable;
import org.springframework.util.StringUtils;

public class HttpHeaders extends org.springframework.http.HttpHeaders {
    public static final String REQUEST_TYPE = "Request-Type";
    public static final String EVENT_TYPE = "Event-Type";
    public static final String SOURCE = "Source";

    public void setRequestType(@Nullable String requestType) {
        if (requestType != null) {
            set(REQUEST_TYPE, requestType);
        } else {
            set(REQUEST_TYPE, null);
        }
    }

    @Nullable
    public String getRequestType() {
        String value = getFirst(REQUEST_TYPE);
        return (StringUtils.hasLength(value) ? value : null);
    }

    public void setEventType(@Nullable String eventType) {
        if (eventType != null) {
            set(EVENT_TYPE, eventType);
        } else {
            set(EVENT_TYPE, null);
        }
    }

    @Nullable
    public String getEventType() {
        String value = getFirst(EVENT_TYPE);
        return (StringUtils.hasLength(value) ? value : null);
    }

    public void setSource(@Nullable String source) {
        if (source != null) {
            set(SOURCE, source);
        } else {
            set(SOURCE, null);
        }
    }

    @Nullable
    public String getSource() {
        String value = getFirst(SOURCE);
        return (StringUtils.hasLength(value) ? value : null);
    }
}
