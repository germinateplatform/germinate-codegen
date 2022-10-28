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
 * Defines features which can exist on maps. In general this will be the marker
 * type but it can also be used to identify QTL regions.
 */
@Getter
@Setter
@Accessors(chain = true)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Mapfeaturetypes implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer   id;
    private String    description;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Mapfeaturetypes() {}

    public Mapfeaturetypes(Mapfeaturetypes value) {
        this.id = value.id;
        this.description = value.description;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Mapfeaturetypes(
        Integer   id,
        String    description,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.description = description;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Mapfeaturetypes (");

        sb.append(id);
        sb.append(", ").append(description);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
