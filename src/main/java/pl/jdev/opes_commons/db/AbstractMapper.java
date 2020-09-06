package pl.jdev.opes_commons.db;

public abstract class AbstractMapper<Object, AuditDto> {
    public abstract Object convertToEntity(AuditDto dto);

    public abstract AuditDto convertToDto(Object entity);
}