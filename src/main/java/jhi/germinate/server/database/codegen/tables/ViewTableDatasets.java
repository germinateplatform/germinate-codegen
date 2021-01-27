/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import com.google.gson.JsonArray;

import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.binding.DatasetLocationBinding;
import jhi.germinate.server.database.binding.DublinCoreBinding;
import jhi.germinate.server.database.binding.SynonymBinding;
import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.pojos.ViewTableLocations;
import jhi.germinate.server.database.codegen.tables.records.ViewTableDatasetsRecord;
import jhi.germinate.server.database.pojo.DublinCore;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


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
public class ViewTableDatasets extends TableImpl<ViewTableDatasetsRecord> {

    private static final long serialVersionUID = 550446950;

    /**
     * The reference instance of <code>germinate_db.view_table_datasets</code>
     */
    public static final ViewTableDatasets VIEW_TABLE_DATASETS = new ViewTableDatasets();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableDatasetsRecord> getRecordType() {
        return ViewTableDatasetsRecord.class;
    }

    /**
     * The column <code>germinate_db.view_table_datasets.dataset_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableDatasetsRecord, Integer> DATASET_ID = createField("dataset_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_datasets.dataset_name</code>. Describes the dataset.
     */
    public final TableField<ViewTableDatasetsRecord, String> DATASET_NAME = createField("dataset_name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "Describes the dataset.");

    /**
     * The column <code>germinate_db.view_table_datasets.dataset_description</code>. The name of this dataset.
     */
    public final TableField<ViewTableDatasetsRecord, String> DATASET_DESCRIPTION = createField("dataset_description", org.jooq.impl.SQLDataType.CLOB, this, "The name of this dataset.");

    /**
     * The column <code>germinate_db.view_table_datasets.hyperlink</code>. Link to access the external dasets.
     */
    public final TableField<ViewTableDatasetsRecord, String> HYPERLINK = createField("hyperlink", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Link to access the external dasets.");

    /**
     * The column <code>germinate_db.view_table_datasets.source_file</code>.
     */
    public final TableField<ViewTableDatasetsRecord, String> SOURCE_FILE = createField("source_file", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>germinate_db.view_table_datasets.version</code>. Dataset version if this exists.
     */
    public final TableField<ViewTableDatasetsRecord, String> VERSION = createField("version", org.jooq.impl.SQLDataType.CHAR(10), this, "Dataset version if this exists.");

    /**
     * The column <code>germinate_db.view_table_datasets.dataset_type</code>. Describes the experiment type.
     */
    public final TableField<ViewTableDatasetsRecord, String> DATASET_TYPE = createField("dataset_type", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Describes the experiment type.");

    /**
     * The column <code>germinate_db.view_table_datasets.experiment_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableDatasetsRecord, Integer> EXPERIMENT_ID = createField("experiment_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.view_table_datasets.experiment_name</code>. The name of the experiment.
     */
    public final TableField<ViewTableDatasetsRecord, String> EXPERIMENT_NAME = createField("experiment_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "The name of the experiment.");

    /**
     * The column <code>germinate_db.view_table_datasets.experiment_description</code>. Describes the experiment.
     */
    public final TableField<ViewTableDatasetsRecord, String> EXPERIMENT_DESCRIPTION = createField("experiment_description", org.jooq.impl.SQLDataType.CLOB, this, "Describes the experiment.");

    /**
     * The column <code>germinate_db.view_table_datasets.datatype</code>. A description of the data type of the contained data. Examples might be: "raw data", "BLUPs", etc.
     */
    public final TableField<ViewTableDatasetsRecord, String> DATATYPE = createField("datatype", org.jooq.impl.SQLDataType.VARCHAR(255), this, "A description of the data type of the contained data. Examples might be: \"raw data\", \"BLUPs\", etc.");

    /**
     * The column <code>germinate_db.view_table_datasets.dataset_state</code>. Defines the datasetstate.
     */
    public final TableField<ViewTableDatasetsRecord, String> DATASET_STATE = createField("dataset_state", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Defines the datasetstate.");

    /**
     * The column <code>germinate_db.view_table_datasets.locations</code>.
     */
    public final TableField<ViewTableDatasetsRecord, ViewTableLocations[]> LOCATIONS = createField("locations", org.jooq.impl.DefaultDataType.getDefaultDataType("\"germinate_template_4_20_10_30\".\"view_table_datasets_locations\""), this, "", new DatasetLocationBinding());

    /**
     * The column <code>germinate_db.view_table_datasets.license_id</code>.
     */
    public final TableField<ViewTableDatasetsRecord, Integer> LICENSE_ID = createField("license_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>germinate_db.view_table_datasets.license_name</code>.
     */
    public final TableField<ViewTableDatasetsRecord, String> LICENSE_NAME = createField("license_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>germinate_db.view_table_datasets.contact</code>. The contact to get more information about this dataset.
     */
    public final TableField<ViewTableDatasetsRecord, String> CONTACT = createField("contact", org.jooq.impl.SQLDataType.VARCHAR(255), this, "The contact to get more information about this dataset.");

    /**
     * The column <code>germinate_db.view_table_datasets.start_date</code>. Date that the dataset was generated.
     */
    public final TableField<ViewTableDatasetsRecord, Date> START_DATE = createField("start_date", org.jooq.impl.SQLDataType.DATE, this, "Date that the dataset was generated.");

    /**
     * The column <code>germinate_db.view_table_datasets.end_date</code>. Date at which the dataset recording ended.
     */
    public final TableField<ViewTableDatasetsRecord, Date> END_DATE = createField("end_date", org.jooq.impl.SQLDataType.DATE, this, "Date at which the dataset recording ended.");

    /**
     * The column <code>germinate_db.view_table_datasets.dublin_core</code>.
     */
    public final TableField<ViewTableDatasetsRecord, DublinCore> DUBLIN_CORE = createField("dublin_core", org.jooq.impl.DefaultDataType.getDefaultDataType("\"germinate_template_4_20_10_30\".\"view_table_datasets_dublin_core\""), this, "", new DublinCoreBinding());

    /**
     * The column <code>germinate_db.view_table_datasets.created_on</code>. When the record was created.

     */
    public final TableField<ViewTableDatasetsRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP, this, "When the record was created.\n");

    /**
     * The column <code>germinate_db.view_table_datasets.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<ViewTableDatasetsRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP, this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * The column <code>germinate_db.view_table_datasets.data_object_count</code>. The number of data objects contained in this dataset.
     */
    public final TableField<ViewTableDatasetsRecord, ULong> DATA_OBJECT_COUNT = createField("data_object_count", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "The number of data objects contained in this dataset.");

    /**
     * The column <code>germinate_db.view_table_datasets.data_point_count</code>. The number of individual data points contained in this dataset.
     */
    public final TableField<ViewTableDatasetsRecord, ULong> DATA_POINT_COUNT = createField("data_point_count", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "The number of individual data points contained in this dataset.");

    /**
     * The column <code>germinate_db.view_table_datasets.is_external</code>. Defines if the dataset is contained within Germinate or from an external source and not stored in the database.
     */
    public final TableField<ViewTableDatasetsRecord, Boolean> IS_EXTERNAL = createField("is_external", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BOOLEAN)), this, "Defines if the dataset is contained within Germinate or from an external source and not stored in the database.");

    /**
     * The column <code>germinate_db.view_table_datasets.collaborators</code>.
     */
    public final TableField<ViewTableDatasetsRecord, Long> COLLABORATORS = createField("collaborators", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>germinate_db.view_table_datasets.attributes</code>.
     */
    public final TableField<ViewTableDatasetsRecord, Long> ATTRIBUTES = createField("attributes", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>germinate_db.view_table_datasets.accepted_by</code>.
     */
    public final TableField<ViewTableDatasetsRecord, JsonArray> ACCEPTED_BY = createField("accepted_by", org.jooq.impl.DefaultDataType.getDefaultDataType("\"germinate_template_4_20_10_30\".\"view_table_datasets_accepted_by\""), this, "", new SynonymBinding());

    /**
     * Create a <code>germinate_db.view_table_datasets</code> table reference
     */
    public ViewTableDatasets() {
        this(DSL.name("view_table_datasets"), null);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_datasets</code> table reference
     */
    public ViewTableDatasets(String alias) {
        this(DSL.name(alias), VIEW_TABLE_DATASETS);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_datasets</code> table reference
     */
    public ViewTableDatasets(Name alias) {
        this(alias, VIEW_TABLE_DATASETS);
    }

    private ViewTableDatasets(Name alias, Table<ViewTableDatasetsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableDatasets(Name alias, Table<ViewTableDatasetsRecord> aliased, Field<?>[] parameters) {
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
    public ViewTableDatasets as(String alias) {
        return new ViewTableDatasets(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableDatasets as(Name alias) {
        return new ViewTableDatasets(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableDatasets rename(String name) {
        return new ViewTableDatasets(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableDatasets rename(Name name) {
        return new ViewTableDatasets(name, null);
    }
// @formatter:on
}
