/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.enums.ViewTablePublicationsReferenceType;
import jhi.germinate.server.database.codegen.tables.ViewTablePublications;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


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
public class ViewTablePublicationsRecord extends TableRecordImpl<ViewTablePublicationsRecord> implements Record7<Integer, String, String, ViewTablePublicationsReferenceType, Integer[], Timestamp, Timestamp> {

    private static final long serialVersionUID = 566283232;

    /**
     * Setter for <code>germinate_db.view_table_publications.publication_id</code>.
     */
    public void setPublicationId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_publications.publication_id</code>.
     */
    public Integer getPublicationId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.view_table_publications.publication_doi</code>.
     */
    public void setPublicationDoi(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_publications.publication_doi</code>.
     */
    public String getPublicationDoi() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_db.view_table_publications.publication_fallback_cache</code>.
     */
    public void setPublicationFallbackCache(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_publications.publication_fallback_cache</code>.
     */
    public String getPublicationFallbackCache() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_db.view_table_publications.reference_type</code>.
     */
    public void setReferenceType(ViewTablePublicationsReferenceType value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_publications.reference_type</code>.
     */
    public ViewTablePublicationsReferenceType getReferenceType() {
        return (ViewTablePublicationsReferenceType) get(3);
    }

    /**
     * Setter for <code>germinate_db.view_table_publications.referencing_ids</code>.
     */
    public void setReferencingIds(Integer... value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_publications.referencing_ids</code>.
     */
    public Integer[] getReferencingIds() {
        return (Integer[]) get(4);
    }

    /**
     * Setter for <code>germinate_db.view_table_publications.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_publications.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>germinate_db.view_table_publications.updated_on</code>.
     */
    public void setUpdatedOn(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_publications.updated_on</code>.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, ViewTablePublicationsReferenceType, Integer[], Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, ViewTablePublicationsReferenceType, Integer[], Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ViewTablePublications.VIEW_TABLE_PUBLICATIONS.PUBLICATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ViewTablePublications.VIEW_TABLE_PUBLICATIONS.PUBLICATION_DOI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ViewTablePublications.VIEW_TABLE_PUBLICATIONS.PUBLICATION_FALLBACK_CACHE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ViewTablePublicationsReferenceType> field4() {
        return ViewTablePublications.VIEW_TABLE_PUBLICATIONS.REFERENCE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer[]> field5() {
        return ViewTablePublications.VIEW_TABLE_PUBLICATIONS.REFERENCING_IDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return ViewTablePublications.VIEW_TABLE_PUBLICATIONS.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return ViewTablePublications.VIEW_TABLE_PUBLICATIONS.UPDATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getPublicationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getPublicationDoi();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPublicationFallbackCache();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTablePublicationsReferenceType component4() {
        return getReferenceType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer[] component5() {
        return getReferencingIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPublicationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPublicationDoi();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPublicationFallbackCache();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTablePublicationsReferenceType value4() {
        return getReferenceType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer[] value5() {
        return getReferencingIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTablePublicationsRecord value1(Integer value) {
        setPublicationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTablePublicationsRecord value2(String value) {
        setPublicationDoi(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTablePublicationsRecord value3(String value) {
        setPublicationFallbackCache(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTablePublicationsRecord value4(ViewTablePublicationsReferenceType value) {
        setReferenceType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTablePublicationsRecord value5(Integer... value) {
        setReferencingIds(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTablePublicationsRecord value6(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTablePublicationsRecord value7(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTablePublicationsRecord values(Integer value1, String value2, String value3, ViewTablePublicationsReferenceType value4, Integer[] value5, Timestamp value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewTablePublicationsRecord
     */
    public ViewTablePublicationsRecord() {
        super(ViewTablePublications.VIEW_TABLE_PUBLICATIONS);
    }

    /**
     * Create a detached, initialised ViewTablePublicationsRecord
     */
    public ViewTablePublicationsRecord(Integer publicationId, String publicationDoi, String publicationFallbackCache, ViewTablePublicationsReferenceType referenceType, Integer[] referencingIds, Timestamp createdOn, Timestamp updatedOn) {
        super(ViewTablePublications.VIEW_TABLE_PUBLICATIONS);

        set(0, publicationId);
        set(1, publicationDoi);
        set(2, publicationFallbackCache);
        set(3, referenceType);
        set(4, referencingIds);
        set(5, createdOn);
        set(6, updatedOn);
    }
// @formatter:on
}
