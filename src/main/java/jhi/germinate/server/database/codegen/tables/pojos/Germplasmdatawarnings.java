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
public class Germplasmdatawarnings implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer   germinatebaseId;
    private Integer   datawarningId;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Germplasmdatawarnings() {}

    public Germplasmdatawarnings(Germplasmdatawarnings value) {
        this.germinatebaseId = value.germinatebaseId;
        this.datawarningId = value.datawarningId;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Germplasmdatawarnings(
        Integer   germinatebaseId,
        Integer   datawarningId,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.germinatebaseId = germinatebaseId;
        this.datawarningId = datawarningId;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Germplasmdatawarnings (");

        sb.append(germinatebaseId);
        sb.append(", ").append(datawarningId);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}