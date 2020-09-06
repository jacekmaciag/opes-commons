package pl.jdev.opes_commons.validation;

import pl.jdev.opes_commons.domain.broker.BrokerName;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

public class BrokerValidator implements ConstraintValidator<Broker, BrokerName> {
    @Override
    public boolean isValid(BrokerName value, ConstraintValidatorContext context) {
        return Arrays.asList(BrokerName.values()).contains(value);
    }
}
