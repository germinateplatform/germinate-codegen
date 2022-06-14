/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ImageToTagsRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row4;
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
public class ImageToTags extends TableImpl<ImageToTagsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.image_to_tags</code>
     */
    public static final ImageToTags IMAGE_TO_TAGS = new ImageToTags();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ImageToTagsRecord> getRecordType() {
        return ImageToTagsRecord.class;
    }

    /**
     * The column <code>germinate_db.image_to_tags.image_id</code>.
     */
    public final TableField<ImageToTagsRecord, Integer> IMAGE_ID = createField(DSL.name("image_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_db.image_to_tags.imagetag_id</code>.
     */
    public final TableField<ImageToTagsRecord, Integer> IMAGETAG_ID = createField(DSL.name("imagetag_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_db.image_to_tags.created_on</code>.
     */
    public final TableField<ImageToTagsRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>germinate_db.image_to_tags.updated_on</code>.
     */
    public final TableField<ImageToTagsRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "");

    private ImageToTags(Name alias, Table<ImageToTagsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ImageToTags(Name alias, Table<ImageToTagsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.image_to_tags</code> table reference
     */
    public ImageToTags(String alias) {
        this(DSL.name(alias), IMAGE_TO_TAGS);
    }

    /**
     * Create an aliased <code>germinate_db.image_to_tags</code> table reference
     */
    public ImageToTags(Name alias) {
        this(alias, IMAGE_TO_TAGS);
    }

    /**
     * Create a <code>germinate_db.image_to_tags</code> table reference
     */
    public ImageToTags() {
        this(DSL.name("image_to_tags"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public UniqueKey<ImageToTagsRecord> getPrimaryKey() {
        return Internal.createUniqueKey(ImageToTags.IMAGE_TO_TAGS, DSL.name("KEY_image_to_tags_PRIMARY"), new TableField[] { ImageToTags.IMAGE_TO_TAGS.IMAGE_ID, ImageToTags.IMAGE_TO_TAGS.IMAGETAG_ID }, true);
    }

    @Override
    public ImageToTags as(String alias) {
        return new ImageToTags(DSL.name(alias), this);
    }

    @Override
    public ImageToTags as(Name alias) {
        return new ImageToTags(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ImageToTags rename(String name) {
        return new ImageToTags(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ImageToTags rename(Name name) {
        return new ImageToTags(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
    // @formatter:on
}
