/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.util.Arrays;


import lombok.*;
import lombok.experimental.Accessors;

// @formatter:off
/**
 * VIEW
 */
@Getter
@Setter
@Accessors(chain = true)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableCollaborators implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer   collaboratorId;
    private String    collaboratorFirstName;
    private String    collaboratorLastName;
    private String    collaboratorExternalId;
    private String    collaboratorEmail;
    private String    collaboratorPhone;
    private String    collaboratorRoles;
    private Integer   institutionId;
    private String    institutionName;
    private String    institutionAddress;
    private Integer   datasetId;
    private Integer   countryId;
    private String    countryName;
    private String    countryCode2;
    private String    countryCode3;
    private Integer[] projectIds;

    public ViewTableCollaborators() {}

    public ViewTableCollaborators(ViewTableCollaborators value) {
        this.collaboratorId = value.collaboratorId;
        this.collaboratorFirstName = value.collaboratorFirstName;
        this.collaboratorLastName = value.collaboratorLastName;
        this.collaboratorExternalId = value.collaboratorExternalId;
        this.collaboratorEmail = value.collaboratorEmail;
        this.collaboratorPhone = value.collaboratorPhone;
        this.collaboratorRoles = value.collaboratorRoles;
        this.institutionId = value.institutionId;
        this.institutionName = value.institutionName;
        this.institutionAddress = value.institutionAddress;
        this.datasetId = value.datasetId;
        this.countryId = value.countryId;
        this.countryName = value.countryName;
        this.countryCode2 = value.countryCode2;
        this.countryCode3 = value.countryCode3;
        this.projectIds = value.projectIds;
    }

    public ViewTableCollaborators(
        Integer   collaboratorId,
        String    collaboratorFirstName,
        String    collaboratorLastName,
        String    collaboratorExternalId,
        String    collaboratorEmail,
        String    collaboratorPhone,
        String    collaboratorRoles,
        Integer   institutionId,
        String    institutionName,
        String    institutionAddress,
        Integer   datasetId,
        Integer   countryId,
        String    countryName,
        String    countryCode2,
        String    countryCode3,
        Integer[] projectIds
    ) {
        this.collaboratorId = collaboratorId;
        this.collaboratorFirstName = collaboratorFirstName;
        this.collaboratorLastName = collaboratorLastName;
        this.collaboratorExternalId = collaboratorExternalId;
        this.collaboratorEmail = collaboratorEmail;
        this.collaboratorPhone = collaboratorPhone;
        this.collaboratorRoles = collaboratorRoles;
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.institutionAddress = institutionAddress;
        this.datasetId = datasetId;
        this.countryId = countryId;
        this.countryName = countryName;
        this.countryCode2 = countryCode2;
        this.countryCode3 = countryCode3;
        this.projectIds = projectIds;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTableCollaborators (");

        sb.append(collaboratorId);
        sb.append(", ").append(collaboratorFirstName);
        sb.append(", ").append(collaboratorLastName);
        sb.append(", ").append(collaboratorExternalId);
        sb.append(", ").append(collaboratorEmail);
        sb.append(", ").append(collaboratorPhone);
        sb.append(", ").append(collaboratorRoles);
        sb.append(", ").append(institutionId);
        sb.append(", ").append(institutionName);
        sb.append(", ").append(institutionAddress);
        sb.append(", ").append(datasetId);
        sb.append(", ").append(countryId);
        sb.append(", ").append(countryName);
        sb.append(", ").append(countryCode2);
        sb.append(", ").append(countryCode3);
        sb.append(", ").append(Arrays.toString(projectIds));

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
