/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.enums.ViewTableNewsNewsImageFit;
import jhi.germinate.server.database.codegen.tables.records.ViewTableNewsRecord;

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
public class ViewTableNews extends TableImpl<ViewTableNewsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.view_table_news</code>
     */
    public static final ViewTableNews VIEW_TABLE_NEWS = new ViewTableNews();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableNewsRecord> getRecordType() {
        return ViewTableNewsRecord.class;
    }

    /**
     * The column <code>germinate_db.view_table_news.news_id</code>. Primary id
     * for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableNewsRecord, Integer> NEWS_ID = createField(DSL.name("news_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_news.news_title</code>. A title
     * which is used to name this news item. This appears in the Germinate user
     * interface if used.
     */
    public final TableField<ViewTableNewsRecord, String> NEWS_TITLE = createField(DSL.name("news_title"), SQLDataType.VARCHAR(255), this, "A title which is used to name this news item. This appears in the Germinate user interface if used.");

    /**
     * The column <code>germinate_db.view_table_news.news_content</code>. The
     * textual content of this news item.
     */
    public final TableField<ViewTableNewsRecord, String> NEWS_CONTENT = createField(DSL.name("news_content"), SQLDataType.CLOB, this, "The textual content of this news item.");

    /**
     * The column <code>germinate_db.view_table_news.news_hyperlink</code>. HTML
     * hyperlink to use for this news item. This can be a link to another source
     * which contains more information or a link to the original source.
     */
    public final TableField<ViewTableNewsRecord, String> NEWS_HYPERLINK = createField(DSL.name("news_hyperlink"), SQLDataType.VARCHAR(255), this, "HTML hyperlink to use for this news item. This can be a link to another source which contains more information or a link to the original source.");

    /**
     * The column <code>germinate_db.view_table_news.news_image</code>. Image to
     * use with this news item.
     */
    public final TableField<ViewTableNewsRecord, String> NEWS_IMAGE = createField(DSL.name("news_image"), SQLDataType.VARCHAR(255), this, "Image to use with this news item.");

    /**
     * The column <code>germinate_db.view_table_news.news_image_fit</code>.
     * Determines the css property of the news item image.
     */
    public final TableField<ViewTableNewsRecord, ViewTableNewsNewsImageFit> NEWS_IMAGE_FIT = createField(DSL.name("news_image_fit"), SQLDataType.VARCHAR(7).nullable(false).defaultValue(DSL.inline("cover", SQLDataType.VARCHAR)).asEnumDataType(jhi.germinate.server.database.codegen.enums.ViewTableNewsNewsImageFit.class), this, "Determines the css property of the news item image.");

    /**
     * The column <code>germinate_db.view_table_news.newstype_id</code>. Primary
     * id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableNewsRecord, Integer> NEWSTYPE_ID = createField(DSL.name("newstype_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_news.newstype_name</code>. Name
     * of the news type.
     */
    public final TableField<ViewTableNewsRecord, String> NEWSTYPE_NAME = createField(DSL.name("newstype_name"), SQLDataType.VARCHAR(255), this, "Name of the news type.");

    /**
     * The column
     * <code>germinate_db.view_table_news.newstype_description</code>. A longer
     * description of the news type.
     */
    public final TableField<ViewTableNewsRecord, String> NEWSTYPE_DESCRIPTION = createField(DSL.name("newstype_description"), SQLDataType.VARCHAR(255), this, "A longer description of the news type.");

    /**
     * The column <code>germinate_db.view_table_news.created_on</code>. When the
     * record was created.
     */
    public final TableField<ViewTableNewsRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0), this, "When the record was created.");

    /**
     * The column <code>germinate_db.view_table_news.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public final TableField<ViewTableNewsRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private ViewTableNews(Name alias, Table<ViewTableNewsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableNews(Name alias, Table<ViewTableNewsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_news` as select `germinate_template_4_24_09_27`.`news`.`id` AS `news_id`,`germinate_template_4_24_09_27`.`news`.`title` AS `news_title`,`germinate_template_4_24_09_27`.`news`.`content` AS `news_content`,`germinate_template_4_24_09_27`.`news`.`hyperlink` AS `news_hyperlink`,`germinate_template_4_24_09_27`.`news`.`image` AS `news_image`,`germinate_template_4_24_09_27`.`news`.`image_fit` AS `news_image_fit`,`germinate_template_4_24_09_27`.`newstypes`.`id` AS `newstype_id`,`germinate_template_4_24_09_27`.`newstypes`.`name` AS `newstype_name`,`germinate_template_4_24_09_27`.`newstypes`.`description` AS `newstype_description`,`germinate_template_4_24_09_27`.`news`.`created_on` AS `created_on`,`germinate_template_4_24_09_27`.`news`.`updated_on` AS `updated_on` from (`germinate_template_4_24_09_27`.`news` left join `germinate_template_4_24_09_27`.`newstypes` on((`germinate_template_4_24_09_27`.`newstypes`.`id` = `germinate_template_4_24_09_27`.`news`.`newstype_id`))) order by `germinate_template_4_24_09_27`.`news`.`created_on` desc"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_news</code> table
     * reference
     */
    public ViewTableNews(String alias) {
        this(DSL.name(alias), VIEW_TABLE_NEWS);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_news</code> table
     * reference
     */
    public ViewTableNews(Name alias) {
        this(alias, VIEW_TABLE_NEWS);
    }

    /**
     * Create a <code>germinate_db.view_table_news</code> table reference
     */
    public ViewTableNews() {
        this(DSL.name("view_table_news"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableNews as(String alias) {
        return new ViewTableNews(DSL.name(alias), this);
    }

    @Override
    public ViewTableNews as(Name alias) {
        return new ViewTableNews(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableNews rename(String name) {
        return new ViewTableNews(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableNews rename(Name name) {
        return new ViewTableNews(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, String, String, String, String, ViewTableNewsNewsImageFit, Integer, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
    // @formatter:on
}
