/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.EntitytypesRecord;

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
public class Entitytypes extends TableImpl<EntitytypesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.entitytypes</code>
     */
    public static final Entitytypes ENTITYTYPES = new Entitytypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EntitytypesRecord> getRecordType() {
        return EntitytypesRecord.class;
    }

    /**
     * The column <code>germinate_db.entitytypes.id</code>. Primary id for this
     * table. This uniquely identifies the row.
     */
    public final TableField<EntitytypesRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.entitytypes.name</code>. The name of the
     * entity type.
     */
    public final TableField<EntitytypesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "The name of the entity type.");

    /**
     * The column <code>germinate_db.entitytypes.description</code>. Describes
     * the entity type.
     */
    public final TableField<EntitytypesRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "Describes the entity type.");

    /**
     * The column <code>germinate_db.entitytypes.created_on</code>. When the
     * record was created.
     */
    public final TableField<EntitytypesRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.entitytypes.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public final TableField<EntitytypesRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private Entitytypes(Name alias, Table<EntitytypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Entitytypes(Name alias, Table<EntitytypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.entitytypes</code> table reference
     */
    public Entitytypes(String alias) {
        this(DSL.name(alias), ENTITYTYPES);
    }

    /**
     * Create an aliased <code>germinate_db.entitytypes</code> table reference
     */
    public Entitytypes(Name alias) {
        this(alias, ENTITYTYPES);
    }

    /**
     * Create a <code>germinate_db.entitytypes</code> table reference
     */
    public Entitytypes() {
        this(DSL.name("entitytypes"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<EntitytypesRecord, Integer> getIdentity() {
        return (Identity<EntitytypesRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<EntitytypesRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Entitytypes.ENTITYTYPES, DSL.name("KEY_entitytypes_PRIMARY"), new TableField[] { Entitytypes.ENTITYTYPES.ID }, true);
    }

    @Override
    public Entitytypes as(String alias) {
        return new Entitytypes(DSL.name(alias), this);
    }

    @Override
    public Entitytypes as(Name alias) {
        return new Entitytypes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Entitytypes rename(String name) {
        return new Entitytypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Entitytypes rename(Name name) {
        return new Entitytypes(name, null);
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
