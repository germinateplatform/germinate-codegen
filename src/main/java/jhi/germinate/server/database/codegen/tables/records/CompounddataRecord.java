/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.tables.Compounddata;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CompounddataRecord extends UpdatableRecordImpl<CompounddataRecord> implements Record9<Integer, Integer, Integer, Integer, Integer, BigDecimal, Timestamp, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1818926658;

    /**
     * Setter for <code>germinate_db.compounddata.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.compounddata.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.compounddata.compound_id</code>. Foreign key compounds (compounds.id).
     */
    public void setCompoundId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.compounddata.compound_id</code>. Foreign key compounds (compounds.id).
     */
    public Integer getCompoundId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>germinate_db.compounddata.germinatebase_id</code>. Foreign key germinatebase (germinatebase.id).
     */
    public void setGerminatebaseId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.compounddata.germinatebase_id</code>. Foreign key germinatebase (germinatebase.id).
     */
    public Integer getGerminatebaseId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>germinate_db.compounddata.dataset_id</code>. Foreign key datasets (datasets.id).
     */
    public void setDatasetId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.compounddata.dataset_id</code>. Foreign key datasets (datasets.id).
     */
    public Integer getDatasetId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>germinate_db.compounddata.analysismethod_id</code>. Foreign key analysismethods (analysismethods.id).
     */
    public void setAnalysismethodId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.compounddata.analysismethod_id</code>. Foreign key analysismethods (analysismethods.id).
     */
    public Integer getAnalysismethodId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>germinate_db.compounddata.compound_value</code>. The compound value for this compound_id and germinatebase_id combination.
     */
    public void setCompoundValue(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.compounddata.compound_value</code>. The compound value for this compound_id and germinatebase_id combination.
     */
    public BigDecimal getCompoundValue() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>germinate_db.compounddata.recording_date</code>. Date when the phenotypic result was recorded. Should be formatted 'YYYY-MM-DD HH:MM:SS' or just 'YYYY-MM-DD' where a timestamp is not available.
     */
    public void setRecordingDate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_db.compounddata.recording_date</code>. Date when the phenotypic result was recorded. Should be formatted 'YYYY-MM-DD HH:MM:SS' or just 'YYYY-MM-DD' where a timestamp is not available.
     */
    public Timestamp getRecordingDate() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>germinate_db.compounddata.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_db.compounddata.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>germinate_db.compounddata.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_db.compounddata.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, Integer, Integer, Integer, BigDecimal, Timestamp, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, Integer, Integer, Integer, BigDecimal, Timestamp, Timestamp, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Compounddata.COMPOUNDDATA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Compounddata.COMPOUNDDATA.COMPOUND_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Compounddata.COMPOUNDDATA.GERMINATEBASE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Compounddata.COMPOUNDDATA.DATASET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Compounddata.COMPOUNDDATA.ANALYSISMETHOD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return Compounddata.COMPOUNDDATA.COMPOUND_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Compounddata.COMPOUNDDATA.RECORDING_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Compounddata.COMPOUNDDATA.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return Compounddata.COMPOUNDDATA.UPDATED_ON;
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
    public Integer component2() {
        return getCompoundId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getGerminatebaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getAnalysismethodId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getCompoundValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getRecordingDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
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
    public Integer value2() {
        return getCompoundId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getGerminatebaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getAnalysismethodId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getCompoundValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getRecordingDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompounddataRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompounddataRecord value2(Integer value) {
        setCompoundId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompounddataRecord value3(Integer value) {
        setGerminatebaseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompounddataRecord value4(Integer value) {
        setDatasetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompounddataRecord value5(Integer value) {
        setAnalysismethodId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompounddataRecord value6(BigDecimal value) {
        setCompoundValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompounddataRecord value7(Timestamp value) {
        setRecordingDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompounddataRecord value8(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompounddataRecord value9(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompounddataRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, BigDecimal value6, Timestamp value7, Timestamp value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CompounddataRecord
     */
    public CompounddataRecord() {
        super(Compounddata.COMPOUNDDATA);
    }

    /**
     * Create a detached, initialised CompounddataRecord
     */
    public CompounddataRecord(Integer id, Integer compoundId, Integer germinatebaseId, Integer datasetId, Integer analysismethodId, BigDecimal compoundValue, Timestamp recordingDate, Timestamp createdOn, Timestamp updatedOn) {
        super(Compounddata.COMPOUNDDATA);

        set(0, id);
        set(1, compoundId);
        set(2, germinatebaseId);
        set(3, datasetId);
        set(4, analysismethodId);
        set(5, compoundValue);
        set(6, recordingDate);
        set(7, createdOn);
        set(8, updatedOn);
    }
// @formatter:on
}
