package pl.jdev.opes_commons.domain.user;

import lombok.Data;

import java.util.Collection;

@Data
public class UserPreferences {

    private Collection<String> currencyPairs;
}
