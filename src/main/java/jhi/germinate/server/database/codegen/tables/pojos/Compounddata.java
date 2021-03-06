/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class Compounddata implements Serializable {

    private static final long serialVersionUID = 1950477486;

    private Integer    id;
    private Integer    compoundId;
    private Integer    germinatebaseId;
    private Integer    datasetId;
    private Integer    analysismethodId;
    private BigDecimal compoundValue;
    private Timestamp  recordingDate;
    private Timestamp  createdOn;
    private Timestamp  updatedOn;

    public Compounddata() {}

    public Compounddata(Compounddata value) {
        this.id = value.id;
        this.compoundId = value.compoundId;
        this.germinatebaseId = value.germinatebaseId;
        this.datasetId = value.datasetId;
        this.analysismethodId = value.analysismethodId;
        this.compoundValue = value.compoundValue;
        this.recordingDate = value.recordingDate;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Compounddata(
        Integer    id,
        Integer    compoundId,
        Integer    germinatebaseId,
        Integer    datasetId,
        Integer    analysismethodId,
        BigDecimal compoundValue,
        Timestamp  recordingDate,
        Timestamp  createdOn,
        Timestamp  updatedOn
    ) {
        this.id = id;
        this.compoundId = compoundId;
        this.germinatebaseId = germinatebaseId;
        this.datasetId = datasetId;
        this.analysismethodId = analysismethodId;
        this.compoundValue = compoundValue;
        this.recordingDate = recordingDate;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompoundId() {
        return this.compoundId;
    }

    public void setCompoundId(Integer compoundId) {
        this.compoundId = compoundId;
    }

    public Integer getGerminatebaseId() {
        return this.germinatebaseId;
    }

    public void setGerminatebaseId(Integer germinatebaseId) {
        this.germinatebaseId = germinatebaseId;
    }

    public Integer getDatasetId() {
        return this.datasetId;
    }

    public void setDatasetId(Integer datasetId) {
        this.datasetId = datasetId;
    }

    public Integer getAnalysismethodId() {
        return this.analysismethodId;
    }

    public void setAnalysismethodId(Integer analysismethodId) {
        this.analysismethodId = analysismethodId;
    }

    public BigDecimal getCompoundValue() {
        return this.compoundValue;
    }

    public void setCompoundValue(BigDecimal compoundValue) {
        this.compoundValue = compoundValue;
    }

    public Timestamp getRecordingDate() {
        return this.recordingDate;
    }

    public void setRecordingDate(Timestamp recordingDate) {
        this.recordingDate = recordingDate;
    }

    public Timestamp getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public Timestamp getUpdatedOn() {
        return this.updatedOn;
    }

    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Compounddata (");

        sb.append(id);
        sb.append(", ").append(compoundId);
        sb.append(", ").append(germinatebaseId);
        sb.append(", ").append(datasetId);
        sb.append(", ").append(analysismethodId);
        sb.append(", ").append(compoundValue);
        sb.append(", ").append(recordingDate);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
