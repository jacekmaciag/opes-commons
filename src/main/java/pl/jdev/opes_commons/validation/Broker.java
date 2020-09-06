package pl.jdev.opes_commons.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = BrokerValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Broker {
    String message() default "Invalid broker name.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
