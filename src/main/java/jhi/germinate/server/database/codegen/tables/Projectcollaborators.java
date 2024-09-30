/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.enums.ProjectcollaboratorsRole;
import jhi.germinate.server.database.codegen.tables.records.ProjectcollaboratorsRecord;

import org.jooq.Field;
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
public class Projectcollaborators extends TableImpl<ProjectcollaboratorsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.projectcollaborators</code>
     */
    public static final Projectcollaborators PROJECTCOLLABORATORS = new Projectcollaborators();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProjectcollaboratorsRecord> getRecordType() {
        return ProjectcollaboratorsRecord.class;
    }

    /**
     * The column
     * <code>germinate_db.projectcollaborators.collaborator_id</code>.
     */
    public final TableField<ProjectcollaboratorsRecord, Integer> COLLABORATOR_ID = createField(DSL.name("collaborator_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_db.projectcollaborators.project_id</code>.
     */
    public final TableField<ProjectcollaboratorsRecord, Integer> PROJECT_ID = createField(DSL.name("project_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_db.projectcollaborators.role</code>.
     */
    public final TableField<ProjectcollaboratorsRecord, ProjectcollaboratorsRole> ROLE = createField(DSL.name("role"), SQLDataType.VARCHAR(22).nullable(false).defaultValue(DSL.inline("author", SQLDataType.VARCHAR)).asEnumDataType(jhi.germinate.server.database.codegen.enums.ProjectcollaboratorsRole.class), this, "");

    /**
     * The column <code>germinate_db.projectcollaborators.created_on</code>.
     */
    public final TableField<ProjectcollaboratorsRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>germinate_db.projectcollaborators.updated_on</code>.
     */
    public final TableField<ProjectcollaboratorsRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "");

    private Projectcollaborators(Name alias, Table<ProjectcollaboratorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Projectcollaborators(Name alias, Table<ProjectcollaboratorsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.projectcollaborators</code> table
     * reference
     */
    public Projectcollaborators(String alias) {
        this(DSL.name(alias), PROJECTCOLLABORATORS);
    }

    /**
     * Create an aliased <code>germinate_db.projectcollaborators</code> table
     * reference
     */
    public Projectcollaborators(Name alias) {
        this(alias, PROJECTCOLLABORATORS);
    }

    /**
     * Create a <code>germinate_db.projectcollaborators</code> table reference
     */
    public Projectcollaborators() {
        this(DSL.name("projectcollaborators"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public UniqueKey<ProjectcollaboratorsRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Projectcollaborators.PROJECTCOLLABORATORS, DSL.name("KEY_projectcollaborators_PRIMARY"), new TableField[] { Projectcollaborators.PROJECTCOLLABORATORS.COLLABORATOR_ID, Projectcollaborators.PROJECTCOLLABORATORS.PROJECT_ID }, true);
    }

    @Override
    public Projectcollaborators as(String alias) {
        return new Projectcollaborators(DSL.name(alias), this);
    }

    @Override
    public Projectcollaborators as(Name alias) {
        return new Projectcollaborators(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Projectcollaborators rename(String name) {
        return new Projectcollaborators(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Projectcollaborators rename(Name name) {
        return new Projectcollaborators(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, ProjectcollaboratorsRole, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
    // @formatter:on
}
