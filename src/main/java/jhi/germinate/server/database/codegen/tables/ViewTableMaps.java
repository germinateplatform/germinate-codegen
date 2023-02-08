/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewTableMapsRecord;

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
public class ViewTableMaps extends TableImpl<ViewTableMapsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.view_table_maps</code>
     */
    public static final ViewTableMaps VIEW_TABLE_MAPS = new ViewTableMaps();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableMapsRecord> getRecordType() {
        return ViewTableMapsRecord.class;
    }

    /**
     * The column <code>germinate_db.view_table_maps.map_id</code>. Primary id
     * for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableMapsRecord, Integer> MAP_ID = createField(DSL.name("map_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_maps.map_name</code>. Describes
     * the map.
     */
    public final TableField<ViewTableMapsRecord, String> MAP_NAME = createField(DSL.name("map_name"), SQLDataType.VARCHAR(255).nullable(false), this, "Describes the map.");

    /**
     * The column <code>germinate_db.view_table_maps.map_description</code>. The
     * name of this map.
     */
    public final TableField<ViewTableMapsRecord, String> MAP_DESCRIPTION = createField(DSL.name("map_description"), SQLDataType.CLOB, this, "The name of this map.");

    /**
     * The column <code>germinate_db.view_table_maps.user_id</code>. Foreign key
     * to Gatekeeper users (Gatekeeper users.id).
     */
    public final TableField<ViewTableMapsRecord, Integer> USER_ID = createField(DSL.name("user_id"), SQLDataType.INTEGER, this, "Foreign key to Gatekeeper users (Gatekeeper users.id).");

    /**
     * The column <code>germinate_db.view_table_maps.visibility</code>.
     * Determines if the map is visible to the Germinate interface or hidden.
     */
    public final TableField<ViewTableMapsRecord, Boolean> VISIBILITY = createField(DSL.name("visibility"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.inline("1", SQLDataType.BOOLEAN)), this, "Determines if the map is visible to the Germinate interface or hidden.");

    /**
     * The column <code>germinate_db.view_table_maps.marker_count</code>.
     */
    public final TableField<ViewTableMapsRecord, Long> MARKER_COUNT = createField(DSL.name("marker_count"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "");

    private ViewTableMaps(Name alias, Table<ViewTableMapsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableMaps(Name alias, Table<ViewTableMapsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_maps` as select `germinate_template_4_23_02_08`.`maps`.`id` AS `map_id`,`germinate_template_4_23_02_08`.`maps`.`name` AS `map_name`,`germinate_template_4_23_02_08`.`maps`.`description` AS `map_description`,`germinate_template_4_23_02_08`.`maps`.`user_id` AS `user_id`,`germinate_template_4_23_02_08`.`maps`.`visibility` AS `visibility`,count(1) AS `marker_count` from (`germinate_template_4_23_02_08`.`maps` left join `germinate_template_4_23_02_08`.`mapdefinitions` on((`germinate_template_4_23_02_08`.`maps`.`id` = `germinate_template_4_23_02_08`.`mapdefinitions`.`map_id`))) group by `germinate_template_4_23_02_08`.`maps`.`id`"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_maps</code> table
     * reference
     */
    public ViewTableMaps(String alias) {
        this(DSL.name(alias), VIEW_TABLE_MAPS);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_maps</code> table
     * reference
     */
    public ViewTableMaps(Name alias) {
        this(alias, VIEW_TABLE_MAPS);
    }

    /**
     * Create a <code>germinate_db.view_table_maps</code> table reference
     */
    public ViewTableMaps() {
        this(DSL.name("view_table_maps"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableMaps as(String alias) {
        return new ViewTableMaps(DSL.name(alias), this);
    }

    @Override
    public ViewTableMaps as(Name alias) {
        return new ViewTableMaps(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableMaps rename(String name) {
        return new ViewTableMaps(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableMaps rename(Name name) {
        return new ViewTableMaps(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, Integer, Boolean, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
    // @formatter:on
}
