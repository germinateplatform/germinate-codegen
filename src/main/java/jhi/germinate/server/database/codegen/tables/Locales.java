/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.LocalesRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Row5;
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
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Locales extends TableImpl<LocalesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.locales</code>
     */
    public static final Locales LOCALES = new Locales();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LocalesRecord> getRecordType() {
        return LocalesRecord.class;
    }

    /**
     * The column <code>germinate_db.locales.id</code>.
     */
    public final TableField<LocalesRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>germinate_db.locales.name</code>.
     */
    public final TableField<LocalesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>germinate_db.locales.description</code>.
     */
    public final TableField<LocalesRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>germinate_db.locales.created_on</code>. When the record
     * was created.
     */
    public final TableField<LocalesRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.locales.updated_on</code>. When the record
     * was updated. This may be different from the created on date if subsequent
     * changes have been made to the underlying record.
     */
    public final TableField<LocalesRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private Locales(Name alias, Table<LocalesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Locales(Name alias, Table<LocalesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.locales</code> table reference
     */
    public Locales(String alias) {
        this(DSL.name(alias), LOCALES);
    }

    /**
     * Create an aliased <code>germinate_db.locales</code> table reference
     */
    public Locales(Name alias) {
        this(alias, LOCALES);
    }

    /**
     * Create a <code>germinate_db.locales</code> table reference
     */
    public Locales() {
        this(DSL.name("locales"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<LocalesRecord, Integer> getIdentity() {
        return (Identity<LocalesRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<LocalesRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Locales.LOCALES, DSL.name("KEY_locales_PRIMARY"), new TableField[] { Locales.LOCALES.ID }, true);
    }

    @Override
    public Locales as(String alias) {
        return new Locales(DSL.name(alias), this);
    }

    @Override
    public Locales as(Name alias) {
        return new Locales(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Locales rename(String name) {
        return new Locales(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Locales rename(Name name) {
        return new Locales(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
    // @formatter:on
}
