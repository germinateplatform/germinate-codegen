/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.enums.GermplasminstitutionsType;


// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Germplasminstitutions implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer                   germinatebaseId;
    private Integer                   institutionId;
    private GermplasminstitutionsType type;
    private Timestamp                 createdOn;
    private Timestamp                 updatedOn;

    public Germplasminstitutions() {}

    public Germplasminstitutions(Germplasminstitutions value) {
        this.germinatebaseId = value.germinatebaseId;
        this.institutionId = value.institutionId;
        this.type = value.type;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Germplasminstitutions(
        Integer                   germinatebaseId,
        Integer                   institutionId,
        GermplasminstitutionsType type,
        Timestamp                 createdOn,
        Timestamp                 updatedOn
    ) {
        this.germinatebaseId = germinatebaseId;
        this.institutionId = institutionId;
        this.type = type;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    /**
     * Getter for
     * <code>germinate_db.germplasminstitutions.germinatebase_id</code>.
     */
    public Integer getGerminatebaseId() {
        return this.germinatebaseId;
    }

    /**
     * Setter for
     * <code>germinate_db.germplasminstitutions.germinatebase_id</code>.
     */
    public void setGerminatebaseId(Integer germinatebaseId) {
        this.germinatebaseId = germinatebaseId;
    }

    /**
     * Getter for
     * <code>germinate_db.germplasminstitutions.institution_id</code>.
     */
    public Integer getInstitutionId() {
        return this.institutionId;
    }

    /**
     * Setter for
     * <code>germinate_db.germplasminstitutions.institution_id</code>.
     */
    public void setInstitutionId(Integer institutionId) {
        this.institutionId = institutionId;
    }

    /**
     * Getter for <code>germinate_db.germplasminstitutions.type</code>.
     */
    public GermplasminstitutionsType getType() {
        return this.type;
    }

    /**
     * Setter for <code>germinate_db.germplasminstitutions.type</code>.
     */
    public void setType(GermplasminstitutionsType type) {
        this.type = type;
    }

    /**
     * Getter for <code>germinate_db.germplasminstitutions.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>germinate_db.germplasminstitutions.created_on</code>.
     */
    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Getter for <code>germinate_db.germplasminstitutions.updated_on</code>.
     */
    public Timestamp getUpdatedOn() {
        return this.updatedOn;
    }

    /**
     * Setter for <code>germinate_db.germplasminstitutions.updated_on</code>.
     */
    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Germplasminstitutions (");

        sb.append(germinatebaseId);
        sb.append(", ").append(institutionId);
        sb.append(", ").append(type);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
