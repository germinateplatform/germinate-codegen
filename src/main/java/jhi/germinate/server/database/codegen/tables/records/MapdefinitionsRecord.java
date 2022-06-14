/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.tables.Mapdefinitions;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * Relates genetic markers to a map and assigns a position (if known). Maps are
 * made up of lists of markers and positions (genetic or physiscal and
 * chromosome/linkage group assignation). In the case of QTL the
 * definition_start and definition_end columns can be used to specify a range
 * across a linkage group.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MapdefinitionsRecord extends UpdatableRecordImpl<MapdefinitionsRecord> implements Record10<Integer, Integer, Integer, Integer, Double, Double, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>germinate_db.mapdefinitions.id</code>. Primary id for
     * this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.mapdefinitions.id</code>. Primary id for
     * this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.mapdefinitions.mapfeaturetype_id</code>.
     * Foreign key to mapfeaturetypes (mapfeaturetypes.id).
     */
    public void setMapfeaturetypeId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.mapdefinitions.mapfeaturetype_id</code>.
     * Foreign key to mapfeaturetypes (mapfeaturetypes.id).
     */
    public Integer getMapfeaturetypeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>germinate_db.mapdefinitions.marker_id</code>. Foreign
     * key to markers (markers.id).
     */
    public void setMarkerId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.mapdefinitions.marker_id</code>. Foreign
     * key to markers (markers.id).
     */
    public Integer getMarkerId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>germinate_db.mapdefinitions.map_id</code>. Foreign key
     * to maps (maps.id).
     */
    public void setMapId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.mapdefinitions.map_id</code>. Foreign key
     * to maps (maps.id).
     */
    public Integer getMapId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>germinate_db.mapdefinitions.definition_start</code>.
     * Used if the markers location spans over an area more than a single point
     * on the maps. Determines the marker start location.
     */
    public void setDefinitionStart(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.mapdefinitions.definition_start</code>.
     * Used if the markers location spans over an area more than a single point
     * on the maps. Determines the marker start location.
     */
    public Double getDefinitionStart() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>germinate_db.mapdefinitions.definition_end</code>. Used
     * if the markers location spans over an area more than a single point on
     * the maps. Determines the marker end location.
     */
    public void setDefinitionEnd(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.mapdefinitions.definition_end</code>. Used
     * if the markers location spans over an area more than a single point on
     * the maps. Determines the marker end location.
     */
    public Double getDefinitionEnd() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>germinate_db.mapdefinitions.chromosome</code>. The
     * chromosome/linkage group that this marker is found on.
     */
    public void setChromosome(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_db.mapdefinitions.chromosome</code>. The
     * chromosome/linkage group that this marker is found on.
     */
    public String getChromosome() {
        return (String) get(6);
    }

    /**
     * Setter for <code>germinate_db.mapdefinitions.arm_impute</code>. If a
     * chromosome arm is available then this can be entered here.
     */
    public void setArmImpute(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_db.mapdefinitions.arm_impute</code>. If a
     * chromosome arm is available then this can be entered here.
     */
    public String getArmImpute() {
        return (String) get(7);
    }

    /**
     * Setter for <code>germinate_db.mapdefinitions.created_on</code>. When the
     * record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_db.mapdefinitions.created_on</code>. When the
     * record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>germinate_db.mapdefinitions.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>germinate_db.mapdefinitions.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, Integer, Integer, Integer, Double, Double, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Integer, Integer, Integer, Integer, Double, Double, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Mapdefinitions.MAPDEFINITIONS.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Mapdefinitions.MAPDEFINITIONS.MAPFEATURETYPE_ID;
    }

    @Override
    public Field<Integer> field3() {
        return Mapdefinitions.MAPDEFINITIONS.MARKER_ID;
    }

    @Override
    public Field<Integer> field4() {
        return Mapdefinitions.MAPDEFINITIONS.MAP_ID;
    }

    @Override
    public Field<Double> field5() {
        return Mapdefinitions.MAPDEFINITIONS.DEFINITION_START;
    }

    @Override
    public Field<Double> field6() {
        return Mapdefinitions.MAPDEFINITIONS.DEFINITION_END;
    }

    @Override
    public Field<String> field7() {
        return Mapdefinitions.MAPDEFINITIONS.CHROMOSOME;
    }

    @Override
    public Field<String> field8() {
        return Mapdefinitions.MAPDEFINITIONS.ARM_IMPUTE;
    }

    @Override
    public Field<Timestamp> field9() {
        return Mapdefinitions.MAPDEFINITIONS.CREATED_ON;
    }

    @Override
    public Field<Timestamp> field10() {
        return Mapdefinitions.MAPDEFINITIONS.UPDATED_ON;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getMapfeaturetypeId();
    }

    @Override
    public Integer component3() {
        return getMarkerId();
    }

    @Override
    public Integer component4() {
        return getMapId();
    }

    @Override
    public Double component5() {
        return getDefinitionStart();
    }

    @Override
    public Double component6() {
        return getDefinitionEnd();
    }

    @Override
    public String component7() {
        return getChromosome();
    }

    @Override
    public String component8() {
        return getArmImpute();
    }

    @Override
    public Timestamp component9() {
        return getCreatedOn();
    }

    @Override
    public Timestamp component10() {
        return getUpdatedOn();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getMapfeaturetypeId();
    }

    @Override
    public Integer value3() {
        return getMarkerId();
    }

    @Override
    public Integer value4() {
        return getMapId();
    }

    @Override
    public Double value5() {
        return getDefinitionStart();
    }

    @Override
    public Double value6() {
        return getDefinitionEnd();
    }

    @Override
    public String value7() {
        return getChromosome();
    }

    @Override
    public String value8() {
        return getArmImpute();
    }

    @Override
    public Timestamp value9() {
        return getCreatedOn();
    }

    @Override
    public Timestamp value10() {
        return getUpdatedOn();
    }

    @Override
    public MapdefinitionsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public MapdefinitionsRecord value2(Integer value) {
        setMapfeaturetypeId(value);
        return this;
    }

    @Override
    public MapdefinitionsRecord value3(Integer value) {
        setMarkerId(value);
        return this;
    }

    @Override
    public MapdefinitionsRecord value4(Integer value) {
        setMapId(value);
        return this;
    }

    @Override
    public MapdefinitionsRecord value5(Double value) {
        setDefinitionStart(value);
        return this;
    }

    @Override
    public MapdefinitionsRecord value6(Double value) {
        setDefinitionEnd(value);
        return this;
    }

    @Override
    public MapdefinitionsRecord value7(String value) {
        setChromosome(value);
        return this;
    }

    @Override
    public MapdefinitionsRecord value8(String value) {
        setArmImpute(value);
        return this;
    }

    @Override
    public MapdefinitionsRecord value9(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public MapdefinitionsRecord value10(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    @Override
    public MapdefinitionsRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Double value5, Double value6, String value7, String value8, Timestamp value9, Timestamp value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MapdefinitionsRecord
     */
    public MapdefinitionsRecord() {
        super(Mapdefinitions.MAPDEFINITIONS);
    }

    /**
     * Create a detached, initialised MapdefinitionsRecord
     */
    public MapdefinitionsRecord(Integer id, Integer mapfeaturetypeId, Integer markerId, Integer mapId, Double definitionStart, Double definitionEnd, String chromosome, String armImpute, Timestamp createdOn, Timestamp updatedOn) {
        super(Mapdefinitions.MAPDEFINITIONS);

        setId(id);
        setMapfeaturetypeId(mapfeaturetypeId);
        setMarkerId(markerId);
        setMapId(mapId);
        setDefinitionStart(definitionStart);
        setDefinitionEnd(definitionEnd);
        setChromosome(chromosome);
        setArmImpute(armImpute);
        setCreatedOn(createdOn);
        setUpdatedOn(updatedOn);
    }

    /**
     * Create a detached, initialised MapdefinitionsRecord
     */
    public MapdefinitionsRecord(jhi.germinate.server.database.codegen.tables.pojos.Mapdefinitions value) {
        super(Mapdefinitions.MAPDEFINITIONS);

        if (value != null) {
            setId(value.getId());
            setMapfeaturetypeId(value.getMapfeaturetypeId());
            setMarkerId(value.getMarkerId());
            setMapId(value.getMapId());
            setDefinitionStart(value.getDefinitionStart());
            setDefinitionEnd(value.getDefinitionEnd());
            setChromosome(value.getChromosome());
            setArmImpute(value.getArmImpute());
            setCreatedOn(value.getCreatedOn());
            setUpdatedOn(value.getUpdatedOn());
        }
    }
    // @formatter:on
}
