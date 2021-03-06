/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class ViewTableMaps implements Serializable {

    private static final long serialVersionUID = -1770550046;

    private Integer mapId;
    private String  mapName;
    private String  mapDescription;
    private Integer userId;
    private Boolean visibility;
    private Long    markerCount;

    public ViewTableMaps() {}

    public ViewTableMaps(ViewTableMaps value) {
        this.mapId = value.mapId;
        this.mapName = value.mapName;
        this.mapDescription = value.mapDescription;
        this.userId = value.userId;
        this.visibility = value.visibility;
        this.markerCount = value.markerCount;
    }

    public ViewTableMaps(
        Integer mapId,
        String  mapName,
        String  mapDescription,
        Integer userId,
        Boolean visibility,
        Long    markerCount
    ) {
        this.mapId = mapId;
        this.mapName = mapName;
        this.mapDescription = mapDescription;
        this.userId = userId;
        this.visibility = visibility;
        this.markerCount = markerCount;
    }

    public Integer getMapId() {
        return this.mapId;
    }

    public void setMapId(Integer mapId) {
        this.mapId = mapId;
    }

    public String getMapName() {
        return this.mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public String getMapDescription() {
        return this.mapDescription;
    }

    public void setMapDescription(String mapDescription) {
        this.mapDescription = mapDescription;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Boolean getVisibility() {
        return this.visibility;
    }

    public void setVisibility(Boolean visibility) {
        this.visibility = visibility;
    }

    public Long getMarkerCount() {
        return this.markerCount;
    }

    public void setMarkerCount(Long markerCount) {
        this.markerCount = markerCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTableMaps (");

        sb.append(mapId);
        sb.append(", ").append(mapName);
        sb.append(", ").append(mapDescription);
        sb.append(", ").append(userId);
        sb.append(", ").append(visibility);
        sb.append(", ").append(markerCount);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
