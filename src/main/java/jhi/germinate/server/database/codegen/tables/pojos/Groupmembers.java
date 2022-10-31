/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;


import lombok.*;
import lombok.experimental.Accessors;

// @formatter:off
/**
 * Defines which entities are contained within a group. These can be the primary
 * key from any table.
 */
@Getter
@Setter
@Accessors(chain = true)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Groupmembers implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer   id;
    private Integer   foreignId;
    private Integer   groupId;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Groupmembers() {}

    public Groupmembers(Groupmembers value) {
        this.id = value.id;
        this.foreignId = value.foreignId;
        this.groupId = value.groupId;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Groupmembers(
        Integer   id,
        Integer   foreignId,
        Integer   groupId,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.foreignId = foreignId;
        this.groupId = groupId;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Groupmembers (");

        sb.append(id);
        sb.append(", ").append(foreignId);
        sb.append(", ").append(groupId);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
