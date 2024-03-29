/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.tables.Pedigreedefinitions;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * This table holds the actual pedigree definition data.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PedigreedefinitionsRecord extends UpdatableRecordImpl<PedigreedefinitionsRecord> implements Record8<Integer, Integer, Integer, Integer, Integer, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>germinate_db.pedigreedefinitions.id</code>. Primary id
     * for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.pedigreedefinitions.id</code>. Primary id
     * for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.pedigreedefinitions.dataset_id</code>.
     */
    public void setDatasetId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.pedigreedefinitions.dataset_id</code>.
     */
    public Integer getDatasetId() {
        return (Integer) get(1);
    }

    /**
     * Setter for
     * <code>germinate_db.pedigreedefinitions.germinatebase_id</code>. Foreign
     * key to germinatebase (germinatebase.id).
     */
    public void setGerminatebaseId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>germinate_db.pedigreedefinitions.germinatebase_id</code>. Foreign
     * key to germinatebase (germinatebase.id).
     */
    public Integer getGerminatebaseId() {
        return (Integer) get(2);
    }

    /**
     * Setter for
     * <code>germinate_db.pedigreedefinitions.pedigreenotation_id</code>.
     * Foreign key to pedigreenotations (pedigreenotations.id).
     */
    public void setPedigreenotationId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>germinate_db.pedigreedefinitions.pedigreenotation_id</code>.
     * Foreign key to pedigreenotations (pedigreenotations.id).
     */
    public Integer getPedigreenotationId() {
        return (Integer) get(3);
    }

    /**
     * Setter for
     * <code>germinate_db.pedigreedefinitions.pedigreedescription_id</code>.
     */
    public void setPedigreedescriptionId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>germinate_db.pedigreedefinitions.pedigreedescription_id</code>.
     */
    public Integer getPedigreedescriptionId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>germinate_db.pedigreedefinitions.definition</code>. The
     * pedigree string which is used to represent the germinatebase entry.
     */
    public void setDefinition(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.pedigreedefinitions.definition</code>. The
     * pedigree string which is used to represent the germinatebase entry.
     */
    public String getDefinition() {
        return (String) get(5);
    }

    /**
     * Setter for <code>germinate_db.pedigreedefinitions.created_on</code>. When
     * the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_db.pedigreedefinitions.created_on</code>. When
     * the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>germinate_db.pedigreedefinitions.updated_on</code>. When
     * the record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_db.pedigreedefinitions.updated_on</code>. When
     * the record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, Integer, Integer, Integer, Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Integer, Integer, Integer, Integer, Integer, String, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Pedigreedefinitions.PEDIGREEDEFINITIONS.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Pedigreedefinitions.PEDIGREEDEFINITIONS.DATASET_ID;
    }

    @Override
    public Field<Integer> field3() {
        return Pedigreedefinitions.PEDIGREEDEFINITIONS.GERMINATEBASE_ID;
    }

    @Override
    public Field<Integer> field4() {
        return Pedigreedefinitions.PEDIGREEDEFINITIONS.PEDIGREENOTATION_ID;
    }

    @Override
    public Field<Integer> field5() {
        return Pedigreedefinitions.PEDIGREEDEFINITIONS.PEDIGREEDESCRIPTION_ID;
    }

    @Override
    public Field<String> field6() {
        return Pedigreedefinitions.PEDIGREEDEFINITIONS.DEFINITION;
    }

    @Override
    public Field<Timestamp> field7() {
        return Pedigreedefinitions.PEDIGREEDEFINITIONS.CREATED_ON;
    }

    @Override
    public Field<Timestamp> field8() {
        return Pedigreedefinitions.PEDIGREEDEFINITIONS.UPDATED_ON;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getDatasetId();
    }

    @Override
    public Integer component3() {
        return getGerminatebaseId();
    }

    @Override
    public Integer component4() {
        return getPedigreenotationId();
    }

    @Override
    public Integer component5() {
        return getPedigreedescriptionId();
    }

    @Override
    public String component6() {
        return getDefinition();
    }

    @Override
    public Timestamp component7() {
        return getCreatedOn();
    }

    @Override
    public Timestamp component8() {
        return getUpdatedOn();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getDatasetId();
    }

    @Override
    public Integer value3() {
        return getGerminatebaseId();
    }

    @Override
    public Integer value4() {
        return getPedigreenotationId();
    }

    @Override
    public Integer value5() {
        return getPedigreedescriptionId();
    }

    @Override
    public String value6() {
        return getDefinition();
    }

    @Override
    public Timestamp value7() {
        return getCreatedOn();
    }

    @Override
    public Timestamp value8() {
        return getUpdatedOn();
    }

    @Override
    public PedigreedefinitionsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public PedigreedefinitionsRecord value2(Integer value) {
        setDatasetId(value);
        return this;
    }

    @Override
    public PedigreedefinitionsRecord value3(Integer value) {
        setGerminatebaseId(value);
        return this;
    }

    @Override
    public PedigreedefinitionsRecord value4(Integer value) {
        setPedigreenotationId(value);
        return this;
    }

    @Override
    public PedigreedefinitionsRecord value5(Integer value) {
        setPedigreedescriptionId(value);
        return this;
    }

    @Override
    public PedigreedefinitionsRecord value6(String value) {
        setDefinition(value);
        return this;
    }

    @Override
    public PedigreedefinitionsRecord value7(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public PedigreedefinitionsRecord value8(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    @Override
    public PedigreedefinitionsRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, String value6, Timestamp value7, Timestamp value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PedigreedefinitionsRecord
     */
    public PedigreedefinitionsRecord() {
        super(Pedigreedefinitions.PEDIGREEDEFINITIONS);
    }

    /**
     * Create a detached, initialised PedigreedefinitionsRecord
     */
    public PedigreedefinitionsRecord(Integer id, Integer datasetId, Integer germinatebaseId, Integer pedigreenotationId, Integer pedigreedescriptionId, String definition, Timestamp createdOn, Timestamp updatedOn) {
        super(Pedigreedefinitions.PEDIGREEDEFINITIONS);

        setId(id);
        setDatasetId(datasetId);
        setGerminatebaseId(germinatebaseId);
        setPedigreenotationId(pedigreenotationId);
        setPedigreedescriptionId(pedigreedescriptionId);
        setDefinition(definition);
        setCreatedOn(createdOn);
        setUpdatedOn(updatedOn);
    }

    /**
     * Create a detached, initialised PedigreedefinitionsRecord
     */
    public PedigreedefinitionsRecord(jhi.germinate.server.database.codegen.tables.pojos.Pedigreedefinitions value) {
        super(Pedigreedefinitions.PEDIGREEDEFINITIONS);

        if (value != null) {
            setId(value.getId());
            setDatasetId(value.getDatasetId());
            setGerminatebaseId(value.getGerminatebaseId());
            setPedigreenotationId(value.getPedigreenotationId());
            setPedigreedescriptionId(value.getPedigreedescriptionId());
            setDefinition(value.getDefinition());
            setCreatedOn(value.getCreatedOn());
            setUpdatedOn(value.getUpdatedOn());
        }
    }
    // @formatter:on
}
