/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.enums.ViewTableGermplasmAttributesAttributeType;
import jhi.germinate.server.database.codegen.tables.ViewTableGermplasmAttributes;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;


// @formatter:off
/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableGermplasmAttributesRecord extends TableRecordImpl<ViewTableGermplasmAttributesRecord> implements Record12<Integer, Integer, String, String, Integer, String, String, ViewTableGermplasmAttributesAttributeType, String, Integer, Timestamp, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>germinate_db.view_table_germplasm_attributes.attribute_value_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public void setAttributeValueId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_germplasm_attributes.attribute_value_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public Integer getAttributeValueId() {
        return (Integer) get(0);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_germplasm_attributes.germplasm_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public void setGermplasmId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_germplasm_attributes.germplasm_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public Integer getGermplasmId() {
        return (Integer) get(1);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_germplasm_attributes.germplasm_gid</code>.
     * A unique identifier.
     */
    public void setGermplasmGid(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_germplasm_attributes.germplasm_gid</code>.
     * A unique identifier.
     */
    public String getGermplasmGid() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_germplasm_attributes.germplasm_name</code>.
     * A unique name which defines an entry in the germinatbase table.
     */
    public void setGermplasmName(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_germplasm_attributes.germplasm_name</code>.
     * A unique name which defines an entry in the germinatbase table.
     */
    public String getGermplasmName() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_germplasm_attributes.attribute_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public void setAttributeId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_germplasm_attributes.attribute_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public Integer getAttributeId() {
        return (Integer) get(4);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_germplasm_attributes.attribute_name</code>.
     * Defines the name of the attribute.
     */
    public void setAttributeName(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_germplasm_attributes.attribute_name</code>.
     * Defines the name of the attribute.
     */
    public String getAttributeName() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_germplasm_attributes.attribute_description</code>.
     * Describes the attribute. This should expand on the name to make it clear
     * what the attribute actually is.
     */
    public void setAttributeDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_germplasm_attributes.attribute_description</code>.
     * Describes the attribute. This should expand on the name to make it clear
     * what the attribute actually is.
     */
    public String getAttributeDescription() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_germplasm_attributes.attribute_type</code>.
     * Defines the data type of the attribute. This can be of numeric, text,
     * date or categorical types.
     */
    public void setAttributeType(ViewTableGermplasmAttributesAttributeType value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_germplasm_attributes.attribute_type</code>.
     * Defines the data type of the attribute. This can be of numeric, text,
     * date or categorical types.
     */
    public ViewTableGermplasmAttributesAttributeType getAttributeType() {
        return (ViewTableGermplasmAttributesAttributeType) get(7);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_germplasm_attributes.target_table</code>.
     */
    public void setTargetTable(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_germplasm_attributes.target_table</code>.
     */
    public String getTargetTable() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_germplasm_attributes.foreign_id</code>.
     * Foreign key to germinatebase (germinatebase.id).
     */
    public void setForeignId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_germplasm_attributes.foreign_id</code>.
     * Foreign key to germinatebase (germinatebase.id).
     */
    public Integer getForeignId() {
        return (Integer) get(9);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_germplasm_attributes.created_on</code>.
     * When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_germplasm_attributes.created_on</code>.
     * When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_germplasm_attributes.attribute_value</code>.
     * The value of the attribute.
     */
    public void setAttributeValue(String value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_germplasm_attributes.attribute_value</code>.
     * The value of the attribute.
     */
    public String getAttributeValue() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, Integer, String, String, Integer, String, String, ViewTableGermplasmAttributesAttributeType, String, Integer, Timestamp, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Integer, Integer, String, String, Integer, String, String, ViewTableGermplasmAttributesAttributeType, String, Integer, Timestamp, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.ATTRIBUTE_VALUE_ID;
    }

    @Override
    public Field<Integer> field2() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.GERMPLASM_ID;
    }

    @Override
    public Field<String> field3() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.GERMPLASM_GID;
    }

    @Override
    public Field<String> field4() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.GERMPLASM_NAME;
    }

    @Override
    public Field<Integer> field5() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.ATTRIBUTE_ID;
    }

    @Override
    public Field<String> field6() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.ATTRIBUTE_NAME;
    }

    @Override
    public Field<String> field7() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.ATTRIBUTE_DESCRIPTION;
    }

    @Override
    public Field<ViewTableGermplasmAttributesAttributeType> field8() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.ATTRIBUTE_TYPE;
    }

    @Override
    public Field<String> field9() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.TARGET_TABLE;
    }

    @Override
    public Field<Integer> field10() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.FOREIGN_ID;
    }

    @Override
    public Field<Timestamp> field11() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.CREATED_ON;
    }

    @Override
    public Field<String> field12() {
        return ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES.ATTRIBUTE_VALUE;
    }

    @Override
    public Integer component1() {
        return getAttributeValueId();
    }

    @Override
    public Integer component2() {
        return getGermplasmId();
    }

    @Override
    public String component3() {
        return getGermplasmGid();
    }

    @Override
    public String component4() {
        return getGermplasmName();
    }

    @Override
    public Integer component5() {
        return getAttributeId();
    }

    @Override
    public String component6() {
        return getAttributeName();
    }

    @Override
    public String component7() {
        return getAttributeDescription();
    }

    @Override
    public ViewTableGermplasmAttributesAttributeType component8() {
        return getAttributeType();
    }

    @Override
    public String component9() {
        return getTargetTable();
    }

    @Override
    public Integer component10() {
        return getForeignId();
    }

    @Override
    public Timestamp component11() {
        return getCreatedOn();
    }

    @Override
    public String component12() {
        return getAttributeValue();
    }

    @Override
    public Integer value1() {
        return getAttributeValueId();
    }

    @Override
    public Integer value2() {
        return getGermplasmId();
    }

    @Override
    public String value3() {
        return getGermplasmGid();
    }

    @Override
    public String value4() {
        return getGermplasmName();
    }

    @Override
    public Integer value5() {
        return getAttributeId();
    }

    @Override
    public String value6() {
        return getAttributeName();
    }

    @Override
    public String value7() {
        return getAttributeDescription();
    }

    @Override
    public ViewTableGermplasmAttributesAttributeType value8() {
        return getAttributeType();
    }

    @Override
    public String value9() {
        return getTargetTable();
    }

    @Override
    public Integer value10() {
        return getForeignId();
    }

    @Override
    public Timestamp value11() {
        return getCreatedOn();
    }

    @Override
    public String value12() {
        return getAttributeValue();
    }

    @Override
    public ViewTableGermplasmAttributesRecord value1(Integer value) {
        setAttributeValueId(value);
        return this;
    }

    @Override
    public ViewTableGermplasmAttributesRecord value2(Integer value) {
        setGermplasmId(value);
        return this;
    }

    @Override
    public ViewTableGermplasmAttributesRecord value3(String value) {
        setGermplasmGid(value);
        return this;
    }

    @Override
    public ViewTableGermplasmAttributesRecord value4(String value) {
        setGermplasmName(value);
        return this;
    }

    @Override
    public ViewTableGermplasmAttributesRecord value5(Integer value) {
        setAttributeId(value);
        return this;
    }

    @Override
    public ViewTableGermplasmAttributesRecord value6(String value) {
        setAttributeName(value);
        return this;
    }

    @Override
    public ViewTableGermplasmAttributesRecord value7(String value) {
        setAttributeDescription(value);
        return this;
    }

    @Override
    public ViewTableGermplasmAttributesRecord value8(ViewTableGermplasmAttributesAttributeType value) {
        setAttributeType(value);
        return this;
    }

    @Override
    public ViewTableGermplasmAttributesRecord value9(String value) {
        setTargetTable(value);
        return this;
    }

    @Override
    public ViewTableGermplasmAttributesRecord value10(Integer value) {
        setForeignId(value);
        return this;
    }

    @Override
    public ViewTableGermplasmAttributesRecord value11(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public ViewTableGermplasmAttributesRecord value12(String value) {
        setAttributeValue(value);
        return this;
    }

    @Override
    public ViewTableGermplasmAttributesRecord values(Integer value1, Integer value2, String value3, String value4, Integer value5, String value6, String value7, ViewTableGermplasmAttributesAttributeType value8, String value9, Integer value10, Timestamp value11, String value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewTableGermplasmAttributesRecord
     */
    public ViewTableGermplasmAttributesRecord() {
        super(ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES);
    }

    /**
     * Create a detached, initialised ViewTableGermplasmAttributesRecord
     */
    public ViewTableGermplasmAttributesRecord(Integer attributeValueId, Integer germplasmId, String germplasmGid, String germplasmName, Integer attributeId, String attributeName, String attributeDescription, ViewTableGermplasmAttributesAttributeType attributeType, String targetTable, Integer foreignId, Timestamp createdOn, String attributeValue) {
        super(ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES);

        setAttributeValueId(attributeValueId);
        setGermplasmId(germplasmId);
        setGermplasmGid(germplasmGid);
        setGermplasmName(germplasmName);
        setAttributeId(attributeId);
        setAttributeName(attributeName);
        setAttributeDescription(attributeDescription);
        setAttributeType(attributeType);
        setTargetTable(targetTable);
        setForeignId(foreignId);
        setCreatedOn(createdOn);
        setAttributeValue(attributeValue);
    }

    /**
     * Create a detached, initialised ViewTableGermplasmAttributesRecord
     */
    public ViewTableGermplasmAttributesRecord(jhi.germinate.server.database.codegen.tables.pojos.ViewTableGermplasmAttributes value) {
        super(ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES);

        if (value != null) {
            setAttributeValueId(value.getAttributeValueId());
            setGermplasmId(value.getGermplasmId());
            setGermplasmGid(value.getGermplasmGid());
            setGermplasmName(value.getGermplasmName());
            setAttributeId(value.getAttributeId());
            setAttributeName(value.getAttributeName());
            setAttributeDescription(value.getAttributeDescription());
            setAttributeType(value.getAttributeType());
            setTargetTable(value.getTargetTable());
            setForeignId(value.getForeignId());
            setCreatedOn(value.getCreatedOn());
            setAttributeValue(value.getAttributeValue());
        }
    }
    // @formatter:on
}
