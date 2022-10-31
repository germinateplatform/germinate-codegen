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
 * Climate overlays can be used in conjunction with OpenStreetMap in order to
 * visualize climate data in a geographic context.
 */
@Getter
@Setter
@Accessors(chain = true)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Climateoverlays implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer   id;
    private Integer   climateId;
    private String    path;
    private Double    bottomLeftLongitude;
    private Double    bottomLeftLatitude;
    private Double    topRightLongitude;
    private Double    topRightLatitude;
    private Boolean   isLegend;
    private String    description;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Climateoverlays() {}

    public Climateoverlays(Climateoverlays value) {
        this.id = value.id;
        this.climateId = value.climateId;
        this.path = value.path;
        this.bottomLeftLongitude = value.bottomLeftLongitude;
        this.bottomLeftLatitude = value.bottomLeftLatitude;
        this.topRightLongitude = value.topRightLongitude;
        this.topRightLatitude = value.topRightLatitude;
        this.isLegend = value.isLegend;
        this.description = value.description;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Climateoverlays(
        Integer   id,
        Integer   climateId,
        String    path,
        Double    bottomLeftLongitude,
        Double    bottomLeftLatitude,
        Double    topRightLongitude,
        Double    topRightLatitude,
        Boolean   isLegend,
        String    description,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.climateId = climateId;
        this.path = path;
        this.bottomLeftLongitude = bottomLeftLongitude;
        this.bottomLeftLatitude = bottomLeftLatitude;
        this.topRightLongitude = topRightLongitude;
        this.topRightLatitude = topRightLatitude;
        this.isLegend = isLegend;
        this.description = description;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Climateoverlays (");

        sb.append(id);
        sb.append(", ").append(climateId);
        sb.append(", ").append(path);
        sb.append(", ").append(bottomLeftLongitude);
        sb.append(", ").append(bottomLeftLatitude);
        sb.append(", ").append(topRightLongitude);
        sb.append(", ").append(topRightLatitude);
        sb.append(", ").append(isLegend);
        sb.append(", ").append(description);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
