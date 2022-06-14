/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import jhi.germinate.server.database.codegen.tables.ViewTableCollaborators;

import org.jooq.Field;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.TableRecordImpl;


// @formatter:off
/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableCollaboratorsRecord extends TableRecordImpl<ViewTableCollaboratorsRecord> implements Record15<Integer, String, String, String, String, String, String, Integer, String, String, Integer, Integer, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>germinate_db.view_table_collaborators.collaborator_id</code>.
     */
    public void setCollaboratorId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_collaborators.collaborator_id</code>.
     */
    public Integer getCollaboratorId() {
        return (Integer) get(0);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_collaborators.collaborator_first_name</code>.
     * Last name (surname) of the author(s), researcher(s), scientist(s),
     * student(s) responsible for producing the information product.
     */
    public void setCollaboratorFirstName(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_collaborators.collaborator_first_name</code>.
     * Last name (surname) of the author(s), researcher(s), scientist(s),
     * student(s) responsible for producing the information product.
     */
    public String getCollaboratorFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_collaborators.collaborator_last_name</code>.
     * First name (and middle name if available) of the author(s),
     * researcher(s), scientist(s), student(s) responsible for producing the
     * information product.
     */
    public void setCollaboratorLastName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_collaborators.collaborator_last_name</code>.
     * First name (and middle name if available) of the author(s),
     * researcher(s), scientist(s), student(s) responsible for producing the
     * information product.
     */
    public String getCollaboratorLastName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_collaborators.collaborator_external_id</code>.
     * An identifier for the data submitter. If that submitter is an individual,
     * ORCID identifiers are recommended.
     */
    public void setCollaboratorExternalId(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_collaborators.collaborator_external_id</code>.
     * An identifier for the data submitter. If that submitter is an individual,
     * ORCID identifiers are recommended.
     */
    public String getCollaboratorExternalId() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_collaborators.collaborator_email</code>.
     * E-mail address of the author(s), researcher(s), scientist(s), student(s)
     * responsible for producing the information product.
     */
    public void setCollaboratorEmail(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_collaborators.collaborator_email</code>.
     * E-mail address of the author(s), researcher(s), scientist(s), student(s)
     * responsible for producing the information product.
     */
    public String getCollaboratorEmail() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_collaborators.collaborator_phone</code>.
     * Phone number of the author(s), researcher(s), scientist(s), student(s)
     * responsible for producing the information product.
     */
    public void setCollaboratorPhone(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_collaborators.collaborator_phone</code>.
     * Phone number of the author(s), researcher(s), scientist(s), student(s)
     * responsible for producing the information product.
     */
    public String getCollaboratorPhone() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_collaborators.collaborator_roles</code>.
     * Type of contribution of the person to the investigation (e.g. data
     * submitter; author; corresponding author)
     */
    public void setCollaboratorRoles(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_collaborators.collaborator_roles</code>.
     * Type of contribution of the person to the investigation (e.g. data
     * submitter; author; corresponding author)
     */
    public String getCollaboratorRoles() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_collaborators.institution_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public void setInstitutionId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_collaborators.institution_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public Integer getInstitutionId() {
        return (Integer) get(7);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_collaborators.institution_name</code>. The
     * institute name.
     */
    public void setInstitutionName(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_collaborators.institution_name</code>. The
     * institute name.
     */
    public String getInstitutionName() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_collaborators.institution_address</code>.
     * The postal address of the institute.
     */
    public void setInstitutionAddress(String value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_collaborators.institution_address</code>.
     * The postal address of the institute.
     */
    public String getInstitutionAddress() {
        return (String) get(9);
    }

    /**
     * Setter for <code>germinate_db.view_table_collaborators.dataset_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public void setDatasetId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_collaborators.dataset_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public Integer getDatasetId() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>germinate_db.view_table_collaborators.country_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public void setCountryId(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_collaborators.country_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public Integer getCountryId() {
        return (Integer) get(11);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_collaborators.country_name</code>. Country
     * name.
     */
    public void setCountryName(String value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_collaborators.country_name</code>. Country
     * name.
     */
    public String getCountryName() {
        return (String) get(12);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_collaborators.country_code2</code>. ISO 2
     * Code for country.
     */
    public void setCountryCode2(String value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_collaborators.country_code2</code>. ISO 2
     * Code for country.
     */
    public String getCountryCode2() {
        return (String) get(13);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_collaborators.country_code3</code>. ISO 3
     * Code for country.
     */
    public void setCountryCode3(String value) {
        set(14, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_collaborators.country_code3</code>. ISO 3
     * Code for country.
     */
    public String getCountryCode3() {
        return (String) get(14);
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row15<Integer, String, String, String, String, String, String, Integer, String, String, Integer, Integer, String, String, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    @Override
    public Row15<Integer, String, String, String, String, String, String, Integer, String, String, Integer, Integer, String, String, String> valuesRow() {
        return (Row15) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.COLLABORATOR_ID;
    }

    @Override
    public Field<String> field2() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.COLLABORATOR_FIRST_NAME;
    }

    @Override
    public Field<String> field3() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.COLLABORATOR_LAST_NAME;
    }

    @Override
    public Field<String> field4() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.COLLABORATOR_EXTERNAL_ID;
    }

    @Override
    public Field<String> field5() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.COLLABORATOR_EMAIL;
    }

    @Override
    public Field<String> field6() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.COLLABORATOR_PHONE;
    }

    @Override
    public Field<String> field7() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.COLLABORATOR_ROLES;
    }

    @Override
    public Field<Integer> field8() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.INSTITUTION_ID;
    }

    @Override
    public Field<String> field9() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.INSTITUTION_NAME;
    }

    @Override
    public Field<String> field10() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.INSTITUTION_ADDRESS;
    }

    @Override
    public Field<Integer> field11() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.DATASET_ID;
    }

    @Override
    public Field<Integer> field12() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.COUNTRY_ID;
    }

    @Override
    public Field<String> field13() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.COUNTRY_NAME;
    }

    @Override
    public Field<String> field14() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.COUNTRY_CODE2;
    }

    @Override
    public Field<String> field15() {
        return ViewTableCollaborators.VIEW_TABLE_COLLABORATORS.COUNTRY_CODE3;
    }

    @Override
    public Integer component1() {
        return getCollaboratorId();
    }

    @Override
    public String component2() {
        return getCollaboratorFirstName();
    }

    @Override
    public String component3() {
        return getCollaboratorLastName();
    }

    @Override
    public String component4() {
        return getCollaboratorExternalId();
    }

    @Override
    public String component5() {
        return getCollaboratorEmail();
    }

    @Override
    public String component6() {
        return getCollaboratorPhone();
    }

    @Override
    public String component7() {
        return getCollaboratorRoles();
    }

    @Override
    public Integer component8() {
        return getInstitutionId();
    }

    @Override
    public String component9() {
        return getInstitutionName();
    }

    @Override
    public String component10() {
        return getInstitutionAddress();
    }

    @Override
    public Integer component11() {
        return getDatasetId();
    }

    @Override
    public Integer component12() {
        return getCountryId();
    }

    @Override
    public String component13() {
        return getCountryName();
    }

    @Override
    public String component14() {
        return getCountryCode2();
    }

    @Override
    public String component15() {
        return getCountryCode3();
    }

    @Override
    public Integer value1() {
        return getCollaboratorId();
    }

    @Override
    public String value2() {
        return getCollaboratorFirstName();
    }

    @Override
    public String value3() {
        return getCollaboratorLastName();
    }

    @Override
    public String value4() {
        return getCollaboratorExternalId();
    }

    @Override
    public String value5() {
        return getCollaboratorEmail();
    }

    @Override
    public String value6() {
        return getCollaboratorPhone();
    }

    @Override
    public String value7() {
        return getCollaboratorRoles();
    }

    @Override
    public Integer value8() {
        return getInstitutionId();
    }

    @Override
    public String value9() {
        return getInstitutionName();
    }

    @Override
    public String value10() {
        return getInstitutionAddress();
    }

    @Override
    public Integer value11() {
        return getDatasetId();
    }

    @Override
    public Integer value12() {
        return getCountryId();
    }

    @Override
    public String value13() {
        return getCountryName();
    }

    @Override
    public String value14() {
        return getCountryCode2();
    }

    @Override
    public String value15() {
        return getCountryCode3();
    }

    @Override
    public ViewTableCollaboratorsRecord value1(Integer value) {
        setCollaboratorId(value);
        return this;
    }

    @Override
    public ViewTableCollaboratorsRecord value2(String value) {
        setCollaboratorFirstName(value);
        return this;
    }

    @Override
    public ViewTableCollaboratorsRecord value3(String value) {
        setCollaboratorLastName(value);
        return this;
    }

    @Override
    public ViewTableCollaboratorsRecord value4(String value) {
        setCollaboratorExternalId(value);
        return this;
    }

    @Override
    public ViewTableCollaboratorsRecord value5(String value) {
        setCollaboratorEmail(value);
        return this;
    }

    @Override
    public ViewTableCollaboratorsRecord value6(String value) {
        setCollaboratorPhone(value);
        return this;
    }

    @Override
    public ViewTableCollaboratorsRecord value7(String value) {
        setCollaboratorRoles(value);
        return this;
    }

    @Override
    public ViewTableCollaboratorsRecord value8(Integer value) {
        setInstitutionId(value);
        return this;
    }

    @Override
    public ViewTableCollaboratorsRecord value9(String value) {
        setInstitutionName(value);
        return this;
    }

    @Override
    public ViewTableCollaboratorsRecord value10(String value) {
        setInstitutionAddress(value);
        return this;
    }

    @Override
    public ViewTableCollaboratorsRecord value11(Integer value) {
        setDatasetId(value);
        return this;
    }

    @Override
    public ViewTableCollaboratorsRecord value12(Integer value) {
        setCountryId(value);
        return this;
    }

    @Override
    public ViewTableCollaboratorsRecord value13(String value) {
        setCountryName(value);
        return this;
    }

    @Override
    public ViewTableCollaboratorsRecord value14(String value) {
        setCountryCode2(value);
        return this;
    }

    @Override
    public ViewTableCollaboratorsRecord value15(String value) {
        setCountryCode3(value);
        return this;
    }

    @Override
    public ViewTableCollaboratorsRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, Integer value8, String value9, String value10, Integer value11, Integer value12, String value13, String value14, String value15) {
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
     * Create a detached ViewTableCollaboratorsRecord
     */
    public ViewTableCollaboratorsRecord() {
        super(ViewTableCollaborators.VIEW_TABLE_COLLABORATORS);
    }

    /**
     * Create a detached, initialised ViewTableCollaboratorsRecord
     */
    public ViewTableCollaboratorsRecord(Integer collaboratorId, String collaboratorFirstName, String collaboratorLastName, String collaboratorExternalId, String collaboratorEmail, String collaboratorPhone, String collaboratorRoles, Integer institutionId, String institutionName, String institutionAddress, Integer datasetId, Integer countryId, String countryName, String countryCode2, String countryCode3) {
        super(ViewTableCollaborators.VIEW_TABLE_COLLABORATORS);

        setCollaboratorId(collaboratorId);
        setCollaboratorFirstName(collaboratorFirstName);
        setCollaboratorLastName(collaboratorLastName);
        setCollaboratorExternalId(collaboratorExternalId);
        setCollaboratorEmail(collaboratorEmail);
        setCollaboratorPhone(collaboratorPhone);
        setCollaboratorRoles(collaboratorRoles);
        setInstitutionId(institutionId);
        setInstitutionName(institutionName);
        setInstitutionAddress(institutionAddress);
        setDatasetId(datasetId);
        setCountryId(countryId);
        setCountryName(countryName);
        setCountryCode2(countryCode2);
        setCountryCode3(countryCode3);
    }

    /**
     * Create a detached, initialised ViewTableCollaboratorsRecord
     */
    public ViewTableCollaboratorsRecord(jhi.germinate.server.database.codegen.tables.pojos.ViewTableCollaborators value) {
        super(ViewTableCollaborators.VIEW_TABLE_COLLABORATORS);

        if (value != null) {
            setCollaboratorId(value.getCollaboratorId());
            setCollaboratorFirstName(value.getCollaboratorFirstName());
            setCollaboratorLastName(value.getCollaboratorLastName());
            setCollaboratorExternalId(value.getCollaboratorExternalId());
            setCollaboratorEmail(value.getCollaboratorEmail());
            setCollaboratorPhone(value.getCollaboratorPhone());
            setCollaboratorRoles(value.getCollaboratorRoles());
            setInstitutionId(value.getInstitutionId());
            setInstitutionName(value.getInstitutionName());
            setInstitutionAddress(value.getInstitutionAddress());
            setDatasetId(value.getDatasetId());
            setCountryId(value.getCountryId());
            setCountryName(value.getCountryName());
            setCountryCode2(value.getCountryCode2());
            setCountryCode3(value.getCountryCode3());
        }
    }
    // @formatter:on
}
