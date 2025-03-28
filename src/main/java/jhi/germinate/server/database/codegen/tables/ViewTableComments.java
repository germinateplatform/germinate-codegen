/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewTableCommentsRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row8;
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
public class ViewTableComments extends TableImpl<ViewTableCommentsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.view_table_comments</code>
     */
    public static final ViewTableComments VIEW_TABLE_COMMENTS = new ViewTableComments();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableCommentsRecord> getRecordType() {
        return ViewTableCommentsRecord.class;
    }

    /**
     * The column <code>germinate_db.view_table_comments.comment_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableCommentsRecord, Integer> COMMENT_ID = createField(DSL.name("comment_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_comments.comment_type_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableCommentsRecord, Integer> COMMENT_TYPE_ID = createField(DSL.name("comment_type_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_comments.comment_type</code>.
     * This could include 'germinatebase' or 'markers' to define the table that
     * the comment relates to.
     */
    public final TableField<ViewTableCommentsRecord, String> COMMENT_TYPE = createField(DSL.name("comment_type"), SQLDataType.VARCHAR(50).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "This could include 'germinatebase' or 'markers' to define the table that the comment relates to.");

    /**
     * The column
     * <code>germinate_db.view_table_comments.comment_foreign_id</code>. Relates
     * to the UID of the table to which the comment relates
     */
    public final TableField<ViewTableCommentsRecord, Integer> COMMENT_FOREIGN_ID = createField(DSL.name("comment_foreign_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Relates to the UID of the table to which the comment relates");

    /**
     * The column <code>germinate_db.view_table_comments.user_id</code>. Foreign
     * key to Gatekeeper users (Gatekeeper users.id).
     */
    public final TableField<ViewTableCommentsRecord, Integer> USER_ID = createField(DSL.name("user_id"), SQLDataType.INTEGER, this, "Foreign key to Gatekeeper users (Gatekeeper users.id).");

    /**
     * The column <code>germinate_db.view_table_comments.user_name</code>.
     */
    public final TableField<ViewTableCommentsRecord, String> USER_NAME = createField(DSL.name("user_name"), SQLDataType.VARCHAR.nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>germinate_db.view_table_comments.comment_content</code>.
     * The comment content.
     */
    public final TableField<ViewTableCommentsRecord, String> COMMENT_CONTENT = createField(DSL.name("comment_content"), SQLDataType.CLOB.nullable(false), this, "The comment content.");

    /**
     * The column <code>germinate_db.view_table_comments.updated_on</code>. When
     * the record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public final TableField<ViewTableCommentsRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private ViewTableComments(Name alias, Table<ViewTableCommentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableComments(Name alias, Table<ViewTableCommentsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_comments` as select `germinate_template_4_25_03_05`.`comments`.`id` AS `comment_id`,`germinate_template_4_25_03_05`.`commenttypes`.`id` AS `comment_type_id`,`germinate_template_4_25_03_05`.`commenttypes`.`reference_table` AS `comment_type`,`germinate_template_4_25_03_05`.`comments`.`reference_id` AS `comment_foreign_id`,`germinate_template_4_25_03_05`.`comments`.`user_id` AS `user_id`,'' AS `user_name`,`germinate_template_4_25_03_05`.`comments`.`description` AS `comment_content`,`germinate_template_4_25_03_05`.`comments`.`updated_on` AS `updated_on` from (`germinate_template_4_25_03_05`.`comments` left join `germinate_template_4_25_03_05`.`commenttypes` on((`germinate_template_4_25_03_05`.`commenttypes`.`id` = `germinate_template_4_25_03_05`.`comments`.`commenttype_id`)))"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_comments</code> table
     * reference
     */
    public ViewTableComments(String alias) {
        this(DSL.name(alias), VIEW_TABLE_COMMENTS);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_comments</code> table
     * reference
     */
    public ViewTableComments(Name alias) {
        this(alias, VIEW_TABLE_COMMENTS);
    }

    /**
     * Create a <code>germinate_db.view_table_comments</code> table reference
     */
    public ViewTableComments() {
        this(DSL.name("view_table_comments"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableComments as(String alias) {
        return new ViewTableComments(DSL.name(alias), this);
    }

    @Override
    public ViewTableComments as(Name alias) {
        return new ViewTableComments(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableComments rename(String name) {
        return new ViewTableComments(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableComments rename(Name name) {
        return new ViewTableComments(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, Integer, String, Integer, Integer, String, String, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
    // @formatter:on
}
