/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewTableClimateDataRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row20;
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
public class ViewTableClimateData extends TableImpl<ViewTableClimateDataRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>germinate_db.view_table_climate_data</code>
     */
    public static final ViewTableClimateData VIEW_TABLE_CLIMATE_DATA = new ViewTableClimateData();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableClimateDataRecord> getRecordType() {
        return ViewTableClimateDataRecord.class;
    }

    /**
     * The column <code>germinate_db.view_table_climate_data.location_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableClimateDataRecord, Integer> LOCATION_ID = createField(DSL.name("location_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_climate_data.location_name</code>. The site
     * name where the location is.
     */
    public final TableField<ViewTableClimateDataRecord, String> LOCATION_NAME = createField(DSL.name("location_name"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "The site name where the location is.");

    /**
     * The column
     * <code>germinate_db.view_table_climate_data.location_region</code>. The
     * region where the location is if this exists.
     */
    public final TableField<ViewTableClimateDataRecord, String> LOCATION_REGION = createField(DSL.name("location_region"), SQLDataType.VARCHAR(255), this, "The region where the location is if this exists.");

    /**
     * The column
     * <code>germinate_db.view_table_climate_data.location_state</code>. The
     * state where the location is if this exists.
     */
    public final TableField<ViewTableClimateDataRecord, String> LOCATION_STATE = createField(DSL.name("location_state"), SQLDataType.VARCHAR(255), this, "The state where the location is if this exists.");

    /**
     * The column
     * <code>germinate_db.view_table_climate_data.location_type</code>. The name
     * of the location type. 
     */
    public final TableField<ViewTableClimateDataRecord, String> LOCATION_TYPE = createField(DSL.name("location_type"), SQLDataType.VARCHAR(255), this, "The name of the location type. ");

    /**
     * The column
     * <code>germinate_db.view_table_climate_data.location_latitude</code>.
     * Latitude of the location.
     */
    public final TableField<ViewTableClimateDataRecord, BigDecimal> LOCATION_LATITUDE = createField(DSL.name("location_latitude"), SQLDataType.DECIMAL(64, 10), this, "Latitude of the location.");

    /**
     * The column
     * <code>germinate_db.view_table_climate_data.location_longitude</code>.
     * Longitude of the location.
     */
    public final TableField<ViewTableClimateDataRecord, BigDecimal> LOCATION_LONGITUDE = createField(DSL.name("location_longitude"), SQLDataType.DECIMAL(64, 10), this, "Longitude of the location.");

    /**
     * The column
     * <code>germinate_db.view_table_climate_data.location_elevation</code>. The
     * elevation of the site in metres.
     */
    public final TableField<ViewTableClimateDataRecord, BigDecimal> LOCATION_ELEVATION = createField(DSL.name("location_elevation"), SQLDataType.DECIMAL(64, 10), this, "The elevation of the site in metres.");

    /**
     * The column
     * <code>germinate_db.view_table_climate_data.country_name</code>. Country
     * name.
     */
    public final TableField<ViewTableClimateDataRecord, String> COUNTRY_NAME = createField(DSL.name("country_name"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "Country name.");

    /**
     * The column
     * <code>germinate_db.view_table_climate_data.country_code2</code>. ISO 2
     * Code for country.
     */
    public final TableField<ViewTableClimateDataRecord, String> COUNTRY_CODE2 = createField(DSL.name("country_code2"), SQLDataType.CHAR(2).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "ISO 2 Code for country.");

    /**
     * The column
     * <code>germinate_db.view_table_climate_data.country_code3</code>. ISO 3
     * Code for country.
     */
    public final TableField<ViewTableClimateDataRecord, String> COUNTRY_CODE3 = createField(DSL.name("country_code3"), SQLDataType.CHAR(3).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "ISO 3 Code for country.");

    /**
     * The column <code>germinate_db.view_table_climate_data.dataset_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableClimateDataRecord, Integer> DATASET_ID = createField(DSL.name("dataset_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_climate_data.dataset_name</code>. Describes
     * the dataset.
     */
    public final TableField<ViewTableClimateDataRecord, String> DATASET_NAME = createField(DSL.name("dataset_name"), SQLDataType.CLOB, this, "Describes the dataset.");

    /**
     * The column
     * <code>germinate_db.view_table_climate_data.dataset_description</code>.
     * The name of this dataset.
     */
    public final TableField<ViewTableClimateDataRecord, String> DATASET_DESCRIPTION = createField(DSL.name("dataset_description"), SQLDataType.CLOB, this, "The name of this dataset.");

    /**
     * The column <code>germinate_db.view_table_climate_data.climate_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableClimateDataRecord, Integer> CLIMATE_ID = createField(DSL.name("climate_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_climate_data.climate_name</code>. Describes
     * the climate.
     */
    public final TableField<ViewTableClimateDataRecord, String> CLIMATE_NAME = createField(DSL.name("climate_name"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "Describes the climate.");

    /**
     * The column
     * <code>germinate_db.view_table_climate_data.climate_name_short</code>.
     * Shortened version of the climate name which is used in some table
     * headers.
     */
    public final TableField<ViewTableClimateDataRecord, String> CLIMATE_NAME_SHORT = createField(DSL.name("climate_name_short"), SQLDataType.CHAR(10), this, "Shortened version of the climate name which is used in some table headers.");

    /**
     * The column <code>germinate_db.view_table_climate_data.unit_name</code>.
     * The name of the unit. This should be the name of the unit in full.
     */
    public final TableField<ViewTableClimateDataRecord, String> UNIT_NAME = createField(DSL.name("unit_name"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "The name of the unit. This should be the name of the unit in full.");

    /**
     * The column
     * <code>germinate_db.view_table_climate_data.recording_date</code>. The
     * date at which this data point was recorded.
     */
    public final TableField<ViewTableClimateDataRecord, Timestamp> RECORDING_DATE = createField(DSL.name("recording_date"), SQLDataType.TIMESTAMP(0), this, "The date at which this data point was recorded.");

    /**
     * The column
     * <code>germinate_db.view_table_climate_data.climate_value</code>. Value
     * for the specific climate attribute. These are monthly averages and not
     * daily. Monthly data is required for the current Germinate climate
     * viisualizations and interface.
     */
    public final TableField<ViewTableClimateDataRecord, Double> CLIMATE_VALUE = createField(DSL.name("climate_value"), SQLDataType.DOUBLE, this, "Value for the specific climate attribute. These are monthly averages and not daily. Monthly data is required for the current Germinate climate viisualizations and interface.");

    private ViewTableClimateData(Name alias, Table<ViewTableClimateDataRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableClimateData(Name alias, Table<ViewTableClimateDataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_climate_data` as select `germinate_template_4_22_05_04`.`locations`.`id` AS `location_id`,`germinate_template_4_22_05_04`.`locations`.`site_name` AS `location_name`,`germinate_template_4_22_05_04`.`locations`.`region` AS `location_region`,`germinate_template_4_22_05_04`.`locations`.`state` AS `location_state`,`germinate_template_4_22_05_04`.`locationtypes`.`name` AS `location_type`,`germinate_template_4_22_05_04`.`locations`.`latitude` AS `location_latitude`,`germinate_template_4_22_05_04`.`locations`.`longitude` AS `location_longitude`,`germinate_template_4_22_05_04`.`locations`.`elevation` AS `location_elevation`,`germinate_template_4_22_05_04`.`countries`.`country_name` AS `country_name`,`germinate_template_4_22_05_04`.`countries`.`country_code2` AS `country_code2`,`germinate_template_4_22_05_04`.`countries`.`country_code3` AS `country_code3`,`germinate_template_4_22_05_04`.`datasets`.`id` AS `dataset_id`,`germinate_template_4_22_05_04`.`datasets`.`name` AS `dataset_name`,`germinate_template_4_22_05_04`.`datasets`.`description` AS `dataset_description`,`germinate_template_4_22_05_04`.`climates`.`id` AS `climate_id`,`germinate_template_4_22_05_04`.`climates`.`name` AS `climate_name`,`germinate_template_4_22_05_04`.`climates`.`short_name` AS `climate_name_short`,`germinate_template_4_22_05_04`.`units`.`unit_name` AS `unit_name`,`germinate_template_4_22_05_04`.`climatedata`.`recording_date` AS `recording_date`,`germinate_template_4_22_05_04`.`climatedata`.`climate_value` AS `climate_value` from ((((((`germinate_template_4_22_05_04`.`climatedata` left join `germinate_template_4_22_05_04`.`locations` on((`germinate_template_4_22_05_04`.`locations`.`id` = `germinate_template_4_22_05_04`.`climatedata`.`location_id`))) left join `germinate_template_4_22_05_04`.`locationtypes` on((`germinate_template_4_22_05_04`.`locations`.`locationtype_id` = `germinate_template_4_22_05_04`.`locationtypes`.`id`))) left join `germinate_template_4_22_05_04`.`climates` on((`germinate_template_4_22_05_04`.`climates`.`id` = `germinate_template_4_22_05_04`.`climatedata`.`climate_id`))) left join `germinate_template_4_22_05_04`.`units` on((`germinate_template_4_22_05_04`.`units`.`id` = `germinate_template_4_22_05_04`.`climates`.`unit_id`))) left join `germinate_template_4_22_05_04`.`datasets` on((`germinate_template_4_22_05_04`.`datasets`.`id` = `germinate_template_4_22_05_04`.`climatedata`.`dataset_id`))) left join `germinate_template_4_22_05_04`.`countries` on((`germinate_template_4_22_05_04`.`countries`.`id` = `germinate_template_4_22_05_04`.`locations`.`country_id`)))"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_climate_data</code> table
     * reference
     */
    public ViewTableClimateData(String alias) {
        this(DSL.name(alias), VIEW_TABLE_CLIMATE_DATA);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_climate_data</code> table
     * reference
     */
    public ViewTableClimateData(Name alias) {
        this(alias, VIEW_TABLE_CLIMATE_DATA);
    }

    /**
     * Create a <code>germinate_db.view_table_climate_data</code> table
     * reference
     */
    public ViewTableClimateData() {
        this(DSL.name("view_table_climate_data"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableClimateData as(String alias) {
        return new ViewTableClimateData(DSL.name(alias), this);
    }

    @Override
    public ViewTableClimateData as(Name alias) {
        return new ViewTableClimateData(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableClimateData rename(String name) {
        return new ViewTableClimateData(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableClimateData rename(Name name) {
        return new ViewTableClimateData(name, null);
    }

    // -------------------------------------------------------------------------
    // Row20 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row20<Integer, String, String, String, String, BigDecimal, BigDecimal, BigDecimal, String, String, String, Integer, String, String, Integer, String, String, String, Timestamp, Double> fieldsRow() {
        return (Row20) super.fieldsRow();
    }
    // @formatter:on
}
