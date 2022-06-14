/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.TaxonomiesRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


// @formatter:off
/**
 * The species table holds information relating to the species that are deinfed
 * within a particular Germinate instance including common names and ploidy
 * levels.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Taxonomies extends TableImpl<TaxonomiesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.taxonomies</code>
     */
    public static final Taxonomies TAXONOMIES = new Taxonomies();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TaxonomiesRecord> getRecordType() {
        return TaxonomiesRecord.class;
    }

    /**
     * The column <code>germinate_db.taxonomies.id</code>. Primary id for this
     * table. This uniquely identifies the row.
     */
    public final TableField<TaxonomiesRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.taxonomies.genus</code>. Genus name for the
     * species.
     */
    public final TableField<TaxonomiesRecord, String> GENUS = createField(DSL.name("genus"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "Genus name for the species.");

    /**
     * The column <code>germinate_db.taxonomies.species</code>. Species name in
     * lowercase.
     */
    public final TableField<TaxonomiesRecord, String> SPECIES = createField(DSL.name("species"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "Species name in lowercase.");

    /**
     * The column <code>germinate_db.taxonomies.subtaxa</code>. Subtaxa name.
     */
    public final TableField<TaxonomiesRecord, String> SUBTAXA = createField(DSL.name("subtaxa"), SQLDataType.VARCHAR(255), this, "Subtaxa name.");

    /**
     * The column <code>germinate_db.taxonomies.species_author</code>. also
     * known as spauthor in the Multi Crop Passport Descriptors (MCPD V2 2012).
     * Describes the authority for the species name.
     */
    public final TableField<TaxonomiesRecord, String> SPECIES_AUTHOR = createField(DSL.name("species_author"), SQLDataType.VARCHAR(255), this, "also known as spauthor in the Multi Crop Passport Descriptors (MCPD V2 2012). Describes the authority for the species name.");

    /**
     * The column <code>germinate_db.taxonomies.subtaxa_author</code>. also
     * known as subtauthor in the Multi Crop Passport Descriptors (MCPD V2
     * 2012).
     */
    public final TableField<TaxonomiesRecord, String> SUBTAXA_AUTHOR = createField(DSL.name("subtaxa_author"), SQLDataType.VARCHAR(255), this, "also known as subtauthor in the Multi Crop Passport Descriptors (MCPD V2 2012).");

    /**
     * The column <code>germinate_db.taxonomies.cropname</code>. The name of the
     * crop. This should be the common name. Examples would include barley,
     * maize, wheat, rice and so on.
     */
    public final TableField<TaxonomiesRecord, String> CROPNAME = createField(DSL.name("cropname"), SQLDataType.VARCHAR(255), this, "The name of the crop. This should be the common name. Examples would include barley, maize, wheat, rice and so on.");

    /**
     * The column <code>germinate_db.taxonomies.ploidy</code>. Defines the
     * ploidy level for the species. Use numbers to reference ploidy for example
     * diploid = 2, tetraploid = 4.
     */
    public final TableField<TaxonomiesRecord, Integer> PLOIDY = createField(DSL.name("ploidy"), SQLDataType.INTEGER, this, "Defines the ploidy level for the species. Use numbers to reference ploidy for example diploid = 2, tetraploid = 4.");

    /**
     * The column <code>germinate_db.taxonomies.created_on</code>. When the
     * record was created.
     */
    public final TableField<TaxonomiesRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.taxonomies.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public final TableField<TaxonomiesRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private Taxonomies(Name alias, Table<TaxonomiesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Taxonomies(Name alias, Table<TaxonomiesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("The species table holds information relating to the species that are deinfed within a particular Germinate instance including common names and ploidy levels."), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.taxonomies</code> table reference
     */
    public Taxonomies(String alias) {
        this(DSL.name(alias), TAXONOMIES);
    }

    /**
     * Create an aliased <code>germinate_db.taxonomies</code> table reference
     */
    public Taxonomies(Name alias) {
        this(alias, TAXONOMIES);
    }

    /**
     * Create a <code>germinate_db.taxonomies</code> table reference
     */
    public Taxonomies() {
        this(DSL.name("taxonomies"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<TaxonomiesRecord, Integer> getIdentity() {
        return (Identity<TaxonomiesRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<TaxonomiesRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Taxonomies.TAXONOMIES, DSL.name("KEY_taxonomies_PRIMARY"), new TableField[] { Taxonomies.TAXONOMIES.ID }, true);
    }

    @Override
    public Taxonomies as(String alias) {
        return new Taxonomies(DSL.name(alias), this);
    }

    @Override
    public Taxonomies as(Name alias) {
        return new Taxonomies(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Taxonomies rename(String name) {
        return new Taxonomies(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Taxonomies rename(Name name) {
        return new Taxonomies(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, String, String, String, String, String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
    // @formatter:on
}
