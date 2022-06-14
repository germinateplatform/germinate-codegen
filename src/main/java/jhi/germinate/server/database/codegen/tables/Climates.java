/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.enums.ClimatesDatatype;
import jhi.germinate.server.database.codegen.tables.records.ClimatesRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Row8;
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
 * Defines climates. Climates are measureable weather type characteristics such
 * as temperature or cloud cover.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Climates extends TableImpl<ClimatesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.climates</code>
     */
    public static final Climates CLIMATES = new Climates();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClimatesRecord> getRecordType() {
        return ClimatesRecord.class;
    }

    /**
     * The column <code>germinate_db.climates.id</code>. Primary id for this
     * table. This uniquely identifies the row.
     */
    public final TableField<ClimatesRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.climates.name</code>. Describes the
     * climate.
     */
    public final TableField<ClimatesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "Describes the climate.");

    /**
     * The column <code>germinate_db.climates.short_name</code>. Shortened
     * version of the climate name which is used in some table headers.
     */
    public final TableField<ClimatesRecord, String> SHORT_NAME = createField(DSL.name("short_name"), SQLDataType.CHAR(10), this, "Shortened version of the climate name which is used in some table headers.");

    /**
     * The column <code>germinate_db.climates.description</code>. A longer
     * description of the climate.
     */
    public final TableField<ClimatesRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "A longer description of the climate.");

    /**
     * The column <code>germinate_db.climates.datatype</code>. Defines the data
     * type of the climate. This can be of numeric, text, date or categorical
     * types.
     */
    public final TableField<ClimatesRecord, ClimatesDatatype> DATATYPE = createField(DSL.name("datatype"), SQLDataType.VARCHAR(11).nullable(false).defaultValue(DSL.inline("text", SQLDataType.VARCHAR)).asEnumDataType(jhi.germinate.server.database.codegen.enums.ClimatesDatatype.class), this, "Defines the data type of the climate. This can be of numeric, text, date or categorical types.");

    /**
     * The column <code>germinate_db.climates.unit_id</code>. Foreign key to
     * units (units.id).

     */
    public final TableField<ClimatesRecord, Integer> UNIT_ID = createField(DSL.name("unit_id"), SQLDataType.INTEGER, this, "Foreign key to units (units.id).\n");

    /**
     * The column <code>germinate_db.climates.created_on</code>. When the record
     * was created.
     */
    public final TableField<ClimatesRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.climates.updated_on</code>. When the record
     * was updated. This may be different from the created on date if subsequent
     * changes have been made to the underlying record.
     */
    public final TableField<ClimatesRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private Climates(Name alias, Table<ClimatesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Climates(Name alias, Table<ClimatesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Defines climates. Climates are measureable weather type characteristics such as temperature or cloud cover."), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.climates</code> table reference
     */
    public Climates(String alias) {
        this(DSL.name(alias), CLIMATES);
    }

    /**
     * Create an aliased <code>germinate_db.climates</code> table reference
     */
    public Climates(Name alias) {
        this(alias, CLIMATES);
    }

    /**
     * Create a <code>germinate_db.climates</code> table reference
     */
    public Climates() {
        this(DSL.name("climates"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<ClimatesRecord, Integer> getIdentity() {
        return (Identity<ClimatesRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<ClimatesRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Climates.CLIMATES, DSL.name("KEY_climates_PRIMARY"), new TableField[] { Climates.CLIMATES.ID }, true);
    }

    @Override
    public Climates as(String alias) {
        return new Climates(DSL.name(alias), this);
    }

    @Override
    public Climates as(Name alias) {
        return new Climates(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Climates rename(String name) {
        return new Climates(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Climates rename(Name name) {
        return new Climates(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, String, String, String, ClimatesDatatype, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
    // @formatter:on
}
