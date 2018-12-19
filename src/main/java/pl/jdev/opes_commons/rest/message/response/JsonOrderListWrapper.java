package pl.jdev.opes_commons.rest.message.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import pl.jdev.opes_commons.domain.order.Order;

import java.util.Collection;

@Getter
@AllArgsConstructor(staticName = "payloadOf", onConstructor = @__({@JsonCreator}))
public class JsonOrderListWrapper {
    private Collection<Order> orders;
}
