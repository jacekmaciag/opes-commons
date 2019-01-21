package pl.jdev.opes_commons.rest.message.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.jdev.opes_commons.domain.order.Order;

@Getter
@AllArgsConstructor(onConstructor = @__({@JsonCreator}))
public class CreateOrderRequest {
    private Order order;
}
