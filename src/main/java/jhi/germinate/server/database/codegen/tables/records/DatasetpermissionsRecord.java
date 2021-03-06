/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.tables.Datasetpermissions;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * This defines which users can view which datasets. Requires Germinate Gatekeeper. 
 * This overrides the datasets state.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DatasetpermissionsRecord extends UpdatableRecordImpl<DatasetpermissionsRecord> implements Record6<Integer, Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -750888218;

    /**
     * Setter for <code>germinate_db.datasetpermissions.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.datasetpermissions.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.datasetpermissions.dataset_id</code>. Foreign key to datasets (datasets.id).
     */
    public void setDatasetId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.datasetpermissions.dataset_id</code>. Foreign key to datasets (datasets.id).
     */
    public Integer getDatasetId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>germinate_db.datasetpermissions.user_id</code>. Foreign key to Gatekeeper users (Gatekeeper usersid).
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.datasetpermissions.user_id</code>. Foreign key to Gatekeeper users (Gatekeeper usersid).
     */
    public Integer getUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>germinate_db.datasetpermissions.group_id</code>. Foreign key to usergroups table.
     */
    public void setGroupId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.datasetpermissions.group_id</code>. Foreign key to usergroups table.
     */
    public Integer getGroupId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>germinate_db.datasetpermissions.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.datasetpermissions.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>germinate_db.datasetpermissions.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.datasetpermissions.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
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
    public Row6<Integer, Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Datasetpermissions.DATASETPERMISSIONS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Datasetpermissions.DATASETPERMISSIONS.DATASET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Datasetpermissions.DATASETPERMISSIONS.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Datasetpermissions.DATASETPERMISSIONS.GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Datasetpermissions.DATASETPERMISSIONS.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Datasetpermissions.DATASETPERMISSIONS.UPDATED_ON;
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
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getGroupId();
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
    public Integer value2() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getGroupId();
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
    public DatasetpermissionsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetpermissionsRecord value2(Integer value) {
        setDatasetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetpermissionsRecord value3(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetpermissionsRecord value4(Integer value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetpermissionsRecord value5(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetpermissionsRecord value6(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatasetpermissionsRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Timestamp value5, Timestamp value6) {
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
     * Create a detached DatasetpermissionsRecord
     */
    public DatasetpermissionsRecord() {
        super(Datasetpermissions.DATASETPERMISSIONS);
    }

    /**
     * Create a detached, initialised DatasetpermissionsRecord
     */
    public DatasetpermissionsRecord(Integer id, Integer datasetId, Integer userId, Integer groupId, Timestamp createdOn, Timestamp updatedOn) {
        super(Datasetpermissions.DATASETPERMISSIONS);

        set(0, id);
        set(1, datasetId);
        set(2, userId);
        set(3, groupId);
        set(4, createdOn);
        set(5, updatedOn);
    }
// @formatter:on
}
