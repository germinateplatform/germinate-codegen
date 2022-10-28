/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;


import lombok.*;
import lombok.experimental.Accessors;

// @formatter:off
/**
 * Holds montly average climate data such as rainfall, temperature or cloud
 * cover. This is based on locations rather than accessions like most of the
 * other tables in Germinate.
 */
@Getter
@Setter
@Accessors(chain = true)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Climatedata implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer   id;
    private Integer   climateId;
    private Integer   locationId;
    private Double    climateValue;
    private Integer   datasetId;
    private Timestamp recordingDate;
    private String    oldRecordingDate;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Climatedata() {}

    public Climatedata(Climatedata value) {
        this.id = value.id;
        this.climateId = value.climateId;
        this.locationId = value.locationId;
        this.climateValue = value.climateValue;
        this.datasetId = value.datasetId;
        this.recordingDate = value.recordingDate;
        this.oldRecordingDate = value.oldRecordingDate;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Climatedata(
        Integer   id,
        Integer   climateId,
        Integer   locationId,
        Double    climateValue,
        Integer   datasetId,
        Timestamp recordingDate,
        String    oldRecordingDate,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.climateId = climateId;
        this.locationId = locationId;
        this.climateValue = climateValue;
        this.datasetId = datasetId;
        this.recordingDate = recordingDate;
        this.oldRecordingDate = oldRecordingDate;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Climatedata (");

        sb.append(id);
        sb.append(", ").append(climateId);
        sb.append(", ").append(locationId);
        sb.append(", ").append(climateValue);
        sb.append(", ").append(datasetId);
        sb.append(", ").append(recordingDate);
        sb.append(", ").append(oldRecordingDate);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
