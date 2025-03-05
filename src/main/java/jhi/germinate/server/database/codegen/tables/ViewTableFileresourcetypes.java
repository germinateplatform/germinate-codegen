/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewTableFileresourcetypesRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row6;
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
public class ViewTableFileresourcetypes extends TableImpl<ViewTableFileresourcetypesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>germinate_db.view_table_fileresourcetypes</code>
     */
    public static final ViewTableFileresourcetypes VIEW_TABLE_FILERESOURCETYPES = new ViewTableFileresourcetypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableFileresourcetypesRecord> getRecordType() {
        return ViewTableFileresourcetypesRecord.class;
    }

    /**
     * The column <code>germinate_db.view_table_fileresourcetypes.id</code>. The
     * primary id.
     */
    public final TableField<ViewTableFileresourcetypesRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "The primary id.");

    /**
     * The column <code>germinate_db.view_table_fileresourcetypes.name</code>.
     * The name of the file type.
     */
    public final TableField<ViewTableFileresourcetypesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255), this, "The name of the file type.");

    /**
     * The column
     * <code>germinate_db.view_table_fileresourcetypes.description</code>. The
     * description of the file type.
     */
    public final TableField<ViewTableFileresourcetypesRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "The description of the file type.");

    /**
     * The column
     * <code>germinate_db.view_table_fileresourcetypes.created_on</code>. When
     * this record was created.
     */
    public final TableField<ViewTableFileresourcetypesRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When this record was created.");

    /**
     * The column
     * <code>germinate_db.view_table_fileresourcetypes.updated_on</code>. When
     * this record was last updated.
     */
    public final TableField<ViewTableFileresourcetypesRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When this record was last updated.");

    /**
     * The column <code>germinate_db.view_table_fileresourcetypes.count</code>.
     */
    public final TableField<ViewTableFileresourcetypesRecord, Long> COUNT = createField(DSL.name("count"), SQLDataType.BIGINT, this, "");

    private ViewTableFileresourcetypes(Name alias, Table<ViewTableFileresourcetypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableFileresourcetypes(Name alias, Table<ViewTableFileresourcetypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_fileresourcetypes` as select `germinate_template_4_25_03_05`.`fileresourcetypes`.`id` AS `id`,`germinate_template_4_25_03_05`.`fileresourcetypes`.`name` AS `name`,`germinate_template_4_25_03_05`.`fileresourcetypes`.`description` AS `description`,`germinate_template_4_25_03_05`.`fileresourcetypes`.`created_on` AS `created_on`,`germinate_template_4_25_03_05`.`fileresourcetypes`.`updated_on` AS `updated_on`,(select count(1) from `germinate_template_4_25_03_05`.`fileresources` where (`germinate_template_4_25_03_05`.`fileresources`.`fileresourcetype_id` = `germinate_template_4_25_03_05`.`fileresourcetypes`.`id`)) AS `count` from `germinate_template_4_25_03_05`.`fileresourcetypes`"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_fileresourcetypes</code>
     * table reference
     */
    public ViewTableFileresourcetypes(String alias) {
        this(DSL.name(alias), VIEW_TABLE_FILERESOURCETYPES);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_fileresourcetypes</code>
     * table reference
     */
    public ViewTableFileresourcetypes(Name alias) {
        this(alias, VIEW_TABLE_FILERESOURCETYPES);
    }

    /**
     * Create a <code>germinate_db.view_table_fileresourcetypes</code> table
     * reference
     */
    public ViewTableFileresourcetypes() {
        this(DSL.name("view_table_fileresourcetypes"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableFileresourcetypes as(String alias) {
        return new ViewTableFileresourcetypes(DSL.name(alias), this);
    }

    @Override
    public ViewTableFileresourcetypes as(Name alias) {
        return new ViewTableFileresourcetypes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableFileresourcetypes rename(String name) {
        return new ViewTableFileresourcetypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableFileresourcetypes rename(Name name) {
        return new ViewTableFileresourcetypes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, Timestamp, Timestamp, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
    // @formatter:on
}
