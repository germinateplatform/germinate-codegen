/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.LicensesRecord;

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
public class Licenses extends TableImpl<LicensesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.licenses</code>
     */
    public static final Licenses LICENSES = new Licenses();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LicensesRecord> getRecordType() {
        return LicensesRecord.class;
    }

    /**
     * The column <code>germinate_db.licenses.id</code>.
     */
    public final TableField<LicensesRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>germinate_db.licenses.name</code>.
     */
    public final TableField<LicensesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>germinate_db.licenses.description</code>.
     */
    public final TableField<LicensesRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>germinate_db.licenses.created_on</code>. When the record
     * was created.
     */
    public final TableField<LicensesRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.licenses.updated_on</code>. When the record
     * was updated. This may be different from the created on date if subsequent
     * changes have been made to the underlying record.
     */
    public final TableField<LicensesRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private Licenses(Name alias, Table<LicensesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Licenses(Name alias, Table<LicensesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.licenses</code> table reference
     */
    public Licenses(String alias) {
        this(DSL.name(alias), LICENSES);
    }

    /**
     * Create an aliased <code>germinate_db.licenses</code> table reference
     */
    public Licenses(Name alias) {
        this(alias, LICENSES);
    }

    /**
     * Create a <code>germinate_db.licenses</code> table reference
     */
    public Licenses() {
        this(DSL.name("licenses"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<LicensesRecord, Integer> getIdentity() {
        return (Identity<LicensesRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<LicensesRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Licenses.LICENSES, DSL.name("KEY_licenses_PRIMARY"), new TableField[] { Licenses.LICENSES.ID }, true);
    }

    @Override
    public Licenses as(String alias) {
        return new Licenses(DSL.name(alias), this);
    }

    @Override
    public Licenses as(Name alias) {
        return new Licenses(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Licenses rename(String name) {
        return new Licenses(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Licenses rename(Name name) {
        return new Licenses(name, null);
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
