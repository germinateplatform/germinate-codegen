/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.enums.PedigreesRelationshipType;
import jhi.germinate.server.database.codegen.tables.Pedigrees;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * Holds pedigree definitions. A pedigree is constructed from a series of
 * individial-&gt;parent records. This gives a great deal of flexibility in how
 * pedigree networks can be constructed. This table is required for operation
 * with the Helium pedigree viewer.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PedigreesRecord extends UpdatableRecordImpl<PedigreesRecord> implements Record9<Integer, Integer, Integer, Integer, PedigreesRelationshipType, Integer, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>germinate_db.pedigrees.id</code>. Primary id for this
     * table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.pedigrees.id</code>. Primary id for this
     * table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.pedigrees.dataset_id</code>.
     */
    public void setDatasetId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.pedigrees.dataset_id</code>.
     */
    public Integer getDatasetId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>germinate_db.pedigrees.germinatebase_id</code>. Foreign
     * key germinatebase (germinatebase.id).
     */
    public void setGerminatebaseId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.pedigrees.germinatebase_id</code>. Foreign
     * key germinatebase (germinatebase.id).
     */
    public Integer getGerminatebaseId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>germinate_db.pedigrees.parent_id</code>. Foreign key
     * germinatebase (germinatebase.id). This is the parrent of the individual
     * identified in the germinatebase_id column.
     */
    public void setParentId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.pedigrees.parent_id</code>. Foreign key
     * germinatebase (germinatebase.id). This is the parrent of the individual
     * identified in the germinatebase_id column.
     */
    public Integer getParentId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>germinate_db.pedigrees.relationship_type</code>. Male or
     * Female parent. Should be recorded as 'M' (male) or 'F' (female).
     */
    public void setRelationshipType(PedigreesRelationshipType value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.pedigrees.relationship_type</code>. Male or
     * Female parent. Should be recorded as 'M' (male) or 'F' (female).
     */
    public PedigreesRelationshipType getRelationshipType() {
        return (PedigreesRelationshipType) get(4);
    }

    /**
     * Setter for <code>germinate_db.pedigrees.pedigreedescription_id</code>.
     * Foreign key pedigreedescriptions (pedigreedescriptions.id).
     */
    public void setPedigreedescriptionId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.pedigrees.pedigreedescription_id</code>.
     * Foreign key pedigreedescriptions (pedigreedescriptions.id).
     */
    public Integer getPedigreedescriptionId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>germinate_db.pedigrees.relationship_description</code>.
     * Can be used as a meta-data field to describe the relationships if a
     * complex rellationship is required. Examples may include, 'is a complex
     * cross containing', 'F4 generation' and so on. This is used by the Helium
     * pedigree visualiztion tool.
     */
    public void setRelationshipDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_db.pedigrees.relationship_description</code>.
     * Can be used as a meta-data field to describe the relationships if a
     * complex rellationship is required. Examples may include, 'is a complex
     * cross containing', 'F4 generation' and so on. This is used by the Helium
     * pedigree visualiztion tool.
     */
    public String getRelationshipDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>germinate_db.pedigrees.created_on</code>. When the
     * record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_db.pedigrees.created_on</code>. When the
     * record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>germinate_db.pedigrees.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_db.pedigrees.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, Integer, Integer, Integer, PedigreesRelationshipType, Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Integer, Integer, Integer, Integer, PedigreesRelationshipType, Integer, String, Timestamp, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Pedigrees.PEDIGREES.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Pedigrees.PEDIGREES.DATASET_ID;
    }

    @Override
    public Field<Integer> field3() {
        return Pedigrees.PEDIGREES.GERMINATEBASE_ID;
    }

    @Override
    public Field<Integer> field4() {
        return Pedigrees.PEDIGREES.PARENT_ID;
    }

    @Override
    public Field<PedigreesRelationshipType> field5() {
        return Pedigrees.PEDIGREES.RELATIONSHIP_TYPE;
    }

    @Override
    public Field<Integer> field6() {
        return Pedigrees.PEDIGREES.PEDIGREEDESCRIPTION_ID;
    }

    @Override
    public Field<String> field7() {
        return Pedigrees.PEDIGREES.RELATIONSHIP_DESCRIPTION;
    }

    @Override
    public Field<Timestamp> field8() {
        return Pedigrees.PEDIGREES.CREATED_ON;
    }

    @Override
    public Field<Timestamp> field9() {
        return Pedigrees.PEDIGREES.UPDATED_ON;
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
        return getParentId();
    }

    @Override
    public PedigreesRelationshipType component5() {
        return getRelationshipType();
    }

    @Override
    public Integer component6() {
        return getPedigreedescriptionId();
    }

    @Override
    public String component7() {
        return getRelationshipDescription();
    }

    @Override
    public Timestamp component8() {
        return getCreatedOn();
    }

    @Override
    public Timestamp component9() {
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
        return getParentId();
    }

    @Override
    public PedigreesRelationshipType value5() {
        return getRelationshipType();
    }

    @Override
    public Integer value6() {
        return getPedigreedescriptionId();
    }

    @Override
    public String value7() {
        return getRelationshipDescription();
    }

    @Override
    public Timestamp value8() {
        return getCreatedOn();
    }

    @Override
    public Timestamp value9() {
        return getUpdatedOn();
    }

    @Override
    public PedigreesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public PedigreesRecord value2(Integer value) {
        setDatasetId(value);
        return this;
    }

    @Override
    public PedigreesRecord value3(Integer value) {
        setGerminatebaseId(value);
        return this;
    }

    @Override
    public PedigreesRecord value4(Integer value) {
        setParentId(value);
        return this;
    }

    @Override
    public PedigreesRecord value5(PedigreesRelationshipType value) {
        setRelationshipType(value);
        return this;
    }

    @Override
    public PedigreesRecord value6(Integer value) {
        setPedigreedescriptionId(value);
        return this;
    }

    @Override
    public PedigreesRecord value7(String value) {
        setRelationshipDescription(value);
        return this;
    }

    @Override
    public PedigreesRecord value8(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public PedigreesRecord value9(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    @Override
    public PedigreesRecord values(Integer value1, Integer value2, Integer value3, Integer value4, PedigreesRelationshipType value5, Integer value6, String value7, Timestamp value8, Timestamp value9) {
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
     * Create a detached PedigreesRecord
     */
    public PedigreesRecord() {
        super(Pedigrees.PEDIGREES);
    }

    /**
     * Create a detached, initialised PedigreesRecord
     */
    public PedigreesRecord(Integer id, Integer datasetId, Integer germinatebaseId, Integer parentId, PedigreesRelationshipType relationshipType, Integer pedigreedescriptionId, String relationshipDescription, Timestamp createdOn, Timestamp updatedOn) {
        super(Pedigrees.PEDIGREES);

        setId(id);
        setDatasetId(datasetId);
        setGerminatebaseId(germinatebaseId);
        setParentId(parentId);
        setRelationshipType(relationshipType);
        setPedigreedescriptionId(pedigreedescriptionId);
        setRelationshipDescription(relationshipDescription);
        setCreatedOn(createdOn);
        setUpdatedOn(updatedOn);
    }

    /**
     * Create a detached, initialised PedigreesRecord
     */
    public PedigreesRecord(jhi.germinate.server.database.codegen.tables.pojos.Pedigrees value) {
        super(Pedigrees.PEDIGREES);

        if (value != null) {
            setId(value.getId());
            setDatasetId(value.getDatasetId());
            setGerminatebaseId(value.getGerminatebaseId());
            setParentId(value.getParentId());
            setRelationshipType(value.getRelationshipType());
            setPedigreedescriptionId(value.getPedigreedescriptionId());
            setRelationshipDescription(value.getRelationshipDescription());
            setCreatedOn(value.getCreatedOn());
            setUpdatedOn(value.getUpdatedOn());
        }
    }
    // @formatter:on
}
