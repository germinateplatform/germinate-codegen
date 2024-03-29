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
 * This class is generated by jOOQ.
 */
@Getter
@Setter
@Accessors(chain = true)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Datasetmembertypes implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer   id;
    private String    targetTable;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Datasetmembertypes() {}

    public Datasetmembertypes(Datasetmembertypes value) {
        this.id = value.id;
        this.targetTable = value.targetTable;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Datasetmembertypes(
        Integer   id,
        String    targetTable,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.targetTable = targetTable;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Datasetmembertypes (");

        sb.append(id);
        sb.append(", ").append(targetTable);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
