/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.PedigreedescriptionsRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.TableImpl;


// @formatter:off
/**
 * Description of pedigrees. Pedigrees can have a description which details 
 * additional information about the pedigree, how it was constructed and who 
 * the contact is for the pedigree.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Pedigreedescriptions extends TableImpl<PedigreedescriptionsRecord> {

    private static final long serialVersionUID = 1368616322;

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
     * The column <code>germinate_db.pedigreedescriptions.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<PedigreedescriptionsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.pedigreedescriptions.name</code>. The name of the pedigree.
     */
    public final TableField<PedigreedescriptionsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "The name of the pedigree.");

    /**
     * The column <code>germinate_db.pedigreedescriptions.description</code>. Describes the pedigree in more detail.
     */
    public final TableField<PedigreedescriptionsRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "Describes the pedigree in more detail.");

    /**
     * The column <code>germinate_db.pedigreedescriptions.author</code>. Who is responsible for the creation of the pedigree. Attribution should be included in here for pedigree sources.
     */
    public final TableField<PedigreedescriptionsRecord, String> AUTHOR = createField("author", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Who is responsible for the creation of the pedigree. Attribution should be included in here for pedigree sources.");

    /**
     * The column <code>germinate_db.pedigreedescriptions.created_on</code>. When the record was created.
     */
    public final TableField<PedigreedescriptionsRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.pedigreedescriptions.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<PedigreedescriptionsRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_db.pedigreedescriptions</code> table reference
     */
    public Pedigreedescriptions() {
        this(DSL.name("pedigreedescriptions"), null);
    }

    /**
     * Create an aliased <code>germinate_db.pedigreedescriptions</code> table reference
     */
    public Pedigreedescriptions(String alias) {
        this(DSL.name(alias), PEDIGREEDESCRIPTIONS);
    }

    /**
     * Create an aliased <code>germinate_db.pedigreedescriptions</code> table reference
     */
    public Pedigreedescriptions(Name alias) {
        this(alias, PEDIGREEDESCRIPTIONS);
    }

    private Pedigreedescriptions(Name alias, Table<PedigreedescriptionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Pedigreedescriptions(Name alias, Table<PedigreedescriptionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Description of pedigrees. Pedigrees can have a description which details additional information about the pedigree, how it was constructed and who the contact is for the pedigree."));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return GerminateDb.GERMINATE_DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PedigreedescriptionsRecord, Integer> getIdentity() {
        return Internal.createIdentity(jhi.germinate.server.database.codegen.tables.Pedigreedescriptions.PEDIGREEDESCRIPTIONS, jhi.germinate.server.database.codegen.tables.Pedigreedescriptions.PEDIGREEDESCRIPTIONS.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PedigreedescriptionsRecord> getPrimaryKey() {
        return Internal.createUniqueKey(jhi.germinate.server.database.codegen.tables.Pedigreedescriptions.PEDIGREEDESCRIPTIONS, "KEY_pedigreedescriptions_PRIMARY", jhi.germinate.server.database.codegen.tables.Pedigreedescriptions.PEDIGREEDESCRIPTIONS.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PedigreedescriptionsRecord>> getKeys() {
        return Arrays.<UniqueKey<PedigreedescriptionsRecord>>asList(
              Internal.createUniqueKey(jhi.germinate.server.database.codegen.tables.Pedigreedescriptions.PEDIGREEDESCRIPTIONS, "KEY_pedigreedescriptions_PRIMARY", jhi.germinate.server.database.codegen.tables.Pedigreedescriptions.PEDIGREEDESCRIPTIONS.ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Pedigreedescriptions as(String alias) {
        return new Pedigreedescriptions(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
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
// @formatter:on
}
