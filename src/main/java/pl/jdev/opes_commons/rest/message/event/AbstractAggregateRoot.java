package pl.jdev.opes_commons.rest.message.event;

import lombok.Getter;
import org.springframework.data.domain.AfterDomainEventPublication;
import org.springframework.data.domain.DomainEvents;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

public class AbstractAggregateRoot {
    @Getter(onMethod = @__(@DomainEvents))
    private transient final List<Object> domainEvents = new ArrayList<>();

    protected <T> T registerEvent(T event) {
        Assert.notNull(event, "Domain event must not be null!");
        this.domainEvents.add(event);
        return event;
    }

    @AfterDomainEventPublication
    public void clearDomainEvents() {
        this.domainEvents.clear();
    }
}
