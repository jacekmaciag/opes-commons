package pl.jdev.opes_commons.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = OrderTypeValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface SupportedOrderType {
	String message() default "Invalid order type.";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}