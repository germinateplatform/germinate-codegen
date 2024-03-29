/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.PedigreedescriptionsRecord;

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
 * Description of pedigrees. Pedigrees can have a description which details
 * additional information about the pedigree, how it was constructed and who the
 * contact is for the pedigree.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Pedigreedescriptions extends TableImpl<PedigreedescriptionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.pedigreedescriptions</code>
     */
    public static final Pedigreedescriptions PEDIGREEDESCRIPTIONS = new Pedigreedescriptions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PedigreedescriptionsRecord> getRecordType() {
        return PedigreedescriptionsRecord.class;
    }

    /**
     * The column <code>germinate_db.pedigreedescriptions.id</code>. Primary id
     * for this table. This uniquely identifies the row.
     */
    public final TableField<PedigreedescriptionsRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.pedigreedescriptions.name</code>. The name
     * of the pedigree.
     */
    public final TableField<PedigreedescriptionsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "The name of the pedigree.");

    /**
     * The column <code>germinate_db.pedigreedescriptions.description</code>.
     * Describes the pedigree in more detail.
     */
    public final TableField<PedigreedescriptionsRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "Describes the pedigree in more detail.");

    /**
     * The column <code>germinate_db.pedigreedescriptions.author</code>. Who is
     * responsible for the creation of the pedigree. Attribution should be
     * included in here for pedigree sources.
     */
    public final TableField<PedigreedescriptionsRecord, String> AUTHOR = createField(DSL.name("author"), SQLDataType.VARCHAR(255), this, "Who is responsible for the creation of the pedigree. Attribution should be included in here for pedigree sources.");

    /**
     * The column <code>germinate_db.pedigreedescriptions.created_on</code>.
     * When the record was created.
     */
    public final TableField<PedigreedescriptionsRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.pedigreedescriptions.updated_on</code>.
     * When the record was updated. This may be different from the created on
     * date if subsequent changes have been made to the underlying record.
     */
    public final TableField<PedigreedescriptionsRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private Pedigreedescriptions(Name alias, Table<PedigreedescriptionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Pedigreedescriptions(Name alias, Table<PedigreedescriptionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Description of pedigrees. Pedigrees can have a description which details additional information about the pedigree, how it was constructed and who the contact is for the pedigree."), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.pedigreedescriptions</code> table
     * reference
     */
    public Pedigreedescriptions(String alias) {
        this(DSL.name(alias), PEDIGREEDESCRIPTIONS);
    }

    /**
     * Create an aliased <code>germinate_db.pedigreedescriptions</code> table
     * reference
     */
    public Pedigreedescriptions(Name alias) {
        this(alias, PEDIGREEDESCRIPTIONS);
    }

    /**
     * Create a <code>germinate_db.pedigreedescriptions</code> table reference
     */
    public Pedigreedescriptions() {
        this(DSL.name("pedigreedescriptions"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<PedigreedescriptionsRecord, Integer> getIdentity() {
        return (Identity<PedigreedescriptionsRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<PedigreedescriptionsRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Pedigreedescriptions.PEDIGREEDESCRIPTIONS, DSL.name("KEY_pedigreedescriptions_PRIMARY"), new TableField[] { Pedigreedescriptions.PEDIGREEDESCRIPTIONS.ID }, true);
    }

    @Override
    public Pedigreedescriptions as(String alias) {
        return new Pedigreedescriptions(DSL.name(alias), this);
    }

    @Override
    public Pedigreedescriptions as(Name alias) {
        return new Pedigreedescriptions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Pedigreedescriptions rename(String name) {
        return new Pedigreedescriptions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Pedigreedescriptions rename(Name name) {
        return new Pedigreedescriptions(name, null);
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
