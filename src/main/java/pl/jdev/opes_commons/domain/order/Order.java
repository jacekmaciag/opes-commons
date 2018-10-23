package pl.jdev.opes_commons.domain.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.TypeAlias;
import pl.jdev.opes_commons.domain.AbstractEntity;
import pl.jdev.opes_commons.domain.ClientExtensions;

import java.util.Date;

@Data
@AllArgsConstructor
@TypeAlias("order")
public abstract class Order extends AbstractEntity {
    private String orderId;
    private Date createTime;
    private OrderState state;
    private ClientExtensions clientExtensions;
}