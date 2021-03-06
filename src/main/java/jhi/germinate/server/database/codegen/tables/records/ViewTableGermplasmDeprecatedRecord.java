/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.tables.ViewTableGermplasmDeprecated;

import org.jooq.impl.TableRecordImpl;


// @formatter:off
/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableGermplasmDeprecatedRecord extends TableRecordImpl<ViewTableGermplasmDeprecatedRecord> {

    private static final long serialVersionUID = 931850170;

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.germplasm_name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public void setGermplasmName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.germplasm_name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public String getGermplasmName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.germplasm_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setGermplasmId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.germplasm_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getGermplasmId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.germplasm_gid</code>. A unique identifier.
     */
    public void setGermplasmGid(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.germplasm_gid</code>. A unique identifier.
     */
    public String getGermplasmGid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.germplasm_number</code>. This is the unique identifier for accessions within a genebank, and is assigned when a sample is
entered into the genebank collection (e.g. ‘PI 113869’).
     */
    public void setGermplasmNumber(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.germplasm_number</code>. This is the unique identifier for accessions within a genebank, and is assigned when a sample is
entered into the genebank collection (e.g. ‘PI 113869’).
     */
    public String getGermplasmNumber() {
        return (String) get(3);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.germplasm_puid</code>. Any persistent, unique identifier assigned to the accession so it can be unambiguously referenced at the global level and the information associated with it harvested through automated means. Report one PUID for each accession.
     */
    public void setGermplasmPuid(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.germplasm_puid</code>. Any persistent, unique identifier assigned to the accession so it can be unambiguously referenced at the global level and the information associated with it harvested through automated means. Report one PUID for each accession.
     */
    public String getGermplasmPuid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.entity_type_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setEntityTypeId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.entity_type_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getEntityTypeId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.entity_type_name</code>. The name of the entity type.
     */
    public void setEntityTypeName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.entity_type_name</code>. The name of the entity type.
     */
    public String getEntityTypeName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.entity_parent_id</code>. Foreign key to germinatebase (germinatebase.id).
     */
    public void setEntityParentId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.entity_parent_id</code>. Foreign key to germinatebase (germinatebase.id).
     */
    public Integer getEntityParentId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.entity_parent_name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public void setEntityParentName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.entity_parent_name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public String getEntityParentName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.entity_parent_general_identifier</code>. A unique identifier.
     */
    public void setEntityParentGeneralIdentifier(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.entity_parent_general_identifier</code>. A unique identifier.
     */
    public String getEntityParentGeneralIdentifier() {
        return (String) get(9);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.biological_status_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setBiologicalStatusId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.biological_status_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getBiologicalStatusId() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.biological_status_name</code>. Previoulsy known as sampstat.
     */
    public void setBiologicalStatusName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.biological_status_name</code>. Previoulsy known as sampstat.
     */
    public String getBiologicalStatusName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.synonyms</code>. The synonyms as a json array.
     */
    public void setSynonyms(String... value) {
        set(12, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.synonyms</code>. The synonyms as a json array.
     */
    public String[] getSynonyms() {
        return (String[]) get(12);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.collector_number</code>. Original identifier assigned by the collector(s) of the sample, normally composed of the name or
initials of the collector(s) followed by a number (e.g. ‘FM9909’). This identifier is essential for
identifying duplicates held in different collections.
     */
    public void setCollectorNumber(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.collector_number</code>. Original identifier assigned by the collector(s) of the sample, normally composed of the name or
initials of the collector(s) followed by a number (e.g. ‘FM9909’). This identifier is essential for
identifying duplicates held in different collections.
     */
    public String getCollectorNumber() {
        return (String) get(13);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.genus</code>. Genus name for the species.
     */
    public void setGenus(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.genus</code>. Genus name for the species.
     */
    public String getGenus() {
        return (String) get(14);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.species</code>. Species name in lowercase.
     */
    public void setSpecies(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.species</code>. Species name in lowercase.
     */
    public String getSpecies() {
        return (String) get(15);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.subtaxa</code>. Subtaxa name.
     */
    public void setSubtaxa(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.subtaxa</code>. Subtaxa name.
     */
    public String getSubtaxa() {
        return (String) get(16);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.institution_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setInstitutionId(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.institution_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getInstitutionId() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.institution_name</code>. The institute name.
     */
    public void setInstitutionName(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.institution_name</code>. The institute name.
     */
    public String getInstitutionName() {
        return (String) get(18);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.location</code>. The site name where the location is.
     */
    public void setLocation(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.location</code>. The site name where the location is.
     */
    public String getLocation() {
        return (String) get(19);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.latitude</code>. Latitude of the location.
     */
    public void setLatitude(BigDecimal value) {
        set(20, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.latitude</code>. Latitude of the location.
     */
    public BigDecimal getLatitude() {
        return (BigDecimal) get(20);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.longitude</code>. Longitude of the location.
     */
    public void setLongitude(BigDecimal value) {
        set(21, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.longitude</code>. Longitude of the location.
     */
    public BigDecimal getLongitude() {
        return (BigDecimal) get(21);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.elevation</code>. The elevation of the site in metres.
     */
    public void setElevation(BigDecimal value) {
        set(22, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.elevation</code>. The elevation of the site in metres.
     */
    public BigDecimal getElevation() {
        return (BigDecimal) get(22);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.country_name</code>. Country name.
     */
    public void setCountryName(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.country_name</code>. Country name.
     */
    public String getCountryName() {
        return (String) get(23);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.country_code</code>. ISO 2 Code for country.
     */
    public void setCountryCode(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.country_code</code>. ISO 2 Code for country.
     */
    public String getCountryCode() {
        return (String) get(24);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.coll_date</code>. Collecting date of the sample, where YYYY is the year, MM is the month and DD is the day.
Missing data (MM or DD) should be indicated with hyphens or ‘00’ [double zero]. 
     */
    public void setCollDate(Date value) {
        set(25, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.coll_date</code>. Collecting date of the sample, where YYYY is the year, MM is the month and DD is the day.
Missing data (MM or DD) should be indicated with hyphens or ‘00’ [double zero]. 
     */
    public Date getCollDate() {
        return (Date) get(25);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.pdci</code>. Passport Data Completeness Index. This is calculated by Germinate. Manual editing of this field will be overwritten.
     */
    public void setPdci(Double value) {
        set(26, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.pdci</code>. Passport Data Completeness Index. This is calculated by Germinate. Manual editing of this field will be overwritten.
     */
    public Double getPdci() {
        return (Double) get(26);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.image_count</code>.
     */
    public void setImageCount(Long value) {
        set(27, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.image_count</code>.
     */
    public Long getImageCount() {
        return (Long) get(27);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.first_image_path</code>.
     */
    public void setFirstImagePath(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.first_image_path</code>.
     */
    public String getFirstImagePath() {
        return (String) get(28);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.has_trials_data</code>.
     */
    public void setHasTrialsData(Integer value) {
        set(29, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.has_trials_data</code>.
     */
    public Integer getHasTrialsData() {
        return (Integer) get(29);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.has_genotypic_data</code>.
     */
    public void setHasGenotypicData(Integer value) {
        set(30, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.has_genotypic_data</code>.
     */
    public Integer getHasGenotypicData() {
        return (Integer) get(30);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.has_allelefreq_data</code>.
     */
    public void setHasAllelefreqData(Integer value) {
        set(31, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.has_allelefreq_data</code>.
     */
    public Integer getHasAllelefreqData() {
        return (Integer) get(31);
    }

    /**
     * Setter for <code>germinate_db.view_table_germplasm_deprecated.has_compound_data</code>.
     */
    public void setHasCompoundData(Integer value) {
        set(32, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_germplasm_deprecated.has_compound_data</code>.
     */
    public Integer getHasCompoundData() {
        return (Integer) get(32);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewTableGermplasmDeprecatedRecord
     */
    public ViewTableGermplasmDeprecatedRecord() {
        super(ViewTableGermplasmDeprecated.VIEW_TABLE_GERMPLASM_DEPRECATED);
    }

    /**
     * Create a detached, initialised ViewTableGermplasmDeprecatedRecord
     */
    public ViewTableGermplasmDeprecatedRecord(String germplasmName, Integer germplasmId, String germplasmGid, String germplasmNumber, String germplasmPuid, Integer entityTypeId, String entityTypeName, Integer entityParentId, String entityParentName, String entityParentGeneralIdentifier, Integer biologicalStatusId, String biologicalStatusName, String[] synonyms, String collectorNumber, String genus, String species, String subtaxa, Integer institutionId, String institutionName, String location, BigDecimal latitude, BigDecimal longitude, BigDecimal elevation, String countryName, String countryCode, Date collDate, Double pdci, Long imageCount, String firstImagePath, Integer hasTrialsData, Integer hasGenotypicData, Integer hasAllelefreqData, Integer hasCompoundData) {
        super(ViewTableGermplasmDeprecated.VIEW_TABLE_GERMPLASM_DEPRECATED);

        set(0, germplasmName);
        set(1, germplasmId);
        set(2, germplasmGid);
        set(3, germplasmNumber);
        set(4, germplasmPuid);
        set(5, entityTypeId);
        set(6, entityTypeName);
        set(7, entityParentId);
        set(8, entityParentName);
        set(9, entityParentGeneralIdentifier);
        set(10, biologicalStatusId);
        set(11, biologicalStatusName);
        set(12, synonyms);
        set(13, collectorNumber);
        set(14, genus);
        set(15, species);
        set(16, subtaxa);
        set(17, institutionId);
        set(18, institutionName);
        set(19, location);
        set(20, latitude);
        set(21, longitude);
        set(22, elevation);
        set(23, countryName);
        set(24, countryCode);
        set(25, collDate);
        set(26, pdci);
        set(27, imageCount);
        set(28, firstImagePath);
        set(29, hasTrialsData);
        set(30, hasGenotypicData);
        set(31, hasAllelefreqData);
        set(32, hasCompoundData);
    }
// @formatter:on
}
