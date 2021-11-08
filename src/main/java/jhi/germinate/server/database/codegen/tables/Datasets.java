/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jhi.germinate.server.database.binding.DublinCoreBinding;
import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.DatasetsRecord;
import jhi.germinate.server.database.pojo.DublinCore;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.TableImpl;


// @formatter:off
/**
 * Datasets which are defined within Germinate although there can be external 
 * datasets which are links out to external data sources most will be held 
 * within Germinate.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Datasets extends TableImpl<DatasetsRecord> {

    private static final long serialVersionUID = -1619446382;

    /**
     * The reference instance of <code>germinate_db.datasets</code>
     */
    public static final Datasets DATASETS = new Datasets();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DatasetsRecord> getRecordType() {
        return DatasetsRecord.class;
    }

    /**
     * The column <code>germinate_db.datasets.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<DatasetsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.datasets.experiment_id</code>. Foreign key to experiments (experiments.id).
     */
    public final TableField<DatasetsRecord, Integer> EXPERIMENT_ID = createField("experiment_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "Foreign key to experiments (experiments.id).");

    /**
     * The column <code>germinate_db.datasets.datasettype_id</code>. Foreign key to datasettypes (datasettypes.id).
     */
    public final TableField<DatasetsRecord, Integer> DATASETTYPE_ID = createField("datasettype_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("-1", org.jooq.impl.SQLDataType.INTEGER)), this, "Foreign key to datasettypes (datasettypes.id).");

    /**
     * The column <code>germinate_db.datasets.name</code>. Describes the dataset.
     */
    public final TableField<DatasetsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "Describes the dataset.");

    /**
     * The column <code>germinate_db.datasets.description</code>. The name of this dataset.
     */
    public final TableField<DatasetsRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "The name of this dataset.");

    /**
     * The column <code>germinate_db.datasets.date_start</code>. Date that the dataset was generated.
     */
    public final TableField<DatasetsRecord, Date> DATE_START = createField("date_start", org.jooq.impl.SQLDataType.DATE, this, "Date that the dataset was generated.");

    /**
     * The column <code>germinate_db.datasets.date_end</code>. Date at which the dataset recording ended.
     */
    public final TableField<DatasetsRecord, Date> DATE_END = createField("date_end", org.jooq.impl.SQLDataType.DATE, this, "Date at which the dataset recording ended.");

    /**
     * The column <code>germinate_db.datasets.source_file</code>.
     */
    public final TableField<DatasetsRecord, String> SOURCE_FILE = createField("source_file", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>germinate_db.datasets.datatype</code>. A description of the data type of the contained data. Examples might be: "raw data", "BLUPs", etc.
     */
    public final TableField<DatasetsRecord, String> DATATYPE = createField("datatype", org.jooq.impl.SQLDataType.VARCHAR(255), this, "A description of the data type of the contained data. Examples might be: \"raw data\", \"BLUPs\", etc.");

    /**
     * The column <code>germinate_db.datasets.dublin_core</code>.
     */
    public final TableField<DatasetsRecord, DublinCore> DUBLIN_CORE = createField("dublin_core", org.jooq.impl.DefaultDataType.getDefaultDataType("\"germinate_template_4_21_11_08\".\"datasets_dublin_core\""), this, "", new DublinCoreBinding());

    /**
     * The column <code>germinate_db.datasets.version</code>. Dataset version if this exists.
     */
    public final TableField<DatasetsRecord, String> VERSION = createField("version", org.jooq.impl.SQLDataType.CHAR(10), this, "Dataset version if this exists.");

    /**
     * The column <code>germinate_db.datasets.created_by</code>. Defines who created the dataset. This is a FK in Gatekeeper users table. Foreign key to Gatekeeper users (users.id).
     */
    public final TableField<DatasetsRecord, Integer> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.INTEGER, this, "Defines who created the dataset. This is a FK in Gatekeeper users table. Foreign key to Gatekeeper users (users.id).");

    /**
     * The column <code>germinate_db.datasets.dataset_state_id</code>. Foreign key to datasetstates (datasetstates.id).
     */
    public final TableField<DatasetsRecord, Integer> DATASET_STATE_ID = createField("dataset_state_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "Foreign key to datasetstates (datasetstates.id).");

    /**
     * The column <code>germinate_db.datasets.license_id</code>.
     */
    public final TableField<DatasetsRecord, Integer> LICENSE_ID = createField("license_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>germinate_db.datasets.is_external</code>. Defines if the dataset is contained within Germinate or from an external source and not stored in the database.
     */
    public final TableField<DatasetsRecord, Boolean> IS_EXTERNAL = createField("is_external", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BOOLEAN)), this, "Defines if the dataset is contained within Germinate or from an external source and not stored in the database.");

    /**
     * The column <code>germinate_db.datasets.hyperlink</code>. Link to access the external dasets.
     */
    public final TableField<DatasetsRecord, String> HYPERLINK = createField("hyperlink", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Link to access the external dasets.");

    /**
     * The column <code>germinate_db.datasets.created_on</code>. When the record was created.

     */
    public final TableField<DatasetsRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.\n");

    /**
     * The column <code>germinate_db.datasets.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<DatasetsRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * The column <code>germinate_db.datasets.contact</code>. The contact to get more information about this dataset.
     */
    public final TableField<DatasetsRecord, String> CONTACT = createField("contact", org.jooq.impl.SQLDataType.VARCHAR(255), this, "The contact to get more information about this dataset.");

    /**
     * Create a <code>germinate_db.datasets</code> table reference
     */
    public Datasets() {
        this(DSL.name("datasets"), null);
    }

    /**
     * Create an aliased <code>germinate_db.datasets</code> table reference
     */
    public Datasets(String alias) {
        this(DSL.name(alias), DATASETS);
    }

    /**
     * Create an aliased <code>germinate_db.datasets</code> table reference
     */
    public Datasets(Name alias) {
        this(alias, DATASETS);
    }

    private Datasets(Name alias, Table<DatasetsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Datasets(Name alias, Table<DatasetsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Datasets which are defined within Germinate although there can be external datasets which are links out to external data sources most will be held within Germinate."));
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
    public Identity<DatasetsRecord, Integer> getIdentity() {
        return Internal.createIdentity(jhi.germinate.server.database.codegen.tables.Datasets.DATASETS, jhi.germinate.server.database.codegen.tables.Datasets.DATASETS.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DatasetsRecord> getPrimaryKey() {
        return Internal.createUniqueKey(jhi.germinate.server.database.codegen.tables.Datasets.DATASETS, "KEY_datasets_PRIMARY", jhi.germinate.server.database.codegen.tables.Datasets.DATASETS.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DatasetsRecord>> getKeys() {
        return Arrays.<UniqueKey<DatasetsRecord>>asList(
              Internal.createUniqueKey(jhi.germinate.server.database.codegen.tables.Datasets.DATASETS, "KEY_datasets_PRIMARY", jhi.germinate.server.database.codegen.tables.Datasets.DATASETS.ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Datasets as(String alias) {
        return new Datasets(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Datasets as(Name alias) {
        return new Datasets(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Datasets rename(String name) {
        return new Datasets(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Datasets rename(Name name) {
        return new Datasets(name, null);
    }
// @formatter:on
}
