/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.enums.ViewTableGermplasmAttributesAttributeType;
import jhi.germinate.server.database.codegen.tables.records.ViewTableGermplasmAttributesRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row12;
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
public class ViewTableGermplasmAttributes extends TableImpl<ViewTableGermplasmAttributesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>germinate_db.view_table_germplasm_attributes</code>
     */
    public static final ViewTableGermplasmAttributes VIEW_TABLE_GERMPLASM_ATTRIBUTES = new ViewTableGermplasmAttributes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableGermplasmAttributesRecord> getRecordType() {
        return ViewTableGermplasmAttributesRecord.class;
    }

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_attributes.attribute_value_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableGermplasmAttributesRecord, Integer> ATTRIBUTE_VALUE_ID = createField(DSL.name("attribute_value_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_attributes.germplasm_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableGermplasmAttributesRecord, Integer> GERMPLASM_ID = createField(DSL.name("germplasm_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_attributes.germplasm_gid</code>.
     * A unique identifier.
     */
    public final TableField<ViewTableGermplasmAttributesRecord, String> GERMPLASM_GID = createField(DSL.name("germplasm_gid"), SQLDataType.VARCHAR(255), this, "A unique identifier.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_attributes.germplasm_name</code>.
     * A unique name which defines an entry in the germinatbase table.
     */
    public final TableField<ViewTableGermplasmAttributesRecord, String> GERMPLASM_NAME = createField(DSL.name("germplasm_name"), SQLDataType.VARCHAR(255), this, "A unique name which defines an entry in the germinatbase table.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_attributes.attribute_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableGermplasmAttributesRecord, Integer> ATTRIBUTE_ID = createField(DSL.name("attribute_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_attributes.attribute_name</code>.
     * Defines the name of the attribute.
     */
    public final TableField<ViewTableGermplasmAttributesRecord, String> ATTRIBUTE_NAME = createField(DSL.name("attribute_name"), SQLDataType.VARCHAR(255), this, "Defines the name of the attribute.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_attributes.attribute_description</code>.
     * Describes the attribute. This should expand on the name to make it clear
     * what the attribute actually is.
     */
    public final TableField<ViewTableGermplasmAttributesRecord, String> ATTRIBUTE_DESCRIPTION = createField(DSL.name("attribute_description"), SQLDataType.VARCHAR(255), this, "Describes the attribute. This should expand on the name to make it clear what the attribute actually is.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_attributes.attribute_type</code>.
     * Defines the data type of the attribute. This can be of numeric, text,
     * date or categorical types.
     */
    public final TableField<ViewTableGermplasmAttributesRecord, ViewTableGermplasmAttributesAttributeType> ATTRIBUTE_TYPE = createField(DSL.name("attribute_type"), SQLDataType.VARCHAR(11).defaultValue(DSL.inline("text", SQLDataType.VARCHAR)).asEnumDataType(jhi.germinate.server.database.codegen.enums.ViewTableGermplasmAttributesAttributeType.class), this, "Defines the data type of the attribute. This can be of numeric, text, date or categorical types.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_attributes.target_table</code>.
     */
    public final TableField<ViewTableGermplasmAttributesRecord, String> TARGET_TABLE = createField(DSL.name("target_table"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("germinatebase", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_attributes.foreign_id</code>.
     * Foreign key to germinatebase (germinatebase.id).
     */
    public final TableField<ViewTableGermplasmAttributesRecord, Integer> FOREIGN_ID = createField(DSL.name("foreign_id"), SQLDataType.INTEGER.nullable(false), this, "Foreign key to germinatebase (germinatebase.id).");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_attributes.created_on</code>.
     * When the record was created.
     */
    public final TableField<ViewTableGermplasmAttributesRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0), this, "When the record was created.");

    /**
     * The column
     * <code>germinate_db.view_table_germplasm_attributes.attribute_value</code>.
     * The value of the attribute.
     */
    public final TableField<ViewTableGermplasmAttributesRecord, String> ATTRIBUTE_VALUE = createField(DSL.name("attribute_value"), SQLDataType.CLOB.nullable(false), this, "The value of the attribute.");

    private ViewTableGermplasmAttributes(Name alias, Table<ViewTableGermplasmAttributesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableGermplasmAttributes(Name alias, Table<ViewTableGermplasmAttributesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_germplasm_attributes` as select `germinate_template_4_23_01_09`.`attributedata`.`id` AS `attribute_value_id`,`germinate_template_4_23_01_09`.`germinatebase`.`id` AS `germplasm_id`,`germinate_template_4_23_01_09`.`germinatebase`.`general_identifier` AS `germplasm_gid`,`germinate_template_4_23_01_09`.`germinatebase`.`name` AS `germplasm_name`,`germinate_template_4_23_01_09`.`attributes`.`id` AS `attribute_id`,`germinate_template_4_23_01_09`.`attributes`.`name` AS `attribute_name`,`germinate_template_4_23_01_09`.`attributes`.`description` AS `attribute_description`,`germinate_template_4_23_01_09`.`attributes`.`datatype` AS `attribute_type`,`germinate_template_4_23_01_09`.`attributes`.`target_table` AS `target_table`,`germinate_template_4_23_01_09`.`attributedata`.`foreign_id` AS `foreign_id`,`germinate_template_4_23_01_09`.`attributedata`.`created_on` AS `created_on`,`germinate_template_4_23_01_09`.`attributedata`.`value` AS `attribute_value` from ((`germinate_template_4_23_01_09`.`attributedata` left join `germinate_template_4_23_01_09`.`germinatebase` on((`germinate_template_4_23_01_09`.`attributedata`.`foreign_id` = `germinate_template_4_23_01_09`.`germinatebase`.`id`))) left join `germinate_template_4_23_01_09`.`attributes` on((`germinate_template_4_23_01_09`.`attributes`.`id` = `germinate_template_4_23_01_09`.`attributedata`.`attribute_id`))) where (`germinate_template_4_23_01_09`.`attributes`.`target_table` = 'germinatebase')"));
    }

    /**
     * Create an aliased
     * <code>germinate_db.view_table_germplasm_attributes</code> table reference
     */
    public ViewTableGermplasmAttributes(String alias) {
        this(DSL.name(alias), VIEW_TABLE_GERMPLASM_ATTRIBUTES);
    }

    /**
     * Create an aliased
     * <code>germinate_db.view_table_germplasm_attributes</code> table reference
     */
    public ViewTableGermplasmAttributes(Name alias) {
        this(alias, VIEW_TABLE_GERMPLASM_ATTRIBUTES);
    }

    /**
     * Create a <code>germinate_db.view_table_germplasm_attributes</code> table
     * reference
     */
    public ViewTableGermplasmAttributes() {
        this(DSL.name("view_table_germplasm_attributes"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableGermplasmAttributes as(String alias) {
        return new ViewTableGermplasmAttributes(DSL.name(alias), this);
    }

    @Override
    public ViewTableGermplasmAttributes as(Name alias) {
        return new ViewTableGermplasmAttributes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableGermplasmAttributes rename(String name) {
        return new ViewTableGermplasmAttributes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableGermplasmAttributes rename(Name name) {
        return new ViewTableGermplasmAttributes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, Integer, String, String, Integer, String, String, ViewTableGermplasmAttributesAttributeType, String, Integer, Timestamp, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
    // @formatter:on
}
