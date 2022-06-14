/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.CompoundsRecord;

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
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Compounds extends TableImpl<CompoundsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.compounds</code>
     */
    public static final Compounds COMPOUNDS = new Compounds();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CompoundsRecord> getRecordType() {
        return CompoundsRecord.class;
    }

    /**
     * The column <code>germinate_db.compounds.id</code>. Primary id for this
     * table. This uniquely identifies the row.
     */
    public final TableField<CompoundsRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.compounds.name</code>. Compound full name.
     */
    public final TableField<CompoundsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "Compound full name.");

    /**
     * The column <code>germinate_db.compounds.description</code>. Full
     * description of the compound. This should contain enough infomation to
     * accurately identify the compound and how it was recorded.
     */
    public final TableField<CompoundsRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(255), this, "Full description of the compound. This should contain enough infomation to accurately identify the compound and how it was recorded.");

    /**
     * The column <code>germinate_db.compounds.molecular_formula</code>. The
     * molecular formula of the compound.
     */
    public final TableField<CompoundsRecord, String> MOLECULAR_FORMULA = createField(DSL.name("molecular_formula"), SQLDataType.VARCHAR(255), this, "The molecular formula of the compound.");

    /**
     * The column <code>germinate_db.compounds.monoisotopic_mass</code>. The
     * monoisotopic mass of the compound.
     */
    public final TableField<CompoundsRecord, BigDecimal> MONOISOTOPIC_MASS = createField(DSL.name("monoisotopic_mass"), SQLDataType.DECIMAL(64, 10), this, "The monoisotopic mass of the compound.");

    /**
     * The column <code>germinate_db.compounds.average_mass</code>. The average
     * mass of the compound.
     */
    public final TableField<CompoundsRecord, BigDecimal> AVERAGE_MASS = createField(DSL.name("average_mass"), SQLDataType.DECIMAL(64, 10), this, "The average mass of the compound.");

    /**
     * The column <code>germinate_db.compounds.compound_class</code>. A
     * classification of the compound.
     */
    public final TableField<CompoundsRecord, String> COMPOUND_CLASS = createField(DSL.name("compound_class"), SQLDataType.VARCHAR(255), this, "A classification of the compound.");

    /**
     * The column <code>germinate_db.compounds.unit_id</code>. Foreign Key to
     * units (units.id).
     */
    public final TableField<CompoundsRecord, Integer> UNIT_ID = createField(DSL.name("unit_id"), SQLDataType.INTEGER, this, "Foreign Key to units (units.id).");

    /**
     * The column <code>germinate_db.compounds.created_on</code>. When the
     * record was created.
     */
    public final TableField<CompoundsRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.compounds.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public final TableField<CompoundsRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private Compounds(Name alias, Table<CompoundsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Compounds(Name alias, Table<CompoundsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.compounds</code> table reference
     */
    public Compounds(String alias) {
        this(DSL.name(alias), COMPOUNDS);
    }

    /**
     * Create an aliased <code>germinate_db.compounds</code> table reference
     */
    public Compounds(Name alias) {
        this(alias, COMPOUNDS);
    }

    /**
     * Create a <code>germinate_db.compounds</code> table reference
     */
    public Compounds() {
        this(DSL.name("compounds"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<CompoundsRecord, Integer> getIdentity() {
        return (Identity<CompoundsRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<CompoundsRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Compounds.COMPOUNDS, DSL.name("KEY_compounds_PRIMARY"), new TableField[] { Compounds.COMPOUNDS.ID }, true);
    }

    @Override
    public Compounds as(String alias) {
        return new Compounds(DSL.name(alias), this);
    }

    @Override
    public Compounds as(Name alias) {
        return new Compounds(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Compounds rename(String name) {
        return new Compounds(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Compounds rename(Name name) {
        return new Compounds(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, String, String, BigDecimal, BigDecimal, String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
    // @formatter:on
}
