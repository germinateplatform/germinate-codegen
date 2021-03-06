/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.tables.Pedigreenotations;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * Allows additional supporting data to be associated with a pedigree definition 
 * such as the contributing data source.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PedigreenotationsRecord extends UpdatableRecordImpl<PedigreenotationsRecord> implements Record6<Integer, String, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 672888745;

    /**
     * Setter for <code>germinate_db.pedigreenotations.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.pedigreenotations.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.pedigreenotations.name</code>. Name of the reference notation source.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.pedigreenotations.name</code>. Name of the reference notation source.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_db.pedigreenotations.description</code>. A longer description about the reference notation source.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.pedigreenotations.description</code>. A longer description about the reference notation source.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_db.pedigreenotations.reference_url</code>. Hyperlink to the notation source.
     */
    public void setReferenceUrl(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.pedigreenotations.reference_url</code>. Hyperlink to the notation source.
     */
    public String getReferenceUrl() {
        return (String) get(3);
    }

    /**
     * Setter for <code>germinate_db.pedigreenotations.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.pedigreenotations.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>germinate_db.pedigreenotations.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.pedigreenotations.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Pedigreenotations.PEDIGREENOTATIONS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Pedigreenotations.PEDIGREENOTATIONS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Pedigreenotations.PEDIGREENOTATIONS.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Pedigreenotations.PEDIGREENOTATIONS.REFERENCE_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Pedigreenotations.PEDIGREENOTATIONS.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Pedigreenotations.PEDIGREENOTATIONS.UPDATED_ON;
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getReferenceUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getReferenceUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PedigreenotationsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PedigreenotationsRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PedigreenotationsRecord value3(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PedigreenotationsRecord value4(String value) {
        setReferenceUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PedigreenotationsRecord value5(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PedigreenotationsRecord value6(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PedigreenotationsRecord values(Integer value1, String value2, String value3, String value4, Timestamp value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PedigreenotationsRecord
     */
    public PedigreenotationsRecord() {
        super(Pedigreenotations.PEDIGREENOTATIONS);
    }

    /**
     * Create a detached, initialised PedigreenotationsRecord
     */
    public PedigreenotationsRecord(Integer id, String name, String description, String referenceUrl, Timestamp createdOn, Timestamp updatedOn) {
        super(Pedigreenotations.PEDIGREENOTATIONS);

        set(0, id);
        set(1, name);
        set(2, description);
        set(3, referenceUrl);
        set(4, createdOn);
        set(5, updatedOn);
    }
// @formatter:on
}
