/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.CommentsRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Row8;
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
 * Comments can be added to different entries in Germinate such as entries from
 * germinatebase or markers from the markers table.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Comments extends TableImpl<CommentsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.comments</code>
     */
    public static final Comments COMMENTS = new Comments();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CommentsRecord> getRecordType() {
        return CommentsRecord.class;
    }

    /**
     * The column <code>germinate_db.comments.id</code>. Primary id for this
     * table. This uniquely identifies the row.
     */
    public final TableField<CommentsRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.comments.commenttype_id</code>. Foreign key
     * to commentypes (commenttypes.id).
     */
    public final TableField<CommentsRecord, Integer> COMMENTTYPE_ID = createField(DSL.name("commenttype_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Foreign key to commentypes (commenttypes.id).");

    /**
     * The column <code>germinate_db.comments.user_id</code>. Foreign key to
     * Gatekeeper users (Gatekeeper users.id).
     */
    public final TableField<CommentsRecord, Integer> USER_ID = createField(DSL.name("user_id"), SQLDataType.INTEGER, this, "Foreign key to Gatekeeper users (Gatekeeper users.id).");

    /**
     * The column <code>germinate_db.comments.visibility</code>. Defines if the
     * comment is available or masked (hidden) from the interface.
     */
    public final TableField<CommentsRecord, Boolean> VISIBILITY = createField(DSL.name("visibility"), SQLDataType.BOOLEAN, this, "Defines if the comment is available or masked (hidden) from the interface.");

    /**
     * The column <code>germinate_db.comments.description</code>. The comment
     * content.
     */
    public final TableField<CommentsRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB.nullable(false), this, "The comment content.");

    /**
     * The column <code>germinate_db.comments.reference_id</code>. Relates to
     * the UID of the table to which the comment relates
     */
    public final TableField<CommentsRecord, Integer> REFERENCE_ID = createField(DSL.name("reference_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Relates to the UID of the table to which the comment relates");

    /**
     * The column <code>germinate_db.comments.created_on</code>. When the record
     * was created.
     */
    public final TableField<CommentsRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.comments.updated_on</code>. When the record
     * was updated. This may be different from the created on date if subsequent
     * changes have been made to the underlying record.
     */
    public final TableField<CommentsRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private Comments(Name alias, Table<CommentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Comments(Name alias, Table<CommentsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Comments can be added to different entries in Germinate such as entries from germinatebase or markers from the markers table."), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.comments</code> table reference
     */
    public Comments(String alias) {
        this(DSL.name(alias), COMMENTS);
    }

    /**
     * Create an aliased <code>germinate_db.comments</code> table reference
     */
    public Comments(Name alias) {
        this(alias, COMMENTS);
    }

    /**
     * Create a <code>germinate_db.comments</code> table reference
     */
    public Comments() {
        this(DSL.name("comments"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<CommentsRecord, Integer> getIdentity() {
        return (Identity<CommentsRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<CommentsRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Comments.COMMENTS, DSL.name("KEY_comments_PRIMARY"), new TableField[] { Comments.COMMENTS.ID }, true);
    }

    @Override
    public Comments as(String alias) {
        return new Comments(DSL.name(alias), this);
    }

    @Override
    public Comments as(Name alias) {
        return new Comments(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Comments rename(String name) {
        return new Comments(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Comments rename(Name name) {
        return new Comments(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, Integer, Integer, Boolean, String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
    // @formatter:on
}
