/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ClimatedataRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Row9;
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
 * Holds montly average climate data such as rainfall, temperature or cloud
 * cover. This is based on locations rather than accessions like most of the
 * other tables in Germinate.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Climatedata extends TableImpl<ClimatedataRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.climatedata</code>
     */
    public static final Climatedata CLIMATEDATA = new Climatedata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClimatedataRecord> getRecordType() {
        return ClimatedataRecord.class;
    }

    /**
     * The column <code>germinate_db.climatedata.id</code>. Primary id for this
     * table. This uniquely identifies the row.
     */
    public final TableField<ClimatedataRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.climatedata.climate_id</code>. Foreign key
     * to climates (climates.id).
     */
    public final TableField<ClimatedataRecord, Integer> CLIMATE_ID = createField(DSL.name("climate_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Foreign key to climates (climates.id).");

    /**
     * The column <code>germinate_db.climatedata.location_id</code>. Foreign key
     * to locations (locations.id).
     */
    public final TableField<ClimatedataRecord, Integer> LOCATION_ID = createField(DSL.name("location_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Foreign key to locations (locations.id).");

    /**
     * The column <code>germinate_db.climatedata.climate_value</code>. Value for
     * the specific climate attribute. These are monthly averages and not daily.
     * Monthly data is required for the current Germinate climate
     * viisualizations and interface.
     */
    public final TableField<ClimatedataRecord, Double> CLIMATE_VALUE = createField(DSL.name("climate_value"), SQLDataType.DOUBLE, this, "Value for the specific climate attribute. These are monthly averages and not daily. Monthly data is required for the current Germinate climate viisualizations and interface.");

    /**
     * The column <code>germinate_db.climatedata.dataset_id</code>. Foreign key
     * to datasets (datasets.id).
     */
    public final TableField<ClimatedataRecord, Integer> DATASET_ID = createField(DSL.name("dataset_id"), SQLDataType.INTEGER.nullable(false), this, "Foreign key to datasets (datasets.id).");

    /**
     * The column <code>germinate_db.climatedata.recording_date</code>. The date
     * at which this data point was recorded.
     */
    public final TableField<ClimatedataRecord, Timestamp> RECORDING_DATE = createField(DSL.name("recording_date"), SQLDataType.TIMESTAMP(0), this, "The date at which this data point was recorded.");

    /**
     * The column <code>germinate_db.climatedata.old_recording_date</code>. The
     * month that the data was recorded. This uses an integer to represent the
     * month (1-12).
     */
    public final TableField<ClimatedataRecord, String> OLD_RECORDING_DATE = createField(DSL.name("old_recording_date"), SQLDataType.VARCHAR(32), this, "The month that the data was recorded. This uses an integer to represent the month (1-12).");

    /**
     * The column <code>germinate_db.climatedata.created_on</code>. When the
     * record was created.
     */
    public final TableField<ClimatedataRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.climatedata.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public final TableField<ClimatedataRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private Climatedata(Name alias, Table<ClimatedataRecord> aliased) {
        this(alias, aliased, null);
    }

    private Climatedata(Name alias, Table<ClimatedataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Holds montly average climate data such as rainfall, temperature or cloud cover. This is based on locations rather than accessions like most of the other tables in Germinate."), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.climatedata</code> table reference
     */
    public Climatedata(String alias) {
        this(DSL.name(alias), CLIMATEDATA);
    }

    /**
     * Create an aliased <code>germinate_db.climatedata</code> table reference
     */
    public Climatedata(Name alias) {
        this(alias, CLIMATEDATA);
    }

    /**
     * Create a <code>germinate_db.climatedata</code> table reference
     */
    public Climatedata() {
        this(DSL.name("climatedata"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<ClimatedataRecord, Integer> getIdentity() {
        return (Identity<ClimatedataRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<ClimatedataRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Climatedata.CLIMATEDATA, DSL.name("KEY_climatedata_PRIMARY"), new TableField[] { Climatedata.CLIMATEDATA.ID }, true);
    }

    @Override
    public Climatedata as(String alias) {
        return new Climatedata(DSL.name(alias), this);
    }

    @Override
    public Climatedata as(Name alias) {
        return new Climatedata(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Climatedata rename(String name) {
        return new Climatedata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Climatedata rename(Name name) {
        return new Climatedata(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, Integer, Integer, Double, Integer, Timestamp, String, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
    // @formatter:on
}
