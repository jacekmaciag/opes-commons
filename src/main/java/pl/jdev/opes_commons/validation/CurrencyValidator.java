package pl.jdev.opes_commons.validation;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Currency;
import java.util.function.Function;

public class CurrencyValidator implements ConstraintValidator<SupportedCurrency, String> {
    //TODO: needs fix based on provided currency config

    @Override
    public void initialize(SupportedCurrency constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if ((value != null) && !value.isEmpty()) {
//            return isParsable.apply(value) ? isSupported.apply(value) : false;
            return true;
        }
        return false;
    }

    private Function<String, Boolean> isParsable = value -> {
        try {
            Currency.getInstance(value);
        } catch (Exception e) {
            return false;
        }
        return true;
    };

//    private Function<String, Boolean> isSupported = value -> currencyConfig.getSupportedCurrencies().contains(Currency.getInstance(value));
}