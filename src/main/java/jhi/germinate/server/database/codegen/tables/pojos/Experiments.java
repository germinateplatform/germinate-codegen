/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;


// @formatter:off
/**
 * Defines ecperiments that are held in Germinate.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Experiments implements Serializable {

    private static final long serialVersionUID = 906388035;

    private Integer   id;
    private String    experimentName;
    private Integer   userId;
    private String    description;
    private Date      experimentDate;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Experiments() {}

    public Experiments(Experiments value) {
        this.id = value.id;
        this.experimentName = value.experimentName;
        this.userId = value.userId;
        this.description = value.description;
        this.experimentDate = value.experimentDate;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Experiments(
        Integer   id,
        String    experimentName,
        Integer   userId,
        String    description,
        Date      experimentDate,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.experimentName = experimentName;
        this.userId = userId;
        this.description = description;
        this.experimentDate = experimentDate;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExperimentName() {
        return this.experimentName;
    }

    public void setExperimentName(String experimentName) {
        this.experimentName = experimentName;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getExperimentDate() {
        return this.experimentDate;
    }

    public void setExperimentDate(Date experimentDate) {
        this.experimentDate = experimentDate;
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
        StringBuilder sb = new StringBuilder("Experiments (");

        sb.append(id);
        sb.append(", ").append(experimentName);
        sb.append(", ").append(userId);
        sb.append(", ").append(description);
        sb.append(", ").append(experimentDate);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
