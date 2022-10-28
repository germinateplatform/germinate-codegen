/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


import lombok.*;
import lombok.experimental.Accessors;

// @formatter:off
/**
 * Contains phenotypic data which has been collected.
 */
@Getter
@Setter
@Accessors(chain = true)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Phenotypedata implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer    id;
    private Integer    phenotypeId;
    private Integer    germinatebaseId;
    private String     rep;
    private String     block;
    private Short      trialRow;
    private Short      trialColumn;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private BigDecimal elevation;
    private String     phenotypeValue;
    private Integer    datasetId;
    private Timestamp  recordingDate;
    private Timestamp  createdOn;
    private Timestamp  updatedOn;
    private Integer    locationId;
    private Integer    treatmentId;
    private Integer    trialseriesId;

    public Phenotypedata() {}

    public Phenotypedata(Phenotypedata value) {
        this.id = value.id;
        this.phenotypeId = value.phenotypeId;
        this.germinatebaseId = value.germinatebaseId;
        this.rep = value.rep;
        this.block = value.block;
        this.trialRow = value.trialRow;
        this.trialColumn = value.trialColumn;
        this.latitude = value.latitude;
        this.longitude = value.longitude;
        this.elevation = value.elevation;
        this.phenotypeValue = value.phenotypeValue;
        this.datasetId = value.datasetId;
        this.recordingDate = value.recordingDate;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
        this.locationId = value.locationId;
        this.treatmentId = value.treatmentId;
        this.trialseriesId = value.trialseriesId;
    }

    public Phenotypedata(
        Integer    id,
        Integer    phenotypeId,
        Integer    germinatebaseId,
        String     rep,
        String     block,
        Short      trialRow,
        Short      trialColumn,
        BigDecimal latitude,
        BigDecimal longitude,
        BigDecimal elevation,
        String     phenotypeValue,
        Integer    datasetId,
        Timestamp  recordingDate,
        Timestamp  createdOn,
        Timestamp  updatedOn,
        Integer    locationId,
        Integer    treatmentId,
        Integer    trialseriesId
    ) {
        this.id = id;
        this.phenotypeId = phenotypeId;
        this.germinatebaseId = germinatebaseId;
        this.rep = rep;
        this.block = block;
        this.trialRow = trialRow;
        this.trialColumn = trialColumn;
        this.latitude = latitude;
        this.longitude = longitude;
        this.elevation = elevation;
        this.phenotypeValue = phenotypeValue;
        this.datasetId = datasetId;
        this.recordingDate = recordingDate;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.locationId = locationId;
        this.treatmentId = treatmentId;
        this.trialseriesId = trialseriesId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Phenotypedata (");

        sb.append(id);
        sb.append(", ").append(phenotypeId);
        sb.append(", ").append(germinatebaseId);
        sb.append(", ").append(rep);
        sb.append(", ").append(block);
        sb.append(", ").append(trialRow);
        sb.append(", ").append(trialColumn);
        sb.append(", ").append(latitude);
        sb.append(", ").append(longitude);
        sb.append(", ").append(elevation);
        sb.append(", ").append(phenotypeValue);
        sb.append(", ").append(datasetId);
        sb.append(", ").append(recordingDate);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);
        sb.append(", ").append(locationId);
        sb.append(", ").append(treatmentId);
        sb.append(", ").append(trialseriesId);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
