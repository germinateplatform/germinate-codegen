/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;


// @formatter:off
/**
 * Defines attributes data. Attributes which are defined in attributes can have
 * values associated with them. Data which does not warrant new column in the
 * germinatebase table can be added here. Examples include small amounts of data
 * defining germplasm which only exists for a small sub-group of the total
 * database.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Attributedata implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer   id;
    private Integer   attributeId;
    private Integer   foreignId;
    private String    value;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Attributedata() {}

    public Attributedata(Attributedata value) {
        this.id = value.id;
        this.attributeId = value.attributeId;
        this.foreignId = value.foreignId;
        this.value = value.value;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Attributedata(
        Integer   id,
        Integer   attributeId,
        Integer   foreignId,
        String    value,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.attributeId = attributeId;
        this.foreignId = foreignId;
        this.value = value;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    /**
     * Getter for <code>germinate_db.attributedata.id</code>. Primary id for
     * this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>germinate_db.attributedata.id</code>. Primary id for
     * this table. This uniquely identifies the row.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>germinate_db.attributedata.attribute_id</code>. Foreign
     * key to attributes (attributes.id).
     */
    public Integer getAttributeId() {
        return this.attributeId;
    }

    /**
     * Setter for <code>germinate_db.attributedata.attribute_id</code>. Foreign
     * key to attributes (attributes.id).
     */
    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    /**
     * Getter for <code>germinate_db.attributedata.foreign_id</code>. Foreign
     * key to germinatebase (germinatebase.id).
     */
    public Integer getForeignId() {
        return this.foreignId;
    }

    /**
     * Setter for <code>germinate_db.attributedata.foreign_id</code>. Foreign
     * key to germinatebase (germinatebase.id).
     */
    public void setForeignId(Integer foreignId) {
        this.foreignId = foreignId;
    }

    /**
     * Getter for <code>germinate_db.attributedata.value</code>. The value of
     * the attribute.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Setter for <code>germinate_db.attributedata.value</code>. The value of
     * the attribute.
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Getter for <code>germinate_db.attributedata.created_on</code>. When the
     * record was created.
     */
    public Timestamp getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>germinate_db.attributedata.created_on</code>. When the
     * record was created.
     */
    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Getter for <code>germinate_db.attributedata.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return this.updatedOn;
    }

    /**
     * Setter for <code>germinate_db.attributedata.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Attributedata (");

        sb.append(id);
        sb.append(", ").append(attributeId);
        sb.append(", ").append(foreignId);
        sb.append(", ").append(value);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
