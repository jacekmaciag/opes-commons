package pl.jdev.opes_commons.rest.message;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Deprecated
@Getter
@AllArgsConstructor(onConstructor = @__({@JsonCreator}))
public class CancelOrderAction implements Action {
    private UUID accountId;
    private String extAccountId;
    private UUID orderId;
    private String extOrderId;
}
