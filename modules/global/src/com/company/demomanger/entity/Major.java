package com.company.demomanger.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseIdentityIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Table(name = "DEMOMANGER_MAJOR")
@Entity(name = "demomanger_Major")
@NamePattern("%s|name")
public class Major extends BaseIdentityIdEntity implements HasUuid {
    private static final long serialVersionUID = -4207788634587478264L;

    @Column(name = "UUID")
    private UUID uuid;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}