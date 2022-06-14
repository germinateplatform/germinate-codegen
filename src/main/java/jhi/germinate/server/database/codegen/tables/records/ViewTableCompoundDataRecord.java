/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.tables.ViewTableCompoundData;

import org.jooq.Field;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.TableRecordImpl;


// @formatter:off
/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableCompoundDataRecord extends TableRecordImpl<ViewTableCompoundDataRecord> implements Record15<Integer, String, String, String[], String, String, String, Integer, String, String, Integer, String, String, Timestamp, BigDecimal> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>germinate_db.view_table_compound_data.germplasm_id</code>. Primary
     * id for this table. This uniquely identifies the row.
     */
    public void setGermplasmId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_compound_data.germplasm_id</code>. Primary
     * id for this table. This uniquely identifies the row.
     */
    public Integer getGermplasmId() {
        return (Integer) get(0);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_compound_data.germplasm_gid</code>. A
     * unique identifier.
     */
    public void setGermplasmGid(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_compound_data.germplasm_gid</code>. A
     * unique identifier.
     */
    public String getGermplasmGid() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_compound_data.germplasm_name</code>. A
     * unique name which defines an entry in the germinatbase table.
     */
    public void setGermplasmName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_compound_data.germplasm_name</code>. A
     * unique name which defines an entry in the germinatbase table.
     */
    public String getGermplasmName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_compound_data.germplasm_synonyms</code>.
     * The synonyms as a json array.
     */
    public void setGermplasmSynonyms(String[] value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_compound_data.germplasm_synonyms</code>.
     * The synonyms as a json array.
     */
    public String[] getGermplasmSynonyms() {
        return (String[]) get(3);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_compound_data.entity_parent_name</code>. A
     * unique name which defines an entry in the germinatbase table.
     */
    public void setEntityParentName(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_compound_data.entity_parent_name</code>. A
     * unique name which defines an entry in the germinatbase table.
     */
    public String getEntityParentName() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_compound_data.entity_parent_general_identifier</code>.
     * A unique identifier.
     */
    public void setEntityParentGeneralIdentifier(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_compound_data.entity_parent_general_identifier</code>.
     * A unique identifier.
     */
    public String getEntityParentGeneralIdentifier() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_compound_data.entity_type</code>. The name
     * of the entity type.
     */
    public void setEntityType(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_compound_data.entity_type</code>. The name
     * of the entity type.
     */
    public String getEntityType() {
        return (String) get(6);
    }

    /**
     * Setter for <code>germinate_db.view_table_compound_data.dataset_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public void setDatasetId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_compound_data.dataset_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public Integer getDatasetId() {
        return (Integer) get(7);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_compound_data.dataset_name</code>.
     * Describes the dataset.
     */
    public void setDatasetName(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_compound_data.dataset_name</code>.
     * Describes the dataset.
     */
    public String getDatasetName() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_compound_data.dataset_description</code>.
     * The name of this dataset.
     */
    public void setDatasetDescription(String value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_compound_data.dataset_description</code>.
     * The name of this dataset.
     */
    public String getDatasetDescription() {
        return (String) get(9);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_compound_data.compound_id</code>. Primary
     * id for this table. This uniquely identifies the row.
     */
    public void setCompoundId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_compound_data.compound_id</code>. Primary
     * id for this table. This uniquely identifies the row.
     */
    public Integer getCompoundId() {
        return (Integer) get(10);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_compound_data.compound_name</code>.
     * Compound full name.
     */
    public void setCompoundName(String value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_compound_data.compound_name</code>.
     * Compound full name.
     */
    public String getCompoundName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>germinate_db.view_table_compound_data.unit_name</code>.
     * The name of the unit. This should be the name of the unit in full.
     */
    public void setUnitName(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_compound_data.unit_name</code>.
     * The name of the unit. This should be the name of the unit in full.
     */
    public String getUnitName() {
        return (String) get(12);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_compound_data.recording_date</code>. Date
     * when the phenotypic result was recorded. Should be formatted 'YYYY-MM-DD
     * HH:MM:SS' or just 'YYYY-MM-DD' where a timestamp is not available.
     */
    public void setRecordingDate(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_compound_data.recording_date</code>. Date
     * when the phenotypic result was recorded. Should be formatted 'YYYY-MM-DD
     * HH:MM:SS' or just 'YYYY-MM-DD' where a timestamp is not available.
     */
    public Timestamp getRecordingDate() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_compound_data.compound_value</code>. The
     * compound value for this compound_id and germinatebase_id combination.
     */
    public void setCompoundValue(BigDecimal value) {
        set(14, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_compound_data.compound_value</code>. The
     * compound value for this compound_id and germinatebase_id combination.
     */
    public BigDecimal getCompoundValue() {
        return (BigDecimal) get(14);
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row15<Integer, String, String, String[], String, String, String, Integer, String, String, Integer, String, String, Timestamp, BigDecimal> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    @Override
    public Row15<Integer, String, String, String[], String, String, String, Integer, String, String, Integer, String, String, Timestamp, BigDecimal> valuesRow() {
        return (Row15) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.GERMPLASM_ID;
    }

    @Override
    public Field<String> field2() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.GERMPLASM_GID;
    }

    @Override
    public Field<String> field3() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.GERMPLASM_NAME;
    }

    @Override
    public Field<String[]> field4() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.GERMPLASM_SYNONYMS;
    }

    @Override
    public Field<String> field5() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.ENTITY_PARENT_NAME;
    }

    @Override
    public Field<String> field6() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.ENTITY_PARENT_GENERAL_IDENTIFIER;
    }

    @Override
    public Field<String> field7() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.ENTITY_TYPE;
    }

    @Override
    public Field<Integer> field8() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.DATASET_ID;
    }

    @Override
    public Field<String> field9() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.DATASET_NAME;
    }

    @Override
    public Field<String> field10() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.DATASET_DESCRIPTION;
    }

    @Override
    public Field<Integer> field11() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.COMPOUND_ID;
    }

    @Override
    public Field<String> field12() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.COMPOUND_NAME;
    }

    @Override
    public Field<String> field13() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.UNIT_NAME;
    }

    @Override
    public Field<Timestamp> field14() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.RECORDING_DATE;
    }

    @Override
    public Field<BigDecimal> field15() {
        return ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA.COMPOUND_VALUE;
    }

    @Override
    public Integer component1() {
        return getGermplasmId();
    }

    @Override
    public String component2() {
        return getGermplasmGid();
    }

    @Override
    public String component3() {
        return getGermplasmName();
    }

    @Override
    public String[] component4() {
        return getGermplasmSynonyms();
    }

    @Override
    public String component5() {
        return getEntityParentName();
    }

    @Override
    public String component6() {
        return getEntityParentGeneralIdentifier();
    }

    @Override
    public String component7() {
        return getEntityType();
    }

    @Override
    public Integer component8() {
        return getDatasetId();
    }

    @Override
    public String component9() {
        return getDatasetName();
    }

    @Override
    public String component10() {
        return getDatasetDescription();
    }

    @Override
    public Integer component11() {
        return getCompoundId();
    }

    @Override
    public String component12() {
        return getCompoundName();
    }

    @Override
    public String component13() {
        return getUnitName();
    }

    @Override
    public Timestamp component14() {
        return getRecordingDate();
    }

    @Override
    public BigDecimal component15() {
        return getCompoundValue();
    }

    @Override
    public Integer value1() {
        return getGermplasmId();
    }

    @Override
    public String value2() {
        return getGermplasmGid();
    }

    @Override
    public String value3() {
        return getGermplasmName();
    }

    @Override
    public String[] value4() {
        return getGermplasmSynonyms();
    }

    @Override
    public String value5() {
        return getEntityParentName();
    }

    @Override
    public String value6() {
        return getEntityParentGeneralIdentifier();
    }

    @Override
    public String value7() {
        return getEntityType();
    }

    @Override
    public Integer value8() {
        return getDatasetId();
    }

    @Override
    public String value9() {
        return getDatasetName();
    }

    @Override
    public String value10() {
        return getDatasetDescription();
    }

    @Override
    public Integer value11() {
        return getCompoundId();
    }

    @Override
    public String value12() {
        return getCompoundName();
    }

    @Override
    public String value13() {
        return getUnitName();
    }

    @Override
    public Timestamp value14() {
        return getRecordingDate();
    }

    @Override
    public BigDecimal value15() {
        return getCompoundValue();
    }

    @Override
    public ViewTableCompoundDataRecord value1(Integer value) {
        setGermplasmId(value);
        return this;
    }

    @Override
    public ViewTableCompoundDataRecord value2(String value) {
        setGermplasmGid(value);
        return this;
    }

    @Override
    public ViewTableCompoundDataRecord value3(String value) {
        setGermplasmName(value);
        return this;
    }

    @Override
    public ViewTableCompoundDataRecord value4(String[] value) {
        setGermplasmSynonyms(value);
        return this;
    }

    @Override
    public ViewTableCompoundDataRecord value5(String value) {
        setEntityParentName(value);
        return this;
    }

    @Override
    public ViewTableCompoundDataRecord value6(String value) {
        setEntityParentGeneralIdentifier(value);
        return this;
    }

    @Override
    public ViewTableCompoundDataRecord value7(String value) {
        setEntityType(value);
        return this;
    }

    @Override
    public ViewTableCompoundDataRecord value8(Integer value) {
        setDatasetId(value);
        return this;
    }

    @Override
    public ViewTableCompoundDataRecord value9(String value) {
        setDatasetName(value);
        return this;
    }

    @Override
    public ViewTableCompoundDataRecord value10(String value) {
        setDatasetDescription(value);
        return this;
    }

    @Override
    public ViewTableCompoundDataRecord value11(Integer value) {
        setCompoundId(value);
        return this;
    }

    @Override
    public ViewTableCompoundDataRecord value12(String value) {
        setCompoundName(value);
        return this;
    }

    @Override
    public ViewTableCompoundDataRecord value13(String value) {
        setUnitName(value);
        return this;
    }

    @Override
    public ViewTableCompoundDataRecord value14(Timestamp value) {
        setRecordingDate(value);
        return this;
    }

    @Override
    public ViewTableCompoundDataRecord value15(BigDecimal value) {
        setCompoundValue(value);
        return this;
    }

    @Override
    public ViewTableCompoundDataRecord values(Integer value1, String value2, String value3, String[] value4, String value5, String value6, String value7, Integer value8, String value9, String value10, Integer value11, String value12, String value13, Timestamp value14, BigDecimal value15) {
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
        value15(value15);
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
    public ViewTableCompoundDataRecord(Integer germplasmId, String germplasmGid, String germplasmName, String[] germplasmSynonyms, String entityParentName, String entityParentGeneralIdentifier, String entityType, Integer datasetId, String datasetName, String datasetDescription, Integer compoundId, String compoundName, String unitName, Timestamp recordingDate, BigDecimal compoundValue) {
        super(ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA);

        setGermplasmId(germplasmId);
        setGermplasmGid(germplasmGid);
        setGermplasmName(germplasmName);
        setGermplasmSynonyms(germplasmSynonyms);
        setEntityParentName(entityParentName);
        setEntityParentGeneralIdentifier(entityParentGeneralIdentifier);
        setEntityType(entityType);
        setDatasetId(datasetId);
        setDatasetName(datasetName);
        setDatasetDescription(datasetDescription);
        setCompoundId(compoundId);
        setCompoundName(compoundName);
        setUnitName(unitName);
        setRecordingDate(recordingDate);
        setCompoundValue(compoundValue);
    }

    /**
     * Create a detached, initialised ViewTableCompoundDataRecord
     */
    public ViewTableCompoundDataRecord(jhi.germinate.server.database.codegen.tables.pojos.ViewTableCompoundData value) {
        super(ViewTableCompoundData.VIEW_TABLE_COMPOUND_DATA);

        if (value != null) {
            setGermplasmId(value.getGermplasmId());
            setGermplasmGid(value.getGermplasmGid());
            setGermplasmName(value.getGermplasmName());
            setGermplasmSynonyms(value.getGermplasmSynonyms());
            setEntityParentName(value.getEntityParentName());
            setEntityParentGeneralIdentifier(value.getEntityParentGeneralIdentifier());
            setEntityType(value.getEntityType());
            setDatasetId(value.getDatasetId());
            setDatasetName(value.getDatasetName());
            setDatasetDescription(value.getDatasetDescription());
            setCompoundId(value.getCompoundId());
            setCompoundName(value.getCompoundName());
            setUnitName(value.getUnitName());
            setRecordingDate(value.getRecordingDate());
            setCompoundValue(value.getCompoundValue());
        }
    }
    // @formatter:on
}
