/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;


// @formatter:off
/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableInstitutions implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer institutionId;
    private String  institutionName;
    private String  institutionCode;
    private String  institutionAcronym;
    private String  institutionAddress;
    private String  institutionEmail;
    private String  institutionContact;
    private String  institutionPhone;
    private Integer countryId;
    private String  countryName;
    private String  countryCode;
    private String  institutionType;

    public ViewTableInstitutions() {}

    public ViewTableInstitutions(ViewTableInstitutions value) {
        this.institutionId = value.institutionId;
        this.institutionName = value.institutionName;
        this.institutionCode = value.institutionCode;
        this.institutionAcronym = value.institutionAcronym;
        this.institutionAddress = value.institutionAddress;
        this.institutionEmail = value.institutionEmail;
        this.institutionContact = value.institutionContact;
        this.institutionPhone = value.institutionPhone;
        this.countryId = value.countryId;
        this.countryName = value.countryName;
        this.countryCode = value.countryCode;
        this.institutionType = value.institutionType;
    }

    public ViewTableInstitutions(
        Integer institutionId,
        String  institutionName,
        String  institutionCode,
        String  institutionAcronym,
        String  institutionAddress,
        String  institutionEmail,
        String  institutionContact,
        String  institutionPhone,
        Integer countryId,
        String  countryName,
        String  countryCode,
        String  institutionType
    ) {
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.institutionCode = institutionCode;
        this.institutionAcronym = institutionAcronym;
        this.institutionAddress = institutionAddress;
        this.institutionEmail = institutionEmail;
        this.institutionContact = institutionContact;
        this.institutionPhone = institutionPhone;
        this.countryId = countryId;
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.institutionType = institutionType;
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_institutions.institution_id</code>. Primary
     * id for this table. This uniquely identifies the row.
     */
    public Integer getInstitutionId() {
        return this.institutionId;
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_institutions.institution_id</code>. Primary
     * id for this table. This uniquely identifies the row.
     */
    public void setInstitutionId(Integer institutionId) {
        this.institutionId = institutionId;
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_institutions.institution_name</code>. The
     * institute name.
     */
    public String getInstitutionName() {
        return this.institutionName;
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_institutions.institution_name</code>. The
     * institute name.
     */
    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_institutions.institution_code</code>. If
     * there is a defined ISO code for the institute this should be used here.
     */
    public String getInstitutionCode() {
        return this.institutionCode;
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_institutions.institution_code</code>. If
     * there is a defined ISO code for the institute this should be used here.
     */
    public void setInstitutionCode(String institutionCode) {
        this.institutionCode = institutionCode;
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_institutions.institution_acronym</code>. If
     * there is an acronym for the institute.
     */
    public String getInstitutionAcronym() {
        return this.institutionAcronym;
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_institutions.institution_acronym</code>. If
     * there is an acronym for the institute.
     */
    public void setInstitutionAcronym(String institutionAcronym) {
        this.institutionAcronym = institutionAcronym;
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_institutions.institution_address</code>.
     * The postal address of the institute.
     */
    public String getInstitutionAddress() {
        return this.institutionAddress;
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_institutions.institution_address</code>.
     * The postal address of the institute.
     */
    public void setInstitutionAddress(String institutionAddress) {
        this.institutionAddress = institutionAddress;
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_institutions.institution_email</code>. The
     * email address to contact the institute.
     */
    public String getInstitutionEmail() {
        return this.institutionEmail;
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_institutions.institution_email</code>. The
     * email address to contact the institute.
     */
    public void setInstitutionEmail(String institutionEmail) {
        this.institutionEmail = institutionEmail;
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_institutions.institution_contact</code>.
     * The contact at the institute which should be used for correspondence.
     */
    public String getInstitutionContact() {
        return this.institutionContact;
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_institutions.institution_contact</code>.
     * The contact at the institute which should be used for correspondence.
     */
    public void setInstitutionContact(String institutionContact) {
        this.institutionContact = institutionContact;
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_institutions.institution_phone</code>. The
     * telephone number for the institute.
     */
    public String getInstitutionPhone() {
        return this.institutionPhone;
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_institutions.institution_phone</code>. The
     * telephone number for the institute.
     */
    public void setInstitutionPhone(String institutionPhone) {
        this.institutionPhone = institutionPhone;
    }

    /**
     * Getter for <code>germinate_db.view_table_institutions.country_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public Integer getCountryId() {
        return this.countryId;
    }

    /**
     * Setter for <code>germinate_db.view_table_institutions.country_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_institutions.country_name</code>. Country
     * name.
     */
    public String getCountryName() {
        return this.countryName;
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_institutions.country_name</code>. Country
     * name.
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_institutions.country_code</code>. ISO 2
     * Code for country.
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_institutions.country_code</code>. ISO 2
     * Code for country.
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_institutions.institution_type</code>.
     */
    public String getInstitutionType() {
        return this.institutionType;
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_institutions.institution_type</code>.
     */
    public void setInstitutionType(String institutionType) {
        this.institutionType = institutionType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTableInstitutions (");

        sb.append(institutionId);
        sb.append(", ").append(institutionName);
        sb.append(", ").append(institutionCode);
        sb.append(", ").append(institutionAcronym);
        sb.append(", ").append(institutionAddress);
        sb.append(", ").append(institutionEmail);
        sb.append(", ").append(institutionContact);
        sb.append(", ").append(institutionPhone);
        sb.append(", ").append(countryId);
        sb.append(", ").append(countryName);
        sb.append(", ").append(countryCode);
        sb.append(", ").append(institutionType);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
