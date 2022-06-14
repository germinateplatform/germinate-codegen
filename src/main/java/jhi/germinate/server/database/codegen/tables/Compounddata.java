/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.CompounddataRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Row9;
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
public class Compounddata extends TableImpl<CompounddataRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.compounddata</code>
     */
    public static final Compounddata COMPOUNDDATA = new Compounddata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CompounddataRecord> getRecordType() {
        return CompounddataRecord.class;
    }

    /**
     * The column <code>germinate_db.compounddata.id</code>. Primary id for this
     * table. This uniquely identifies the row.
     */
    public final TableField<CompounddataRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.compounddata.compound_id</code>. Foreign
     * key compounds (compounds.id).
     */
    public final TableField<CompounddataRecord, Integer> COMPOUND_ID = createField(DSL.name("compound_id"), SQLDataType.INTEGER.nullable(false), this, "Foreign key compounds (compounds.id).");

    /**
     * The column <code>germinate_db.compounddata.germinatebase_id</code>.
     * Foreign key germinatebase (germinatebase.id).
     */
    public final TableField<CompounddataRecord, Integer> GERMINATEBASE_ID = createField(DSL.name("germinatebase_id"), SQLDataType.INTEGER.nullable(false), this, "Foreign key germinatebase (germinatebase.id).");

    /**
     * The column <code>germinate_db.compounddata.dataset_id</code>. Foreign key
     * datasets (datasets.id).
     */
    public final TableField<CompounddataRecord, Integer> DATASET_ID = createField(DSL.name("dataset_id"), SQLDataType.INTEGER.nullable(false), this, "Foreign key datasets (datasets.id).");

    /**
     * The column <code>germinate_db.compounddata.analysismethod_id</code>.
     * Foreign key analysismethods (analysismethods.id).
     */
    public final TableField<CompounddataRecord, Integer> ANALYSISMETHOD_ID = createField(DSL.name("analysismethod_id"), SQLDataType.INTEGER, this, "Foreign key analysismethods (analysismethods.id).");

    /**
     * The column <code>germinate_db.compounddata.compound_value</code>. The
     * compound value for this compound_id and germinatebase_id combination.
     */
    public final TableField<CompounddataRecord, BigDecimal> COMPOUND_VALUE = createField(DSL.name("compound_value"), SQLDataType.DECIMAL(64, 10).nullable(false), this, "The compound value for this compound_id and germinatebase_id combination.");

    /**
     * The column <code>germinate_db.compounddata.recording_date</code>. Date
     * when the phenotypic result was recorded. Should be formatted 'YYYY-MM-DD
     * HH:MM:SS' or just 'YYYY-MM-DD' where a timestamp is not available.
     */
    public final TableField<CompounddataRecord, Timestamp> RECORDING_DATE = createField(DSL.name("recording_date"), SQLDataType.TIMESTAMP(0), this, "Date when the phenotypic result was recorded. Should be formatted 'YYYY-MM-DD HH:MM:SS' or just 'YYYY-MM-DD' where a timestamp is not available.");

    /**
     * The column <code>germinate_db.compounddata.created_on</code>. When the
     * record was created.
     */
    public final TableField<CompounddataRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.compounddata.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public final TableField<CompounddataRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private Compounddata(Name alias, Table<CompounddataRecord> aliased) {
        this(alias, aliased, null);
    }

    private Compounddata(Name alias, Table<CompounddataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.compounddata</code> table reference
     */
    public Compounddata(String alias) {
        this(DSL.name(alias), COMPOUNDDATA);
    }

    /**
     * Create an aliased <code>germinate_db.compounddata</code> table reference
     */
    public Compounddata(Name alias) {
        this(alias, COMPOUNDDATA);
    }

    /**
     * Create a <code>germinate_db.compounddata</code> table reference
     */
    public Compounddata() {
        this(DSL.name("compounddata"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<CompounddataRecord, Integer> getIdentity() {
        return (Identity<CompounddataRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<CompounddataRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Compounddata.COMPOUNDDATA, DSL.name("KEY_compounddata_PRIMARY"), new TableField[] { Compounddata.COMPOUNDDATA.ID }, true);
    }

    @Override
    public Compounddata as(String alias) {
        return new Compounddata(DSL.name(alias), this);
    }

    @Override
    public Compounddata as(Name alias) {
        return new Compounddata(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Compounddata rename(String name) {
        return new Compounddata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Compounddata rename(Name name) {
        return new Compounddata(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, Integer, Integer, Integer, Integer, BigDecimal, Timestamp, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
    // @formatter:on
}
