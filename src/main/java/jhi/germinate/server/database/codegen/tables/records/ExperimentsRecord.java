/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Date;
import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.tables.Experiments;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * Defines ecperiments that are held in Germinate.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExperimentsRecord extends UpdatableRecordImpl<ExperimentsRecord> implements Record8<Integer, String, Integer, Integer, String, Date, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>germinate_db.experiments.id</code>. Primary id for this
     * table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.experiments.id</code>. Primary id for this
     * table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.experiments.experiment_name</code>. The
     * name of the experiment.
     */
    public void setExperimentName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.experiments.experiment_name</code>. The
     * name of the experiment.
     */
    public String getExperimentName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_db.experiments.user_id</code>. Foreign key to
     * Gatekeeper users (Gatekeeper users.id).

     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.experiments.user_id</code>. Foreign key to
     * Gatekeeper users (Gatekeeper users.id).

     */
    public Integer getUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>germinate_db.experiments.project_id</code>.
     */
    public void setProjectId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.experiments.project_id</code>.
     */
    public Integer getProjectId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>germinate_db.experiments.description</code>. Describes
     * the experiment.
     */
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.experiments.description</code>. Describes
     * the experiment.
     */
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>germinate_db.experiments.experiment_date</code>. The
     * date that the experiment was carried out.
     */
    public void setExperimentDate(Date value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.experiments.experiment_date</code>. The
     * date that the experiment was carried out.
     */
    public Date getExperimentDate() {
        return (Date) get(5);
    }

    /**
     * Setter for <code>germinate_db.experiments.created_on</code>. When the
     * record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_db.experiments.created_on</code>. When the
     * record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>germinate_db.experiments.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_db.experiments.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
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
    public Row8<Integer, String, Integer, Integer, String, Date, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Integer, String, Integer, Integer, String, Date, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Experiments.EXPERIMENTS.ID;
    }

    @Override
    public Field<String> field2() {
        return Experiments.EXPERIMENTS.EXPERIMENT_NAME;
    }

    @Override
    public Field<Integer> field3() {
        return Experiments.EXPERIMENTS.USER_ID;
    }

    @Override
    public Field<Integer> field4() {
        return Experiments.EXPERIMENTS.PROJECT_ID;
    }

    @Override
    public Field<String> field5() {
        return Experiments.EXPERIMENTS.DESCRIPTION;
    }

    @Override
    public Field<Date> field6() {
        return Experiments.EXPERIMENTS.EXPERIMENT_DATE;
    }

    @Override
    public Field<Timestamp> field7() {
        return Experiments.EXPERIMENTS.CREATED_ON;
    }

    @Override
    public Field<Timestamp> field8() {
        return Experiments.EXPERIMENTS.UPDATED_ON;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getExperimentName();
    }

    @Override
    public Integer component3() {
        return getUserId();
    }

    @Override
    public Integer component4() {
        return getProjectId();
    }

    @Override
    public String component5() {
        return getDescription();
    }

    @Override
    public Date component6() {
        return getExperimentDate();
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
    public String value2() {
        return getExperimentName();
    }

    @Override
    public Integer value3() {
        return getUserId();
    }

    @Override
    public Integer value4() {
        return getProjectId();
    }

    @Override
    public String value5() {
        return getDescription();
    }

    @Override
    public Date value6() {
        return getExperimentDate();
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
    public ExperimentsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public ExperimentsRecord value2(String value) {
        setExperimentName(value);
        return this;
    }

    @Override
    public ExperimentsRecord value3(Integer value) {
        setUserId(value);
        return this;
    }

    @Override
    public ExperimentsRecord value4(Integer value) {
        setProjectId(value);
        return this;
    }

    @Override
    public ExperimentsRecord value5(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public ExperimentsRecord value6(Date value) {
        setExperimentDate(value);
        return this;
    }

    @Override
    public ExperimentsRecord value7(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public ExperimentsRecord value8(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    @Override
    public ExperimentsRecord values(Integer value1, String value2, Integer value3, Integer value4, String value5, Date value6, Timestamp value7, Timestamp value8) {
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
     * Create a detached ExperimentsRecord
     */
    public ExperimentsRecord() {
        super(Experiments.EXPERIMENTS);
    }

    /**
     * Create a detached, initialised ExperimentsRecord
     */
    public ExperimentsRecord(Integer id, String experimentName, Integer userId, Integer projectId, String description, Date experimentDate, Timestamp createdOn, Timestamp updatedOn) {
        super(Experiments.EXPERIMENTS);

        setId(id);
        setExperimentName(experimentName);
        setUserId(userId);
        setProjectId(projectId);
        setDescription(description);
        setExperimentDate(experimentDate);
        setCreatedOn(createdOn);
        setUpdatedOn(updatedOn);
    }

    /**
     * Create a detached, initialised ExperimentsRecord
     */
    public ExperimentsRecord(jhi.germinate.server.database.codegen.tables.pojos.Experiments value) {
        super(Experiments.EXPERIMENTS);

        if (value != null) {
            setId(value.getId());
            setExperimentName(value.getExperimentName());
            setUserId(value.getUserId());
            setProjectId(value.getProjectId());
            setDescription(value.getDescription());
            setExperimentDate(value.getExperimentDate());
            setCreatedOn(value.getCreatedOn());
            setUpdatedOn(value.getUpdatedOn());
        }
    }
    // @formatter:on
}
