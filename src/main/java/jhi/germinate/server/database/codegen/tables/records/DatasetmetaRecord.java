/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.tables.Datasetmeta;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


// @formatter:off
/**
 * Defines dataset sizes for the items in the datasets table. This table is
 * automatically updated every hour.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DatasetmetaRecord extends UpdatableRecordImpl<DatasetmetaRecord> implements Record6<Integer, Integer, ULong, ULong, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>germinate_db.datasetmeta.id</code>. Primary id for this
     * table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.datasetmeta.id</code>. Primary id for this
     * table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.datasetmeta.dataset_id</code>. Foreign key
     * to [datasets] ([datasets].id).
     */
    public void setDatasetId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.datasetmeta.dataset_id</code>. Foreign key
     * to [datasets] ([datasets].id).
     */
    public Integer getDatasetId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>germinate_db.datasetmeta.nr_of_data_objects</code>. The
     * number of data objects contained in this dataset.
     */
    public void setNrOfDataObjects(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.datasetmeta.nr_of_data_objects</code>. The
     * number of data objects contained in this dataset.
     */
    public ULong getNrOfDataObjects() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>germinate_db.datasetmeta.nr_of_data_points</code>. The
     * number of individual data points contained in this dataset.
     */
    public void setNrOfDataPoints(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.datasetmeta.nr_of_data_points</code>. The
     * number of individual data points contained in this dataset.
     */
    public ULong getNrOfDataPoints() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>germinate_db.datasetmeta.created_on</code>. When the
     * record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.datasetmeta.created_on</code>. When the
     * record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>germinate_db.datasetmeta.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.datasetmeta.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, ULong, ULong, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, Integer, ULong, ULong, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Datasetmeta.DATASETMETA.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Datasetmeta.DATASETMETA.DATASET_ID;
    }

    @Override
    public Field<ULong> field3() {
        return Datasetmeta.DATASETMETA.NR_OF_DATA_OBJECTS;
    }

    @Override
    public Field<ULong> field4() {
        return Datasetmeta.DATASETMETA.NR_OF_DATA_POINTS;
    }

    @Override
    public Field<Timestamp> field5() {
        return Datasetmeta.DATASETMETA.CREATED_ON;
    }

    @Override
    public Field<Timestamp> field6() {
        return Datasetmeta.DATASETMETA.UPDATED_ON;
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
    public ULong component3() {
        return getNrOfDataObjects();
    }

    @Override
    public ULong component4() {
        return getNrOfDataPoints();
    }

    @Override
    public Timestamp component5() {
        return getCreatedOn();
    }

    @Override
    public Timestamp component6() {
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
    public ULong value3() {
        return getNrOfDataObjects();
    }

    @Override
    public ULong value4() {
        return getNrOfDataPoints();
    }

    @Override
    public Timestamp value5() {
        return getCreatedOn();
    }

    @Override
    public Timestamp value6() {
        return getUpdatedOn();
    }

    @Override
    public DatasetmetaRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public DatasetmetaRecord value2(Integer value) {
        setDatasetId(value);
        return this;
    }

    @Override
    public DatasetmetaRecord value3(ULong value) {
        setNrOfDataObjects(value);
        return this;
    }

    @Override
    public DatasetmetaRecord value4(ULong value) {
        setNrOfDataPoints(value);
        return this;
    }

    @Override
    public DatasetmetaRecord value5(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public DatasetmetaRecord value6(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    @Override
    public DatasetmetaRecord values(Integer value1, Integer value2, ULong value3, ULong value4, Timestamp value5, Timestamp value6) {
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
     * Create a detached DatasetmetaRecord
     */
    public DatasetmetaRecord() {
        super(Datasetmeta.DATASETMETA);
    }

    /**
     * Create a detached, initialised DatasetmetaRecord
     */
    public DatasetmetaRecord(Integer id, Integer datasetId, ULong nrOfDataObjects, ULong nrOfDataPoints, Timestamp createdOn, Timestamp updatedOn) {
        super(Datasetmeta.DATASETMETA);

        setId(id);
        setDatasetId(datasetId);
        setNrOfDataObjects(nrOfDataObjects);
        setNrOfDataPoints(nrOfDataPoints);
        setCreatedOn(createdOn);
        setUpdatedOn(updatedOn);
    }

    /**
     * Create a detached, initialised DatasetmetaRecord
     */
    public DatasetmetaRecord(jhi.germinate.server.database.codegen.tables.pojos.Datasetmeta value) {
        super(Datasetmeta.DATASETMETA);

        if (value != null) {
            setId(value.getId());
            setDatasetId(value.getDatasetId());
            setNrOfDataObjects(value.getNrOfDataObjects());
            setNrOfDataPoints(value.getNrOfDataPoints());
            setCreatedOn(value.getCreatedOn());
            setUpdatedOn(value.getUpdatedOn());
        }
    }
    // @formatter:on
}
