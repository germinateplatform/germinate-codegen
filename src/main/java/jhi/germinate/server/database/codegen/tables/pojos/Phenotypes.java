/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.enums.PhenotypesDatatype;
import jhi.germinate.server.database.pojo.TraitRestrictions;


// @formatter:off
/**
 * Defines phenoytpes which are held in Germinate.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Phenotypes implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer            id;
    private String             name;
    private String             shortName;
    private String             description;
    private PhenotypesDatatype datatype;
    private TraitRestrictions  restrictions;
    private Integer            unitId;
    private Timestamp          createdOn;
    private Timestamp          updatedOn;

    public Phenotypes() {}

    public Phenotypes(Phenotypes value) {
        this.id = value.id;
        this.name = value.name;
        this.shortName = value.shortName;
        this.description = value.description;
        this.datatype = value.datatype;
        this.restrictions = value.restrictions;
        this.unitId = value.unitId;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Phenotypes(
        Integer            id,
        String             name,
        String             shortName,
        String             description,
        PhenotypesDatatype datatype,
        TraitRestrictions  restrictions,
        Integer            unitId,
        Timestamp          createdOn,
        Timestamp          updatedOn
    ) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.description = description;
        this.datatype = datatype;
        this.restrictions = restrictions;
        this.unitId = unitId;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    /**
     * Getter for <code>germinate_db.phenotypes.id</code>. Primary id for this
     * table. This uniquely identifies the row.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>germinate_db.phenotypes.id</code>. Primary id for this
     * table. This uniquely identifies the row.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>germinate_db.phenotypes.name</code>. Phenotype full
     * name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>germinate_db.phenotypes.name</code>. Phenotype full
     * name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>germinate_db.phenotypes.short_name</code>. Shortened
     * name for the phenotype. This is used in table columns where space is an
     * issue.
     */
    public String getShortName() {
        return this.shortName;
    }

    /**
     * Setter for <code>germinate_db.phenotypes.short_name</code>. Shortened
     * name for the phenotype. This is used in table columns where space is an
     * issue.
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * Getter for <code>germinate_db.phenotypes.description</code>. Full
     * description of the phenotype. This should contain enough infomation to
     * accurately identify the phenoytpe and how it was recorded.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>germinate_db.phenotypes.description</code>. Full
     * description of the phenotype. This should contain enough infomation to
     * accurately identify the phenoytpe and how it was recorded.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for <code>germinate_db.phenotypes.datatype</code>. Defines the
     * data type of the phenotype. This can be of numeric, text, date or
     * categorical types.
     */
    public PhenotypesDatatype getDatatype() {
        return this.datatype;
    }

    /**
     * Setter for <code>germinate_db.phenotypes.datatype</code>. Defines the
     * data type of the phenotype. This can be of numeric, text, date or
     * categorical types.
     */
    public void setDatatype(PhenotypesDatatype datatype) {
        this.datatype = datatype;
    }

    /**
     * Getter for <code>germinate_db.phenotypes.restrictions</code>. A json
     * object describing the restrictions placed on this trait. It is an object
     * containing a field called "categories" which is an array of arrays, each
     * describing a categorical scale. Each scale must have the same length as
     * they describe the same categories just using different terms or numbers.
     * The other fields are "min" and "max" to specify upper and lower limits
     * for numeric traits.
     */
    public TraitRestrictions getRestrictions() {
        return this.restrictions;
    }

    /**
     * Setter for <code>germinate_db.phenotypes.restrictions</code>. A json
     * object describing the restrictions placed on this trait. It is an object
     * containing a field called "categories" which is an array of arrays, each
     * describing a categorical scale. Each scale must have the same length as
     * they describe the same categories just using different terms or numbers.
     * The other fields are "min" and "max" to specify upper and lower limits
     * for numeric traits.
     */
    public void setRestrictions(TraitRestrictions restrictions) {
        this.restrictions = restrictions;
    }

    /**
     * Getter for <code>germinate_db.phenotypes.unit_id</code>. Foreign Key to
     * units (units.id).
     */
    public Integer getUnitId() {
        return this.unitId;
    }

    /**
     * Setter for <code>germinate_db.phenotypes.unit_id</code>. Foreign Key to
     * units (units.id).
     */
    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    /**
     * Getter for <code>germinate_db.phenotypes.created_on</code>. When the
     * record was created.
     */
    public Timestamp getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>germinate_db.phenotypes.created_on</code>. When the
     * record was created.
     */
    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Getter for <code>germinate_db.phenotypes.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * changes have been made subsequently to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return this.updatedOn;
    }

    /**
     * Setter for <code>germinate_db.phenotypes.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * changes have been made subsequently to the underlying record.
     */
    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Phenotypes (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(shortName);
        sb.append(", ").append(description);
        sb.append(", ").append(datatype);
        sb.append(", ").append(restrictions);
        sb.append(", ").append(unitId);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
