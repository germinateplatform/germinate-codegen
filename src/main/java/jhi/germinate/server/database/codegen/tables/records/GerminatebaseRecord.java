/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.tables.Germinatebase;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * Germinatebase is the Germinate base table which contains passport and other 
 * germplasm definition data.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GerminatebaseRecord extends UpdatableRecordImpl<GerminatebaseRecord> {

    private static final long serialVersionUID = 1617108749;

    /**
     * Setter for <code>germinate_db.germinatebase.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.general_identifier</code>. A unique identifier.
     */
    public void setGeneralIdentifier(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.general_identifier</code>. A unique identifier.
     */
    public String getGeneralIdentifier() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.number</code>. This is the unique identifier for accessions within a genebank, and is assigned when a sample is
entered into the genebank collection (e.g. ‘PI 113869’).
     */
    public void setNumber(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.number</code>. This is the unique identifier for accessions within a genebank, and is assigned when a sample is
entered into the genebank collection (e.g. ‘PI 113869’).
     */
    public String getNumber() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.bank_number</code>. Alternative genebank number.
     */
    public void setBankNumber(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.bank_number</code>. Alternative genebank number.
     */
    public String getBankNumber() {
        return (String) get(4);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.breeders_code</code>. FAO WIEWS code of the institute that has bred the material. If the holding institute has bred the material, the breeding institute code (BREDCODE) should be the same as the holding institute code (INSTCODE). Follows INSTCODE standard. Multiple values are separated by a semicolon without space.
     */
    public void setBreedersCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.breeders_code</code>. FAO WIEWS code of the institute that has bred the material. If the holding institute has bred the material, the breeding institute code (BREDCODE) should be the same as the holding institute code (INSTCODE). Follows INSTCODE standard. Multiple values are separated by a semicolon without space.
     */
    public String getBreedersCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.breeders_name</code>. Name of the institute (or person) that bred the material. This descriptor should be used only if BREDCODE cannot be filled because the FAO WIEWS code for this institute is not available. Multiple names are separated by a semicolon without space.
     */
    public void setBreedersName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.breeders_name</code>. Name of the institute (or person) that bred the material. This descriptor should be used only if BREDCODE cannot be filled because the FAO WIEWS code for this institute is not available. Multiple names are separated by a semicolon without space.
     */
    public String getBreedersName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.taxonomy_id</code>. Foreign key to taxonomies (taxonomies.id).
     */
    public void setTaxonomyId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.taxonomy_id</code>. Foreign key to taxonomies (taxonomies.id).
     */
    public Integer getTaxonomyId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.institution_id</code>. Foreign key to institutions (institutions.id).
     */
    public void setInstitutionId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.institution_id</code>. Foreign key to institutions (institutions.id).
     */
    public Integer getInstitutionId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.plant_passport</code>. Record if the entry has a plant passport.
     */
    public void setPlantPassport(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.plant_passport</code>. Record if the entry has a plant passport.
     */
    public String getPlantPassport() {
        return (String) get(9);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.donor_code</code>. FAO WIEWS code of the donor institute. Follows INSTCODE standard.
     */
    public void setDonorCode(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.donor_code</code>. FAO WIEWS code of the donor institute. Follows INSTCODE standard.
     */
    public String getDonorCode() {
        return (String) get(10);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.donor_name</code>. Name of the donor institute (or person). This descriptor should be used only if DONORCODE cannot be filled because the FAO WIEWS code for this institute is not available.
     */
    public void setDonorName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.donor_name</code>. Name of the donor institute (or person). This descriptor should be used only if DONORCODE cannot be filled because the FAO WIEWS code for this institute is not available.
     */
    public String getDonorName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.donor_number</code>. Identifier assigned to an accession by the donor. Follows ACCENUMB standard.
     */
    public void setDonorNumber(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.donor_number</code>. Identifier assigned to an accession by the donor. Follows ACCENUMB standard.
     */
    public String getDonorNumber() {
        return (String) get(12);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.acqdate</code>. Date on which the accession entered the collection where YYYY is the year, MM is the month and
DD is the day. Missing data (MM or DD) should be indicated with hyphens or ‘00’ [double zero].
     */
    public void setAcqdate(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.acqdate</code>. Date on which the accession entered the collection where YYYY is the year, MM is the month and
DD is the day. Missing data (MM or DD) should be indicated with hyphens or ‘00’ [double zero].
     */
    public String getAcqdate() {
        return (String) get(13);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.collnumb</code>. Original identifier assigned by the collector(s) of the sample, normally composed of the name or
initials of the collector(s) followed by a number (e.g. ‘FM9909’). This identifier is essential for
identifying duplicates held in different collections.
     */
    public void setCollnumb(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.collnumb</code>. Original identifier assigned by the collector(s) of the sample, normally composed of the name or
initials of the collector(s) followed by a number (e.g. ‘FM9909’). This identifier is essential for
identifying duplicates held in different collections.
     */
    public String getCollnumb() {
        return (String) get(14);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.colldate</code>. Collecting date of the sample, where YYYY is the year, MM is the month and DD is the day.
Missing data (MM or DD) should be indicated with hyphens or ‘00’ [double zero]. 
     */
    public void setColldate(Date value) {
        set(15, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.colldate</code>. Collecting date of the sample, where YYYY is the year, MM is the month and DD is the day.
Missing data (MM or DD) should be indicated with hyphens or ‘00’ [double zero]. 
     */
    public Date getColldate() {
        return (Date) get(15);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.collcode</code>. FAO WIEWS code of the institute collecting the sample. If the holding institute has collected the
material, the collecting institute code (COLLCODE) should be the same as the holding institute
code (INSTCODE). Follows INSTCODE standard. Multiple values are separated by a semicolon
without space.
     */
    public void setCollcode(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.collcode</code>. FAO WIEWS code of the institute collecting the sample. If the holding institute has collected the
material, the collecting institute code (COLLCODE) should be the same as the holding institute
code (INSTCODE). Follows INSTCODE standard. Multiple values are separated by a semicolon
without space.
     */
    public String getCollcode() {
        return (String) get(16);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.collname</code>. Name of the institute collecting the sample. This descriptor should be used only if COLLCODE cannot be filled because the FAO WIEWS code for this institute is not available. Multiple values are separated by a semicolon without space.
     */
    public void setCollname(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.collname</code>. Name of the institute collecting the sample. This descriptor should be used only if COLLCODE cannot be filled because the FAO WIEWS code for this institute is not available. Multiple values are separated by a semicolon without space.
     */
    public String getCollname() {
        return (String) get(17);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.collmissid</code>. Identifier of the collecting mission used by the Collecting Institute (4 or 4.1) (e.g. 'CIATFOR-052', 'CN426').
     */
    public void setCollmissid(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.collmissid</code>. Identifier of the collecting mission used by the Collecting Institute (4 or 4.1) (e.g. 'CIATFOR-052', 'CN426').
     */
    public String getCollmissid() {
        return (String) get(18);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.othernumb</code>. Any other identifiers known to exist in other collections for this accession. Use the following format: INSTCODE:ACCENUMB;INSTCODE:identifier;… INSTCODE and identifier are separated by a colon without space. Pairs of INSTCODE and identifier are separated by a semicolon without space. When the institute is not known, the identifier should be preceded by a colon.
     */
    public void setOthernumb(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.othernumb</code>. Any other identifiers known to exist in other collections for this accession. Use the following format: INSTCODE:ACCENUMB;INSTCODE:identifier;… INSTCODE and identifier are separated by a colon without space. Pairs of INSTCODE and identifier are separated by a semicolon without space. When the institute is not known, the identifier should be preceded by a colon.
     */
    public String getOthernumb() {
        return (String) get(19);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.duplsite</code>. FAO WIEWS code of the institute(s) where a safety duplicate of the accession is maintained.
Multiple values are separated by a semicolon without space. Follows INSTCODE standard.
     */
    public void setDuplsite(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.duplsite</code>. FAO WIEWS code of the institute(s) where a safety duplicate of the accession is maintained.
Multiple values are separated by a semicolon without space. Follows INSTCODE standard.
     */
    public String getDuplsite() {
        return (String) get(20);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.duplinstname</code>. Name of the institute where a safety duplicate of the accession is maintained. Multiple values are separated by a semicolon without space.
     */
    public void setDuplinstname(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.duplinstname</code>. Name of the institute where a safety duplicate of the accession is maintained. Multiple values are separated by a semicolon without space.
     */
    public String getDuplinstname() {
        return (String) get(21);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.mlsstatus_id</code>. Foreign key to mlsstatus (mlsstatus.id).
     */
    public void setMlsstatusId(Integer value) {
        set(22, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.mlsstatus_id</code>. Foreign key to mlsstatus (mlsstatus.id).
     */
    public Integer getMlsstatusId() {
        return (Integer) get(22);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.puid</code>. Any persistent, unique identifier assigned to the accession so it can be unambiguously referenced at the global level and the information associated with it harvested through automated means. Report one PUID for each accession.
     */
    public void setPuid(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.puid</code>. Any persistent, unique identifier assigned to the accession so it can be unambiguously referenced at the global level and the information associated with it harvested through automated means. Report one PUID for each accession.
     */
    public String getPuid() {
        return (String) get(23);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.biologicalstatus_id</code>. Foreign key to biologicalstatus (biologicalstaus.id).
     */
    public void setBiologicalstatusId(Integer value) {
        set(24, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.biologicalstatus_id</code>. Foreign key to biologicalstatus (biologicalstaus.id).
     */
    public Integer getBiologicalstatusId() {
        return (Integer) get(24);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.collsrc_id</code>. Foreign key to collectionsources (collectionsources.id).
     */
    public void setCollsrcId(Integer value) {
        set(25, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.collsrc_id</code>. Foreign key to collectionsources (collectionsources.id).
     */
    public Integer getCollsrcId() {
        return (Integer) get(25);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.location_id</code>. Foreign key to locations (locations.id).
     */
    public void setLocationId(Integer value) {
        set(26, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.location_id</code>. Foreign key to locations (locations.id).
     */
    public Integer getLocationId() {
        return (Integer) get(26);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.entitytype_id</code>. Foreign key to entitytypes (entitytypes.id).
     */
    public void setEntitytypeId(Integer value) {
        set(27, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.entitytype_id</code>. Foreign key to entitytypes (entitytypes.id).
     */
    public Integer getEntitytypeId() {
        return (Integer) get(27);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.entityparent_id</code>. Foreign key to germinatebase (germinatebase.id).
     */
    public void setEntityparentId(Integer value) {
        set(28, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.entityparent_id</code>. Foreign key to germinatebase (germinatebase.id).
     */
    public Integer getEntityparentId() {
        return (Integer) get(28);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.pdci</code>. Passport Data Completeness Index. This is calculated by Germinate. Manual editing of this field will be overwritten.
     */
    public void setPdci(Double value) {
        set(29, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.pdci</code>. Passport Data Completeness Index. This is calculated by Germinate. Manual editing of this field will be overwritten.
     */
    public Double getPdci() {
        return (Double) get(29);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(30, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(30);
    }

    /**
     * Setter for <code>germinate_db.germinatebase.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(31, value);
    }

    /**
     * Getter for <code>germinate_db.germinatebase.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(31);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GerminatebaseRecord
     */
    public GerminatebaseRecord() {
        super(Germinatebase.GERMINATEBASE);
    }

    /**
     * Create a detached, initialised GerminatebaseRecord
     */
    public GerminatebaseRecord(Integer id, String generalIdentifier, String number, String name, String bankNumber, String breedersCode, String breedersName, Integer taxonomyId, Integer institutionId, String plantPassport, String donorCode, String donorName, String donorNumber, String acqdate, String collnumb, Date colldate, String collcode, String collname, String collmissid, String othernumb, String duplsite, String duplinstname, Integer mlsstatusId, String puid, Integer biologicalstatusId, Integer collsrcId, Integer locationId, Integer entitytypeId, Integer entityparentId, Double pdci, Timestamp createdOn, Timestamp updatedOn) {
        super(Germinatebase.GERMINATEBASE);

        set(0, id);
        set(1, generalIdentifier);
        set(2, number);
        set(3, name);
        set(4, bankNumber);
        set(5, breedersCode);
        set(6, breedersName);
        set(7, taxonomyId);
        set(8, institutionId);
        set(9, plantPassport);
        set(10, donorCode);
        set(11, donorName);
        set(12, donorNumber);
        set(13, acqdate);
        set(14, collnumb);
        set(15, colldate);
        set(16, collcode);
        set(17, collname);
        set(18, collmissid);
        set(19, othernumb);
        set(20, duplsite);
        set(21, duplinstname);
        set(22, mlsstatusId);
        set(23, puid);
        set(24, biologicalstatusId);
        set(25, collsrcId);
        set(26, locationId);
        set(27, entitytypeId);
        set(28, entityparentId);
        set(29, pdci);
        set(30, createdOn);
        set(31, updatedOn);
    }
// @formatter:on
}
