/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.binding.StoryRequirementsBinding;
import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.StoriesRecord;
import jhi.germinate.server.database.pojo.StoryRequirements;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Row10;
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
public class Stories extends TableImpl<StoriesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.stories</code>
     */
    public static final Stories STORIES = new Stories();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StoriesRecord> getRecordType() {
        return StoriesRecord.class;
    }

    /**
     * The column <code>germinate_db.stories.id</code>.
     */
    public final TableField<StoriesRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>germinate_db.stories.name</code>.
     */
    public final TableField<StoriesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>germinate_db.stories.description</code>.
     */
    public final TableField<StoriesRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>germinate_db.stories.image_id</code>.
     */
    public final TableField<StoriesRecord, Integer> IMAGE_ID = createField(DSL.name("image_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>germinate_db.stories.requirements</code>.
     */
    public final TableField<StoriesRecord, StoryRequirements> REQUIREMENTS = createField(DSL.name("requirements"), SQLDataType.JSON, this, "", new StoryRequirementsBinding());

    /**
     * The column <code>germinate_db.stories.publication_id</code>.
     */
    public final TableField<StoriesRecord, Integer> PUBLICATION_ID = createField(DSL.name("publication_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>germinate_db.stories.visibility</code>.
     */
    public final TableField<StoriesRecord, Boolean> VISIBILITY = createField(DSL.name("visibility"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.inline("1", SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>germinate_db.stories.user_id</code>.
     */
    public final TableField<StoriesRecord, Integer> USER_ID = createField(DSL.name("user_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_db.stories.created_on</code>.
     */
    public final TableField<StoriesRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>germinate_db.stories.updated_on</code>.
     */
    public final TableField<StoriesRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "");

    private Stories(Name alias, Table<StoriesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Stories(Name alias, Table<StoriesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.stories</code> table reference
     */
    public Stories(String alias) {
        this(DSL.name(alias), STORIES);
    }

    /**
     * Create an aliased <code>germinate_db.stories</code> table reference
     */
    public Stories(Name alias) {
        this(alias, STORIES);
    }

    /**
     * Create a <code>germinate_db.stories</code> table reference
     */
    public Stories() {
        this(DSL.name("stories"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<StoriesRecord, Integer> getIdentity() {
        return (Identity<StoriesRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<StoriesRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Stories.STORIES, DSL.name("KEY_stories_PRIMARY"), new TableField[] { Stories.STORIES.ID }, true);
    }

    @Override
    public Stories as(String alias) {
        return new Stories(DSL.name(alias), this);
    }

    @Override
    public Stories as(Name alias) {
        return new Stories(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Stories rename(String name) {
        return new Stories(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Stories rename(Name name) {
        return new Stories(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, String, Integer, StoryRequirements, Integer, Boolean, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
    // @formatter:on
}
