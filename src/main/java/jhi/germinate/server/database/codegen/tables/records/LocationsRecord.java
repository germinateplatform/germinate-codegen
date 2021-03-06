/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.tables.Locations;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * Describes locations. Locations can be collecting sites or the location 
 * of any geographical feature such as research institutes or lab locations.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LocationsRecord extends UpdatableRecordImpl<LocationsRecord> implements Record15<Integer, Integer, Integer, String, String, String, String, BigDecimal, BigDecimal, BigDecimal, Integer, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -2039150604;

    /**
     * Setter for <code>germinate_db.locations.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.locations.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.locations.locationtype_id</code>. Foreign key to locations (locations.id).
     */
    public void setLocationtypeId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.locations.locationtype_id</code>. Foreign key to locations (locations.id).
     */
    public Integer getLocationtypeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>germinate_db.locations.country_id</code>. Foreign key to countries (countries.id).
     */
    public void setCountryId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.locations.country_id</code>. Foreign key to countries (countries.id).
     */
    public Integer getCountryId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>germinate_db.locations.state</code>. The state where the location is if this exists.
     */
    public void setState(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.locations.state</code>. The state where the location is if this exists.
     */
    public String getState() {
        return (String) get(3);
    }

    /**
     * Setter for <code>germinate_db.locations.region</code>. The region where the location is if this exists.
     */
    public void setRegion(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.locations.region</code>. The region where the location is if this exists.
     */
    public String getRegion() {
        return (String) get(4);
    }

    /**
     * Setter for <code>germinate_db.locations.site_name</code>. The site name where the location is.
     */
    public void setSiteName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.locations.site_name</code>. The site name where the location is.
     */
    public String getSiteName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>germinate_db.locations.site_name_short</code>. Shortened site name which can be used in tables within Germinate.
     */
    public void setSiteNameShort(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_db.locations.site_name_short</code>. Shortened site name which can be used in tables within Germinate.
     */
    public String getSiteNameShort() {
        return (String) get(6);
    }

    /**
     * Setter for <code>germinate_db.locations.elevation</code>. The elevation of the site in metres.
     */
    public void setElevation(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_db.locations.elevation</code>. The elevation of the site in metres.
     */
    public BigDecimal getElevation() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>germinate_db.locations.latitude</code>. Latitude of the location.
     */
    public void setLatitude(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_db.locations.latitude</code>. Latitude of the location.
     */
    public BigDecimal getLatitude() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>germinate_db.locations.longitude</code>. Longitude of the location.
     */
    public void setLongitude(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>germinate_db.locations.longitude</code>. Longitude of the location.
     */
    public BigDecimal getLongitude() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>germinate_db.locations.coordinate_uncertainty</code>. Uncertainty associated with the coordinates in metres. Leave the value empty if the uncertainty is unknown. 
     */
    public void setCoordinateUncertainty(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>germinate_db.locations.coordinate_uncertainty</code>. Uncertainty associated with the coordinates in metres. Leave the value empty if the uncertainty is unknown. 
     */
    public Integer getCoordinateUncertainty() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>germinate_db.locations.coordinate_datum</code>. The geodetic datum or spatial reference system upon which the coordinates given in decimal latitude and decimal longitude are based (e.g. WGS84, ETRS89, NAD83). The GPS uses the WGS84 datum.
     */
    public void setCoordinateDatum(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>germinate_db.locations.coordinate_datum</code>. The geodetic datum or spatial reference system upon which the coordinates given in decimal latitude and decimal longitude are based (e.g. WGS84, ETRS89, NAD83). The GPS uses the WGS84 datum.
     */
    public String getCoordinateDatum() {
        return (String) get(11);
    }

    /**
     * Setter for <code>germinate_db.locations.georeferencing_method</code>. The georeferencing method used (GPS, determined from map, gazetteer, or estimated using software). Leave the value empty if georeferencing method is not known.
     */
    public void setGeoreferencingMethod(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>germinate_db.locations.georeferencing_method</code>. The georeferencing method used (GPS, determined from map, gazetteer, or estimated using software). Leave the value empty if georeferencing method is not known.
     */
    public String getGeoreferencingMethod() {
        return (String) get(12);
    }

    /**
     * Setter for <code>germinate_db.locations.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>germinate_db.locations.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>germinate_db.locations.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(14, value);
    }

    /**
     * Getter for <code>germinate_db.locations.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(14);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, Integer, Integer, String, String, String, String, BigDecimal, BigDecimal, BigDecimal, Integer, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Integer, Integer, Integer, String, String, String, String, BigDecimal, BigDecimal, BigDecimal, Integer, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Locations.LOCATIONS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Locations.LOCATIONS.LOCATIONTYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Locations.LOCATIONS.COUNTRY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Locations.LOCATIONS.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Locations.LOCATIONS.REGION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Locations.LOCATIONS.SITE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Locations.LOCATIONS.SITE_NAME_SHORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return Locations.LOCATIONS.ELEVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return Locations.LOCATIONS.LATITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return Locations.LOCATIONS.LONGITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return Locations.LOCATIONS.COORDINATE_UNCERTAINTY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Locations.LOCATIONS.COORDINATE_DATUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Locations.LOCATIONS.GEOREFERENCING_METHOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return Locations.LOCATIONS.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field15() {
        return Locations.LOCATIONS.UPDATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getLocationtypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getRegion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getSiteName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getSiteNameShort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getElevation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getCoordinateUncertainty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getCoordinateDatum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getGeoreferencingMethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component15() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getLocationtypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getRegion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getSiteName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSiteNameShort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getElevation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getCoordinateUncertainty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getCoordinateDatum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getGeoreferencingMethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value15() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationsRecord value2(Integer value) {
        setLocationtypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationsRecord value3(Integer value) {
        setCountryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationsRecord value4(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationsRecord value5(String value) {
        setRegion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationsRecord value6(String value) {
        setSiteName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationsRecord value7(String value) {
        setSiteNameShort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationsRecord value8(BigDecimal value) {
        setElevation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationsRecord value9(BigDecimal value) {
        setLatitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationsRecord value10(BigDecimal value) {
        setLongitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationsRecord value11(Integer value) {
        setCoordinateUncertainty(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationsRecord value12(String value) {
        setCoordinateDatum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationsRecord value13(String value) {
        setGeoreferencingMethod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationsRecord value14(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationsRecord value15(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationsRecord values(Integer value1, Integer value2, Integer value3, String value4, String value5, String value6, String value7, BigDecimal value8, BigDecimal value9, BigDecimal value10, Integer value11, String value12, String value13, Timestamp value14, Timestamp value15) {
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
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LocationsRecord
     */
    public LocationsRecord() {
        super(Locations.LOCATIONS);
    }

    /**
     * Create a detached, initialised LocationsRecord
     */
    public LocationsRecord(Integer id, Integer locationtypeId, Integer countryId, String state, String region, String siteName, String siteNameShort, BigDecimal elevation, BigDecimal latitude, BigDecimal longitude, Integer coordinateUncertainty, String coordinateDatum, String georeferencingMethod, Timestamp createdOn, Timestamp updatedOn) {
        super(Locations.LOCATIONS);

        set(0, id);
        set(1, locationtypeId);
        set(2, countryId);
        set(3, state);
        set(4, region);
        set(5, siteName);
        set(6, siteNameShort);
        set(7, elevation);
        set(8, latitude);
        set(9, longitude);
        set(10, coordinateUncertainty);
        set(11, coordinateDatum);
        set(12, georeferencingMethod);
        set(13, createdOn);
        set(14, updatedOn);
    }
// @formatter:on
}
