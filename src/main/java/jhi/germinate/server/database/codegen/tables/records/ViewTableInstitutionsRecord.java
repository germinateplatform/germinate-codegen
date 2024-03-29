/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import jhi.germinate.server.database.codegen.tables.ViewTableInstitutions;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;


// @formatter:off
/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableInstitutionsRecord extends TableRecordImpl<ViewTableInstitutionsRecord> implements Record12<Integer, String, String, String, String, String, String, String, Integer, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>germinate_db.view_table_institutions.institution_id</code>. Primary
     * id for this table. This uniquely identifies the row.
     */
    public void setInstitutionId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_institutions.institution_id</code>. Primary
     * id for this table. This uniquely identifies the row.
     */
    public Integer getInstitutionId() {
        return (Integer) get(0);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_institutions.institution_name</code>. The
     * institute name.
     */
    public void setInstitutionName(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_institutions.institution_name</code>. The
     * institute name.
     */
    public String getInstitutionName() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_institutions.institution_code</code>. If
     * there is a defined ISO code for the institute this should be used here.
     */
    public void setInstitutionCode(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_institutions.institution_code</code>. If
     * there is a defined ISO code for the institute this should be used here.
     */
    public String getInstitutionCode() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_institutions.institution_acronym</code>. If
     * there is an acronym for the institute.
     */
    public void setInstitutionAcronym(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_institutions.institution_acronym</code>. If
     * there is an acronym for the institute.
     */
    public String getInstitutionAcronym() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_institutions.institution_address</code>.
     * The postal address of the institute.
     */
    public void setInstitutionAddress(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_institutions.institution_address</code>.
     * The postal address of the institute.
     */
    public String getInstitutionAddress() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_institutions.institution_email</code>. The
     * email address to contact the institute.
     */
    public void setInstitutionEmail(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_institutions.institution_email</code>. The
     * email address to contact the institute.
     */
    public String getInstitutionEmail() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_institutions.institution_contact</code>.
     * The contact at the institute which should be used for correspondence.
     */
    public void setInstitutionContact(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_institutions.institution_contact</code>.
     * The contact at the institute which should be used for correspondence.
     */
    public String getInstitutionContact() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_institutions.institution_phone</code>. The
     * telephone number for the institute.
     */
    public void setInstitutionPhone(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_institutions.institution_phone</code>. The
     * telephone number for the institute.
     */
    public String getInstitutionPhone() {
        return (String) get(7);
    }

    /**
     * Setter for <code>germinate_db.view_table_institutions.country_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public void setCountryId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_institutions.country_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public Integer getCountryId() {
        return (Integer) get(8);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_institutions.country_name</code>. Country
     * name.
     */
    public void setCountryName(String value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_institutions.country_name</code>. Country
     * name.
     */
    public String getCountryName() {
        return (String) get(9);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_institutions.country_code</code>. ISO 2
     * Code for country.
     */
    public void setCountryCode(String value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_institutions.country_code</code>. ISO 2
     * Code for country.
     */
    public String getCountryCode() {
        return (String) get(10);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_institutions.institution_type</code>.
     */
    public void setInstitutionType(String value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_institutions.institution_type</code>.
     */
    public String getInstitutionType() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, String, String, String, String, String, String, String, Integer, String, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Integer, String, String, String, String, String, String, String, Integer, String, String, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ViewTableInstitutions.VIEW_TABLE_INSTITUTIONS.INSTITUTION_ID;
    }

    @Override
    public Field<String> field2() {
        return ViewTableInstitutions.VIEW_TABLE_INSTITUTIONS.INSTITUTION_NAME;
    }

    @Override
    public Field<String> field3() {
        return ViewTableInstitutions.VIEW_TABLE_INSTITUTIONS.INSTITUTION_CODE;
    }

    @Override
    public Field<String> field4() {
        return ViewTableInstitutions.VIEW_TABLE_INSTITUTIONS.INSTITUTION_ACRONYM;
    }

    @Override
    public Field<String> field5() {
        return ViewTableInstitutions.VIEW_TABLE_INSTITUTIONS.INSTITUTION_ADDRESS;
    }

    @Override
    public Field<String> field6() {
        return ViewTableInstitutions.VIEW_TABLE_INSTITUTIONS.INSTITUTION_EMAIL;
    }

    @Override
    public Field<String> field7() {
        return ViewTableInstitutions.VIEW_TABLE_INSTITUTIONS.INSTITUTION_CONTACT;
    }

    @Override
    public Field<String> field8() {
        return ViewTableInstitutions.VIEW_TABLE_INSTITUTIONS.INSTITUTION_PHONE;
    }

    @Override
    public Field<Integer> field9() {
        return ViewTableInstitutions.VIEW_TABLE_INSTITUTIONS.COUNTRY_ID;
    }

    @Override
    public Field<String> field10() {
        return ViewTableInstitutions.VIEW_TABLE_INSTITUTIONS.COUNTRY_NAME;
    }

    @Override
    public Field<String> field11() {
        return ViewTableInstitutions.VIEW_TABLE_INSTITUTIONS.COUNTRY_CODE;
    }

    @Override
    public Field<String> field12() {
        return ViewTableInstitutions.VIEW_TABLE_INSTITUTIONS.INSTITUTION_TYPE;
    }

    @Override
    public Integer component1() {
        return getInstitutionId();
    }

    @Override
    public String component2() {
        return getInstitutionName();
    }

    @Override
    public String component3() {
        return getInstitutionCode();
    }

    @Override
    public String component4() {
        return getInstitutionAcronym();
    }

    @Override
    public String component5() {
        return getInstitutionAddress();
    }

    @Override
    public String component6() {
        return getInstitutionEmail();
    }

    @Override
    public String component7() {
        return getInstitutionContact();
    }

    @Override
    public String component8() {
        return getInstitutionPhone();
    }

    @Override
    public Integer component9() {
        return getCountryId();
    }

    @Override
    public String component10() {
        return getCountryName();
    }

    @Override
    public String component11() {
        return getCountryCode();
    }

    @Override
    public String component12() {
        return getInstitutionType();
    }

    @Override
    public Integer value1() {
        return getInstitutionId();
    }

    @Override
    public String value2() {
        return getInstitutionName();
    }

    @Override
    public String value3() {
        return getInstitutionCode();
    }

    @Override
    public String value4() {
        return getInstitutionAcronym();
    }

    @Override
    public String value5() {
        return getInstitutionAddress();
    }

    @Override
    public String value6() {
        return getInstitutionEmail();
    }

    @Override
    public String value7() {
        return getInstitutionContact();
    }

    @Override
    public String value8() {
        return getInstitutionPhone();
    }

    @Override
    public Integer value9() {
        return getCountryId();
    }

    @Override
    public String value10() {
        return getCountryName();
    }

    @Override
    public String value11() {
        return getCountryCode();
    }

    @Override
    public String value12() {
        return getInstitutionType();
    }

    @Override
    public ViewTableInstitutionsRecord value1(Integer value) {
        setInstitutionId(value);
        return this;
    }

    @Override
    public ViewTableInstitutionsRecord value2(String value) {
        setInstitutionName(value);
        return this;
    }

    @Override
    public ViewTableInstitutionsRecord value3(String value) {
        setInstitutionCode(value);
        return this;
    }

    @Override
    public ViewTableInstitutionsRecord value4(String value) {
        setInstitutionAcronym(value);
        return this;
    }

    @Override
    public ViewTableInstitutionsRecord value5(String value) {
        setInstitutionAddress(value);
        return this;
    }

    @Override
    public ViewTableInstitutionsRecord value6(String value) {
        setInstitutionEmail(value);
        return this;
    }

    @Override
    public ViewTableInstitutionsRecord value7(String value) {
        setInstitutionContact(value);
        return this;
    }

    @Override
    public ViewTableInstitutionsRecord value8(String value) {
        setInstitutionPhone(value);
        return this;
    }

    @Override
    public ViewTableInstitutionsRecord value9(Integer value) {
        setCountryId(value);
        return this;
    }

    @Override
    public ViewTableInstitutionsRecord value10(String value) {
        setCountryName(value);
        return this;
    }

    @Override
    public ViewTableInstitutionsRecord value11(String value) {
        setCountryCode(value);
        return this;
    }

    @Override
    public ViewTableInstitutionsRecord value12(String value) {
        setInstitutionType(value);
        return this;
    }

    @Override
    public ViewTableInstitutionsRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, Integer value9, String value10, String value11, String value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewTableInstitutionsRecord
     */
    public ViewTableInstitutionsRecord() {
        super(ViewTableInstitutions.VIEW_TABLE_INSTITUTIONS);
    }

    /**
     * Create a detached, initialised ViewTableInstitutionsRecord
     */
    public ViewTableInstitutionsRecord(Integer institutionId, String institutionName, String institutionCode, String institutionAcronym, String institutionAddress, String institutionEmail, String institutionContact, String institutionPhone, Integer countryId, String countryName, String countryCode, String institutionType) {
        super(ViewTableInstitutions.VIEW_TABLE_INSTITUTIONS);

        setInstitutionId(institutionId);
        setInstitutionName(institutionName);
        setInstitutionCode(institutionCode);
        setInstitutionAcronym(institutionAcronym);
        setInstitutionAddress(institutionAddress);
        setInstitutionEmail(institutionEmail);
        setInstitutionContact(institutionContact);
        setInstitutionPhone(institutionPhone);
        setCountryId(countryId);
        setCountryName(countryName);
        setCountryCode(countryCode);
        setInstitutionType(institutionType);
    }

    /**
     * Create a detached, initialised ViewTableInstitutionsRecord
     */
    public ViewTableInstitutionsRecord(jhi.germinate.server.database.codegen.tables.pojos.ViewTableInstitutions value) {
        super(ViewTableInstitutions.VIEW_TABLE_INSTITUTIONS);

        if (value != null) {
            setInstitutionId(value.getInstitutionId());
            setInstitutionName(value.getInstitutionName());
            setInstitutionCode(value.getInstitutionCode());
            setInstitutionAcronym(value.getInstitutionAcronym());
            setInstitutionAddress(value.getInstitutionAddress());
            setInstitutionEmail(value.getInstitutionEmail());
            setInstitutionContact(value.getInstitutionContact());
            setInstitutionPhone(value.getInstitutionPhone());
            setCountryId(value.getCountryId());
            setCountryName(value.getCountryName());
            setCountryCode(value.getCountryCode());
            setInstitutionType(value.getInstitutionType());
        }
    }
    // @formatter:on
}
