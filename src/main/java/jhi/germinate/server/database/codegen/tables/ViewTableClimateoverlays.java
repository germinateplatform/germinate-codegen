/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewTableClimateoverlaysRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row9;
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
public class ViewTableClimateoverlays extends TableImpl<ViewTableClimateoverlaysRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>germinate_db.view_table_climateoverlays</code>
     */
    public static final ViewTableClimateoverlays VIEW_TABLE_CLIMATEOVERLAYS = new ViewTableClimateoverlays();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableClimateoverlaysRecord> getRecordType() {
        return ViewTableClimateoverlaysRecord.class;
    }

    /**
     * The column
     * <code>germinate_db.view_table_climateoverlays.climate_overlay_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableClimateoverlaysRecord, Integer> CLIMATE_OVERLAY_ID = createField(DSL.name("climate_overlay_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_climateoverlays.climate_id</code>. Primary
     * id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableClimateoverlaysRecord, Integer> CLIMATE_ID = createField(DSL.name("climate_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_climateoverlays.climate_name</code>.
     * Describes the climate.
     */
    public final TableField<ViewTableClimateoverlaysRecord, String> CLIMATE_NAME = createField(DSL.name("climate_name"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "Describes the climate.");

    /**
     * The column
     * <code>germinate_db.view_table_climateoverlays.is_legend</code>. The
     * legend for the image. What colours represent in the overlays. This is not
     * required but used if present. 
     */
    public final TableField<ViewTableClimateoverlaysRecord, Boolean> IS_LEGEND = createField(DSL.name("is_legend"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BOOLEAN)), this, "The legend for the image. What colours represent in the overlays. This is not required but used if present. ");

    /**
     * The column
     * <code>germinate_db.view_table_climateoverlays.bottom_left_latitude</code>.
     * Allows the allignment of images against OpenStreetMap API.
     */
    public final TableField<ViewTableClimateoverlaysRecord, Double> BOTTOM_LEFT_LATITUDE = createField(DSL.name("bottom_left_latitude"), SQLDataType.DOUBLE, this, "Allows the allignment of images against OpenStreetMap API.");

    /**
     * The column
     * <code>germinate_db.view_table_climateoverlays.bottom_left_longitude</code>.
     * Allows the allignment of images against OpenStreetMap API.
     */
    public final TableField<ViewTableClimateoverlaysRecord, Double> BOTTOM_LEFT_LONGITUDE = createField(DSL.name("bottom_left_longitude"), SQLDataType.DOUBLE, this, "Allows the allignment of images against OpenStreetMap API.");

    /**
     * The column
     * <code>germinate_db.view_table_climateoverlays.top_right_latitude</code>.
     * Allows the allignment of images against OpenStreetMap API.
     */
    public final TableField<ViewTableClimateoverlaysRecord, Double> TOP_RIGHT_LATITUDE = createField(DSL.name("top_right_latitude"), SQLDataType.DOUBLE, this, "Allows the allignment of images against OpenStreetMap API.");

    /**
     * The column
     * <code>germinate_db.view_table_climateoverlays.top_right_longitude</code>.
     * Allows the allignment of images against OpenStreetMap API.
     */
    public final TableField<ViewTableClimateoverlaysRecord, Double> TOP_RIGHT_LONGITUDE = createField(DSL.name("top_right_longitude"), SQLDataType.DOUBLE, this, "Allows the allignment of images against OpenStreetMap API.");

    /**
     * The column <code>germinate_db.view_table_climateoverlays.filename</code>.
     * This is the path for holding images which can be used as overlays for the
     * Google Maps representation in Germinate. The path is relative.
     */
    public final TableField<ViewTableClimateoverlaysRecord, String> FILENAME = createField(DSL.name("filename"), SQLDataType.VARCHAR(255).nullable(false), this, "This is the path for holding images which can be used as overlays for the Google Maps representation in Germinate. The path is relative.");

    private ViewTableClimateoverlays(Name alias, Table<ViewTableClimateoverlaysRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableClimateoverlays(Name alias, Table<ViewTableClimateoverlaysRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_climateoverlays` as select `germinate_template_4_22_10_12`.`climateoverlays`.`id` AS `climate_overlay_id`,`germinate_template_4_22_10_12`.`climates`.`id` AS `climate_id`,`germinate_template_4_22_10_12`.`climates`.`name` AS `climate_name`,`germinate_template_4_22_10_12`.`climateoverlays`.`is_legend` AS `is_legend`,`germinate_template_4_22_10_12`.`climateoverlays`.`bottom_left_latitude` AS `bottom_left_latitude`,`germinate_template_4_22_10_12`.`climateoverlays`.`bottom_left_longitude` AS `bottom_left_longitude`,`germinate_template_4_22_10_12`.`climateoverlays`.`top_right_latitude` AS `top_right_latitude`,`germinate_template_4_22_10_12`.`climateoverlays`.`top_right_longitude` AS `top_right_longitude`,`germinate_template_4_22_10_12`.`climateoverlays`.`path` AS `filename` from (`germinate_template_4_22_10_12`.`climateoverlays` left join `germinate_template_4_22_10_12`.`climates` on((`germinate_template_4_22_10_12`.`climates`.`id` = `germinate_template_4_22_10_12`.`climateoverlays`.`climate_id`)))"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_climateoverlays</code>
     * table reference
     */
    public ViewTableClimateoverlays(String alias) {
        this(DSL.name(alias), VIEW_TABLE_CLIMATEOVERLAYS);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_climateoverlays</code>
     * table reference
     */
    public ViewTableClimateoverlays(Name alias) {
        this(alias, VIEW_TABLE_CLIMATEOVERLAYS);
    }

    /**
     * Create a <code>germinate_db.view_table_climateoverlays</code> table
     * reference
     */
    public ViewTableClimateoverlays() {
        this(DSL.name("view_table_climateoverlays"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableClimateoverlays as(String alias) {
        return new ViewTableClimateoverlays(DSL.name(alias), this);
    }

    @Override
    public ViewTableClimateoverlays as(Name alias) {
        return new ViewTableClimateoverlays(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableClimateoverlays rename(String name) {
        return new ViewTableClimateoverlays(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableClimateoverlays rename(Name name) {
        return new ViewTableClimateoverlays(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, Integer, String, Boolean, Double, Double, Double, Double, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
    // @formatter:on
}
