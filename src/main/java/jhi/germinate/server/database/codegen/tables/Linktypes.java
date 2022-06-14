/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.LinktypesRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Row7;
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
 * The link type determines which database table and column are used to
 * construct the final
 * link. The ”placeholder” in the link (from the links table) will be replaced
 * by the value of the
 * ”target column” in the ”target table”
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Linktypes extends TableImpl<LinktypesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.linktypes</code>
     */
    public static final Linktypes LINKTYPES = new Linktypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LinktypesRecord> getRecordType() {
        return LinktypesRecord.class;
    }

    /**
     * The column <code>germinate_db.linktypes.id</code>. Primary id for this
     * table. This uniquely identifies the row.
     */
    public final TableField<LinktypesRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.linktypes.description</code>. A description
     * of the link.
     */
    public final TableField<LinktypesRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(255), this, "A description of the link\r.");

    /**
     * The column <code>germinate_db.linktypes.target_table</code>. This is the
     * table that the link links to.
     */
    public final TableField<LinktypesRecord, String> TARGET_TABLE = createField(DSL.name("target_table"), SQLDataType.VARCHAR(255).nullable(false), this, "This is the table that the link links to.");

    /**
     * The column <code>germinate_db.linktypes.target_column</code>. This is the
     * column that is used to generate the link.
     */
    public final TableField<LinktypesRecord, String> TARGET_COLUMN = createField(DSL.name("target_column"), SQLDataType.VARCHAR(255), this, "This is the column that is used to generate the link.");

    /**
     * The column <code>germinate_db.linktypes.placeholder</code>. The part of
     * the link that will be replaced by the value of the target column.
     */
    public final TableField<LinktypesRecord, String> PLACEHOLDER = createField(DSL.name("placeholder"), SQLDataType.VARCHAR(255), this, "The part of the link that will be replaced by the value of the target column.");

    /**
     * The column <code>germinate_db.linktypes.created_on</code>. When the
     * record was created.
     */
    public final TableField<LinktypesRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.linktypes.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public final TableField<LinktypesRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private Linktypes(Name alias, Table<LinktypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Linktypes(Name alias, Table<LinktypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("The link type determines which database table and column are used to construct the final\r\nlink. The ”placeholder” in the link (from the links table) will be replaced by the value of the\r\n”target column” in the ”target table”"), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.linktypes</code> table reference
     */
    public Linktypes(String alias) {
        this(DSL.name(alias), LINKTYPES);
    }

    /**
     * Create an aliased <code>germinate_db.linktypes</code> table reference
     */
    public Linktypes(Name alias) {
        this(alias, LINKTYPES);
    }

    /**
     * Create a <code>germinate_db.linktypes</code> table reference
     */
    public Linktypes() {
        this(DSL.name("linktypes"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<LinktypesRecord, Integer> getIdentity() {
        return (Identity<LinktypesRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<LinktypesRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Linktypes.LINKTYPES, DSL.name("KEY_linktypes_PRIMARY"), new TableField[] { Linktypes.LINKTYPES.ID }, true);
    }

    @Override
    public Linktypes as(String alias) {
        return new Linktypes(DSL.name(alias), this);
    }

    @Override
    public Linktypes as(Name alias) {
        return new Linktypes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Linktypes rename(String name) {
        return new Linktypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Linktypes rename(Name name) {
        return new Linktypes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, String, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
    // @formatter:on
}
