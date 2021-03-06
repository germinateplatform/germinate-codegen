/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.pojo.DublinCore;


// @formatter:off
/**
 * Datasets which are defined within Germinate although there can be external 
 * datasets which are links out to external data sources most will be held 
 * within Germinate.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Datasets implements Serializable {

    private static final long serialVersionUID = -1262017952;

    private Integer    id;
    private Integer    experimentId;
    private Integer    datasettypeId;
    private String     name;
    private String     description;
    private Date       dateStart;
    private Date       dateEnd;
    private String     sourceFile;
    private String     datatype;
    private DublinCore dublinCore;
    private String     version;
    private Integer    createdBy;
    private Integer    datasetStateId;
    private Integer    licenseId;
    private Boolean    isExternal;
    private String     hyperlink;
    private Timestamp  createdOn;
    private Timestamp  updatedOn;
    private String     contact;

    public Datasets() {}

    public Datasets(Datasets value) {
        this.id = value.id;
        this.experimentId = value.experimentId;
        this.datasettypeId = value.datasettypeId;
        this.name = value.name;
        this.description = value.description;
        this.dateStart = value.dateStart;
        this.dateEnd = value.dateEnd;
        this.sourceFile = value.sourceFile;
        this.datatype = value.datatype;
        this.dublinCore = value.dublinCore;
        this.version = value.version;
        this.createdBy = value.createdBy;
        this.datasetStateId = value.datasetStateId;
        this.licenseId = value.licenseId;
        this.isExternal = value.isExternal;
        this.hyperlink = value.hyperlink;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
        this.contact = value.contact;
    }

    public Datasets(
        Integer    id,
        Integer    experimentId,
        Integer    datasettypeId,
        String     name,
        String     description,
        Date       dateStart,
        Date       dateEnd,
        String     sourceFile,
        String     datatype,
        DublinCore dublinCore,
        String     version,
        Integer    createdBy,
        Integer    datasetStateId,
        Integer    licenseId,
        Boolean    isExternal,
        String     hyperlink,
        Timestamp  createdOn,
        Timestamp  updatedOn,
        String     contact
    ) {
        this.id = id;
        this.experimentId = experimentId;
        this.datasettypeId = datasettypeId;
        this.name = name;
        this.description = description;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.sourceFile = sourceFile;
        this.datatype = datatype;
        this.dublinCore = dublinCore;
        this.version = version;
        this.createdBy = createdBy;
        this.datasetStateId = datasetStateId;
        this.licenseId = licenseId;
        this.isExternal = isExternal;
        this.hyperlink = hyperlink;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.contact = contact;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getExperimentId() {
        return this.experimentId;
    }

    public void setExperimentId(Integer experimentId) {
        this.experimentId = experimentId;
    }

    public Integer getDatasettypeId() {
        return this.datasettypeId;
    }

    public void setDatasettypeId(Integer datasettypeId) {
        this.datasettypeId = datasettypeId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateStart() {
        return this.dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return this.dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getSourceFile() {
        return this.sourceFile;
    }

    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    public String getDatatype() {
        return this.datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public DublinCore getDublinCore() {
        return this.dublinCore;
    }

    public void setDublinCore(DublinCore dublinCore) {
        this.dublinCore = dublinCore;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getDatasetStateId() {
        return this.datasetStateId;
    }

    public void setDatasetStateId(Integer datasetStateId) {
        this.datasetStateId = datasetStateId;
    }

    public Integer getLicenseId() {
        return this.licenseId;
    }

    public void setLicenseId(Integer licenseId) {
        this.licenseId = licenseId;
    }

    public Boolean getIsExternal() {
        return this.isExternal;
    }

    public void setIsExternal(Boolean isExternal) {
        this.isExternal = isExternal;
    }

    public String getHyperlink() {
        return this.hyperlink;
    }

    public void setHyperlink(String hyperlink) {
        this.hyperlink = hyperlink;
    }

    public Timestamp getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public Timestamp getUpdatedOn() {
        return this.updatedOn;
    }

    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Datasets (");

        sb.append(id);
        sb.append(", ").append(experimentId);
        sb.append(", ").append(datasettypeId);
        sb.append(", ").append(name);
        sb.append(", ").append(description);
        sb.append(", ").append(dateStart);
        sb.append(", ").append(dateEnd);
        sb.append(", ").append(sourceFile);
        sb.append(", ").append(datatype);
        sb.append(", ").append(dublinCore);
        sb.append(", ").append(version);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(datasetStateId);
        sb.append(", ").append(licenseId);
        sb.append(", ").append(isExternal);
        sb.append(", ").append(hyperlink);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);
        sb.append(", ").append(contact);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
