package pl.jdev.opes_commons.rest.message;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor(onConstructor = @__({@JsonCreator}))
public class CloseTradeAction implements Action {
    private UUID accountId;
    private String extAccountId;
    private UUID tradeId;
    private String extTradeId;
}
