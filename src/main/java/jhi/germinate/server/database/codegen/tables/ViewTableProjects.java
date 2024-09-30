/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.binding.DatasetArrayBinding;
import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewTableProjectsRecord;
import jhi.germinate.server.database.pojo.Dataset;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row11;
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
public class ViewTableProjects extends TableImpl<ViewTableProjectsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.view_table_projects</code>
     */
    public static final ViewTableProjects VIEW_TABLE_PROJECTS = new ViewTableProjects();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableProjectsRecord> getRecordType() {
        return ViewTableProjectsRecord.class;
    }

    /**
     * The column <code>germinate_db.view_table_projects.project_id</code>.
     */
    public final TableField<ViewTableProjectsRecord, Integer> PROJECT_ID = createField(DSL.name("project_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>germinate_db.view_table_projects.project_name</code>.
     */
    public final TableField<ViewTableProjectsRecord, String> PROJECT_NAME = createField(DSL.name("project_name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column
     * <code>germinate_db.view_table_projects.project_description</code>.
     */
    public final TableField<ViewTableProjectsRecord, String> PROJECT_DESCRIPTION = createField(DSL.name("project_description"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>germinate_db.view_table_projects.project_page_content</code>.
     */
    public final TableField<ViewTableProjectsRecord, String> PROJECT_PAGE_CONTENT = createField(DSL.name("project_page_content"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>germinate_db.view_table_projects.project_external_url</code>.
     */
    public final TableField<ViewTableProjectsRecord, String> PROJECT_EXTERNAL_URL = createField(DSL.name("project_external_url"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>germinate_db.view_table_projects.project_image_id</code>.
     */
    public final TableField<ViewTableProjectsRecord, Integer> PROJECT_IMAGE_ID = createField(DSL.name("project_image_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>germinate_db.view_table_projects.project_start_date</code>.
     */
    public final TableField<ViewTableProjectsRecord, Timestamp> PROJECT_START_DATE = createField(DSL.name("project_start_date"), SQLDataType.TIMESTAMP(0), this, "");

    /**
     * The column
     * <code>germinate_db.view_table_projects.project_end_date</code>.
     */
    public final TableField<ViewTableProjectsRecord, Timestamp> PROJECT_END_DATE = createField(DSL.name("project_end_date"), SQLDataType.TIMESTAMP(0), this, "");

    /**
     * The column
     * <code>germinate_db.view_table_projects.project_created_on</code>.
     */
    public final TableField<ViewTableProjectsRecord, Timestamp> PROJECT_CREATED_ON = createField(DSL.name("project_created_on"), SQLDataType.TIMESTAMP(0).nullable(false).defaultValue(DSL.inline("0000-00-00 00:00:00", SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column
     * <code>germinate_db.view_table_projects.project_updated_on</code>.
     */
    public final TableField<ViewTableProjectsRecord, Timestamp> PROJECT_UPDATED_ON = createField(DSL.name("project_updated_on"), SQLDataType.TIMESTAMP(0).nullable(false).defaultValue(DSL.inline("0000-00-00 00:00:00", SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>germinate_db.view_table_projects.datasets</code>.
     */
    public final TableField<ViewTableProjectsRecord, Dataset[]> DATASETS = createField(DSL.name("datasets"), SQLDataType.JSON, this, "", new DatasetArrayBinding());

    private ViewTableProjects(Name alias, Table<ViewTableProjectsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableProjects(Name alias, Table<ViewTableProjectsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_projects` as select `germinate_template_4_24_09_27`.`projects`.`id` AS `project_id`,`germinate_template_4_24_09_27`.`projects`.`name` AS `project_name`,`germinate_template_4_24_09_27`.`projects`.`description` AS `project_description`,`germinate_template_4_24_09_27`.`projects`.`page_content` AS `project_page_content`,`germinate_template_4_24_09_27`.`projects`.`external_url` AS `project_external_url`,`germinate_template_4_24_09_27`.`projects`.`image_id` AS `project_image_id`,`germinate_template_4_24_09_27`.`projects`.`start_date` AS `project_start_date`,`germinate_template_4_24_09_27`.`projects`.`end_date` AS `project_end_date`,`germinate_template_4_24_09_27`.`projects`.`created_on` AS `project_created_on`,`germinate_template_4_24_09_27`.`projects`.`updated_on` AS `project_updated_on`,json_arrayagg(json_object('datasetId',`germinate_template_4_24_09_27`.`datasets`.`id`,'datasetName',`germinate_template_4_24_09_27`.`datasets`.`name`,'datasetType',`germinate_template_4_24_09_27`.`datasettypes`.`description`,'datasetIsExternal',`germinate_template_4_24_09_27`.`datasets`.`is_external`)) AS `datasets` from (((`germinate_template_4_24_09_27`.`projects` left join `germinate_template_4_24_09_27`.`experiments` on((`germinate_template_4_24_09_27`.`experiments`.`project_id` = `germinate_template_4_24_09_27`.`projects`.`id`))) left join `germinate_template_4_24_09_27`.`datasets` on((`germinate_template_4_24_09_27`.`datasets`.`experiment_id` = `germinate_template_4_24_09_27`.`experiments`.`id`))) left join `germinate_template_4_24_09_27`.`datasettypes` on((`germinate_template_4_24_09_27`.`datasettypes`.`id` = `germinate_template_4_24_09_27`.`datasets`.`datasettype_id`))) group by `germinate_template_4_24_09_27`.`projects`.`id`"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_projects</code> table
     * reference
     */
    public ViewTableProjects(String alias) {
        this(DSL.name(alias), VIEW_TABLE_PROJECTS);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_projects</code> table
     * reference
     */
    public ViewTableProjects(Name alias) {
        this(alias, VIEW_TABLE_PROJECTS);
    }

    /**
     * Create a <code>germinate_db.view_table_projects</code> table reference
     */
    public ViewTableProjects() {
        this(DSL.name("view_table_projects"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableProjects as(String alias) {
        return new ViewTableProjects(DSL.name(alias), this);
    }

    @Override
    public ViewTableProjects as(Name alias) {
        return new ViewTableProjects(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableProjects rename(String name) {
        return new ViewTableProjects(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableProjects rename(Name name) {
        return new ViewTableProjects(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, String, String, String, String, Integer, Timestamp, Timestamp, Timestamp, Timestamp, Dataset[]> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
    // @formatter:on
}
