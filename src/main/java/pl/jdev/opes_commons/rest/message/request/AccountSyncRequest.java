package pl.jdev.opes_commons.rest.message.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(onConstructor = @__({@JsonCreator}))
public class AccountSyncRequest {
    private String extId;
    private String source;
}
