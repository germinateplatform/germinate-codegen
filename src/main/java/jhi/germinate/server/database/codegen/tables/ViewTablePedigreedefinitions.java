/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewTablePedigreedefinitionsRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row14;
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
public class ViewTablePedigreedefinitions extends TableImpl<ViewTablePedigreedefinitionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>germinate_db.view_table_pedigreedefinitions</code>
     */
    public static final ViewTablePedigreedefinitions VIEW_TABLE_PEDIGREEDEFINITIONS = new ViewTablePedigreedefinitions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTablePedigreedefinitionsRecord> getRecordType() {
        return ViewTablePedigreedefinitionsRecord.class;
    }

    /**
     * The column
     * <code>germinate_db.view_table_pedigreedefinitions.germplasm_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTablePedigreedefinitionsRecord, Integer> GERMPLASM_ID = createField(DSL.name("germplasm_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_pedigreedefinitions.germplasm_name</code>.
     * A unique name which defines an entry in the germinatbase table.
     */
    public final TableField<ViewTablePedigreedefinitionsRecord, String> GERMPLASM_NAME = createField(DSL.name("germplasm_name"), SQLDataType.VARCHAR(255), this, "A unique name which defines an entry in the germinatbase table.");

    /**
     * The column
     * <code>germinate_db.view_table_pedigreedefinitions.germplasm_display_name</code>.
     * The name to be displayed on user interfaces and to be exported to
     * external tools like Flapjack and Helium.
     */
    public final TableField<ViewTablePedigreedefinitionsRecord, String> GERMPLASM_DISPLAY_NAME = createField(DSL.name("germplasm_display_name"), SQLDataType.VARCHAR(255), this, "The name to be displayed on user interfaces and to be exported to external tools like Flapjack and Helium.");

    /**
     * The column
     * <code>germinate_db.view_table_pedigreedefinitions.pedigree_notation_name</code>.
     * Name of the reference notation source.
     */
    public final TableField<ViewTablePedigreedefinitionsRecord, String> PEDIGREE_NOTATION_NAME = createField(DSL.name("pedigree_notation_name"), SQLDataType.VARCHAR(255), this, "Name of the reference notation source.");

    /**
     * The column
     * <code>germinate_db.view_table_pedigreedefinitions.pedigree_notation_description</code>.
     * A longer description about the reference notation source.
     */
    public final TableField<ViewTablePedigreedefinitionsRecord, String> PEDIGREE_NOTATION_DESCRIPTION = createField(DSL.name("pedigree_notation_description"), SQLDataType.CLOB, this, "A longer description about the reference notation source.");

    /**
     * The column
     * <code>germinate_db.view_table_pedigreedefinitions.pedigree_notation_url</code>.
     * Hyperlink to the notation source.
     */
    public final TableField<ViewTablePedigreedefinitionsRecord, String> PEDIGREE_NOTATION_URL = createField(DSL.name("pedigree_notation_url"), SQLDataType.VARCHAR(255), this, "Hyperlink to the notation source.");

    /**
     * The column
     * <code>germinate_db.view_table_pedigreedefinitions.dataset_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTablePedigreedefinitionsRecord, Integer> DATASET_ID = createField(DSL.name("dataset_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_pedigreedefinitions.dataset_name</code>.
     * Describes the dataset.
     */
    public final TableField<ViewTablePedigreedefinitionsRecord, String> DATASET_NAME = createField(DSL.name("dataset_name"), SQLDataType.CLOB, this, "Describes the dataset.");

    /**
     * The column
     * <code>germinate_db.view_table_pedigreedefinitions.definition_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTablePedigreedefinitionsRecord, Integer> DEFINITION_ID = createField(DSL.name("definition_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_pedigreedefinitions.definition</code>. The
     * pedigree string which is used to represent the germinatebase entry.
     */
    public final TableField<ViewTablePedigreedefinitionsRecord, String> DEFINITION = createField(DSL.name("definition"), SQLDataType.CLOB.nullable(false), this, "The pedigree string which is used to represent the germinatebase entry.");

    /**
     * The column
     * <code>germinate_db.view_table_pedigreedefinitions.pedigree_description_name</code>.
     * The name of the pedigree.
     */
    public final TableField<ViewTablePedigreedefinitionsRecord, String> PEDIGREE_DESCRIPTION_NAME = createField(DSL.name("pedigree_description_name"), SQLDataType.VARCHAR(255), this, "The name of the pedigree.");

    /**
     * The column
     * <code>germinate_db.view_table_pedigreedefinitions.pedigree_description_description</code>.
     * Describes the pedigree in more detail.
     */
    public final TableField<ViewTablePedigreedefinitionsRecord, String> PEDIGREE_DESCRIPTION_DESCRIPTION = createField(DSL.name("pedigree_description_description"), SQLDataType.CLOB, this, "Describes the pedigree in more detail.");

    /**
     * The column
     * <code>germinate_db.view_table_pedigreedefinitions.pedigree_description_author</code>.
     * Who is responsible for the creation of the pedigree. Attribution should
     * be included in here for pedigree sources.
     */
    public final TableField<ViewTablePedigreedefinitionsRecord, String> PEDIGREE_DESCRIPTION_AUTHOR = createField(DSL.name("pedigree_description_author"), SQLDataType.VARCHAR(255), this, "Who is responsible for the creation of the pedigree. Attribution should be included in here for pedigree sources.");

    /**
     * The column
     * <code>germinate_db.view_table_pedigreedefinitions.created_on</code>. When
     * the record was created.
     */
    public final TableField<ViewTablePedigreedefinitionsRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    private ViewTablePedigreedefinitions(Name alias, Table<ViewTablePedigreedefinitionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTablePedigreedefinitions(Name alias, Table<ViewTablePedigreedefinitionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_pedigreedefinitions` as select `germinate_template_4_25_03_05`.`germinatebase`.`id` AS `germplasm_id`,`germinate_template_4_25_03_05`.`germinatebase`.`name` AS `germplasm_name`,`germinate_template_4_25_03_05`.`germinatebase`.`display_name` AS `germplasm_display_name`,`germinate_template_4_25_03_05`.`pedigreenotations`.`name` AS `pedigree_notation_name`,`germinate_template_4_25_03_05`.`pedigreenotations`.`description` AS `pedigree_notation_description`,`germinate_template_4_25_03_05`.`pedigreenotations`.`reference_url` AS `pedigree_notation_url`,`germinate_template_4_25_03_05`.`datasets`.`id` AS `dataset_id`,`germinate_template_4_25_03_05`.`datasets`.`name` AS `dataset_name`,`germinate_template_4_25_03_05`.`pedigreedefinitions`.`id` AS `definition_id`,`germinate_template_4_25_03_05`.`pedigreedefinitions`.`definition` AS `definition`,`germinate_template_4_25_03_05`.`pedigreedescriptions`.`name` AS `pedigree_description_name`,`germinate_template_4_25_03_05`.`pedigreedescriptions`.`description` AS `pedigree_description_description`,`germinate_template_4_25_03_05`.`pedigreedescriptions`.`author` AS `pedigree_description_author`,`germinate_template_4_25_03_05`.`pedigreedefinitions`.`created_on` AS `created_on` from ((((`germinate_template_4_25_03_05`.`pedigreedefinitions` left join `germinate_template_4_25_03_05`.`germinatebase` on((`germinate_template_4_25_03_05`.`germinatebase`.`id` = `germinate_template_4_25_03_05`.`pedigreedefinitions`.`germinatebase_id`))) left join `germinate_template_4_25_03_05`.`pedigreenotations` on((`germinate_template_4_25_03_05`.`pedigreenotations`.`id` = `germinate_template_4_25_03_05`.`pedigreedefinitions`.`pedigreenotation_id`))) left join `germinate_template_4_25_03_05`.`pedigreedescriptions` on((`germinate_template_4_25_03_05`.`pedigreedescriptions`.`id` = `germinate_template_4_25_03_05`.`pedigreedefinitions`.`pedigreedescription_id`))) left join `germinate_template_4_25_03_05`.`datasets` on((`germinate_template_4_25_03_05`.`datasets`.`id` = `germinate_template_4_25_03_05`.`pedigreedefinitions`.`dataset_id`)))"));
    }

    /**
     * Create an aliased
     * <code>germinate_db.view_table_pedigreedefinitions</code> table reference
     */
    public ViewTablePedigreedefinitions(String alias) {
        this(DSL.name(alias), VIEW_TABLE_PEDIGREEDEFINITIONS);
    }

    /**
     * Create an aliased
     * <code>germinate_db.view_table_pedigreedefinitions</code> table reference
     */
    public ViewTablePedigreedefinitions(Name alias) {
        this(alias, VIEW_TABLE_PEDIGREEDEFINITIONS);
    }

    /**
     * Create a <code>germinate_db.view_table_pedigreedefinitions</code> table
     * reference
     */
    public ViewTablePedigreedefinitions() {
        this(DSL.name("view_table_pedigreedefinitions"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTablePedigreedefinitions as(String alias) {
        return new ViewTablePedigreedefinitions(DSL.name(alias), this);
    }

    @Override
    public ViewTablePedigreedefinitions as(Name alias) {
        return new ViewTablePedigreedefinitions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTablePedigreedefinitions rename(String name) {
        return new ViewTablePedigreedefinitions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTablePedigreedefinitions rename(Name name) {
        return new ViewTablePedigreedefinitions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<Integer, String, String, String, String, String, Integer, String, Integer, String, String, String, String, Timestamp> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
    // @formatter:on
}
