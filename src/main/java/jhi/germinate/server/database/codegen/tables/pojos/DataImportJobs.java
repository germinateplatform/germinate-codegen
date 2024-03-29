/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;

import jhi.germinate.server.database.codegen.enums.DataImportJobsDatatype;
import jhi.germinate.server.database.codegen.enums.DataImportJobsStatus;
import jhi.germinate.server.database.pojo.ImportJobDetails;
import jhi.germinate.server.database.pojo.ImportJobStats;
import jhi.germinate.server.database.pojo.ImportResult;


import lombok.*;
import lombok.experimental.Accessors;

// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@Getter
@Setter
@Accessors(chain = true)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DataImportJobs implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer                id;
    private String                 uuid;
    private String                 jobId;
    private ImportJobDetails       jobConfig;
    private Integer                userId;
    private String                 originalFilename;
    private Boolean                isUpdate;
    private Integer                datasetstateId;
    private DataImportJobsDatatype datatype;
    private DataImportJobsStatus   status;
    private Boolean                imported;
    private Boolean                visibility;
    private ImportResult[]         feedback;
    private ImportJobStats         stats;
    private Timestamp              createdOn;
    private Timestamp              updatedOn;

    public DataImportJobs() {}

    public DataImportJobs(DataImportJobs value) {
        this.id = value.id;
        this.uuid = value.uuid;
        this.jobId = value.jobId;
        this.jobConfig = value.jobConfig;
        this.userId = value.userId;
        this.originalFilename = value.originalFilename;
        this.isUpdate = value.isUpdate;
        this.datasetstateId = value.datasetstateId;
        this.datatype = value.datatype;
        this.status = value.status;
        this.imported = value.imported;
        this.visibility = value.visibility;
        this.feedback = value.feedback;
        this.stats = value.stats;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public DataImportJobs(
        Integer                id,
        String                 uuid,
        String                 jobId,
        ImportJobDetails       jobConfig,
        Integer                userId,
        String                 originalFilename,
        Boolean                isUpdate,
        Integer                datasetstateId,
        DataImportJobsDatatype datatype,
        DataImportJobsStatus   status,
        Boolean                imported,
        Boolean                visibility,
        ImportResult[]         feedback,
        ImportJobStats         stats,
        Timestamp              createdOn,
        Timestamp              updatedOn
    ) {
        this.id = id;
        this.uuid = uuid;
        this.jobId = jobId;
        this.jobConfig = jobConfig;
        this.userId = userId;
        this.originalFilename = originalFilename;
        this.isUpdate = isUpdate;
        this.datasetstateId = datasetstateId;
        this.datatype = datatype;
        this.status = status;
        this.imported = imported;
        this.visibility = visibility;
        this.feedback = feedback;
        this.stats = stats;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DataImportJobs (");

        sb.append(id);
        sb.append(", ").append(uuid);
        sb.append(", ").append(jobId);
        sb.append(", ").append(jobConfig);
        sb.append(", ").append(userId);
        sb.append(", ").append(originalFilename);
        sb.append(", ").append(isUpdate);
        sb.append(", ").append(datasetstateId);
        sb.append(", ").append(datatype);
        sb.append(", ").append(status);
        sb.append(", ").append(imported);
        sb.append(", ").append(visibility);
        sb.append(", ").append(Arrays.toString(feedback));
        sb.append(", ").append(stats);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
