/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.binding.SynonymBinding;
import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewTableCompoundDataRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class ViewTableCompoundData extends TableImpl<ViewTableCompoundDataRecord> {

    private static final long serialVersionUID = 2022146386;

    /**
     * The reference instance of <code>germinate_db.view_table_compound_data</code>
     */
    public static final ViewTableCompoundData VIEW_TABLE_COMPOUND_DATA = new ViewTableCompoundData();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableCompoundDataRecord> getRecordType() {
        return ViewTableCompoundDataRecord.class;
    }

    /**
     * The column <code>germinate_db.view_table_compound_data.germplasm_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableCompoundDataRecord, Integer> GERMPLASM_ID = createField("germplasm_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_compound_data.germplasm_gid</code>. A unique identifier.
     */
    public final TableField<ViewTableCompoundDataRecord, String> GERMPLASM_GID = createField("germplasm_gid", org.jooq.impl.SQLDataType.VARCHAR(255), this, "A unique identifier.");

    /**
     * The column <code>germinate_db.view_table_compound_data.germplasm_name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public final TableField<ViewTableCompoundDataRecord, String> GERMPLASM_NAME = createField("germplasm_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "A unique name which defines an entry in the germinatbase table.");

    /**
     * The column <code>germinate_db.view_table_compound_data.germplasm_synonyms</code>. The synonyms as a json array.
     */
    public final TableField<ViewTableCompoundDataRecord, String[]> GERMPLASM_SYNONYMS = createField("germplasm_synonyms", org.jooq.impl.DefaultDataType.getDefaultDataType("\"germinate_template_4_21_11_08\".\"view_table_compound_data_germplasm_synonyms\""), this, "The synonyms as a json array.", new SynonymBinding());

    /**
     * The column <code>germinate_db.view_table_compound_data.entity_parent_name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public final TableField<ViewTableCompoundDataRecord, String> ENTITY_PARENT_NAME = createField("entity_parent_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "A unique name which defines an entry in the germinatbase table.");

    /**
     * The column <code>germinate_db.view_table_compound_data.entity_parent_general_identifier</code>. A unique identifier.
     */
    public final TableField<ViewTableCompoundDataRecord, String> ENTITY_PARENT_GENERAL_IDENTIFIER = createField("entity_parent_general_identifier", org.jooq.impl.SQLDataType.VARCHAR(255), this, "A unique identifier.");

    /**
     * The column <code>germinate_db.view_table_compound_data.entity_type</code>. The name of the entity type.
     */
    public final TableField<ViewTableCompoundDataRecord, String> ENTITY_TYPE = createField("entity_type", org.jooq.impl.SQLDataType.VARCHAR(255), this, "The name of the entity type.");

    /**
     * The column <code>germinate_db.view_table_compound_data.dataset_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableCompoundDataRecord, Integer> DATASET_ID = createField("dataset_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_compound_data.dataset_name</code>. Describes the dataset.
     */
    public final TableField<ViewTableCompoundDataRecord, String> DATASET_NAME = createField("dataset_name", org.jooq.impl.SQLDataType.CLOB, this, "Describes the dataset.");

    /**
     * The column <code>germinate_db.view_table_compound_data.dataset_description</code>. The name of this dataset.
     */
    public final TableField<ViewTableCompoundDataRecord, String> DATASET_DESCRIPTION = createField("dataset_description", org.jooq.impl.SQLDataType.CLOB, this, "The name of this dataset.");

    /**
     * The column <code>germinate_db.view_table_compound_data.compound_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableCompoundDataRecord, Integer> COMPOUND_ID = createField("compound_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_compound_data.compound_name</code>. Compound full name.
     */
    public final TableField<ViewTableCompoundDataRecord, String> COMPOUND_NAME = createField("compound_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Compound full name.");

    /**
     * The column <code>germinate_db.view_table_compound_data.unit_name</code>. The name of the unit. This should be the name of the unit in full.
     */
    public final TableField<ViewTableCompoundDataRecord, String> UNIT_NAME = createField("unit_name", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "The name of the unit. This should be the name of the unit in full.");

    /**
     * The column <code>germinate_db.view_table_compound_data.recording_date</code>. Date when the phenotypic result was recorded. Should be formatted 'YYYY-MM-DD HH:MM:SS' or just 'YYYY-MM-DD' where a timestamp is not available.
     */
    public final TableField<ViewTableCompoundDataRecord, Timestamp> RECORDING_DATE = createField("recording_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "Date when the phenotypic result was recorded. Should be formatted 'YYYY-MM-DD HH:MM:SS' or just 'YYYY-MM-DD' where a timestamp is not available.");

    /**
     * The column <code>germinate_db.view_table_compound_data.compound_value</code>. The compound value for this compound_id and germinatebase_id combination.
     */
    public final TableField<ViewTableCompoundDataRecord, BigDecimal> COMPOUND_VALUE = createField("compound_value", org.jooq.impl.SQLDataType.DECIMAL(64, 10).nullable(false), this, "The compound value for this compound_id and germinatebase_id combination.");

    /**
     * Create a <code>germinate_db.view_table_compound_data</code> table reference
     */
    public ViewTableCompoundData() {
        this(DSL.name("view_table_compound_data"), null);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_compound_data</code> table reference
     */
    public ViewTableCompoundData(String alias) {
        this(DSL.name(alias), VIEW_TABLE_COMPOUND_DATA);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_compound_data</code> table reference
     */
    public ViewTableCompoundData(Name alias) {
        this(alias, VIEW_TABLE_COMPOUND_DATA);
    }

    private ViewTableCompoundData(Name alias, Table<ViewTableCompoundDataRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableCompoundData(Name alias, Table<ViewTableCompoundDataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return GerminateDb.GERMINATE_DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCompoundData as(String alias) {
        return new ViewTableCompoundData(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableCompoundData as(Name alias) {
        return new ViewTableCompoundData(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableCompoundData rename(String name) {
        return new ViewTableCompoundData(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableCompoundData rename(Name name) {
        return new ViewTableCompoundData(name, null);
    }
// @formatter:on
}
