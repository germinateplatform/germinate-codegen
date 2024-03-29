/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.DatasetpermissionsRecord;

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
 * This defines which users can view which datasets. Requires Germinate
 * Gatekeeper. This overrides the datasets state.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Datasetpermissions extends TableImpl<DatasetpermissionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.datasetpermissions</code>
     */
    public static final Datasetpermissions DATASETPERMISSIONS = new Datasetpermissions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DatasetpermissionsRecord> getRecordType() {
        return DatasetpermissionsRecord.class;
    }

    /**
     * The column <code>germinate_db.datasetpermissions.id</code>. Primary id
     * for this table. This uniquely identifies the row.
     */
    public final TableField<DatasetpermissionsRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.datasetpermissions.dataset_id</code>.
     * Foreign key to datasets (datasets.id).
     */
    public final TableField<DatasetpermissionsRecord, Integer> DATASET_ID = createField(DSL.name("dataset_id"), SQLDataType.INTEGER.nullable(false), this, "Foreign key to datasets (datasets.id).");

    /**
     * The column <code>germinate_db.datasetpermissions.user_id</code>. Foreign
     * key to Gatekeeper users (Gatekeeper usersid).
     */
    public final TableField<DatasetpermissionsRecord, Integer> USER_ID = createField(DSL.name("user_id"), SQLDataType.INTEGER, this, "Foreign key to Gatekeeper users (Gatekeeper usersid).");

    /**
     * The column <code>germinate_db.datasetpermissions.group_id</code>. Foreign
     * key to usergroups table.
     */
    public final TableField<DatasetpermissionsRecord, Integer> GROUP_ID = createField(DSL.name("group_id"), SQLDataType.INTEGER, this, "Foreign key to usergroups table.");

    /**
     * The column <code>germinate_db.datasetpermissions.created_on</code>. When
     * the record was created.
     */
    public final TableField<DatasetpermissionsRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.datasetpermissions.updated_on</code>. When
     * the record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public final TableField<DatasetpermissionsRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private Datasetpermissions(Name alias, Table<DatasetpermissionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Datasetpermissions(Name alias, Table<DatasetpermissionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("This defines which users can view which datasets. Requires Germinate Gatekeeper. This overrides the datasets state."), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.datasetpermissions</code> table
     * reference
     */
    public Datasetpermissions(String alias) {
        this(DSL.name(alias), DATASETPERMISSIONS);
    }

    /**
     * Create an aliased <code>germinate_db.datasetpermissions</code> table
     * reference
     */
    public Datasetpermissions(Name alias) {
        this(alias, DATASETPERMISSIONS);
    }

    /**
     * Create a <code>germinate_db.datasetpermissions</code> table reference
     */
    public Datasetpermissions() {
        this(DSL.name("datasetpermissions"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<DatasetpermissionsRecord, Integer> getIdentity() {
        return (Identity<DatasetpermissionsRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<DatasetpermissionsRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Datasetpermissions.DATASETPERMISSIONS, DSL.name("KEY_datasetpermissions_PRIMARY"), new TableField[] { Datasetpermissions.DATASETPERMISSIONS.ID }, true);
    }

    @Override
    public Datasetpermissions as(String alias) {
        return new Datasetpermissions(DSL.name(alias), this);
    }

    @Override
    public Datasetpermissions as(Name alias) {
        return new Datasetpermissions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Datasetpermissions rename(String name) {
        return new Datasetpermissions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Datasetpermissions rename(Name name) {
        return new Datasetpermissions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
    // @formatter:on
}
