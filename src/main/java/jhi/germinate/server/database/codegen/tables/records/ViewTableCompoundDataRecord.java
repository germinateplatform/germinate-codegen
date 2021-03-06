/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.tables.ViewTableCompoundData;

import org.jooq.Field;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.TableRecordImpl;


// @formatter:off
/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableCompoundDataRecord extends TableRecordImpl<ViewTableCompoundDataRecord> implements Record14<Integer, String, String, String, String, String, Integer, String, String, Integer, String, String, Timestamp, BigDecimal> {

    private static final long serialVersionUID = -1135751859;

    /**
     * Setter for <code>germinate_db.view_table_compound_data.germplasm_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setGermplasmId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_compound_data.germplasm_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getGermplasmId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.view_table_compound_data.germplasm_gid</code>. A unique identifier.
     */
    public void setGermplasmGid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_compound_data.germplasm_gid</code>. A unique identifier.
     */
    public String getGermplasmGid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_db.view_table_compound_data.germplasm_name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public void setGermplasmName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_compound_data.germplasm_name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public String getGermplasmName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_db.view_table_compound_data.entity_parent_name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public void setEntityParentName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_compound_data.entity_parent_name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public String getEntityParentName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>germinate_db.view_table_compound_data.entity_parent_general_identifier</code>. A unique identifier.
     */
    public void setEntityParentGeneralIdentifier(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_compound_data.entity_parent_general_identifier</code>. A unique identifier.
     */
    public String getEntityParentGeneralIdentifier() {
        return (String) get(4);
    }

    /**
     * Setter for <code>germinate_db.view_table_compound_data.entity_type</code>. The name of the entity type.
     */
    public void setEntityType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_compound_data.entity_type</code>. The name of the entity type.
     */
    public String getEntityType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>germinate_db.view_table_compound_data.dataset_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setDatasetId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_compound_data.dataset_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getDatasetId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>germinate_db.view_table_compound_data.dataset_name</code>. Describes the dataset.
     */
    public void setDatasetName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_compound_data.dataset_name</code>. Describes the dataset.
     */
    public String getDatasetName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>germinate_db.view_table_compound_data.dataset_description</code>. The name of this dataset.
     */
    public void setDatasetDescription(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_compound_data.dataset_description</code>. The name of this dataset.
     */
    public String getDatasetDescription() {
        return (String) get(8);
    }

    /**
     * Setter for <code>germinate_db.view_table_compound_data.compound_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setCompoundId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_compound_data.compound_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getCompoundId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>germinate_db.view_table_compound_data.compound_name</code>. Compound full name.
     */
    public void setCompoundName(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_compound_data.compound_name</code>. Compound full name.
     */
    public String getCompoundName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>germinate_db.view_table_compound_data.unit_name</code>. The name of the unit. This should be the name of the unit in full.
     */
    public void setUnitName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_compound_data.unit_name</code>. The name of the unit. This should be the name of the unit in full.
     */
    public String getUnitName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>germinate_db.view_table_compound_data.recording_date</code>. Date when the phenotypic result was recorded. Should be formatted 'YYYY-MM-DD HH:MM:SS' or just 'YYYY-MM-DD' where a timestamp is not available.
     */
    public void setRecordingDate(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_compound_data.recording_date</code>. Date when the phenotypic result was recorded. Should be formatted 'YYYY-MM-DD HH:MM:SS' or just 'YYYY-MM-DD' where a timestamp is not available.
     */
    public Timestamp getRecordingDate() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>germinate_db.view_table_compound_data.compound_value</code>. The compound value for this compound_id and germinatebase_id combination.
     */
    public void setCompoundValue(BigDecimal value) {
        set(13, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_compound_data.compound_value</code>. The compound value for this compound_id and germinatebase_id combination.
     */
    public BigDecimal getCompoundValue() {
        return (BigDecimal) get(13);
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, String, String, String, String, String, Integer, String, String, Integer, String, String, Timestamp, BigDecimal> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, String, String, String, String, String, Integer, String, String, Integer, String, String, Timestamp, BigDecimal> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.GERMPLASM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.GERMPLASM_GID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.GERMPLASM_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.ENTITY_PARENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.ENTITY_PARENT_GENERAL_IDENTIFIER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.ENTITY_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.DATASET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.DATASET_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.DATASET_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.COMPOUND_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.COMPOUND_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.UNIT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.RECORDING_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field14() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.COMPOUND_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getGermplasmId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getGermplasmGid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getGermplasmName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getEntityParentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getEntityParentGeneralIdentifier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getEntityType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getDatasetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getDatasetDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getCompoundId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getCompoundName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getUnitName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getRecordingDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component14() {
        return getCompoundValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getGermplasmId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getGermplasmGid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getGermplasmName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEntityParentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEntityParentGeneralIdentifier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getEntityType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDatasetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getDatasetDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getCompoundId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getCompoundName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getUnitName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getRecordingDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value14() {
        return getCompoundValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCompoundDataRecord value1(Integer value) {
        setGermplasmId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCompoundDataRecord value2(String value) {
        setGermplasmGid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCompoundDataRecord value3(String value) {
        setGermplasmName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCompoundDataRecord value4(String value) {
        setEntityParentName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCompoundDataRecord value5(String value) {
        setEntityParentGeneralIdentifier(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCompoundDataRecord value6(String value) {
        setEntityType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCompoundDataRecord value7(Integer value) {
        setDatasetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCompoundDataRecord value8(String value) {
        setDatasetName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCompoundDataRecord value9(String value) {
        setDatasetDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCompoundDataRecord value10(Integer value) {
        setCompoundId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCompoundDataRecord value11(String value) {
        setCompoundName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCompoundDataRecord value12(String value) {
        setUnitName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCompoundDataRecord value13(Timestamp value) {
        setRecordingDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCompoundDataRecord value14(BigDecimal value) {
        setCompoundValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCompoundDataRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, Integer value7, String value8, String value9, Integer value10, String value11, String value12, Timestamp value13, BigDecimal value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewTableCompoundDataRecord
     */
    public ViewTableCompoundDataRecord() {
        super(ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA);
    }

    /**
     * Create a detached, initialised ViewTableCompoundDataRecord
     */
    public ViewTableCompoundDataRecord(Integer germplasmId, String germplasmGid, String germplasmName, String entityParentName, String entityParentGeneralIdentifier, String entityType, Integer datasetId, String datasetName, String datasetDescription, Integer compoundId, String compoundName, String unitName, Timestamp recordingDate, BigDecimal compoundValue) {
        super(ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA);

        set(0, germplasmId);
        set(1, germplasmGid);
        set(2, germplasmName);
        set(3, entityParentName);
        set(4, entityParentGeneralIdentifier);
        set(5, entityType);
        set(6, datasetId);
        set(7, datasetName);
        set(8, datasetDescription);
        set(9, compoundId);
        set(10, compoundName);
        set(11, unitName);
        set(12, recordingDate);
        set(13, compoundValue);
    }
// @formatter:on
}
