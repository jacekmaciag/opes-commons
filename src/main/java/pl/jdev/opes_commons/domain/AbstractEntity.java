package pl.jdev.opes_commons.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
@EqualsAndHashCode(exclude = "_id")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public abstract class AbstractEntity implements Persistable<UUID>, Serializable {
    @JsonIgnore
    @Id
    UUID _id;
    @JsonIgnore
    @CreatedDate
    Date _createdDate;
    @JsonIgnore
    @LastModifiedDate
    Date _modifiedDate;
    @JsonIgnore
    @Transient
    private boolean _persisted;

    @JsonIgnore
    @Override
    public boolean isNew() {
        return _persisted;
    }

    @Override
    public UUID getId() {
        return this._id;
    }
}
