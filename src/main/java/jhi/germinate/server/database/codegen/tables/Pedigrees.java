/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.enums.PedigreesRelationshipType;
import jhi.germinate.server.database.codegen.tables.records.PedigreesRecord;

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
 * Holds pedigree definitions. A pedigree is constructed from a series of 
 * individial-&gt;parent records. This gives a great deal of flexibility in 
 * how pedigree networks can be constructed. This table is required for operation 
 * with the Helium pedigree viewer.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Pedigrees extends TableImpl<PedigreesRecord> {

    private static final long serialVersionUID = -500817933;

    /**
     * The reference instance of <code>germinate_db.pedigrees</code>
     */
    public static final Pedigrees PEDIGREES = new Pedigrees();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PedigreesRecord> getRecordType() {
        return PedigreesRecord.class;
    }

    /**
     * The column <code>germinate_db.pedigrees.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<PedigreesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.pedigrees.germinatebase_id</code>. Foreign key germinatebase (germinatebase.id).
     */
    public final TableField<PedigreesRecord, Integer> GERMINATEBASE_ID = createField("germinatebase_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Foreign key germinatebase (germinatebase.id).");

    /**
     * The column <code>germinate_db.pedigrees.parent_id</code>. Foreign key germinatebase (germinatebase.id). This is the parrent of the individual identified in the germinatebase_id column.
     */
    public final TableField<PedigreesRecord, Integer> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Foreign key germinatebase (germinatebase.id). This is the parrent of the individual identified in the germinatebase_id column.");

    /**
     * The column <code>germinate_db.pedigrees.relationship_type</code>. Male or Female parent. Should be recorded as 'M' (male) or 'F' (female).
     */
    public final TableField<PedigreesRecord, PedigreesRelationshipType> RELATIONSHIP_TYPE = createField("relationship_type", org.jooq.impl.SQLDataType.VARCHAR(5).nullable(false).defaultValue(org.jooq.impl.DSL.inline("OTHER", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(jhi.germinate.server.database.codegen.enums.PedigreesRelationshipType.class), this, "Male or Female parent. Should be recorded as 'M' (male) or 'F' (female).");

    /**
     * The column <code>germinate_db.pedigrees.pedigreedescription_id</code>. Foreign key pedigreedescriptions (pedigreedescriptions.id).
     */
    public final TableField<PedigreesRecord, Integer> PEDIGREEDESCRIPTION_ID = createField("pedigreedescription_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Foreign key pedigreedescriptions (pedigreedescriptions.id).");

    /**
     * The column <code>germinate_db.pedigrees.relationship_description</code>. Can be used as a meta-data field to describe the relationships if a complex rellationship is required. Examples may include, 'is a complex cross containing', 'F4 generation' and so on. This is used by the Helium pedigree visualiztion tool.
     */
    public final TableField<PedigreesRecord, String> RELATIONSHIP_DESCRIPTION = createField("relationship_description", org.jooq.impl.SQLDataType.CLOB, this, "Can be used as a meta-data field to describe the relationships if a complex rellationship is required. Examples may include, 'is a complex cross containing', 'F4 generation' and so on. This is used by the Helium pedigree visualiztion tool.");

    /**
     * The column <code>germinate_db.pedigrees.created_on</code>. When the record was created.
     */
    public final TableField<PedigreesRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.pedigrees.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<PedigreesRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_db.pedigrees</code> table reference
     */
    public Pedigrees() {
        this(DSL.name("pedigrees"), null);
    }

    /**
     * Create an aliased <code>germinate_db.pedigrees</code> table reference
     */
    public Pedigrees(String alias) {
        this(DSL.name(alias), PEDIGREES);
    }

    /**
     * Create an aliased <code>germinate_db.pedigrees</code> table reference
     */
    public Pedigrees(Name alias) {
        this(alias, PEDIGREES);
    }

    private Pedigrees(Name alias, Table<PedigreesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Pedigrees(Name alias, Table<PedigreesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Holds pedigree definitions. A pedigree is constructed from a series of individial->parent records. This gives a great deal of flexibility in how pedigree networks can be constructed. This table is required for operation with the Helium pedigree viewer."));
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
    public Identity<PedigreesRecord, Integer> getIdentity() {
        return Internal.createIdentity(jhi.germinate.server.database.codegen.tables.Pedigrees.PEDIGREES, jhi.germinate.server.database.codegen.tables.Pedigrees.PEDIGREES.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PedigreesRecord> getPrimaryKey() {
        return Internal.createUniqueKey(jhi.germinate.server.database.codegen.tables.Pedigrees.PEDIGREES, "KEY_pedigrees_PRIMARY", jhi.germinate.server.database.codegen.tables.Pedigrees.PEDIGREES.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PedigreesRecord>> getKeys() {
        return Arrays.<UniqueKey<PedigreesRecord>>asList(
              Internal.createUniqueKey(jhi.germinate.server.database.codegen.tables.Pedigrees.PEDIGREES, "KEY_pedigrees_PRIMARY", jhi.germinate.server.database.codegen.tables.Pedigrees.PEDIGREES.ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Pedigrees as(String alias) {
        return new Pedigrees(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Pedigrees as(Name alias) {
        return new Pedigrees(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Pedigrees rename(String name) {
        return new Pedigrees(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Pedigrees rename(Name name) {
        return new Pedigrees(name, null);
    }
// @formatter:on
}
