/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;


// @formatter:off
/**
 * Synonym type definitions.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Synonymtypes implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer   id;
    private String    targetTable;
    private String    name;
    private String    description;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Synonymtypes() {}

    public Synonymtypes(Synonymtypes value) {
        this.id = value.id;
        this.targetTable = value.targetTable;
        this.name = value.name;
        this.description = value.description;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Synonymtypes(
        Integer   id,
        String    targetTable,
        String    name,
        String    description,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.targetTable = targetTable;
        this.name = name;
        this.description = description;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    /**
     * Getter for <code>germinate_db.synonymtypes.id</code>. Primary id for this
     * table. This uniquely identifies the row.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>germinate_db.synonymtypes.id</code>. Primary id for this
     * table. This uniquely identifies the row.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>germinate_db.synonymtypes.target_table</code>. The
     * target table.
     */
    public String getTargetTable() {
        return this.targetTable;
    }

    /**
     * Setter for <code>germinate_db.synonymtypes.target_table</code>. The
     * target table.
     */
    public void setTargetTable(String targetTable) {
        this.targetTable = targetTable;
    }

    /**
     * Getter for <code>germinate_db.synonymtypes.name</code>. Name of the
     * synonym type.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>germinate_db.synonymtypes.name</code>. Name of the
     * synonym type.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>germinate_db.synonymtypes.description</code>.
     * Description of the type.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>germinate_db.synonymtypes.description</code>.
     * Description of the type.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for <code>germinate_db.synonymtypes.created_on</code>. When the
     * record was created.
     */
    public Timestamp getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>germinate_db.synonymtypes.created_on</code>. When the
     * record was created.
     */
    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Getter for <code>germinate_db.synonymtypes.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return this.updatedOn;
    }

    /**
     * Setter for <code>germinate_db.synonymtypes.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Synonymtypes (");

        sb.append(id);
        sb.append(", ").append(targetTable);
        sb.append(", ").append(name);
        sb.append(", ").append(description);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
