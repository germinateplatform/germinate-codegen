/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.PedigreenotationsRecord;

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
 * Allows additional supporting data to be associated with a pedigree definition
 * such as the contributing data source.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Pedigreenotations extends TableImpl<PedigreenotationsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.pedigreenotations</code>
     */
    public static final Pedigreenotations PEDIGREENOTATIONS = new Pedigreenotations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PedigreenotationsRecord> getRecordType() {
        return PedigreenotationsRecord.class;
    }

    /**
     * The column <code>germinate_db.pedigreenotations.id</code>. Primary id for
     * this table. This uniquely identifies the row.
     */
    public final TableField<PedigreenotationsRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.pedigreenotations.name</code>. Name of the
     * reference notation source.
     */
    public final TableField<PedigreenotationsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "Name of the reference notation source.");

    /**
     * The column <code>germinate_db.pedigreenotations.description</code>. A
     * longer description about the reference notation source.
     */
    public final TableField<PedigreenotationsRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "A longer description about the reference notation source.");

    /**
     * The column <code>germinate_db.pedigreenotations.reference_url</code>.
     * Hyperlink to the notation source.
     */
    public final TableField<PedigreenotationsRecord, String> REFERENCE_URL = createField(DSL.name("reference_url"), SQLDataType.VARCHAR(255), this, "Hyperlink to the notation source.");

    /**
     * The column <code>germinate_db.pedigreenotations.created_on</code>. When
     * the record was created.
     */
    public final TableField<PedigreenotationsRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.pedigreenotations.updated_on</code>. When
     * the record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public final TableField<PedigreenotationsRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private Pedigreenotations(Name alias, Table<PedigreenotationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Pedigreenotations(Name alias, Table<PedigreenotationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Allows additional supporting data to be associated with a pedigree definition such as the contributing data source."), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.pedigreenotations</code> table
     * reference
     */
    public Pedigreenotations(String alias) {
        this(DSL.name(alias), PEDIGREENOTATIONS);
    }

    /**
     * Create an aliased <code>germinate_db.pedigreenotations</code> table
     * reference
     */
    public Pedigreenotations(Name alias) {
        this(alias, PEDIGREENOTATIONS);
    }

    /**
     * Create a <code>germinate_db.pedigreenotations</code> table reference
     */
    public Pedigreenotations() {
        this(DSL.name("pedigreenotations"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<PedigreenotationsRecord, Integer> getIdentity() {
        return (Identity<PedigreenotationsRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<PedigreenotationsRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Pedigreenotations.PEDIGREENOTATIONS, DSL.name("KEY_pedigreenotations_PRIMARY"), new TableField[] { Pedigreenotations.PEDIGREENOTATIONS.ID }, true);
    }

    @Override
    public Pedigreenotations as(String alias) {
        return new Pedigreenotations(DSL.name(alias), this);
    }

    @Override
    public Pedigreenotations as(Name alias) {
        return new Pedigreenotations(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Pedigreenotations rename(String name) {
        return new Pedigreenotations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Pedigreenotations rename(Name name) {
        return new Pedigreenotations(name, null);
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
