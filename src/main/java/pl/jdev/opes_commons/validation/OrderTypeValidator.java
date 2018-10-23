package pl.jdev.opes_commons.validation;

import pl.jdev.opes_commons.domain.order.OrderType;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

public class OrderTypeValidator implements ConstraintValidator<SupportedOrderType, OrderType> {

    @Override
    public void initialize(SupportedOrderType constraintAnnotation) {
    }

    @Override
    public boolean isValid(OrderType value, ConstraintValidatorContext context) {
        return value != null && Arrays.asList(OrderType.values()).contains(value);
    }
}