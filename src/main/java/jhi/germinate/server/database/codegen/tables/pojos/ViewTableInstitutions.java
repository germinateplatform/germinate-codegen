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
public class ViewTableInstitutions implements Serializable {

    private static final long serialVersionUID = -273537379;

    private Integer institutionId;
    private String  institutionName;
    private String  institutionAcronym;
    private String  institutionAddress;
    private String  institutionEmail;
    private String  institutionContact;
    private String  institutionPhone;
    private Integer countryId;
    private String  countryName;
    private String  countryCode;

    public ViewTableInstitutions() {}

    public ViewTableInstitutions(ViewTableInstitutions value) {
        this.institutionId = value.institutionId;
        this.institutionName = value.institutionName;
        this.institutionAcronym = value.institutionAcronym;
        this.institutionAddress = value.institutionAddress;
        this.institutionEmail = value.institutionEmail;
        this.institutionContact = value.institutionContact;
        this.institutionPhone = value.institutionPhone;
        this.countryId = value.countryId;
        this.countryName = value.countryName;
        this.countryCode = value.countryCode;
    }

    public ViewTableInstitutions(
        Integer institutionId,
        String  institutionName,
        String  institutionAcronym,
        String  institutionAddress,
        String  institutionEmail,
        String  institutionContact,
        String  institutionPhone,
        Integer countryId,
        String  countryName,
        String  countryCode
    ) {
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.institutionAcronym = institutionAcronym;
        this.institutionAddress = institutionAddress;
        this.institutionEmail = institutionEmail;
        this.institutionContact = institutionContact;
        this.institutionPhone = institutionPhone;
        this.countryId = countryId;
        this.countryName = countryName;
        this.countryCode = countryCode;
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

    public String getInstitutionAcronym() {
        return this.institutionAcronym;
    }

    public void setInstitutionAcronym(String institutionAcronym) {
        this.institutionAcronym = institutionAcronym;
    }

    public String getInstitutionAddress() {
        return this.institutionAddress;
    }

    public void setInstitutionAddress(String institutionAddress) {
        this.institutionAddress = institutionAddress;
    }

    public String getInstitutionEmail() {
        return this.institutionEmail;
    }

    public void setInstitutionEmail(String institutionEmail) {
        this.institutionEmail = institutionEmail;
    }

    public String getInstitutionContact() {
        return this.institutionContact;
    }

    public void setInstitutionContact(String institutionContact) {
        this.institutionContact = institutionContact;
    }

    public String getInstitutionPhone() {
        return this.institutionPhone;
    }

    public void setInstitutionPhone(String institutionPhone) {
        this.institutionPhone = institutionPhone;
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

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTableInstitutions (");

        sb.append(institutionId);
        sb.append(", ").append(institutionName);
        sb.append(", ").append(institutionAcronym);
        sb.append(", ").append(institutionAddress);
        sb.append(", ").append(institutionEmail);
        sb.append(", ").append(institutionContact);
        sb.append(", ").append(institutionPhone);
        sb.append(", ").append(countryId);
        sb.append(", ").append(countryName);
        sb.append(", ").append(countryCode);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
