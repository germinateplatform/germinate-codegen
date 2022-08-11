/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.tables.Datasetfileresources;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DatasetfileresourcesRecord extends UpdatableRecordImpl<DatasetfileresourcesRecord> implements Record4<Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>germinate_db.datasetfileresources.dataset_id</code>.
     */
    public void setDatasetId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.datasetfileresources.dataset_id</code>.
     */
    public Integer getDatasetId() {
        return (Integer) get(0);
    }

    /**
     * Setter for
     * <code>germinate_db.datasetfileresources.fileresource_id</code>.
     */
    public void setFileresourceId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>germinate_db.datasetfileresources.fileresource_id</code>.
     */
    public Integer getFileresourceId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>germinate_db.datasetfileresources.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.datasetfileresources.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>germinate_db.datasetfileresources.updated_on</code>.
     */
    public void setUpdatedOn(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.datasetfileresources.updated_on</code>.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Datasetfileresources.DATASETFILERESOURCES.DATASET_ID;
    }

    @Override
    public Field<Integer> field2() {
        return Datasetfileresources.DATASETFILERESOURCES.FILERESOURCE_ID;
    }

    @Override
    public Field<Timestamp> field3() {
        return Datasetfileresources.DATASETFILERESOURCES.CREATED_ON;
    }

    @Override
    public Field<Timestamp> field4() {
        return Datasetfileresources.DATASETFILERESOURCES.UPDATED_ON;
    }

    @Override
    public Integer component1() {
        return getDatasetId();
    }

    @Override
    public Integer component2() {
        return getFileresourceId();
    }

    @Override
    public Timestamp component3() {
        return getCreatedOn();
    }

    @Override
    public Timestamp component4() {
        return getUpdatedOn();
    }

    @Override
    public Integer value1() {
        return getDatasetId();
    }

    @Override
    public Integer value2() {
        return getFileresourceId();
    }

    @Override
    public Timestamp value3() {
        return getCreatedOn();
    }

    @Override
    public Timestamp value4() {
        return getUpdatedOn();
    }

    @Override
    public DatasetfileresourcesRecord value1(Integer value) {
        setDatasetId(value);
        return this;
    }

    @Override
    public DatasetfileresourcesRecord value2(Integer value) {
        setFileresourceId(value);
        return this;
    }

    @Override
    public DatasetfileresourcesRecord value3(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public DatasetfileresourcesRecord value4(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    @Override
    public DatasetfileresourcesRecord values(Integer value1, Integer value2, Timestamp value3, Timestamp value4) {
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
     * Create a detached DatasetfileresourcesRecord
     */
    public DatasetfileresourcesRecord() {
        super(Datasetfileresources.DATASETFILERESOURCES);
    }

    /**
     * Create a detached, initialised DatasetfileresourcesRecord
     */
    public DatasetfileresourcesRecord(Integer datasetId, Integer fileresourceId, Timestamp createdOn, Timestamp updatedOn) {
        super(Datasetfileresources.DATASETFILERESOURCES);

        setDatasetId(datasetId);
        setFileresourceId(fileresourceId);
        setCreatedOn(createdOn);
        setUpdatedOn(updatedOn);
    }

    /**
     * Create a detached, initialised DatasetfileresourcesRecord
     */
    public DatasetfileresourcesRecord(jhi.germinate.server.database.codegen.tables.pojos.Datasetfileresources value) {
        super(Datasetfileresources.DATASETFILERESOURCES);

        if (value != null) {
            setDatasetId(value.getDatasetId());
            setFileresourceId(value.getFileresourceId());
            setCreatedOn(value.getCreatedOn());
            setUpdatedOn(value.getUpdatedOn());
        }
    }
    // @formatter:on
}