/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.enums.ViewTableDatasetAttributesAttributeType;
import jhi.germinate.server.database.codegen.tables.records.ViewTableDatasetAttributesRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row10;
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
public class ViewTableDatasetAttributes extends TableImpl<ViewTableDatasetAttributesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>germinate_db.view_table_dataset_attributes</code>
     */
    public static final ViewTableDatasetAttributes VIEW_TABLE_DATASET_ATTRIBUTES = new ViewTableDatasetAttributes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableDatasetAttributesRecord> getRecordType() {
        return ViewTableDatasetAttributesRecord.class;
    }

    /**
     * The column
     * <code>germinate_db.view_table_dataset_attributes.dataset_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableDatasetAttributesRecord, Integer> DATASET_ID = createField(DSL.name("dataset_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_dataset_attributes.dataset_name</code>.
     * Describes the dataset.
     */
    public final TableField<ViewTableDatasetAttributesRecord, String> DATASET_NAME = createField(DSL.name("dataset_name"), SQLDataType.CLOB, this, "Describes the dataset.");

    /**
     * The column
     * <code>germinate_db.view_table_dataset_attributes.dataset_description</code>.
     * The name of this dataset.
     */
    public final TableField<ViewTableDatasetAttributesRecord, String> DATASET_DESCRIPTION = createField(DSL.name("dataset_description"), SQLDataType.CLOB, this, "The name of this dataset.");

    /**
     * The column
     * <code>germinate_db.view_table_dataset_attributes.attribute_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableDatasetAttributesRecord, Integer> ATTRIBUTE_ID = createField(DSL.name("attribute_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_dataset_attributes.attribute_name</code>.
     * Defines the name of the attribute.
     */
    public final TableField<ViewTableDatasetAttributesRecord, String> ATTRIBUTE_NAME = createField(DSL.name("attribute_name"), SQLDataType.VARCHAR(255), this, "Defines the name of the attribute.");

    /**
     * The column
     * <code>germinate_db.view_table_dataset_attributes.attribute_description</code>.
     * Describes the attribute. This should expand on the name to make it clear
     * what the attribute actually is.
     */
    public final TableField<ViewTableDatasetAttributesRecord, String> ATTRIBUTE_DESCRIPTION = createField(DSL.name("attribute_description"), SQLDataType.VARCHAR(255), this, "Describes the attribute. This should expand on the name to make it clear what the attribute actually is.");

    /**
     * The column
     * <code>germinate_db.view_table_dataset_attributes.attribute_type</code>.
     * Defines the data type of the attribute. This can be of numeric, text,
     * date or categorical types.
     */
    public final TableField<ViewTableDatasetAttributesRecord, ViewTableDatasetAttributesAttributeType> ATTRIBUTE_TYPE = createField(DSL.name("attribute_type"), SQLDataType.VARCHAR(11).defaultValue(DSL.inline("text", SQLDataType.VARCHAR)).asEnumDataType(jhi.germinate.server.database.codegen.enums.ViewTableDatasetAttributesAttributeType.class), this, "Defines the data type of the attribute. This can be of numeric, text, date or categorical types.");

    /**
     * The column
     * <code>germinate_db.view_table_dataset_attributes.target_table</code>.
     */
    public final TableField<ViewTableDatasetAttributesRecord, String> TARGET_TABLE = createField(DSL.name("target_table"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("germinatebase", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>germinate_db.view_table_dataset_attributes.foreign_id</code>.
     * Foreign key to germinatebase (germinatebase.id).
     */
    public final TableField<ViewTableDatasetAttributesRecord, Integer> FOREIGN_ID = createField(DSL.name("foreign_id"), SQLDataType.INTEGER.nullable(false), this, "Foreign key to germinatebase (germinatebase.id).");

    /**
     * The column
     * <code>germinate_db.view_table_dataset_attributes.attribute_value</code>.
     * The value of the attribute.
     */
    public final TableField<ViewTableDatasetAttributesRecord, String> ATTRIBUTE_VALUE = createField(DSL.name("attribute_value"), SQLDataType.CLOB.nullable(false), this, "The value of the attribute.");

    private ViewTableDatasetAttributes(Name alias, Table<ViewTableDatasetAttributesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableDatasetAttributes(Name alias, Table<ViewTableDatasetAttributesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_dataset_attributes` as select `germinate_template_4_23_02_08`.`datasets`.`id` AS `dataset_id`,`germinate_template_4_23_02_08`.`datasets`.`name` AS `dataset_name`,`germinate_template_4_23_02_08`.`datasets`.`description` AS `dataset_description`,`germinate_template_4_23_02_08`.`attributes`.`id` AS `attribute_id`,`germinate_template_4_23_02_08`.`attributes`.`name` AS `attribute_name`,`germinate_template_4_23_02_08`.`attributes`.`description` AS `attribute_description`,`germinate_template_4_23_02_08`.`attributes`.`datatype` AS `attribute_type`,`germinate_template_4_23_02_08`.`attributes`.`target_table` AS `target_table`,`germinate_template_4_23_02_08`.`attributedata`.`foreign_id` AS `foreign_id`,`germinate_template_4_23_02_08`.`attributedata`.`value` AS `attribute_value` from ((`germinate_template_4_23_02_08`.`attributedata` left join `germinate_template_4_23_02_08`.`datasets` on((`germinate_template_4_23_02_08`.`attributedata`.`foreign_id` = `germinate_template_4_23_02_08`.`datasets`.`id`))) left join `germinate_template_4_23_02_08`.`attributes` on((`germinate_template_4_23_02_08`.`attributes`.`id` = `germinate_template_4_23_02_08`.`attributedata`.`attribute_id`))) where (`germinate_template_4_23_02_08`.`attributes`.`target_table` = 'datasets')"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_dataset_attributes</code>
     * table reference
     */
    public ViewTableDatasetAttributes(String alias) {
        this(DSL.name(alias), VIEW_TABLE_DATASET_ATTRIBUTES);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_dataset_attributes</code>
     * table reference
     */
    public ViewTableDatasetAttributes(Name alias) {
        this(alias, VIEW_TABLE_DATASET_ATTRIBUTES);
    }

    /**
     * Create a <code>germinate_db.view_table_dataset_attributes</code> table
     * reference
     */
    public ViewTableDatasetAttributes() {
        this(DSL.name("view_table_dataset_attributes"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableDatasetAttributes as(String alias) {
        return new ViewTableDatasetAttributes(DSL.name(alias), this);
    }

    @Override
    public ViewTableDatasetAttributes as(Name alias) {
        return new ViewTableDatasetAttributes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableDatasetAttributes rename(String name) {
        return new ViewTableDatasetAttributes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableDatasetAttributes rename(Name name) {
        return new ViewTableDatasetAttributes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, String, Integer, String, String, ViewTableDatasetAttributesAttributeType, String, Integer, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
    // @formatter:on
}
