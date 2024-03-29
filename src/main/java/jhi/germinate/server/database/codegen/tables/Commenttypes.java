/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.CommenttypesRecord;

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
 * Defines the comment type.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Commenttypes extends TableImpl<CommenttypesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.commenttypes</code>
     */
    public static final Commenttypes COMMENTTYPES = new Commenttypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CommenttypesRecord> getRecordType() {
        return CommenttypesRecord.class;
    }

    /**
     * The column <code>germinate_db.commenttypes.id</code>. Primary id for this
     * table. This uniquely identifies the row.
     */
    public final TableField<CommenttypesRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.commenttypes.description</code>. Describes
     * the comment type.
     */
    public final TableField<CommenttypesRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB.nullable(false), this, "Describes the comment type.");

    /**
     * The column <code>germinate_db.commenttypes.reference_table</code>. This
     * could include 'germinatebase' or 'markers' to define the table that the
     * comment relates to.
     */
    public final TableField<CommenttypesRecord, String> REFERENCE_TABLE = createField(DSL.name("reference_table"), SQLDataType.VARCHAR(50).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "This could include 'germinatebase' or 'markers' to define the table that the comment relates to.");

    /**
     * The column <code>germinate_db.commenttypes.created_on</code>. When the
     * record was created.
     */
    public final TableField<CommenttypesRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.commenttypes.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public final TableField<CommenttypesRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private Commenttypes(Name alias, Table<CommenttypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Commenttypes(Name alias, Table<CommenttypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Defines the comment type."), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.commenttypes</code> table reference
     */
    public Commenttypes(String alias) {
        this(DSL.name(alias), COMMENTTYPES);
    }

    /**
     * Create an aliased <code>germinate_db.commenttypes</code> table reference
     */
    public Commenttypes(Name alias) {
        this(alias, COMMENTTYPES);
    }

    /**
     * Create a <code>germinate_db.commenttypes</code> table reference
     */
    public Commenttypes() {
        this(DSL.name("commenttypes"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<CommenttypesRecord, Integer> getIdentity() {
        return (Identity<CommenttypesRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<CommenttypesRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Commenttypes.COMMENTTYPES, DSL.name("KEY_commenttypes_PRIMARY"), new TableField[] { Commenttypes.COMMENTTYPES.ID }, true);
    }

    @Override
    public Commenttypes as(String alias) {
        return new Commenttypes(DSL.name(alias), this);
    }

    @Override
    public Commenttypes as(Name alias) {
        return new Commenttypes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Commenttypes rename(String name) {
        return new Commenttypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Commenttypes rename(Name name) {
        return new Commenttypes(name, null);
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
