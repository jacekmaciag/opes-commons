package pl.jdev.opes_commons.rest.message.request;

import org.springframework.messaging.MessageHeaders;

import java.util.Map;
import java.util.UUID;

public class EntityDetailsRequest extends Request<UUID> {
    public EntityDetailsRequest() {
        super(null);
    }

    public EntityDetailsRequest(UUID id) {
        super(id);
    }

    public EntityDetailsRequest(UUID id, Map headers) {
        super(id, headers);
    }

    public EntityDetailsRequest(UUID id, MessageHeaders headers) {
        super(id, headers);
    }
//    private Collection<UUID> intIds;
//    private Collection<String> extIds;
//
//    public EntityDetailsRequest() {
//        this.intIds = Collections.emptyList();
//        this.extIds = Collections.emptyList();
//    }
//
//    public EntityDetailsRequest(UUID intId, String extId) {
//        this.intIds = new ArrayList<>();
//        intIds.add(intId);
//        this.extIds = new ArrayList<>();
//        extIds.add(extId);
//    }
//
//    public EntityDetailsRequest(Collection<UUID> intIds, Collection<String> extIds) {
//        if (intIds.size() != extIds.size())
//            throw new IllegalArgumentException("Internal IDs amount does not match External IDs amount!");
//        this.intIds = intIds;
//        this.extIds = extIds;
//    }
}
