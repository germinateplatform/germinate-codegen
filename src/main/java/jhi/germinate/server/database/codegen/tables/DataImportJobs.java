/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jhi.germinate.server.database.binding.ImportResultBinding;
import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.enums.DataImportJobsDatatype;
import jhi.germinate.server.database.codegen.enums.DataImportJobsStatus;
import jhi.germinate.server.database.codegen.tables.records.DataImportJobsRecord;
import jhi.germinate.server.database.pojo.ImportResult;

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
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DataImportJobs extends TableImpl<DataImportJobsRecord> {

    private static final long serialVersionUID = -1889349610;

    /**
     * The reference instance of <code>germinate_db.data_import_jobs</code>
     */
    public static final DataImportJobs DATA_IMPORT_JOBS = new DataImportJobs();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DataImportJobsRecord> getRecordType() {
        return DataImportJobsRecord.class;
    }

    /**
     * The column <code>germinate_db.data_import_jobs.id</code>.
     */
    public final TableField<DataImportJobsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>germinate_db.data_import_jobs.uuid</code>.
     */
    public final TableField<DataImportJobsRecord, String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>germinate_db.data_import_jobs.job_id</code>.
     */
    public final TableField<DataImportJobsRecord, String> JOB_ID = createField("job_id", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>germinate_db.data_import_jobs.user_id</code>.
     */
    public final TableField<DataImportJobsRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>germinate_db.data_import_jobs.original_filename</code>.
     */
    public final TableField<DataImportJobsRecord, String> ORIGINAL_FILENAME = createField("original_filename", org.jooq.impl.SQLDataType.VARCHAR(266).nullable(false), this, "");

    /**
     * The column <code>germinate_db.data_import_jobs.is_update</code>.
     */
    public final TableField<DataImportJobsRecord, Boolean> IS_UPDATE = createField("is_update", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>germinate_db.data_import_jobs.datasetstate_id</code>.
     */
    public final TableField<DataImportJobsRecord, Integer> DATASETSTATE_ID = createField("datasetstate_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>germinate_db.data_import_jobs.datatype</code>.
     */
    public final TableField<DataImportJobsRecord, DataImportJobsDatatype> DATATYPE = createField("datatype", org.jooq.impl.SQLDataType.VARCHAR(8).nullable(false).defaultValue(org.jooq.impl.DSL.inline("mcpd", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(jhi.germinate.server.database.codegen.enums.DataImportJobsDatatype.class), this, "");

    /**
     * The column <code>germinate_db.data_import_jobs.status</code>.
     */
    public final TableField<DataImportJobsRecord, DataImportJobsStatus> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(9).nullable(false).defaultValue(org.jooq.impl.DSL.inline("waiting", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(jhi.germinate.server.database.codegen.enums.DataImportJobsStatus.class), this, "");

    /**
     * The column <code>germinate_db.data_import_jobs.imported</code>.
     */
    public final TableField<DataImportJobsRecord, Boolean> IMPORTED = createField("imported", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>germinate_db.data_import_jobs.visibility</code>.
     */
    public final TableField<DataImportJobsRecord, Boolean> VISIBILITY = createField("visibility", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>germinate_db.data_import_jobs.feedback</code>.
     */
    public final TableField<DataImportJobsRecord, ImportResult[]> FEEDBACK = createField("feedback", org.jooq.impl.DefaultDataType.getDefaultDataType("\"germinate_template_4_22_05_04\".\"data_import_jobs_feedback\""), this, "", new ImportResultBinding());

    /**
     * The column <code>germinate_db.data_import_jobs.created_on</code>.
     */
    public final TableField<DataImportJobsRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>germinate_db.data_import_jobs.updated_on</code>.
     */
    public final TableField<DataImportJobsRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>germinate_db.data_import_jobs</code> table reference
     */
    public DataImportJobs() {
        this(DSL.name("data_import_jobs"), null);
    }

    /**
     * Create an aliased <code>germinate_db.data_import_jobs</code> table reference
     */
    public DataImportJobs(String alias) {
        this(DSL.name(alias), DATA_IMPORT_JOBS);
    }

    /**
     * Create an aliased <code>germinate_db.data_import_jobs</code> table reference
     */
    public DataImportJobs(Name alias) {
        this(alias, DATA_IMPORT_JOBS);
    }

    private DataImportJobs(Name alias, Table<DataImportJobsRecord> aliased) {
        this(alias, aliased, null);
    }

    private DataImportJobs(Name alias, Table<DataImportJobsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
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
    public Identity<DataImportJobsRecord, Integer> getIdentity() {
        return Internal.createIdentity(jhi.germinate.server.database.codegen.tables.DataImportJobs.DATA_IMPORT_JOBS, jhi.germinate.server.database.codegen.tables.DataImportJobs.DATA_IMPORT_JOBS.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DataImportJobsRecord> getPrimaryKey() {
        return Internal.createUniqueKey(jhi.germinate.server.database.codegen.tables.DataImportJobs.DATA_IMPORT_JOBS, "KEY_data_import_jobs_PRIMARY", jhi.germinate.server.database.codegen.tables.DataImportJobs.DATA_IMPORT_JOBS.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DataImportJobsRecord>> getKeys() {
        return Arrays.<UniqueKey<DataImportJobsRecord>>asList(
              Internal.createUniqueKey(jhi.germinate.server.database.codegen.tables.DataImportJobs.DATA_IMPORT_JOBS, "KEY_data_import_jobs_PRIMARY", jhi.germinate.server.database.codegen.tables.DataImportJobs.DATA_IMPORT_JOBS.ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataImportJobs as(String alias) {
        return new DataImportJobs(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataImportJobs as(Name alias) {
        return new DataImportJobs(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DataImportJobs rename(String name) {
        return new DataImportJobs(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DataImportJobs rename(Name name) {
        return new DataImportJobs(name, null);
    }
// @formatter:on
}
