/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class ViewTableCollaborators implements Serializable {

    private static final long serialVersionUID = 967575880;

    private Integer collaboratorId;
    private String  collaboratorFirstName;
    private String  collaboratorLastName;
    private String  collaboratorEmail;
    private String  collaboratorPhone;
    private Integer institutionId;
    private String  institutionName;
    private String  institutionAddress;
    private Integer datasetId;
    private Integer countryId;
    private String  countryName;
    private String  countryCode2;
    private String  countryCode3;

    public ViewTableCollaborators() {}

    public ViewTableCollaborators(ViewTableCollaborators value) {
        this.collaboratorId = value.collaboratorId;
        this.collaboratorFirstName = value.collaboratorFirstName;
        this.collaboratorLastName = value.collaboratorLastName;
        this.collaboratorEmail = value.collaboratorEmail;
        this.collaboratorPhone = value.collaboratorPhone;
        this.institutionId = value.institutionId;
        this.institutionName = value.institutionName;
        this.institutionAddress = value.institutionAddress;
        this.datasetId = value.datasetId;
        this.countryId = value.countryId;
        this.countryName = value.countryName;
        this.countryCode2 = value.countryCode2;
        this.countryCode3 = value.countryCode3;
    }

    public ViewTableCollaborators(
        Integer collaboratorId,
        String  collaboratorFirstName,
        String  collaboratorLastName,
        String  collaboratorEmail,
        String  collaboratorPhone,
        Integer institutionId,
        String  institutionName,
        String  institutionAddress,
        Integer datasetId,
        Integer countryId,
        String  countryName,
        String  countryCode2,
        String  countryCode3
    ) {
        this.collaboratorId = collaboratorId;
        this.collaboratorFirstName = collaboratorFirstName;
        this.collaboratorLastName = collaboratorLastName;
        this.collaboratorEmail = collaboratorEmail;
        this.collaboratorPhone = collaboratorPhone;
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.institutionAddress = institutionAddress;
        this.datasetId = datasetId;
        this.countryId = countryId;
        this.countryName = countryName;
        this.countryCode2 = countryCode2;
        this.countryCode3 = countryCode3;
    }

    public Integer getCollaboratorId() {
        return this.collaboratorId;
    }

    public void setCollaboratorId(Integer collaboratorId) {
        this.collaboratorId = collaboratorId;
    }

    public String getCollaboratorFirstName() {
        return this.collaboratorFirstName;
    }

    public void setCollaboratorFirstName(String collaboratorFirstName) {
        this.collaboratorFirstName = collaboratorFirstName;
    }

    public String getCollaboratorLastName() {
        return this.collaboratorLastName;
    }

    public void setCollaboratorLastName(String collaboratorLastName) {
        this.collaboratorLastName = collaboratorLastName;
    }

    public String getCollaboratorEmail() {
        return this.collaboratorEmail;
    }

    public void setCollaboratorEmail(String collaboratorEmail) {
        this.collaboratorEmail = collaboratorEmail;
    }

    public String getCollaboratorPhone() {
        return this.collaboratorPhone;
    }

    public void setCollaboratorPhone(String collaboratorPhone) {
        this.collaboratorPhone = collaboratorPhone;
    }

    public Integer getInstitutionId() {
        return this.institutionId;
    }

    public void setInstitutionId(Integer institutionId) {
        this.institutionId = institutionId;
    }

    public String getInstitutionName() {
        return this.institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getInstitutionAddress() {
        return this.institutionAddress;
    }

    public void setInstitutionAddress(String institutionAddress) {
        this.institutionAddress = institutionAddress;
    }

    public Integer getDatasetId() {
        return this.datasetId;
    }

    public void setDatasetId(Integer datasetId) {
        this.datasetId = datasetId;
    }

    public Integer getCountryId() {
        return this.countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
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

    public String getCountryCode3() {
        return this.countryCode3;
    }

    public void setCountryCode3(String countryCode3) {
        this.countryCode3 = countryCode3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTableCollaborators (");

        sb.append(collaboratorId);
        sb.append(", ").append(collaboratorFirstName);
        sb.append(", ").append(collaboratorLastName);
        sb.append(", ").append(collaboratorEmail);
        sb.append(", ").append(collaboratorPhone);
        sb.append(", ").append(institutionId);
        sb.append(", ").append(institutionName);
        sb.append(", ").append(institutionAddress);
        sb.append(", ").append(datasetId);
        sb.append(", ").append(countryId);
        sb.append(", ").append(countryName);
        sb.append(", ").append(countryCode2);
        sb.append(", ").append(countryCode3);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
