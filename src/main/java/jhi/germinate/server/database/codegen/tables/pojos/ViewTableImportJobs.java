/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.enums.ViewTableImportJobsDatatype;
import jhi.germinate.server.database.codegen.enums.ViewTableImportJobsStatus;
import jhi.germinate.server.database.pojo.ImportJobStats;


import lombok.*;
import lombok.experimental.Accessors;

// @formatter:off
/**
 * VIEW
 */
@Getter
@Setter
@Accessors(chain = true)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableImportJobs implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer                     id;
    private Boolean                     isUpdate;
    private Integer                     datasetstateId;
    private ViewTableImportJobsDatatype datatype;
    private ViewTableImportJobsStatus   status;
    private ImportJobStats              stats;
    private Timestamp                   createdOn;

    public ViewTableImportJobs() {}

    public ViewTableImportJobs(ViewTableImportJobs value) {
        this.id = value.id;
        this.isUpdate = value.isUpdate;
        this.datasetstateId = value.datasetstateId;
        this.datatype = value.datatype;
        this.status = value.status;
        this.stats = value.stats;
        this.createdOn = value.createdOn;
    }

    public ViewTableImportJobs(
        Integer                     id,
        Boolean                     isUpdate,
        Integer                     datasetstateId,
        ViewTableImportJobsDatatype datatype,
        ViewTableImportJobsStatus   status,
        ImportJobStats              stats,
        Timestamp                   createdOn
    ) {
        this.id = id;
        this.isUpdate = isUpdate;
        this.datasetstateId = datasetstateId;
        this.datatype = datatype;
        this.status = status;
        this.stats = stats;
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTableImportJobs (");

        sb.append(id);
        sb.append(", ").append(isUpdate);
        sb.append(", ").append(datasetstateId);
        sb.append(", ").append(datatype);
        sb.append(", ").append(status);
        sb.append(", ").append(stats);
        sb.append(", ").append(createdOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
