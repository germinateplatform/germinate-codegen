/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.enums.ViewTableClimatesDataType;
import jhi.germinate.server.database.codegen.tables.records.ViewTableClimatesRecord;

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
public class ViewTableClimates extends TableImpl<ViewTableClimatesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.view_table_climates</code>
     */
    public static final ViewTableClimates VIEW_TABLE_CLIMATES = new ViewTableClimates();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableClimatesRecord> getRecordType() {
        return ViewTableClimatesRecord.class;
    }

    /**
     * The column <code>germinate_db.view_table_climates.climate_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableClimatesRecord, Integer> CLIMATE_ID = createField(DSL.name("climate_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_climates.climate_name</code>.
     * Describes the climate.
     */
    public final TableField<ViewTableClimatesRecord, String> CLIMATE_NAME = createField(DSL.name("climate_name"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "Describes the climate.");

    /**
     * The column
     * <code>germinate_db.view_table_climates.climate_name_short</code>.
     * Shortened version of the climate name which is used in some table
     * headers.
     */
    public final TableField<ViewTableClimatesRecord, String> CLIMATE_NAME_SHORT = createField(DSL.name("climate_name_short"), SQLDataType.CHAR(10), this, "Shortened version of the climate name which is used in some table headers.");

    /**
     * The column
     * <code>germinate_db.view_table_climates.climate_description</code>. A
     * longer description of the climate.
     */
    public final TableField<ViewTableClimatesRecord, String> CLIMATE_DESCRIPTION = createField(DSL.name("climate_description"), SQLDataType.CLOB, this, "A longer description of the climate.");

    /**
     * The column <code>germinate_db.view_table_climates.data_type</code>.
     * Defines the data type of the climate. This can be of numeric, text, date
     * or categorical types.
     */
    public final TableField<ViewTableClimatesRecord, ViewTableClimatesDataType> DATA_TYPE = createField(DSL.name("data_type"), SQLDataType.VARCHAR(11).nullable(false).defaultValue(DSL.inline("text", SQLDataType.VARCHAR)).asEnumDataType(jhi.germinate.server.database.codegen.enums.ViewTableClimatesDataType.class), this, "Defines the data type of the climate. This can be of numeric, text, date or categorical types.");

    /**
     * The column <code>germinate_db.view_table_climates.unit_id</code>. Primary
     * id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableClimatesRecord, Integer> UNIT_ID = createField(DSL.name("unit_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_climates.unit_name</code>. The
     * name of the unit. This should be the name of the unit in full.
     */
    public final TableField<ViewTableClimatesRecord, String> UNIT_NAME = createField(DSL.name("unit_name"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "The name of the unit. This should be the name of the unit in full.");

    /**
     * The column
     * <code>germinate_db.view_table_climates.unit_description</code>. A
     * description of the unit. If the unit is not a standard SI unit then it is
     * beneficial to have a description which explains what the unit it, how it
     * is derived and any other information which would help identifiy it.
     */
    public final TableField<ViewTableClimatesRecord, String> UNIT_DESCRIPTION = createField(DSL.name("unit_description"), SQLDataType.CLOB, this, "A description of the unit. If the unit is not a standard SI unit then it is beneficial to have a description which explains what the unit it, how it is derived and any other information which would help identifiy it.");

    /**
     * The column <code>germinate_db.view_table_climates.overlays</code>.
     */
    public final TableField<ViewTableClimatesRecord, Long> OVERLAYS = createField(DSL.name("overlays"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>germinate_db.view_table_climates.unit_abbreviation</code>. This
     * should be the unit abbreviation.
     */
    public final TableField<ViewTableClimatesRecord, String> UNIT_ABBREVIATION = createField(DSL.name("unit_abbreviation"), SQLDataType.CHAR(10), this, "This should be the unit abbreviation.");

    /**
     * The column <code>germinate_db.view_table_climates.count</code>.
     */
    public final TableField<ViewTableClimatesRecord, Long> COUNT = createField(DSL.name("count"), SQLDataType.BIGINT, this, "");

    private ViewTableClimates(Name alias, Table<ViewTableClimatesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableClimates(Name alias, Table<ViewTableClimatesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_climates` as select `germinate_template_4_25_03_05`.`climates`.`id` AS `climate_id`,`germinate_template_4_25_03_05`.`climates`.`name` AS `climate_name`,`germinate_template_4_25_03_05`.`climates`.`short_name` AS `climate_name_short`,`germinate_template_4_25_03_05`.`climates`.`description` AS `climate_description`,`germinate_template_4_25_03_05`.`climates`.`datatype` AS `data_type`,`germinate_template_4_25_03_05`.`units`.`id` AS `unit_id`,`germinate_template_4_25_03_05`.`units`.`unit_name` AS `unit_name`,`germinate_template_4_25_03_05`.`units`.`unit_description` AS `unit_description`,(select count(1) from `germinate_template_4_25_03_05`.`mapoverlays` where ((`germinate_template_4_25_03_05`.`mapoverlays`.`reference_table` = 'climates') and (`germinate_template_4_25_03_05`.`mapoverlays`.`foreign_id` = `germinate_template_4_25_03_05`.`climates`.`id`))) AS `overlays`,`germinate_template_4_25_03_05`.`units`.`unit_abbreviation` AS `unit_abbreviation`,(select count(1) from `germinate_template_4_25_03_05`.`climatedata` where (`germinate_template_4_25_03_05`.`climatedata`.`climate_id` = `germinate_template_4_25_03_05`.`climates`.`id`)) AS `count` from (`germinate_template_4_25_03_05`.`climates` left join `germinate_template_4_25_03_05`.`units` on((`germinate_template_4_25_03_05`.`units`.`id` = `germinate_template_4_25_03_05`.`climates`.`unit_id`))) group by `germinate_template_4_25_03_05`.`climates`.`id`"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_climates</code> table
     * reference
     */
    public ViewTableClimates(String alias) {
        this(DSL.name(alias), VIEW_TABLE_CLIMATES);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_climates</code> table
     * reference
     */
    public ViewTableClimates(Name alias) {
        this(alias, VIEW_TABLE_CLIMATES);
    }

    /**
     * Create a <code>germinate_db.view_table_climates</code> table reference
     */
    public ViewTableClimates() {
        this(DSL.name("view_table_climates"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableClimates as(String alias) {
        return new ViewTableClimates(DSL.name(alias), this);
    }

    @Override
    public ViewTableClimates as(Name alias) {
        return new ViewTableClimates(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableClimates rename(String name) {
        return new ViewTableClimates(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableClimates rename(Name name) {
        return new ViewTableClimates(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, String, String, String, ViewTableClimatesDataType, Integer, String, String, Long, String, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
    // @formatter:on
}
