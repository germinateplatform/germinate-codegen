/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.StoragedataRecord;

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
public class Storagedata extends TableImpl<StoragedataRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.storagedata</code>
     */
    public static final Storagedata STORAGEDATA = new Storagedata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StoragedataRecord> getRecordType() {
        return StoragedataRecord.class;
    }

    /**
     * The column <code>germinate_db.storagedata.id</code>.
     */
    public final TableField<StoragedataRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>germinate_db.storagedata.germinatebase_id</code>.
     */
    public final TableField<StoragedataRecord, Integer> GERMINATEBASE_ID = createField(DSL.name("germinatebase_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_db.storagedata.storage_id</code>.
     */
    public final TableField<StoragedataRecord, Integer> STORAGE_ID = createField(DSL.name("storage_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_db.storagedata.created_on</code>. When the
     * record was created.
     */
    public final TableField<StoragedataRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.storagedata.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public final TableField<StoragedataRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private Storagedata(Name alias, Table<StoragedataRecord> aliased) {
        this(alias, aliased, null);
    }

    private Storagedata(Name alias, Table<StoragedataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.storagedata</code> table reference
     */
    public Storagedata(String alias) {
        this(DSL.name(alias), STORAGEDATA);
    }

    /**
     * Create an aliased <code>germinate_db.storagedata</code> table reference
     */
    public Storagedata(Name alias) {
        this(alias, STORAGEDATA);
    }

    /**
     * Create a <code>germinate_db.storagedata</code> table reference
     */
    public Storagedata() {
        this(DSL.name("storagedata"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<StoragedataRecord, Integer> getIdentity() {
        return (Identity<StoragedataRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<StoragedataRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Storagedata.STORAGEDATA, DSL.name("KEY_storagedata_PRIMARY"), new TableField[] { Storagedata.STORAGEDATA.ID }, true);
    }

    @Override
    public Storagedata as(String alias) {
        return new Storagedata(DSL.name(alias), this);
    }

    @Override
    public Storagedata as(Name alias) {
        return new Storagedata(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Storagedata rename(String name) {
        return new Storagedata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Storagedata rename(Name name) {
        return new Storagedata(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
    // @formatter:on
}
