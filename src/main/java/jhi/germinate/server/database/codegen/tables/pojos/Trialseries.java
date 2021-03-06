/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


// @formatter:off
/**
 * Holds the names of trial series. Trial series define the name of the trial 
 * to which trials data is associated. Examples would include the overarching 
 * project.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Trialseries implements Serializable {

    private static final long serialVersionUID = -1014666846;

    private Integer   id;
    private String    seriesname;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Trialseries() {}

    public Trialseries(Trialseries value) {
        this.id = value.id;
        this.seriesname = value.seriesname;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Trialseries(
        Integer   id,
        String    seriesname,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.seriesname = seriesname;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSeriesname() {
        return this.seriesname;
    }

    public void setSeriesname(String seriesname) {
        this.seriesname = seriesname;
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
        StringBuilder sb = new StringBuilder("Trialseries (");

        sb.append(id);
        sb.append(", ").append(seriesname);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
