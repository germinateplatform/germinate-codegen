/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.UnitsRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


// @formatter:off
/**
 * The 'units' table holds descriptions of the various units that are used in
 * the Germinate database. Examples of these would include International System
 * of Units (SI) base units: kilogram, meter, second, ampere, kelvin, candela
 * and mole but can include any units that are required.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Units extends TableImpl<UnitsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.units</code>
     */
    public static final Units UNITS = new Units();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UnitsRecord> getRecordType() {
        return UnitsRecord.class;
    }

    /**
     * The column <code>germinate_db.units.id</code>. Primary id for this table.
     * This uniquely identifies the row.
     */
    public final TableField<UnitsRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.units.unit_name</code>. The name of the
     * unit. This should be the name of the unit in full.
     */
    public final TableField<UnitsRecord, String> UNIT_NAME = createField(DSL.name("unit_name"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "The name of the unit. This should be the name of the unit in full.");

    /**
     * The column <code>germinate_db.units.unit_abbreviation</code>. This should
     * be the unit abbreviation.
     */
    public final TableField<UnitsRecord, String> UNIT_ABBREVIATION = createField(DSL.name("unit_abbreviation"), SQLDataType.CHAR(10), this, "This should be the unit abbreviation.");

    /**
     * The column <code>germinate_db.units.unit_description</code>. A
     * description of the unit. If the unit is not a standard SI unit then it is
     * beneficial to have a description which explains what the unit it, how it
     * is derived and any other information which would help identifiy it.
     */
    public final TableField<UnitsRecord, String> UNIT_DESCRIPTION = createField(DSL.name("unit_description"), SQLDataType.CLOB, this, "A description of the unit. If the unit is not a standard SI unit then it is beneficial to have a description which explains what the unit it, how it is derived and any other information which would help identifiy it.");

    /**
     * The column <code>germinate_db.units.created_on</code>. When the record
     * was created.
     */
    public final TableField<UnitsRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.units.updated_on</code>. When the record
     * was updated. This may be different from the created on date if changes
     * have been made subsequently to the underlying record.
     */
    public final TableField<UnitsRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if changes have been made subsequently to the underlying record.");

    private Units(Name alias, Table<UnitsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Units(Name alias, Table<UnitsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("The 'units' table holds descriptions of the various units that are used in the Germinate database. Examples of these would include International System of Units (SI) base units: kilogram, meter, second, ampere, kelvin, candela and mole but can include any units that are required."), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.units</code> table reference
     */
    public Units(String alias) {
        this(DSL.name(alias), UNITS);
    }

    /**
     * Create an aliased <code>germinate_db.units</code> table reference
     */
    public Units(Name alias) {
        this(alias, UNITS);
    }

    /**
     * Create a <code>germinate_db.units</code> table reference
     */
    public Units() {
        this(DSL.name("units"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<UnitsRecord, Integer> getIdentity() {
        return (Identity<UnitsRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<UnitsRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Units.UNITS, DSL.name("KEY_units_PRIMARY"), new TableField[] { Units.UNITS.ID }, true);
    }

    @Override
    public Units as(String alias) {
        return new Units(DSL.name(alias), this);
    }

    @Override
    public Units as(Name alias) {
        return new Units(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Units rename(String name) {
        return new Units(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Units rename(Name name) {
        return new Units(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
    // @formatter:on
}
