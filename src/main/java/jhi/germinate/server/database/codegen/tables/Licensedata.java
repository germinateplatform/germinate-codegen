/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.LicensedataRecord;

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
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Licensedata extends TableImpl<LicensedataRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.licensedata</code>
     */
    public static final Licensedata LICENSEDATA = new Licensedata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LicensedataRecord> getRecordType() {
        return LicensedataRecord.class;
    }

    /**
     * The column <code>germinate_db.licensedata.id</code>.
     */
    public final TableField<LicensedataRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>germinate_db.licensedata.license_id</code>.
     */
    public final TableField<LicensedataRecord, Integer> LICENSE_ID = createField(DSL.name("license_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_db.licensedata.locale_id</code>.
     */
    public final TableField<LicensedataRecord, Integer> LOCALE_ID = createField(DSL.name("locale_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_db.licensedata.content</code>.
     */
    public final TableField<LicensedataRecord, String> CONTENT = createField(DSL.name("content"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>germinate_db.licensedata.created_on</code>. When the
     * record was created.
     */
    public final TableField<LicensedataRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.licensedata.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public final TableField<LicensedataRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private Licensedata(Name alias, Table<LicensedataRecord> aliased) {
        this(alias, aliased, null);
    }

    private Licensedata(Name alias, Table<LicensedataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.licensedata</code> table reference
     */
    public Licensedata(String alias) {
        this(DSL.name(alias), LICENSEDATA);
    }

    /**
     * Create an aliased <code>germinate_db.licensedata</code> table reference
     */
    public Licensedata(Name alias) {
        this(alias, LICENSEDATA);
    }

    /**
     * Create a <code>germinate_db.licensedata</code> table reference
     */
    public Licensedata() {
        this(DSL.name("licensedata"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<LicensedataRecord, Integer> getIdentity() {
        return (Identity<LicensedataRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<LicensedataRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Licensedata.LICENSEDATA, DSL.name("KEY_licensedata_PRIMARY"), new TableField[] { Licensedata.LICENSEDATA.ID }, true);
    }

    @Override
    public Licensedata as(String alias) {
        return new Licensedata(DSL.name(alias), this);
    }

    @Override
    public Licensedata as(Name alias) {
        return new Licensedata(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Licensedata rename(String name) {
        return new Licensedata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Licensedata rename(Name name) {
        return new Licensedata(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
    // @formatter:on
}
