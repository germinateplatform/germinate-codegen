/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.binding.IntArrayBinding;
import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewTableGroupsRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row12;
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
public class ViewTableGroups extends TableImpl<ViewTableGroupsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.view_table_groups</code>
     */
    public static final ViewTableGroups VIEW_TABLE_GROUPS = new ViewTableGroups();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableGroupsRecord> getRecordType() {
        return ViewTableGroupsRecord.class;
    }

    /**
     * The column <code>germinate_db.view_table_groups.group_id</code>. Primary
     * id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableGroupsRecord, Integer> GROUP_ID = createField(DSL.name("group_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_groups.group_name</code>. The
     * name of the group which can be used to identify it.
     */
    public final TableField<ViewTableGroupsRecord, String> GROUP_NAME = createField(DSL.name("group_name"), SQLDataType.VARCHAR(255), this, "The name of the group which can be used to identify it.");

    /**
     * The column <code>germinate_db.view_table_groups.group_description</code>.
     * A free text description of the group. This has no length limitations.
     */
    public final TableField<ViewTableGroupsRecord, String> GROUP_DESCRIPTION = createField(DSL.name("group_description"), SQLDataType.CLOB, this, "A free text description of the group. This has no length limitations.");

    /**
     * The column <code>germinate_db.view_table_groups.group_type_id</code>.
     */
    public final TableField<ViewTableGroupsRecord, Integer> GROUP_TYPE_ID = createField(DSL.name("group_type_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>germinate_db.view_table_groups.group_type</code>.
     */
    public final TableField<ViewTableGroupsRecord, String> GROUP_TYPE = createField(DSL.name("group_type"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>germinate_db.view_table_groups.user_name</code>.
     */
    public final TableField<ViewTableGroupsRecord, String> USER_NAME = createField(DSL.name("user_name"), SQLDataType.VARCHAR.nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>germinate_db.view_table_groups.user_id</code>. Defines
     * who created the group. Foreign key to Gatekeeper users (Gatekeeper
     * users.id).
     */
    public final TableField<ViewTableGroupsRecord, Integer> USER_ID = createField(DSL.name("user_id"), SQLDataType.INTEGER, this, "Defines who created the group. Foreign key to Gatekeeper users (Gatekeeper users.id).");

    /**
     * The column <code>germinate_db.view_table_groups.group_visibility</code>.
     * Defines if the group is visuble or hidden from the Germinate user
     * interface.
     */
    public final TableField<ViewTableGroupsRecord, Boolean> GROUP_VISIBILITY = createField(DSL.name("group_visibility"), SQLDataType.BOOLEAN, this, "Defines if the group is visuble or hidden from the Germinate user interface.");

    /**
     * The column <code>germinate_db.view_table_groups.created_on</code>.
     * Foreign key to locations (locations.id).
     */
    public final TableField<ViewTableGroupsRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "Foreign key to locations (locations.id).");

    /**
     * The column <code>germinate_db.view_table_groups.updated_on</code>. When
     * the record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public final TableField<ViewTableGroupsRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * The column <code>germinate_db.view_table_groups.project_ids</code>.
     */
    public final TableField<ViewTableGroupsRecord, Integer[]> PROJECT_IDS = createField(DSL.name("project_ids"), SQLDataType.JSON, this, "", new IntArrayBinding());

    /**
     * The column <code>germinate_db.view_table_groups.count</code>.
     */
    public final TableField<ViewTableGroupsRecord, Long> COUNT = createField(DSL.name("count"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "");

    private ViewTableGroups(Name alias, Table<ViewTableGroupsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableGroups(Name alias, Table<ViewTableGroupsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_groups` as select `germinate_template_4_25_03_05`.`groups`.`id` AS `group_id`,`germinate_template_4_25_03_05`.`groups`.`name` AS `group_name`,`germinate_template_4_25_03_05`.`groups`.`description` AS `group_description`,`germinate_template_4_25_03_05`.`grouptypes`.`id` AS `group_type_id`,`germinate_template_4_25_03_05`.`grouptypes`.`target_table` AS `group_type`,'' AS `user_name`,`germinate_template_4_25_03_05`.`groups`.`created_by` AS `user_id`,`germinate_template_4_25_03_05`.`groups`.`visibility` AS `group_visibility`,`germinate_template_4_25_03_05`.`groups`.`created_on` AS `created_on`,`germinate_template_4_25_03_05`.`groups`.`updated_on` AS `updated_on`,(select json_arrayagg(`germinate_template_4_25_03_05`.`projectgroups`.`project_id`) from `germinate_template_4_25_03_05`.`projectgroups` where (`germinate_template_4_25_03_05`.`projectgroups`.`group_id` = `germinate_template_4_25_03_05`.`groups`.`id`) group by `germinate_template_4_25_03_05`.`projectgroups`.`group_id`) AS `project_ids`,count(`germinate_template_4_25_03_05`.`groupmembers`.`id`) AS `count` from ((((`germinate_template_4_25_03_05`.`groups` left join `germinate_template_4_25_03_05`.`grouptypes` on((`germinate_template_4_25_03_05`.`groups`.`grouptype_id` = `germinate_template_4_25_03_05`.`grouptypes`.`id`))) left join `germinate_template_4_25_03_05`.`groupmembers` on((`germinate_template_4_25_03_05`.`groupmembers`.`group_id` = `germinate_template_4_25_03_05`.`groups`.`id`))) left join `germinate_template_4_25_03_05`.`projectgroups` on((`germinate_template_4_25_03_05`.`projectgroups`.`group_id` = `germinate_template_4_25_03_05`.`groups`.`id`))) left join `germinate_template_4_25_03_05`.`projects` on((`germinate_template_4_25_03_05`.`projects`.`id` = `germinate_template_4_25_03_05`.`projectgroups`.`project_id`))) group by `germinate_template_4_25_03_05`.`groups`.`id`"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_groups</code> table
     * reference
     */
    public ViewTableGroups(String alias) {
        this(DSL.name(alias), VIEW_TABLE_GROUPS);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_groups</code> table
     * reference
     */
    public ViewTableGroups(Name alias) {
        this(alias, VIEW_TABLE_GROUPS);
    }

    /**
     * Create a <code>germinate_db.view_table_groups</code> table reference
     */
    public ViewTableGroups() {
        this(DSL.name("view_table_groups"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableGroups as(String alias) {
        return new ViewTableGroups(DSL.name(alias), this);
    }

    @Override
    public ViewTableGroups as(Name alias) {
        return new ViewTableGroups(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableGroups rename(String name) {
        return new ViewTableGroups(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableGroups rename(Name name) {
        return new ViewTableGroups(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, String, String, Integer, String, String, Integer, Boolean, Timestamp, Timestamp, Integer[], Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
    // @formatter:on
}
