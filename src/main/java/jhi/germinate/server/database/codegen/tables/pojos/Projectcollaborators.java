/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.enums.ProjectcollaboratorsRole;


import lombok.*;
import lombok.experimental.Accessors;

// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@Getter
@Setter
@Accessors(chain = true)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Projectcollaborators implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer                  collaboratorId;
    private Integer                  projectId;
    private ProjectcollaboratorsRole role;
    private Timestamp                createdOn;
    private Timestamp                updatedOn;

    public Projectcollaborators() {}

    public Projectcollaborators(Projectcollaborators value) {
        this.collaboratorId = value.collaboratorId;
        this.projectId = value.projectId;
        this.role = value.role;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Projectcollaborators(
        Integer                  collaboratorId,
        Integer                  projectId,
        ProjectcollaboratorsRole role,
        Timestamp                createdOn,
        Timestamp                updatedOn
    ) {
        this.collaboratorId = collaboratorId;
        this.projectId = projectId;
        this.role = role;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Projectcollaborators (");

        sb.append(collaboratorId);
        sb.append(", ").append(projectId);
        sb.append(", ").append(role);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}