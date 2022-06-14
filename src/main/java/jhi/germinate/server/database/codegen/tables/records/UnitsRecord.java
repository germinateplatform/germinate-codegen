/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.tables.Units;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * The 'units' table holds descriptions of the various units that are used in
 * the Germinate database. Examples of these would include International System
 * of Units (SI) base units: kilogram, meter, second, ampere, kelvin, candela
 * and mole but can include any units that are required.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UnitsRecord extends UpdatableRecordImpl<UnitsRecord> implements Record6<Integer, String, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>germinate_db.units.id</code>. Primary id for this table.
     * This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.units.id</code>. Primary id for this table.
     * This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.units.unit_name</code>. The name of the
     * unit. This should be the name of the unit in full.
     */
    public void setUnitName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.units.unit_name</code>. The name of the
     * unit. This should be the name of the unit in full.
     */
    public String getUnitName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_db.units.unit_abbreviation</code>. This should
     * be the unit abbreviation.
     */
    public void setUnitAbbreviation(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.units.unit_abbreviation</code>. This should
     * be the unit abbreviation.
     */
    public String getUnitAbbreviation() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_db.units.unit_description</code>. A
     * description of the unit. If the unit is not a standard SI unit then it is
     * beneficial to have a description which explains what the unit it, how it
     * is derived and any other information which would help identifiy it.
     */
    public void setUnitDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.units.unit_description</code>. A
     * description of the unit. If the unit is not a standard SI unit then it is
     * beneficial to have a description which explains what the unit it, how it
     * is derived and any other information which would help identifiy it.
     */
    public String getUnitDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>germinate_db.units.created_on</code>. When the record
     * was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.units.created_on</code>. When the record
     * was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>germinate_db.units.updated_on</code>. When the record
     * was updated. This may be different from the created on date if changes
     * have been made subsequently to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.units.updated_on</code>. When the record
     * was updated. This may be different from the created on date if changes
     * have been made subsequently to the underlying record.
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
    public Row6<Integer, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Units.UNITS.ID;
    }

    @Override
    public Field<String> field2() {
        return Units.UNITS.UNIT_NAME;
    }

    @Override
    public Field<String> field3() {
        return Units.UNITS.UNIT_ABBREVIATION;
    }

    @Override
    public Field<String> field4() {
        return Units.UNITS.UNIT_DESCRIPTION;
    }

    @Override
    public Field<Timestamp> field5() {
        return Units.UNITS.CREATED_ON;
    }

    @Override
    public Field<Timestamp> field6() {
        return Units.UNITS.UPDATED_ON;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getUnitName();
    }

    @Override
    public String component3() {
        return getUnitAbbreviation();
    }

    @Override
    public String component4() {
        return getUnitDescription();
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
    public String value2() {
        return getUnitName();
    }

    @Override
    public String value3() {
        return getUnitAbbreviation();
    }

    @Override
    public String value4() {
        return getUnitDescription();
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
    public UnitsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public UnitsRecord value2(String value) {
        setUnitName(value);
        return this;
    }

    @Override
    public UnitsRecord value3(String value) {
        setUnitAbbreviation(value);
        return this;
    }

    @Override
    public UnitsRecord value4(String value) {
        setUnitDescription(value);
        return this;
    }

    @Override
    public UnitsRecord value5(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public UnitsRecord value6(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    @Override
    public UnitsRecord values(Integer value1, String value2, String value3, String value4, Timestamp value5, Timestamp value6) {
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
     * Create a detached UnitsRecord
     */
    public UnitsRecord() {
        super(Units.UNITS);
    }

    /**
     * Create a detached, initialised UnitsRecord
     */
    public UnitsRecord(Integer id, String unitName, String unitAbbreviation, String unitDescription, Timestamp createdOn, Timestamp updatedOn) {
        super(Units.UNITS);

        setId(id);
        setUnitName(unitName);
        setUnitAbbreviation(unitAbbreviation);
        setUnitDescription(unitDescription);
        setCreatedOn(createdOn);
        setUpdatedOn(updatedOn);
    }

    /**
     * Create a detached, initialised UnitsRecord
     */
    public UnitsRecord(jhi.germinate.server.database.codegen.tables.pojos.Units value) {
        super(Units.UNITS);

        if (value != null) {
            setId(value.getId());
            setUnitName(value.getUnitName());
            setUnitAbbreviation(value.getUnitAbbreviation());
            setUnitDescription(value.getUnitDescription());
            setCreatedOn(value.getCreatedOn());
            setUpdatedOn(value.getUpdatedOn());
        }
    }
    // @formatter:on
}
