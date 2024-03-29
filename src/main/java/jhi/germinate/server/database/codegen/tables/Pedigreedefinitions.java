/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.PedigreedefinitionsRecord;

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
 * This table holds the actual pedigree definition data.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Pedigreedefinitions extends TableImpl<PedigreedefinitionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.pedigreedefinitions</code>
     */
    public static final Pedigreedefinitions PEDIGREEDEFINITIONS = new Pedigreedefinitions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PedigreedefinitionsRecord> getRecordType() {
        return PedigreedefinitionsRecord.class;
    }

    /**
     * The column <code>germinate_db.pedigreedefinitions.id</code>. Primary id
     * for this table. This uniquely identifies the row.
     */
    public final TableField<PedigreedefinitionsRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.pedigreedefinitions.dataset_id</code>.
     */
    public final TableField<PedigreedefinitionsRecord, Integer> DATASET_ID = createField(DSL.name("dataset_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>germinate_db.pedigreedefinitions.germinatebase_id</code>. Foreign
     * key to germinatebase (germinatebase.id).
     */
    public final TableField<PedigreedefinitionsRecord, Integer> GERMINATEBASE_ID = createField(DSL.name("germinatebase_id"), SQLDataType.INTEGER.nullable(false), this, "Foreign key to germinatebase (germinatebase.id).");

    /**
     * The column
     * <code>germinate_db.pedigreedefinitions.pedigreenotation_id</code>.
     * Foreign key to pedigreenotations (pedigreenotations.id).
     */
    public final TableField<PedigreedefinitionsRecord, Integer> PEDIGREENOTATION_ID = createField(DSL.name("pedigreenotation_id"), SQLDataType.INTEGER.nullable(false), this, "Foreign key to pedigreenotations (pedigreenotations.id).");

    /**
     * The column
     * <code>germinate_db.pedigreedefinitions.pedigreedescription_id</code>.
     */
    public final TableField<PedigreedefinitionsRecord, Integer> PEDIGREEDESCRIPTION_ID = createField(DSL.name("pedigreedescription_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>germinate_db.pedigreedefinitions.definition</code>. The
     * pedigree string which is used to represent the germinatebase entry.
     */
    public final TableField<PedigreedefinitionsRecord, String> DEFINITION = createField(DSL.name("definition"), SQLDataType.CLOB.nullable(false), this, "The pedigree string which is used to represent the germinatebase entry.");

    /**
     * The column <code>germinate_db.pedigreedefinitions.created_on</code>. When
     * the record was created.
     */
    public final TableField<PedigreedefinitionsRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.pedigreedefinitions.updated_on</code>. When
     * the record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public final TableField<PedigreedefinitionsRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private Pedigreedefinitions(Name alias, Table<PedigreedefinitionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Pedigreedefinitions(Name alias, Table<PedigreedefinitionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("This table holds the actual pedigree definition data."), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.pedigreedefinitions</code> table
     * reference
     */
    public Pedigreedefinitions(String alias) {
        this(DSL.name(alias), PEDIGREEDEFINITIONS);
    }

    /**
     * Create an aliased <code>germinate_db.pedigreedefinitions</code> table
     * reference
     */
    public Pedigreedefinitions(Name alias) {
        this(alias, PEDIGREEDEFINITIONS);
    }

    /**
     * Create a <code>germinate_db.pedigreedefinitions</code> table reference
     */
    public Pedigreedefinitions() {
        this(DSL.name("pedigreedefinitions"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<PedigreedefinitionsRecord, Integer> getIdentity() {
        return (Identity<PedigreedefinitionsRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<PedigreedefinitionsRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Pedigreedefinitions.PEDIGREEDEFINITIONS, DSL.name("KEY_pedigreedefinitions_PRIMARY"), new TableField[] { Pedigreedefinitions.PEDIGREEDEFINITIONS.ID }, true);
    }

    @Override
    public Pedigreedefinitions as(String alias) {
        return new Pedigreedefinitions(DSL.name(alias), this);
    }

    @Override
    public Pedigreedefinitions as(Name alias) {
        return new Pedigreedefinitions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Pedigreedefinitions rename(String name) {
        return new Pedigreedefinitions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Pedigreedefinitions rename(Name name) {
        return new Pedigreedefinitions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, Integer, Integer, Integer, Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
    // @formatter:on
}
