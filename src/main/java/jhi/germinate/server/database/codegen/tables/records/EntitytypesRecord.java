/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.tables.Entitytypes;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EntitytypesRecord extends UpdatableRecordImpl<EntitytypesRecord> implements Record5<Integer, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>germinate_db.entitytypes.id</code>. Primary id for this
     * table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.entitytypes.id</code>. Primary id for this
     * table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.entitytypes.name</code>. The name of the
     * entity type.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.entitytypes.name</code>. The name of the
     * entity type.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_db.entitytypes.description</code>. Describes
     * the entity type.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.entitytypes.description</code>. Describes
     * the entity type.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_db.entitytypes.created_on</code>. When the
     * record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.entitytypes.created_on</code>. When the
     * record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>germinate_db.entitytypes.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.entitytypes.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Entitytypes.ENTITYTYPES.ID;
    }

    @Override
    public Field<String> field2() {
        return Entitytypes.ENTITYTYPES.NAME;
    }

    @Override
    public Field<String> field3() {
        return Entitytypes.ENTITYTYPES.DESCRIPTION;
    }

    @Override
    public Field<Timestamp> field4() {
        return Entitytypes.ENTITYTYPES.CREATED_ON;
    }

    @Override
    public Field<Timestamp> field5() {
        return Entitytypes.ENTITYTYPES.UPDATED_ON;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public Timestamp component4() {
        return getCreatedOn();
    }

    @Override
    public Timestamp component5() {
        return getUpdatedOn();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public Timestamp value4() {
        return getCreatedOn();
    }

    @Override
    public Timestamp value5() {
        return getUpdatedOn();
    }

    @Override
    public EntitytypesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public EntitytypesRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public EntitytypesRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public EntitytypesRecord value4(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public EntitytypesRecord value5(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    @Override
    public EntitytypesRecord values(Integer value1, String value2, String value3, Timestamp value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EntitytypesRecord
     */
    public EntitytypesRecord() {
        super(Entitytypes.ENTITYTYPES);
    }

    /**
     * Create a detached, initialised EntitytypesRecord
     */
    public EntitytypesRecord(Integer id, String name, String description, Timestamp createdOn, Timestamp updatedOn) {
        super(Entitytypes.ENTITYTYPES);

        setId(id);
        setName(name);
        setDescription(description);
        setCreatedOn(createdOn);
        setUpdatedOn(updatedOn);
    }

    /**
     * Create a detached, initialised EntitytypesRecord
     */
    public EntitytypesRecord(jhi.germinate.server.database.codegen.tables.pojos.Entitytypes value) {
        super(Entitytypes.ENTITYTYPES);

        if (value != null) {
            setId(value.getId());
            setName(value.getName());
            setDescription(value.getDescription());
            setCreatedOn(value.getCreatedOn());
            setUpdatedOn(value.getUpdatedOn());
        }
    }
    // @formatter:on
}
