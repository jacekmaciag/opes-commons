package pl.jdev.opes_commons.rest.message.request;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.UUID;

@Getter
public class EntityDetailsRequest implements DataRequest {
    private Collection<UUID> intIds;
    private Collection<String> extIds;

    public EntityDetailsRequest() {
        this.intIds = Collections.emptyList();
        this.extIds = Collections.emptyList();
    }

    public EntityDetailsRequest(UUID intId, String extId) {
        this.intIds = new ArrayList<>();
        intIds.add(intId);
        this.extIds = new ArrayList<>();
        extIds.add(extId);
    }

    public EntityDetailsRequest(Collection<UUID> intIds, Collection<String> extIds) {
        if (intIds.size() != extIds.size())
            throw new IllegalArgumentException("Internal IDs amount does not match External IDs amount!");
        this.intIds = intIds;
        this.extIds = extIds;
    }
}
