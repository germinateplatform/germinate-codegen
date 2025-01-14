/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.enums.ViewTableMapoverlaysReferenceTable;
import jhi.germinate.server.database.codegen.tables.records.ViewTableMapoverlaysRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row17;
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
public class ViewTableMapoverlays extends TableImpl<ViewTableMapoverlaysRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>germinate_db.view_table_mapoverlays</code>
     */
    public static final ViewTableMapoverlays VIEW_TABLE_MAPOVERLAYS = new ViewTableMapoverlays();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableMapoverlaysRecord> getRecordType() {
        return ViewTableMapoverlaysRecord.class;
    }

    /**
     * The column
     * <code>germinate_db.view_table_mapoverlays.mapoverlay_id</code>. The
     * primary key of this table.
     */
    public final TableField<ViewTableMapoverlaysRecord, Integer> MAPOVERLAY_ID = createField(DSL.name("mapoverlay_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "The primary key of this table.");

    /**
     * The column
     * <code>germinate_db.view_table_mapoverlays.mapoverlay_name</code>. A name
     * for the map overlay.
     */
    public final TableField<ViewTableMapoverlaysRecord, String> MAPOVERLAY_NAME = createField(DSL.name("mapoverlay_name"), SQLDataType.VARCHAR(255).nullable(false), this, "A name for the map overlay.");

    /**
     * The column
     * <code>germinate_db.view_table_mapoverlays.mapoverlay_description</code>.
     * An optional description of what is shown on the overlay.
     */
    public final TableField<ViewTableMapoverlaysRecord, String> MAPOVERLAY_DESCRIPTION = createField(DSL.name("mapoverlay_description"), SQLDataType.CLOB, this, "An optional description of what is shown on the overlay.");

    /**
     * The column
     * <code>germinate_db.view_table_mapoverlays.mapoverlay_bottom_left_lat</code>.
     * The bottom left latitude coordinates in decimal degrees for anchoring on
     * the map.
     */
    public final TableField<ViewTableMapoverlaysRecord, BigDecimal> MAPOVERLAY_BOTTOM_LEFT_LAT = createField(DSL.name("mapoverlay_bottom_left_lat"), SQLDataType.DECIMAL(64, 10), this, "The bottom left latitude coordinates in decimal degrees for anchoring on the map.");

    /**
     * The column
     * <code>germinate_db.view_table_mapoverlays.mapoverlay_bottom_left_lng</code>.
     * The bottom left longitude coordinates in decimal degrees for anchoring on
     * the map.
     */
    public final TableField<ViewTableMapoverlaysRecord, BigDecimal> MAPOVERLAY_BOTTOM_LEFT_LNG = createField(DSL.name("mapoverlay_bottom_left_lng"), SQLDataType.DECIMAL(64, 10), this, "The bottom left longitude coordinates in decimal degrees for anchoring on the map.");

    /**
     * The column
     * <code>germinate_db.view_table_mapoverlays.mapoverlay_top_right_lat</code>.
     * The top right latitude coordinates in decimal degrees for anchoring on
     * the map.
     */
    public final TableField<ViewTableMapoverlaysRecord, BigDecimal> MAPOVERLAY_TOP_RIGHT_LAT = createField(DSL.name("mapoverlay_top_right_lat"), SQLDataType.DECIMAL(64, 10), this, "The top right latitude coordinates in decimal degrees for anchoring on the map.");

    /**
     * The column
     * <code>germinate_db.view_table_mapoverlays.mapoverlay_top_right_lng</code>.
     * The top right longitude coordinates in decimal degrees for anchoring on
     * the map.
     */
    public final TableField<ViewTableMapoverlaysRecord, BigDecimal> MAPOVERLAY_TOP_RIGHT_LNG = createField(DSL.name("mapoverlay_top_right_lng"), SQLDataType.DECIMAL(64, 10), this, "The top right longitude coordinates in decimal degrees for anchoring on the map.");

    /**
     * The column
     * <code>germinate_db.view_table_mapoverlays.mapoverlays_is_legend</code>.
     * Flag to indicate whether this is a legend or an actual overlay.
     */
    public final TableField<ViewTableMapoverlaysRecord, Boolean> MAPOVERLAYS_IS_LEGEND = createField(DSL.name("mapoverlays_is_legend"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BOOLEAN)), this, "Flag to indicate whether this is a legend or an actual overlay.");

    /**
     * The column
     * <code>germinate_db.view_table_mapoverlays.reference_table</code>.
     * Optionally, other database items can be linked to this. As an example, an
     * overlay can be linked to a climate variable.
     */
    public final TableField<ViewTableMapoverlaysRecord, ViewTableMapoverlaysReferenceTable> REFERENCE_TABLE = createField(DSL.name("reference_table"), SQLDataType.VARCHAR(10).asEnumDataType(jhi.germinate.server.database.codegen.enums.ViewTableMapoverlaysReferenceTable.class), this, "Optionally, other database items can be linked to this. As an example, an overlay can be linked to a climate variable.");

    /**
     * The column <code>germinate_db.view_table_mapoverlays.foreign_id</code>.
     * The foreign id within the reference_table of the linked database object.
     */
    public final TableField<ViewTableMapoverlaysRecord, Integer> FOREIGN_ID = createField(DSL.name("foreign_id"), SQLDataType.INTEGER, this, "The foreign id within the reference_table of the linked database object.");

    /**
     * The column <code>germinate_db.view_table_mapoverlays.dataset_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableMapoverlaysRecord, Integer> DATASET_ID = createField(DSL.name("dataset_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_mapoverlays.dataset_name</code>.
     * Describes the dataset.
     */
    public final TableField<ViewTableMapoverlaysRecord, String> DATASET_NAME = createField(DSL.name("dataset_name"), SQLDataType.CLOB, this, "Describes the dataset.");

    /**
     * The column
     * <code>germinate_db.view_table_mapoverlays.dataset_description</code>. The
     * name of this dataset.
     */
    public final TableField<ViewTableMapoverlaysRecord, String> DATASET_DESCRIPTION = createField(DSL.name("dataset_description"), SQLDataType.CLOB, this, "The name of this dataset.");

    /**
     * The column <code>germinate_db.view_table_mapoverlays.dataset_type</code>.
     * Describes the experiment type.
     */
    public final TableField<ViewTableMapoverlaysRecord, String> DATASET_TYPE = createField(DSL.name("dataset_type"), SQLDataType.VARCHAR(255), this, "Describes the experiment type.");

    /**
     * The column
     * <code>germinate_db.view_table_mapoverlays.recording_date</code>. A date
     * that is associated with the timepoint when this has been recorded.
     */
    public final TableField<ViewTableMapoverlaysRecord, Timestamp> RECORDING_DATE = createField(DSL.name("recording_date"), SQLDataType.TIMESTAMP(0), this, "A date that is associated with the timepoint when this has been recorded.");

    /**
     * The column <code>germinate_db.view_table_mapoverlays.created_on</code>.
     * The datetime when this database record has been created.
     */
    public final TableField<ViewTableMapoverlaysRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "The datetime when this database record has been created.");

    /**
     * The column <code>germinate_db.view_table_mapoverlays.updated_on</code>.
     * The timestamp when this database record has last been updated.
     */
    public final TableField<ViewTableMapoverlaysRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "The timestamp when this database record has last been updated.");

    private ViewTableMapoverlays(Name alias, Table<ViewTableMapoverlaysRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableMapoverlays(Name alias, Table<ViewTableMapoverlaysRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_mapoverlays` as select `germinate_template_4_25_01_14`.`mapoverlays`.`id` AS `mapoverlay_id`,`germinate_template_4_25_01_14`.`mapoverlays`.`name` AS `mapoverlay_name`,`germinate_template_4_25_01_14`.`mapoverlays`.`description` AS `mapoverlay_description`,`germinate_template_4_25_01_14`.`mapoverlays`.`bottom_left_lat` AS `mapoverlay_bottom_left_lat`,`germinate_template_4_25_01_14`.`mapoverlays`.`bottom_left_lng` AS `mapoverlay_bottom_left_lng`,`germinate_template_4_25_01_14`.`mapoverlays`.`top_right_lat` AS `mapoverlay_top_right_lat`,`germinate_template_4_25_01_14`.`mapoverlays`.`top_right_lng` AS `mapoverlay_top_right_lng`,`germinate_template_4_25_01_14`.`mapoverlays`.`is_legend` AS `mapoverlays_is_legend`,`germinate_template_4_25_01_14`.`mapoverlays`.`reference_table` AS `reference_table`,`germinate_template_4_25_01_14`.`mapoverlays`.`foreign_id` AS `foreign_id`,`germinate_template_4_25_01_14`.`datasets`.`id` AS `dataset_id`,`germinate_template_4_25_01_14`.`datasets`.`name` AS `dataset_name`,`germinate_template_4_25_01_14`.`datasets`.`description` AS `dataset_description`,`germinate_template_4_25_01_14`.`datasettypes`.`description` AS `dataset_type`,`germinate_template_4_25_01_14`.`mapoverlays`.`recording_date` AS `recording_date`,`germinate_template_4_25_01_14`.`mapoverlays`.`created_on` AS `created_on`,`germinate_template_4_25_01_14`.`mapoverlays`.`updated_on` AS `updated_on` from ((`germinate_template_4_25_01_14`.`mapoverlays` left join `germinate_template_4_25_01_14`.`datasets` on((`germinate_template_4_25_01_14`.`datasets`.`id` = `germinate_template_4_25_01_14`.`mapoverlays`.`dataset_id`))) left join `germinate_template_4_25_01_14`.`datasettypes` on((`germinate_template_4_25_01_14`.`datasettypes`.`id` = `germinate_template_4_25_01_14`.`datasets`.`datasettype_id`)))"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_mapoverlays</code> table
     * reference
     */
    public ViewTableMapoverlays(String alias) {
        this(DSL.name(alias), VIEW_TABLE_MAPOVERLAYS);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_mapoverlays</code> table
     * reference
     */
    public ViewTableMapoverlays(Name alias) {
        this(alias, VIEW_TABLE_MAPOVERLAYS);
    }

    /**
     * Create a <code>germinate_db.view_table_mapoverlays</code> table reference
     */
    public ViewTableMapoverlays() {
        this(DSL.name("view_table_mapoverlays"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableMapoverlays as(String alias) {
        return new ViewTableMapoverlays(DSL.name(alias), this);
    }

    @Override
    public ViewTableMapoverlays as(Name alias) {
        return new ViewTableMapoverlays(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableMapoverlays rename(String name) {
        return new ViewTableMapoverlays(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableMapoverlays rename(Name name) {
        return new ViewTableMapoverlays(name, null);
    }

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row17<Integer, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Boolean, ViewTableMapoverlaysReferenceTable, Integer, Integer, String, String, String, Timestamp, Timestamp, Timestamp> fieldsRow() {
        return (Row17) super.fieldsRow();
    }
    // @formatter:on
}
