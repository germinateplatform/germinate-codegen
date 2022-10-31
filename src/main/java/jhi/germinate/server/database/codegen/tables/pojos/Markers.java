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
 * Defines genetic markers within the database and assigns a type (markertypes).
 */
@Getter
@Setter
@Accessors(chain = true)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Markers implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer   id;
    private Integer   markertypeId;
    private String    markerName;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Markers() {}

    public Markers(Markers value) {
        this.id = value.id;
        this.markertypeId = value.markertypeId;
        this.markerName = value.markerName;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Markers(
        Integer   id,
        Integer   markertypeId,
        String    markerName,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.markertypeId = markertypeId;
        this.markerName = markerName;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Markers (");

        sb.append(id);
        sb.append(", ").append(markertypeId);
        sb.append(", ").append(markerName);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
