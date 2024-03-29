/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.MapdefinitionsRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Row10;
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
 * Relates genetic markers to a map and assigns a position (if known). Maps are
 * made up of lists of markers and positions (genetic or physiscal and
 * chromosome/linkage group assignation). In the case of QTL the
 * definition_start and definition_end columns can be used to specify a range
 * across a linkage group.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Mapdefinitions extends TableImpl<MapdefinitionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.mapdefinitions</code>
     */
    public static final Mapdefinitions MAPDEFINITIONS = new Mapdefinitions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MapdefinitionsRecord> getRecordType() {
        return MapdefinitionsRecord.class;
    }

    /**
     * The column <code>germinate_db.mapdefinitions.id</code>. Primary id for
     * this table. This uniquely identifies the row.
     */
    public final TableField<MapdefinitionsRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.mapdefinitions.mapfeaturetype_id</code>.
     * Foreign key to mapfeaturetypes (mapfeaturetypes.id).
     */
    public final TableField<MapdefinitionsRecord, Integer> MAPFEATURETYPE_ID = createField(DSL.name("mapfeaturetype_id"), SQLDataType.INTEGER.nullable(false), this, "Foreign key to mapfeaturetypes (mapfeaturetypes.id).");

    /**
     * The column <code>germinate_db.mapdefinitions.marker_id</code>. Foreign
     * key to markers (markers.id).
     */
    public final TableField<MapdefinitionsRecord, Integer> MARKER_ID = createField(DSL.name("marker_id"), SQLDataType.INTEGER.nullable(false), this, "Foreign key to markers (markers.id).");

    /**
     * The column <code>germinate_db.mapdefinitions.map_id</code>. Foreign key
     * to maps (maps.id).
     */
    public final TableField<MapdefinitionsRecord, Integer> MAP_ID = createField(DSL.name("map_id"), SQLDataType.INTEGER.nullable(false), this, "Foreign key to maps (maps.id).");

    /**
     * The column <code>germinate_db.mapdefinitions.definition_start</code>.
     * Used if the markers location spans over an area more than a single point
     * on the maps. Determines the marker start location.
     */
    public final TableField<MapdefinitionsRecord, Double> DEFINITION_START = createField(DSL.name("definition_start"), SQLDataType.DOUBLE.nullable(false), this, "Used if the markers location spans over an area more than a single point on the maps. Determines the marker start location.");

    /**
     * The column <code>germinate_db.mapdefinitions.definition_end</code>. Used
     * if the markers location spans over an area more than a single point on
     * the maps. Determines the marker end location.
     */
    public final TableField<MapdefinitionsRecord, Double> DEFINITION_END = createField(DSL.name("definition_end"), SQLDataType.DOUBLE, this, "Used if the markers location spans over an area more than a single point on the maps. Determines the marker end location.");

    /**
     * The column <code>germinate_db.mapdefinitions.chromosome</code>. The
     * chromosome/linkage group that this marker is found on.
     */
    public final TableField<MapdefinitionsRecord, String> CHROMOSOME = createField(DSL.name("chromosome"), SQLDataType.VARCHAR(255).nullable(false), this, "The chromosome/linkage group that this marker is found on.");

    /**
     * The column <code>germinate_db.mapdefinitions.arm_impute</code>. If a
     * chromosome arm is available then this can be entered here.
     */
    public final TableField<MapdefinitionsRecord, String> ARM_IMPUTE = createField(DSL.name("arm_impute"), SQLDataType.VARCHAR(255), this, "If a chromosome arm is available then this can be entered here.");

    /**
     * The column <code>germinate_db.mapdefinitions.created_on</code>. When the
     * record was created.
     */
    public final TableField<MapdefinitionsRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.mapdefinitions.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public final TableField<MapdefinitionsRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private Mapdefinitions(Name alias, Table<MapdefinitionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Mapdefinitions(Name alias, Table<MapdefinitionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Relates genetic markers to a map and assigns a position (if known). Maps are made up of lists of markers and positions (genetic or physiscal and chromosome/linkage group assignation). In the case of QTL the definition_start and definition_end columns can be used to specify a range across a linkage group."), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.mapdefinitions</code> table
     * reference
     */
    public Mapdefinitions(String alias) {
        this(DSL.name(alias), MAPDEFINITIONS);
    }

    /**
     * Create an aliased <code>germinate_db.mapdefinitions</code> table
     * reference
     */
    public Mapdefinitions(Name alias) {
        this(alias, MAPDEFINITIONS);
    }

    /**
     * Create a <code>germinate_db.mapdefinitions</code> table reference
     */
    public Mapdefinitions() {
        this(DSL.name("mapdefinitions"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<MapdefinitionsRecord, Integer> getIdentity() {
        return (Identity<MapdefinitionsRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<MapdefinitionsRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Mapdefinitions.MAPDEFINITIONS, DSL.name("KEY_mapdefinitions_PRIMARY"), new TableField[] { Mapdefinitions.MAPDEFINITIONS.ID }, true);
    }

    @Override
    public Mapdefinitions as(String alias) {
        return new Mapdefinitions(DSL.name(alias), this);
    }

    @Override
    public Mapdefinitions as(Name alias) {
        return new Mapdefinitions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Mapdefinitions rename(String name) {
        return new Mapdefinitions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Mapdefinitions rename(Name name) {
        return new Mapdefinitions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, Integer, Integer, Integer, Double, Double, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
    // @formatter:on
}
