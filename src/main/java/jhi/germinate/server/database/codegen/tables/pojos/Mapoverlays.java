/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.enums.MapoverlaysReferenceTable;


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
public class Mapoverlays implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer                   id;
    private String                    name;
    private String                    description;
    private BigDecimal                bottomLeftLat;
    private BigDecimal                bottomLeftLng;
    private BigDecimal                topRightLat;
    private BigDecimal                topRightLng;
    private Boolean                   isLegend;
    private MapoverlaysReferenceTable referenceTable;
    private Integer                   foreignId;
    private Integer                   datasetId;
    private Timestamp                 recordingDate;
    private Timestamp                 createdOn;
    private Timestamp                 updatedOn;

    public Mapoverlays() {}

    public Mapoverlays(Mapoverlays value) {
        this.id = value.id;
        this.name = value.name;
        this.description = value.description;
        this.bottomLeftLat = value.bottomLeftLat;
        this.bottomLeftLng = value.bottomLeftLng;
        this.topRightLat = value.topRightLat;
        this.topRightLng = value.topRightLng;
        this.isLegend = value.isLegend;
        this.referenceTable = value.referenceTable;
        this.foreignId = value.foreignId;
        this.datasetId = value.datasetId;
        this.recordingDate = value.recordingDate;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Mapoverlays(
        Integer                   id,
        String                    name,
        String                    description,
        BigDecimal                bottomLeftLat,
        BigDecimal                bottomLeftLng,
        BigDecimal                topRightLat,
        BigDecimal                topRightLng,
        Boolean                   isLegend,
        MapoverlaysReferenceTable referenceTable,
        Integer                   foreignId,
        Integer                   datasetId,
        Timestamp                 recordingDate,
        Timestamp                 createdOn,
        Timestamp                 updatedOn
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.bottomLeftLat = bottomLeftLat;
        this.bottomLeftLng = bottomLeftLng;
        this.topRightLat = topRightLat;
        this.topRightLng = topRightLng;
        this.isLegend = isLegend;
        this.referenceTable = referenceTable;
        this.foreignId = foreignId;
        this.datasetId = datasetId;
        this.recordingDate = recordingDate;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Mapoverlays (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(description);
        sb.append(", ").append(bottomLeftLat);
        sb.append(", ").append(bottomLeftLng);
        sb.append(", ").append(topRightLat);
        sb.append(", ").append(topRightLng);
        sb.append(", ").append(isLegend);
        sb.append(", ").append(referenceTable);
        sb.append(", ").append(foreignId);
        sb.append(", ").append(datasetId);
        sb.append(", ").append(recordingDate);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
