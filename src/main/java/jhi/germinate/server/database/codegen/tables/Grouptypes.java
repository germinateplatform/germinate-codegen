/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.GrouptypesRecord;

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
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Grouptypes extends TableImpl<GrouptypesRecord> {

    private static final long serialVersionUID = 1208067448;

    /**
     * The reference instance of <code>germinate_db.grouptypes</code>
     */
    public static final Grouptypes GROUPTYPES = new Grouptypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GrouptypesRecord> getRecordType() {
        return GrouptypesRecord.class;
    }

    /**
     * The column <code>germinate_db.grouptypes.id</code>.
     */
    public final TableField<GrouptypesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>germinate_db.grouptypes.description</code>.
     */
    public final TableField<GrouptypesRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>germinate_db.grouptypes.target_table</code>.
     */
    public final TableField<GrouptypesRecord, String> TARGET_TABLE = createField("target_table", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>germinate_db.grouptypes.created_on</code>. When the record was created.
     */
    public final TableField<GrouptypesRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.grouptypes.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<GrouptypesRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_db.grouptypes</code> table reference
     */
    public Grouptypes() {
        this(DSL.name("grouptypes"), null);
    }

    /**
     * Create an aliased <code>germinate_db.grouptypes</code> table reference
     */
    public Grouptypes(String alias) {
        this(DSL.name(alias), GROUPTYPES);
    }

    /**
     * Create an aliased <code>germinate_db.grouptypes</code> table reference
     */
    public Grouptypes(Name alias) {
        this(alias, GROUPTYPES);
    }

    private Grouptypes(Name alias, Table<GrouptypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Grouptypes(Name alias, Table<GrouptypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
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
    public Identity<GrouptypesRecord, Integer> getIdentity() {
        return Internal.createIdentity(jhi.germinate.server.database.codegen.tables.Grouptypes.GROUPTYPES, jhi.germinate.server.database.codegen.tables.Grouptypes.GROUPTYPES.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GrouptypesRecord> getPrimaryKey() {
        return Internal.createUniqueKey(jhi.germinate.server.database.codegen.tables.Grouptypes.GROUPTYPES, "KEY_grouptypes_PRIMARY", jhi.germinate.server.database.codegen.tables.Grouptypes.GROUPTYPES.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GrouptypesRecord>> getKeys() {
        return Arrays.<UniqueKey<GrouptypesRecord>>asList(
              Internal.createUniqueKey(jhi.germinate.server.database.codegen.tables.Grouptypes.GROUPTYPES, "KEY_grouptypes_PRIMARY", jhi.germinate.server.database.codegen.tables.Grouptypes.GROUPTYPES.ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Grouptypes as(String alias) {
        return new Grouptypes(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Grouptypes as(Name alias) {
        return new Grouptypes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Grouptypes rename(String name) {
        return new Grouptypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Grouptypes rename(Name name) {
        return new Grouptypes(name, null);
    }
// @formatter:on
}
