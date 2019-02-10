package pl.jdev.opes_commons.rest;

import org.springframework.lang.Nullable;
import org.springframework.util.StringUtils;

public class HttpHeaders extends org.springframework.http.HttpHeaders {
    public static final String DATA_TYPE = "Data-Type";
    public static final String EVENT_TYPE = "Event-Type";
    public static final String ACTION_TYPE = "Action-Type";
    public static final String SOURCE = "Source";

    public void setDataType(@Nullable String dataType) {
        if (dataType != null) {
            set(DATA_TYPE, dataType);
        } else {
            set(DATA_TYPE, null);
        }
    }

    @Nullable
    public String getDataType() {
        String value = getFirst(DATA_TYPE);
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

    public void setActionType(@Nullable String actionType) {
        if (actionType != null) {
            set(ACTION_TYPE, actionType);
        } else {
            set(ACTION_TYPE, null);
        }
    }

    @Nullable
    public String getActionType() {
        String value = getFirst(ACTION_TYPE);
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
