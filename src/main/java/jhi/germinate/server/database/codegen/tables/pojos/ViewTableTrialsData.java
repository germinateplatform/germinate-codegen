/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.pojo.TraitRestrictions;


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
public class ViewTableTrialsData implements Serializable {

    private static final long serialVersionUID = -1524528527;

    private Integer           germplasmId;
    private String            germplasmGid;
    private String            germplasmName;
    private String            entityParentName;
    private String            entityParentGeneralIdentifier;
    private String            entityType;
    private Integer           datasetId;
    private String            datasetName;
    private String            datasetDescription;
    private String            locationName;
    private String            countryName;
    private String            countryCode2;
    private Integer           traitId;
    private String            traitName;
    private String            traitNameShort;
    private TraitRestrictions traitRestrictions;
    private String            unitName;
    private String            treatment;
    private Timestamp         recordingDate;
    private String            traitValue;

    public ViewTableTrialsData() {}

    public ViewTableTrialsData(ViewTableTrialsData value) {
        this.germplasmId = value.germplasmId;
        this.germplasmGid = value.germplasmGid;
        this.germplasmName = value.germplasmName;
        this.entityParentName = value.entityParentName;
        this.entityParentGeneralIdentifier = value.entityParentGeneralIdentifier;
        this.entityType = value.entityType;
        this.datasetId = value.datasetId;
        this.datasetName = value.datasetName;
        this.datasetDescription = value.datasetDescription;
        this.locationName = value.locationName;
        this.countryName = value.countryName;
        this.countryCode2 = value.countryCode2;
        this.traitId = value.traitId;
        this.traitName = value.traitName;
        this.traitNameShort = value.traitNameShort;
        this.traitRestrictions = value.traitRestrictions;
        this.unitName = value.unitName;
        this.treatment = value.treatment;
        this.recordingDate = value.recordingDate;
        this.traitValue = value.traitValue;
    }

    public ViewTableTrialsData(
        Integer           germplasmId,
        String            germplasmGid,
        String            germplasmName,
        String            entityParentName,
        String            entityParentGeneralIdentifier,
        String            entityType,
        Integer           datasetId,
        String            datasetName,
        String            datasetDescription,
        String            locationName,
        String            countryName,
        String            countryCode2,
        Integer           traitId,
        String            traitName,
        String            traitNameShort,
        TraitRestrictions traitRestrictions,
        String            unitName,
        String            treatment,
        Timestamp         recordingDate,
        String            traitValue
    ) {
        this.germplasmId = germplasmId;
        this.germplasmGid = germplasmGid;
        this.germplasmName = germplasmName;
        this.entityParentName = entityParentName;
        this.entityParentGeneralIdentifier = entityParentGeneralIdentifier;
        this.entityType = entityType;
        this.datasetId = datasetId;
        this.datasetName = datasetName;
        this.datasetDescription = datasetDescription;
        this.locationName = locationName;
        this.countryName = countryName;
        this.countryCode2 = countryCode2;
        this.traitId = traitId;
        this.traitName = traitName;
        this.traitNameShort = traitNameShort;
        this.traitRestrictions = traitRestrictions;
        this.unitName = unitName;
        this.treatment = treatment;
        this.recordingDate = recordingDate;
        this.traitValue = traitValue;
    }

    public Integer getGermplasmId() {
        return this.germplasmId;
    }

    public void setGermplasmId(Integer germplasmId) {
        this.germplasmId = germplasmId;
    }

    public String getGermplasmGid() {
        return this.germplasmGid;
    }

    public void setGermplasmGid(String germplasmGid) {
        this.germplasmGid = germplasmGid;
    }

    public String getGermplasmName() {
        return this.germplasmName;
    }

    public void setGermplasmName(String germplasmName) {
        this.germplasmName = germplasmName;
    }

    public String getEntityParentName() {
        return this.entityParentName;
    }

    public void setEntityParentName(String entityParentName) {
        this.entityParentName = entityParentName;
    }

    public String getEntityParentGeneralIdentifier() {
        return this.entityParentGeneralIdentifier;
    }

    public void setEntityParentGeneralIdentifier(String entityParentGeneralIdentifier) {
        this.entityParentGeneralIdentifier = entityParentGeneralIdentifier;
    }

    public String getEntityType() {
        return this.entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public Integer getDatasetId() {
        return this.datasetId;
    }

    public void setDatasetId(Integer datasetId) {
        this.datasetId = datasetId;
    }

    public String getDatasetName() {
        return this.datasetName;
    }

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    public String getDatasetDescription() {
        return this.datasetDescription;
    }

    public void setDatasetDescription(String datasetDescription) {
        this.datasetDescription = datasetDescription;
    }

    public String getLocationName() {
        return this.locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode2() {
        return this.countryCode2;
    }

    public void setCountryCode2(String countryCode2) {
        this.countryCode2 = countryCode2;
    }

    public Integer getTraitId() {
        return this.traitId;
    }

    public void setTraitId(Integer traitId) {
        this.traitId = traitId;
    }

    public String getTraitName() {
        return this.traitName;
    }

    public void setTraitName(String traitName) {
        this.traitName = traitName;
    }

    public String getTraitNameShort() {
        return this.traitNameShort;
    }

    public void setTraitNameShort(String traitNameShort) {
        this.traitNameShort = traitNameShort;
    }

    public TraitRestrictions getTraitRestrictions() {
        return this.traitRestrictions;
    }

    public void setTraitRestrictions(TraitRestrictions traitRestrictions) {
        this.traitRestrictions = traitRestrictions;
    }

    public String getUnitName() {
        return this.unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getTreatment() {
        return this.treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public Timestamp getRecordingDate() {
        return this.recordingDate;
    }

    public void setRecordingDate(Timestamp recordingDate) {
        this.recordingDate = recordingDate;
    }

    public String getTraitValue() {
        return this.traitValue;
    }

    public void setTraitValue(String traitValue) {
        this.traitValue = traitValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTableTrialsData (");

        sb.append(germplasmId);
        sb.append(", ").append(germplasmGid);
        sb.append(", ").append(germplasmName);
        sb.append(", ").append(entityParentName);
        sb.append(", ").append(entityParentGeneralIdentifier);
        sb.append(", ").append(entityType);
        sb.append(", ").append(datasetId);
        sb.append(", ").append(datasetName);
        sb.append(", ").append(datasetDescription);
        sb.append(", ").append(locationName);
        sb.append(", ").append(countryName);
        sb.append(", ").append(countryCode2);
        sb.append(", ").append(traitId);
        sb.append(", ").append(traitName);
        sb.append(", ").append(traitNameShort);
        sb.append(", ").append(traitRestrictions);
        sb.append(", ").append(unitName);
        sb.append(", ").append(treatment);
        sb.append(", ").append(recordingDate);
        sb.append(", ").append(traitValue);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
