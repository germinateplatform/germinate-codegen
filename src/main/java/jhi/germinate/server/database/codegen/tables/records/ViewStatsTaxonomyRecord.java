/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import jhi.germinate.server.database.codegen.tables.ViewStatsTaxonomy;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


// @formatter:off
/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewStatsTaxonomyRecord extends TableRecordImpl<ViewStatsTaxonomyRecord> implements Record4<String, String, String, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>germinate_db.view_stats_taxonomy.genus</code>.
     */
    public void setGenus(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.view_stats_taxonomy.genus</code>.
     */
    public String getGenus() {
        return (String) get(0);
    }

    /**
     * Setter for <code>germinate_db.view_stats_taxonomy.species</code>.
     */
    public void setSpecies(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.view_stats_taxonomy.species</code>.
     */
    public String getSpecies() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_db.view_stats_taxonomy.subtaxa</code>.
     */
    public void setSubtaxa(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.view_stats_taxonomy.subtaxa</code>.
     */
    public String getSubtaxa() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_db.view_stats_taxonomy.count</code>.
     */
    public void setCount(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.view_stats_taxonomy.count</code>.
     */
    public Long getCount() {
        return (Long) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ViewStatsTaxonomy.VIEW_STATS_TAXONOMY.GENUS;
    }

    @Override
    public Field<String> field2() {
        return ViewStatsTaxonomy.VIEW_STATS_TAXONOMY.SPECIES;
    }

    @Override
    public Field<String> field3() {
        return ViewStatsTaxonomy.VIEW_STATS_TAXONOMY.SUBTAXA;
    }

    @Override
    public Field<Long> field4() {
        return ViewStatsTaxonomy.VIEW_STATS_TAXONOMY.COUNT;
    }

    @Override
    public String component1() {
        return getGenus();
    }

    @Override
    public String component2() {
        return getSpecies();
    }

    @Override
    public String component3() {
        return getSubtaxa();
    }

    @Override
    public Long component4() {
        return getCount();
    }

    @Override
    public String value1() {
        return getGenus();
    }

    @Override
    public String value2() {
        return getSpecies();
    }

    @Override
    public String value3() {
        return getSubtaxa();
    }

    @Override
    public Long value4() {
        return getCount();
    }

    @Override
    public ViewStatsTaxonomyRecord value1(String value) {
        setGenus(value);
        return this;
    }

    @Override
    public ViewStatsTaxonomyRecord value2(String value) {
        setSpecies(value);
        return this;
    }

    @Override
    public ViewStatsTaxonomyRecord value3(String value) {
        setSubtaxa(value);
        return this;
    }

    @Override
    public ViewStatsTaxonomyRecord value4(Long value) {
        setCount(value);
        return this;
    }

    @Override
    public ViewStatsTaxonomyRecord values(String value1, String value2, String value3, Long value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewStatsTaxonomyRecord
     */
    public ViewStatsTaxonomyRecord() {
        super(ViewStatsTaxonomy.VIEW_STATS_TAXONOMY);
    }

    /**
     * Create a detached, initialised ViewStatsTaxonomyRecord
     */
    public ViewStatsTaxonomyRecord(String genus, String species, String subtaxa, Long count) {
        super(ViewStatsTaxonomy.VIEW_STATS_TAXONOMY);

        setGenus(genus);
        setSpecies(species);
        setSubtaxa(subtaxa);
        setCount(count);
    }

    /**
     * Create a detached, initialised ViewStatsTaxonomyRecord
     */
    public ViewStatsTaxonomyRecord(jhi.germinate.server.database.codegen.tables.pojos.ViewStatsTaxonomy value) {
        super(ViewStatsTaxonomy.VIEW_STATS_TAXONOMY);

        if (value != null) {
            setGenus(value.getGenus());
            setSpecies(value.getSpecies());
            setSubtaxa(value.getSubtaxa());
            setCount(value.getCount());
        }
    }
    // @formatter:on
}
