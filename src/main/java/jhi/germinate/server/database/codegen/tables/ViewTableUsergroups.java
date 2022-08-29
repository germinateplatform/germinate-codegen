/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewTableUsergroupsRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


// @formatter:off
/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableUsergroups extends TableImpl<ViewTableUsergroupsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.view_table_usergroups</code>
     */
    public static final ViewTableUsergroups VIEW_TABLE_USERGROUPS = new ViewTableUsergroups();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableUsergroupsRecord> getRecordType() {
        return ViewTableUsergroupsRecord.class;
    }

    /**
     * The column <code>germinate_db.view_table_usergroups.user_group_id</code>.
     */
    public final TableField<ViewTableUsergroupsRecord, Integer> USER_GROUP_ID = createField(DSL.name("user_group_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>germinate_db.view_table_usergroups.user_group_name</code>. The name
     * of the user group.
     */
    public final TableField<ViewTableUsergroupsRecord, String> USER_GROUP_NAME = createField(DSL.name("user_group_name"), SQLDataType.VARCHAR(255).nullable(false), this, "The name of the user group.");

    /**
     * The column
     * <code>germinate_db.view_table_usergroups.user_group_description</code>. A
     * description of the user group.
     */
    public final TableField<ViewTableUsergroupsRecord, String> USER_GROUP_DESCRIPTION = createField(DSL.name("user_group_description"), SQLDataType.CLOB, this, "A description of the user group.");

    /**
     * The column <code>germinate_db.view_table_usergroups.created_on</code>.
     * When the record was created.
     */
    public final TableField<ViewTableUsergroupsRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0), this, "When the record was created.");

    /**
     * The column <code>germinate_db.view_table_usergroups.count</code>.
     */
    public final TableField<ViewTableUsergroupsRecord, Long> COUNT = createField(DSL.name("count"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "");

    private ViewTableUsergroups(Name alias, Table<ViewTableUsergroupsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableUsergroups(Name alias, Table<ViewTableUsergroupsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_usergroups` as select `germinate_template_4_22_08_24`.`usergroups`.`id` AS `user_group_id`,`germinate_template_4_22_08_24`.`usergroups`.`name` AS `user_group_name`,`germinate_template_4_22_08_24`.`usergroups`.`description` AS `user_group_description`,`germinate_template_4_22_08_24`.`usergroups`.`created_on` AS `created_on`,count(`germinate_template_4_22_08_24`.`usergroupmembers`.`id`) AS `count` from (`germinate_template_4_22_08_24`.`usergroups` left join `germinate_template_4_22_08_24`.`usergroupmembers` on((`germinate_template_4_22_08_24`.`usergroupmembers`.`usergroup_id` = `germinate_template_4_22_08_24`.`usergroups`.`id`))) group by `germinate_template_4_22_08_24`.`usergroups`.`id`"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_usergroups</code> table
     * reference
     */
    public ViewTableUsergroups(String alias) {
        this(DSL.name(alias), VIEW_TABLE_USERGROUPS);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_usergroups</code> table
     * reference
     */
    public ViewTableUsergroups(Name alias) {
        this(alias, VIEW_TABLE_USERGROUPS);
    }

    /**
     * Create a <code>germinate_db.view_table_usergroups</code> table reference
     */
    public ViewTableUsergroups() {
        this(DSL.name("view_table_usergroups"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableUsergroups as(String alias) {
        return new ViewTableUsergroups(DSL.name(alias), this);
    }

    @Override
    public ViewTableUsergroups as(Name alias) {
        return new ViewTableUsergroups(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableUsergroups rename(String name) {
        return new ViewTableUsergroups(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableUsergroups rename(Name name) {
        return new ViewTableUsergroups(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, String, Timestamp, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
    // @formatter:on
}
