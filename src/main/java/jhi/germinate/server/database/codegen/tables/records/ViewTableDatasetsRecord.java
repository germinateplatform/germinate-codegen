/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import com.google.gson.JsonArray;

import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.tables.ViewTableDatasets;
import jhi.germinate.server.database.codegen.tables.pojos.ViewTableLocations;
import jhi.germinate.server.database.pojo.DublinCore;

import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


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
public class ViewTableDatasetsRecord extends TableRecordImpl<ViewTableDatasetsRecord> {

    private static final long serialVersionUID = -2143890803;

    /**
     * Setter for <code>germinate_db.view_table_datasets.dataset_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setDatasetId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.dataset_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getDatasetId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.dataset_name</code>. Describes the dataset.
     */
    public void setDatasetName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.dataset_name</code>. Describes the dataset.
     */
    public String getDatasetName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.dataset_description</code>. The name of this dataset.
     */
    public void setDatasetDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.dataset_description</code>. The name of this dataset.
     */
    public String getDatasetDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.hyperlink</code>. Link to access the external dasets.
     */
    public void setHyperlink(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.hyperlink</code>. Link to access the external dasets.
     */
    public String getHyperlink() {
        return (String) get(3);
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.source_file</code>.
     */
    public void setSourceFile(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.source_file</code>.
     */
    public String getSourceFile() {
        return (String) get(4);
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.version</code>. Dataset version if this exists.
     */
    public void setVersion(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.version</code>. Dataset version if this exists.
     */
    public String getVersion() {
        return (String) get(5);
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.dataset_type</code>. Describes the experiment type.
     */
    public void setDatasetType(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.dataset_type</code>. Describes the experiment type.
     */
    public String getDatasetType() {
        return (String) get(6);
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.experiment_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setExperimentId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.experiment_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getExperimentId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.experiment_name</code>. The name of the experiment.
     */
    public void setExperimentName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.experiment_name</code>. The name of the experiment.
     */
    public String getExperimentName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.experiment_description</code>. Describes the experiment.
     */
    public void setExperimentDescription(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.experiment_description</code>. Describes the experiment.
     */
    public String getExperimentDescription() {
        return (String) get(9);
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.datatype</code>. A description of the data type of the contained data. Examples might be: "raw data", "BLUPs", etc.
     */
    public void setDatatype(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.datatype</code>. A description of the data type of the contained data. Examples might be: "raw data", "BLUPs", etc.
     */
    public String getDatatype() {
        return (String) get(10);
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.dataset_state</code>. Defines the datasetstate.
     */
    public void setDatasetState(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.dataset_state</code>. Defines the datasetstate.
     */
    public String getDatasetState() {
        return (String) get(11);
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.locations</code>.
     */
    public void setLocations(ViewTableLocations... value) {
        set(12, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.locations</code>.
     */
    public ViewTableLocations[] getLocations() {
        return (ViewTableLocations[]) get(12);
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.license_id</code>.
     */
    public void setLicenseId(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.license_id</code>.
     */
    public Integer getLicenseId() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.license_name</code>.
     */
    public void setLicenseName(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.license_name</code>.
     */
    public String getLicenseName() {
        return (String) get(14);
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.contact</code>. The contact to get more information about this dataset.
     */
    public void setContact(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.contact</code>. The contact to get more information about this dataset.
     */
    public String getContact() {
        return (String) get(15);
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.start_date</code>. Date that the dataset was generated.
     */
    public void setStartDate(Date value) {
        set(16, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.start_date</code>. Date that the dataset was generated.
     */
    public Date getStartDate() {
        return (Date) get(16);
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.end_date</code>. Date at which the dataset recording ended.
     */
    public void setEndDate(Date value) {
        set(17, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.end_date</code>. Date at which the dataset recording ended.
     */
    public Date getEndDate() {
        return (Date) get(17);
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.dublin_core</code>.
     */
    public void setDublinCore(DublinCore value) {
        set(18, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.dublin_core</code>.
     */
    public DublinCore getDublinCore() {
        return (DublinCore) get(18);
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.created_on</code>. When the record was created.

     */
    public void setCreatedOn(Timestamp value) {
        set(19, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.created_on</code>. When the record was created.

     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(19);
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(20, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(20);
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.data_object_count</code>. The number of data objects contained in this dataset.
     */
    public void setDataObjectCount(ULong value) {
        set(21, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.data_object_count</code>. The number of data objects contained in this dataset.
     */
    public ULong getDataObjectCount() {
        return (ULong) get(21);
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.data_point_count</code>. The number of individual data points contained in this dataset.
     */
    public void setDataPointCount(ULong value) {
        set(22, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.data_point_count</code>. The number of individual data points contained in this dataset.
     */
    public ULong getDataPointCount() {
        return (ULong) get(22);
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.is_external</code>. Defines if the dataset is contained within Germinate or from an external source and not stored in the database.
     */
    public void setIsExternal(Boolean value) {
        set(23, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.is_external</code>. Defines if the dataset is contained within Germinate or from an external source and not stored in the database.
     */
    public Boolean getIsExternal() {
        return (Boolean) get(23);
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.collaborators</code>.
     */
    public void setCollaborators(Long value) {
        set(24, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.collaborators</code>.
     */
    public Long getCollaborators() {
        return (Long) get(24);
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.attributes</code>.
     */
    public void setAttributes(Long value) {
        set(25, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.attributes</code>.
     */
    public Long getAttributes() {
        return (Long) get(25);
    }

    /**
     * Setter for <code>germinate_db.view_table_datasets.accepted_by</code>.
     */
    public void setAcceptedBy(JsonArray value) {
        set(26, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_datasets.accepted_by</code>.
     */
    public JsonArray getAcceptedBy() {
        return (JsonArray) get(26);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewTableDatasetsRecord
     */
    public ViewTableDatasetsRecord() {
        super(ViewTableDatasets.VIEW_TABLE_DATASETS);
    }

    /**
     * Create a detached, initialised ViewTableDatasetsRecord
     */
    public ViewTableDatasetsRecord(Integer datasetId, String datasetName, String datasetDescription, String hyperlink, String sourceFile, String version, String datasetType, Integer experimentId, String experimentName, String experimentDescription, String datatype, String datasetState, ViewTableLocations[] locations, Integer licenseId, String licenseName, String contact, Date startDate, Date endDate, DublinCore dublinCore, Timestamp createdOn, Timestamp updatedOn, ULong dataObjectCount, ULong dataPointCount, Boolean isExternal, Long collaborators, Long attributes, JsonArray acceptedBy) {
        super(ViewTableDatasets.VIEW_TABLE_DATASETS);

        set(0, datasetId);
        set(1, datasetName);
        set(2, datasetDescription);
        set(3, hyperlink);
        set(4, sourceFile);
        set(5, version);
        set(6, datasetType);
        set(7, experimentId);
        set(8, experimentName);
        set(9, experimentDescription);
        set(10, datatype);
        set(11, datasetState);
        set(12, locations);
        set(13, licenseId);
        set(14, licenseName);
        set(15, contact);
        set(16, startDate);
        set(17, endDate);
        set(18, dublinCore);
        set(19, createdOn);
        set(20, updatedOn);
        set(21, dataObjectCount);
        set(22, dataPointCount);
        set(23, isExternal);
        set(24, collaborators);
        set(25, attributes);
        set(26, acceptedBy);
    }
// @formatter:on
}
