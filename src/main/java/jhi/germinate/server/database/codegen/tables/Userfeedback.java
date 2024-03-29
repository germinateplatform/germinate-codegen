/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.enums.UserfeedbackFeedbackType;
import jhi.germinate.server.database.codegen.enums.UserfeedbackSeverity;
import jhi.germinate.server.database.codegen.tables.records.UserfeedbackRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Row11;
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
public class Userfeedback extends TableImpl<UserfeedbackRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.userfeedback</code>
     */
    public static final Userfeedback USERFEEDBACK = new Userfeedback();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserfeedbackRecord> getRecordType() {
        return UserfeedbackRecord.class;
    }

    /**
     * The column <code>germinate_db.userfeedback.id</code>. Auto-incremented
     * primary key.
     */
    public final TableField<UserfeedbackRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "Auto-incremented primary key.");

    /**
     * The column <code>germinate_db.userfeedback.content</code>. Feedback
     * content.
     */
    public final TableField<UserfeedbackRecord, String> CONTENT = createField(DSL.name("content"), SQLDataType.CLOB.nullable(false), this, "Feedback content.");

    /**
     * The column <code>germinate_db.userfeedback.image</code>. Optional
     * interface screenshot.
     */
    public final TableField<UserfeedbackRecord, byte[]> IMAGE = createField(DSL.name("image"), SQLDataType.BLOB, this, "Optional interface screenshot.");

    /**
     * The column <code>germinate_db.userfeedback.page_url</code>. The URL of
     * the page the user was looking at.
     */
    public final TableField<UserfeedbackRecord, String> PAGE_URL = createField(DSL.name("page_url"), SQLDataType.CLOB.nullable(false), this, "The URL of the page the user was looking at.");

    /**
     * The column <code>germinate_db.userfeedback.user_id</code>. Optional user
     * id if user was logged in.
     */
    public final TableField<UserfeedbackRecord, Integer> USER_ID = createField(DSL.name("user_id"), SQLDataType.INTEGER, this, "Optional user id if user was logged in.");

    /**
     * The column <code>germinate_db.userfeedback.contact_email</code>. Contact
     * email address.
     */
    public final TableField<UserfeedbackRecord, String> CONTACT_EMAIL = createField(DSL.name("contact_email"), SQLDataType.VARCHAR(255).nullable(false), this, "Contact email address.");

    /**
     * The column <code>germinate_db.userfeedback.feedback_type</code>. The type
     * of feedback.
     */
    public final TableField<UserfeedbackRecord, UserfeedbackFeedbackType> FEEDBACK_TYPE = createField(DSL.name("feedback_type"), SQLDataType.VARCHAR(15).nullable(false).defaultValue(DSL.inline("general", SQLDataType.VARCHAR)).asEnumDataType(jhi.germinate.server.database.codegen.enums.UserfeedbackFeedbackType.class), this, "The type of feedback.");

    /**
     * The column <code>germinate_db.userfeedback.severity</code>. The estimated
     * severity of the issue.
     */
    public final TableField<UserfeedbackRecord, UserfeedbackSeverity> SEVERITY = createField(DSL.name("severity"), SQLDataType.VARCHAR(6).nullable(false).defaultValue(DSL.inline("medium", SQLDataType.VARCHAR)).asEnumDataType(jhi.germinate.server.database.codegen.enums.UserfeedbackSeverity.class), this, "The estimated severity of the issue.");

    /**
     * The column <code>germinate_db.userfeedback.is_new</code>. Indicates
     * whether this is new feedback or has been seen before.
     */
    public final TableField<UserfeedbackRecord, Boolean> IS_NEW = createField(DSL.name("is_new"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.inline("1", SQLDataType.BOOLEAN)), this, "Indicates whether this is new feedback or has been seen before.");

    /**
     * The column <code>germinate_db.userfeedback.created_on</code>. When this
     * database record has been created.
     */
    public final TableField<UserfeedbackRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When this database record has been created.");

    /**
     * The column <code>germinate_db.userfeedback.updated_on</code>. When this
     * database record has last been updated.
     */
    public final TableField<UserfeedbackRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When this database record has last been updated.");

    private Userfeedback(Name alias, Table<UserfeedbackRecord> aliased) {
        this(alias, aliased, null);
    }

    private Userfeedback(Name alias, Table<UserfeedbackRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.userfeedback</code> table reference
     */
    public Userfeedback(String alias) {
        this(DSL.name(alias), USERFEEDBACK);
    }

    /**
     * Create an aliased <code>germinate_db.userfeedback</code> table reference
     */
    public Userfeedback(Name alias) {
        this(alias, USERFEEDBACK);
    }

    /**
     * Create a <code>germinate_db.userfeedback</code> table reference
     */
    public Userfeedback() {
        this(DSL.name("userfeedback"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<UserfeedbackRecord, Integer> getIdentity() {
        return (Identity<UserfeedbackRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<UserfeedbackRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Userfeedback.USERFEEDBACK, DSL.name("KEY_userfeedback_PRIMARY"), new TableField[] { Userfeedback.USERFEEDBACK.ID }, true);
    }

    @Override
    public Userfeedback as(String alias) {
        return new Userfeedback(DSL.name(alias), this);
    }

    @Override
    public Userfeedback as(Name alias) {
        return new Userfeedback(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Userfeedback rename(String name) {
        return new Userfeedback(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Userfeedback rename(Name name) {
        return new Userfeedback(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, String, byte[], String, Integer, String, UserfeedbackFeedbackType, UserfeedbackSeverity, Boolean, Timestamp, Timestamp> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
    // @formatter:on
}
