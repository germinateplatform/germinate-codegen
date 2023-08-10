/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.binding.StoryRequirementsBinding;
import jhi.germinate.server.database.binding.StoryTableStepsBinding;
import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.pojos.Storysteps;
import jhi.germinate.server.database.codegen.tables.records.ViewTableStoriesRecord;
import jhi.germinate.server.database.pojo.StoryRequirements;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row13;
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
public class ViewTableStories extends TableImpl<ViewTableStoriesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.view_table_stories</code>
     */
    public static final ViewTableStories VIEW_TABLE_STORIES = new ViewTableStories();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableStoriesRecord> getRecordType() {
        return ViewTableStoriesRecord.class;
    }

    /**
     * The column <code>germinate_db.view_table_stories.story_id</code>.
     */
    public final TableField<ViewTableStoriesRecord, Integer> STORY_ID = createField(DSL.name("story_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>germinate_db.view_table_stories.story_name</code>.
     */
    public final TableField<ViewTableStoriesRecord, String> STORY_NAME = createField(DSL.name("story_name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column
     * <code>germinate_db.view_table_stories.story_description</code>.
     */
    public final TableField<ViewTableStoriesRecord, String> STORY_DESCRIPTION = createField(DSL.name("story_description"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>germinate_db.view_table_stories.story_requirements</code>.
     */
    public final TableField<ViewTableStoriesRecord, StoryRequirements> STORY_REQUIREMENTS = createField(DSL.name("story_requirements"), SQLDataType.JSON, this, "", new StoryRequirementsBinding());

    /**
     * The column <code>germinate_db.view_table_stories.story_image_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableStoriesRecord, Integer> STORY_IMAGE_ID = createField(DSL.name("story_image_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_stories.story_image_name</code>.
     * The file system path to the image.
     */
    public final TableField<ViewTableStoriesRecord, String> STORY_IMAGE_NAME = createField(DSL.name("story_image_name"), SQLDataType.CLOB, this, "The file system path to the image.");

    /**
     * The column <code>germinate_db.view_table_stories.story_visibility</code>.
     */
    public final TableField<ViewTableStoriesRecord, Boolean> STORY_VISIBILITY = createField(DSL.name("story_visibility"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.inline("1", SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>germinate_db.view_table_stories.story_user_id</code>.
     */
    public final TableField<ViewTableStoriesRecord, Integer> STORY_USER_ID = createField(DSL.name("story_user_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_db.view_table_stories.publication_id</code>.
     */
    public final TableField<ViewTableStoriesRecord, Integer> PUBLICATION_ID = createField(DSL.name("publication_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>germinate_db.view_table_stories.publication_doi</code>.
     */
    public final TableField<ViewTableStoriesRecord, String> PUBLICATION_DOI = createField(DSL.name("publication_doi"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>germinate_db.view_table_stories.story_steps</code>.
     */
    public final TableField<ViewTableStoriesRecord, Storysteps[]> STORY_STEPS = createField(DSL.name("story_steps"), SQLDataType.JSON, this, "", new StoryTableStepsBinding());

    /**
     * The column <code>germinate_db.view_table_stories.story_created_on</code>.
     */
    public final TableField<ViewTableStoriesRecord, Timestamp> STORY_CREATED_ON = createField(DSL.name("story_created_on"), SQLDataType.TIMESTAMP(0).nullable(false).defaultValue(DSL.inline("0000-00-00 00:00:00", SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>germinate_db.view_table_stories.story_updated_on</code>.
     */
    public final TableField<ViewTableStoriesRecord, Timestamp> STORY_UPDATED_ON = createField(DSL.name("story_updated_on"), SQLDataType.TIMESTAMP(0).nullable(false).defaultValue(DSL.inline("0000-00-00 00:00:00", SQLDataType.TIMESTAMP)), this, "");

    private ViewTableStories(Name alias, Table<ViewTableStoriesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableStories(Name alias, Table<ViewTableStoriesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_stories` as select `germinate_template_4_23_08_03`.`stories`.`id` AS `story_id`,`germinate_template_4_23_08_03`.`stories`.`name` AS `story_name`,`germinate_template_4_23_08_03`.`stories`.`description` AS `story_description`,`germinate_template_4_23_08_03`.`stories`.`requirements` AS `story_requirements`,`germinate_template_4_23_08_03`.`images`.`id` AS `story_image_id`,`germinate_template_4_23_08_03`.`images`.`path` AS `story_image_name`,`germinate_template_4_23_08_03`.`stories`.`visibility` AS `story_visibility`,`germinate_template_4_23_08_03`.`stories`.`user_id` AS `story_user_id`,`germinate_template_4_23_08_03`.`publications`.`id` AS `publication_id`,`germinate_template_4_23_08_03`.`publications`.`doi` AS `publication_doi`,json_arrayagg(json_object('id',`germinate_template_4_23_08_03`.`storysteps`.`id`,'name',`germinate_template_4_23_08_03`.`storysteps`.`name`,'description',`germinate_template_4_23_08_03`.`storysteps`.`description`,'storyId',`germinate_template_4_23_08_03`.`storysteps`.`story_id`,'storyIndex',`germinate_template_4_23_08_03`.`storysteps`.`story_index`,'pageConfig',`germinate_template_4_23_08_03`.`storysteps`.`page_config`,'storyIndex',`germinate_template_4_23_08_03`.`storysteps`.`story_index`,'imageId',`germinate_template_4_23_08_03`.`storysteps`.`image_id`,'createdOn',date_format(`germinate_template_4_23_08_03`.`storysteps`.`created_on`,'%Y-%m-%d %H:%i:%s'),'updatedOn',date_format(`germinate_template_4_23_08_03`.`storysteps`.`updated_on`,'%Y-%m-%d %H:%i:%s'))) AS `story_steps`,`germinate_template_4_23_08_03`.`stories`.`created_on` AS `story_created_on`,`germinate_template_4_23_08_03`.`stories`.`updated_on` AS `story_updated_on` from (((`germinate_template_4_23_08_03`.`stories` left join `germinate_template_4_23_08_03`.`storysteps` on((`germinate_template_4_23_08_03`.`stories`.`id` = `germinate_template_4_23_08_03`.`storysteps`.`story_id`))) left join `germinate_template_4_23_08_03`.`images` on((`germinate_template_4_23_08_03`.`images`.`id` = `germinate_template_4_23_08_03`.`stories`.`image_id`))) left join `germinate_template_4_23_08_03`.`publications` on((`germinate_template_4_23_08_03`.`publications`.`id` = `germinate_template_4_23_08_03`.`stories`.`publication_id`))) group by `germinate_template_4_23_08_03`.`stories`.`id`"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_stories</code> table
     * reference
     */
    public ViewTableStories(String alias) {
        this(DSL.name(alias), VIEW_TABLE_STORIES);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_stories</code> table
     * reference
     */
    public ViewTableStories(Name alias) {
        this(alias, VIEW_TABLE_STORIES);
    }

    /**
     * Create a <code>germinate_db.view_table_stories</code> table reference
     */
    public ViewTableStories() {
        this(DSL.name("view_table_stories"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableStories as(String alias) {
        return new ViewTableStories(DSL.name(alias), this);
    }

    @Override
    public ViewTableStories as(Name alias) {
        return new ViewTableStories(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableStories rename(String name) {
        return new ViewTableStories(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableStories rename(Name name) {
        return new ViewTableStories(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Integer, String, String, StoryRequirements, Integer, String, Boolean, Integer, Integer, String, Storysteps[], Timestamp, Timestamp> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
    // @formatter:on
}
