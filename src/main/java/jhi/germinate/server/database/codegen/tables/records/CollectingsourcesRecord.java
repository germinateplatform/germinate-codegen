/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.tables.Collectingsources;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * The coding scheme proposed can be used at 2 different levels of detail: 
 * either by using the
 * general codes such as 10, 20, 30, 40, etc., or by using the more specific 
 * codes,
 * such as 11, 12, etc. See Multi Crop Passport Descriptors (MCPD V2 2012) 
 * for further definitions.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CollectingsourcesRecord extends UpdatableRecordImpl<CollectingsourcesRecord> implements Record4<Integer, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -104808044;

    /**
     * Setter for <code>germinate_db.collectingsources.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.collectingsources.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.collectingsources.collsrc</code>. collsrc in the Multi Crop Passport Descriptors (MCPD V2 2012)

     */
    public void setCollsrc(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.collectingsources.collsrc</code>. collsrc in the Multi Crop Passport Descriptors (MCPD V2 2012)

     */
    public String getCollsrc() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_db.collectingsources.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.collectingsources.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>germinate_db.collectingsources.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.collectingsources.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Timestamp, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Collectingsources.COLLECTINGSOURCES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Collectingsources.COLLECTINGSOURCES.COLLSRC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Collectingsources.COLLECTINGSOURCES.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Collectingsources.COLLECTINGSOURCES.UPDATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getCollsrc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCollsrc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectingsourcesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectingsourcesRecord value2(String value) {
        setCollsrc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectingsourcesRecord value3(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectingsourcesRecord value4(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CollectingsourcesRecord values(Integer value1, String value2, Timestamp value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CollectingsourcesRecord
     */
    public CollectingsourcesRecord() {
        super(Collectingsources.COLLECTINGSOURCES);
    }

    /**
     * Create a detached, initialised CollectingsourcesRecord
     */
    public CollectingsourcesRecord(Integer id, String collsrc, Timestamp createdOn, Timestamp updatedOn) {
        super(Collectingsources.COLLECTINGSOURCES);

        set(0, id);
        set(1, collsrc);
        set(2, createdOn);
        set(3, updatedOn);
    }
// @formatter:on
}
