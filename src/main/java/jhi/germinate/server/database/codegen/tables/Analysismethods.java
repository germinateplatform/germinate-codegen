/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.AnalysismethodsRecord;

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
public class Analysismethods extends TableImpl<AnalysismethodsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.analysismethods</code>
     */
    public static final Analysismethods ANALYSISMETHODS = new Analysismethods();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AnalysismethodsRecord> getRecordType() {
        return AnalysismethodsRecord.class;
    }

    /**
     * The column <code>germinate_db.analysismethods.id</code>. Primary id for
     * this table. This uniquely identifies the row.
     */
    public final TableField<AnalysismethodsRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.analysismethods.name</code>. The name of
     * the analysis method.
     */
    public final TableField<AnalysismethodsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "The name of the analysis method.");

    /**
     * The column <code>germinate_db.analysismethods.description</code>.
     * Describes the analysis method.
     */
    public final TableField<AnalysismethodsRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(255), this, "Describes the analysis method.");

    /**
     * The column <code>germinate_db.analysismethods.created_on</code>. When the
     * record was created.
     */
    public final TableField<AnalysismethodsRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.analysismethods.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public final TableField<AnalysismethodsRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private Analysismethods(Name alias, Table<AnalysismethodsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Analysismethods(Name alias, Table<AnalysismethodsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.analysismethods</code> table
     * reference
     */
    public Analysismethods(String alias) {
        this(DSL.name(alias), ANALYSISMETHODS);
    }

    /**
     * Create an aliased <code>germinate_db.analysismethods</code> table
     * reference
     */
    public Analysismethods(Name alias) {
        this(alias, ANALYSISMETHODS);
    }

    /**
     * Create a <code>germinate_db.analysismethods</code> table reference
     */
    public Analysismethods() {
        this(DSL.name("analysismethods"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<AnalysismethodsRecord, Integer> getIdentity() {
        return (Identity<AnalysismethodsRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<AnalysismethodsRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Analysismethods.ANALYSISMETHODS, DSL.name("KEY_analysismethods_PRIMARY"), new TableField[] { Analysismethods.ANALYSISMETHODS.ID }, true);
    }

    @Override
    public Analysismethods as(String alias) {
        return new Analysismethods(DSL.name(alias), this);
    }

    @Override
    public Analysismethods as(Name alias) {
        return new Analysismethods(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Analysismethods rename(String name) {
        return new Analysismethods(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Analysismethods rename(Name name) {
        return new Analysismethods(name, null);
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
