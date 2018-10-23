package pl.jdev.opes_commons.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = TimeInForceValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface SupportedTimeInForce {
	String message() default "Invalid time in force code.";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
