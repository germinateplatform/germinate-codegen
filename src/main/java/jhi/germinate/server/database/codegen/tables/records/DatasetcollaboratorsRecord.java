/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.tables.Datasetcollaborators;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DatasetcollaboratorsRecord extends UpdatableRecordImpl<DatasetcollaboratorsRecord> implements Record6<Integer, Integer, Integer, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>germinate_db.datasetcollaborators.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.datasetcollaborators.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.datasetcollaborators.dataset_id</code>.
     */
    public void setDatasetId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.datasetcollaborators.dataset_id</code>.
     */
    public Integer getDatasetId() {
        return (Integer) get(1);
    }

    /**
     * Setter for
     * <code>germinate_db.datasetcollaborators.collaborator_id</code>.
     */
    public void setCollaboratorId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>germinate_db.datasetcollaborators.collaborator_id</code>.
     */
    public Integer getCollaboratorId() {
        return (Integer) get(2);
    }

    /**
     * Setter for
     * <code>germinate_db.datasetcollaborators.collaborator_roles</code>. Type
     * of contribution of the person to the investigation (e.g. data submitter;
     * author; corresponding author)
     */
    public void setCollaboratorRoles(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>germinate_db.datasetcollaborators.collaborator_roles</code>. Type
     * of contribution of the person to the investigation (e.g. data submitter;
     * author; corresponding author)
     */
    public String getCollaboratorRoles() {
        return (String) get(3);
    }

    /**
     * Setter for <code>germinate_db.datasetcollaborators.created_on</code>.
     * When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.datasetcollaborators.created_on</code>.
     * When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>germinate_db.datasetcollaborators.updated_on</code>.
     * When the record was updated. This may be different from the created on
     * date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.datasetcollaborators.updated_on</code>.
     * When the record was updated. This may be different from the created on
     * date if subsequent changes have been made to the underlying record.
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
    public Row6<Integer, Integer, Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, Integer, Integer, String, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Datasetcollaborators.DATASETCOLLABORATORS.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Datasetcollaborators.DATASETCOLLABORATORS.DATASET_ID;
    }

    @Override
    public Field<Integer> field3() {
        return Datasetcollaborators.DATASETCOLLABORATORS.COLLABORATOR_ID;
    }

    @Override
    public Field<String> field4() {
        return Datasetcollaborators.DATASETCOLLABORATORS.COLLABORATOR_ROLES;
    }

    @Override
    public Field<Timestamp> field5() {
        return Datasetcollaborators.DATASETCOLLABORATORS.CREATED_ON;
    }

    @Override
    public Field<Timestamp> field6() {
        return Datasetcollaborators.DATASETCOLLABORATORS.UPDATED_ON;
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
        return getCollaboratorId();
    }

    @Override
    public String component4() {
        return getCollaboratorRoles();
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
    public Integer value3() {
        return getCollaboratorId();
    }

    @Override
    public String value4() {
        return getCollaboratorRoles();
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
    public DatasetcollaboratorsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public DatasetcollaboratorsRecord value2(Integer value) {
        setDatasetId(value);
        return this;
    }

    @Override
    public DatasetcollaboratorsRecord value3(Integer value) {
        setCollaboratorId(value);
        return this;
    }

    @Override
    public DatasetcollaboratorsRecord value4(String value) {
        setCollaboratorRoles(value);
        return this;
    }

    @Override
    public DatasetcollaboratorsRecord value5(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public DatasetcollaboratorsRecord value6(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    @Override
    public DatasetcollaboratorsRecord values(Integer value1, Integer value2, Integer value3, String value4, Timestamp value5, Timestamp value6) {
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
     * Create a detached DatasetcollaboratorsRecord
     */
    public DatasetcollaboratorsRecord() {
        super(Datasetcollaborators.DATASETCOLLABORATORS);
    }

    /**
     * Create a detached, initialised DatasetcollaboratorsRecord
     */
    public DatasetcollaboratorsRecord(Integer id, Integer datasetId, Integer collaboratorId, String collaboratorRoles, Timestamp createdOn, Timestamp updatedOn) {
        super(Datasetcollaborators.DATASETCOLLABORATORS);

        setId(id);
        setDatasetId(datasetId);
        setCollaboratorId(collaboratorId);
        setCollaboratorRoles(collaboratorRoles);
        setCreatedOn(createdOn);
        setUpdatedOn(updatedOn);
    }

    /**
     * Create a detached, initialised DatasetcollaboratorsRecord
     */
    public DatasetcollaboratorsRecord(jhi.germinate.server.database.codegen.tables.pojos.Datasetcollaborators value) {
        super(Datasetcollaborators.DATASETCOLLABORATORS);

        if (value != null) {
            setId(value.getId());
            setDatasetId(value.getDatasetId());
            setCollaboratorId(value.getCollaboratorId());
            setCollaboratorRoles(value.getCollaboratorRoles());
            setCreatedOn(value.getCreatedOn());
            setUpdatedOn(value.getUpdatedOn());
        }
    }
    // @formatter:on
}
