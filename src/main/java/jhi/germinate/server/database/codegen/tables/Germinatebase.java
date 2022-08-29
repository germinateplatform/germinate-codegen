/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.GerminatebaseRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Row13;
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
 * Germinatebase is the Germinate base table which contains passport and other
 * germplasm definition data.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Germinatebase extends TableImpl<GerminatebaseRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.germinatebase</code>
     */
    public static final Germinatebase GERMINATEBASE = new Germinatebase();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GerminatebaseRecord> getRecordType() {
        return GerminatebaseRecord.class;
    }

    /**
     * The column <code>germinate_db.germinatebase.id</code>. Primary id for
     * this table. This uniquely identifies the row.
     */
    public final TableField<GerminatebaseRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.germinatebase.general_identifier</code>. A
     * unique identifier.
     */
    public final TableField<GerminatebaseRecord, String> GENERAL_IDENTIFIER = createField(DSL.name("general_identifier"), SQLDataType.VARCHAR(255).nullable(false), this, "A unique identifier.");

    /**
     * The column <code>germinate_db.germinatebase.number</code>. This is the
     * unique identifier for accessions within a genebank, and is assigned when
     * a sample is
     * entered into the genebank collection (e.g. ‘PI 113869’).
     */
    public final TableField<GerminatebaseRecord, String> NUMBER = createField(DSL.name("number"), SQLDataType.VARCHAR(255), this, "This is the unique identifier for accessions within a genebank, and is assigned when a sample is\nentered into the genebank collection (e.g. ‘PI 113869’).");

    /**
     * The column <code>germinate_db.germinatebase.name</code>. A unique name
     * which defines an entry in the germinatbase table.
     */
    public final TableField<GerminatebaseRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "A unique name which defines an entry in the germinatbase table.");

    /**
     * The column <code>germinate_db.germinatebase.bank_number</code>.
     * Alternative genebank number.
     */
    public final TableField<GerminatebaseRecord, String> BANK_NUMBER = createField(DSL.name("bank_number"), SQLDataType.VARCHAR(255), this, "Alternative genebank number.");

    /**
     * The column <code>germinate_db.germinatebase.taxonomy_id</code>. Foreign
     * key to taxonomies (taxonomies.id).
     */
    public final TableField<GerminatebaseRecord, Integer> TAXONOMY_ID = createField(DSL.name("taxonomy_id"), SQLDataType.INTEGER, this, "Foreign key to taxonomies (taxonomies.id).");

    /**
     * The column <code>germinate_db.germinatebase.plant_passport</code>. Record
     * if the entry has a plant passport.
     */
    public final TableField<GerminatebaseRecord, String> PLANT_PASSPORT = createField(DSL.name("plant_passport"), SQLDataType.VARCHAR(255), this, "Record if the entry has a plant passport.");

    /**
     * The column <code>germinate_db.germinatebase.location_id</code>. Foreign
     * key to locations (locations.id).
     */
    public final TableField<GerminatebaseRecord, Integer> LOCATION_ID = createField(DSL.name("location_id"), SQLDataType.INTEGER, this, "Foreign key to locations (locations.id).");

    /**
     * The column <code>germinate_db.germinatebase.entitytype_id</code>. Foreign
     * key to entitytypes (entitytypes.id).
     */
    public final TableField<GerminatebaseRecord, Integer> ENTITYTYPE_ID = createField(DSL.name("entitytype_id"), SQLDataType.INTEGER.defaultValue(DSL.inline("1", SQLDataType.INTEGER)), this, "Foreign key to entitytypes (entitytypes.id).");

    /**
     * The column <code>germinate_db.germinatebase.entityparent_id</code>.
     * Foreign key to germinatebase (germinatebase.id).
     */
    public final TableField<GerminatebaseRecord, Integer> ENTITYPARENT_ID = createField(DSL.name("entityparent_id"), SQLDataType.INTEGER, this, "Foreign key to germinatebase (germinatebase.id).");

    /**
     * The column <code>germinate_db.germinatebase.pdci</code>. Passport Data
     * Completeness Index. This is calculated by Germinate. Manual editing of
     * this field will be overwritten.
     */
    public final TableField<GerminatebaseRecord, Double> PDCI = createField(DSL.name("pdci"), SQLDataType.FLOAT, this, "Passport Data Completeness Index. This is calculated by Germinate. Manual editing of this field will be overwritten.");

    /**
     * The column <code>germinate_db.germinatebase.created_on</code>. When the
     * record was created.
     */
    public final TableField<GerminatebaseRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.germinatebase.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public final TableField<GerminatebaseRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private Germinatebase(Name alias, Table<GerminatebaseRecord> aliased) {
        this(alias, aliased, null);
    }

    private Germinatebase(Name alias, Table<GerminatebaseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Germinatebase is the Germinate base table which contains passport and other germplasm definition data."), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.germinatebase</code> table reference
     */
    public Germinatebase(String alias) {
        this(DSL.name(alias), GERMINATEBASE);
    }

    /**
     * Create an aliased <code>germinate_db.germinatebase</code> table reference
     */
    public Germinatebase(Name alias) {
        this(alias, GERMINATEBASE);
    }

    /**
     * Create a <code>germinate_db.germinatebase</code> table reference
     */
    public Germinatebase() {
        this(DSL.name("germinatebase"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<GerminatebaseRecord, Integer> getIdentity() {
        return (Identity<GerminatebaseRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<GerminatebaseRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Germinatebase.GERMINATEBASE, DSL.name("KEY_germinatebase_PRIMARY"), new TableField[] { Germinatebase.GERMINATEBASE.ID }, true);
    }

    @Override
    public Germinatebase as(String alias) {
        return new Germinatebase(DSL.name(alias), this);
    }

    @Override
    public Germinatebase as(Name alias) {
        return new Germinatebase(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Germinatebase rename(String name) {
        return new Germinatebase(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Germinatebase rename(Name name) {
        return new Germinatebase(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Integer, String, String, String, String, Integer, String, Integer, Integer, Integer, Double, Timestamp, Timestamp> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
    // @formatter:on
}
