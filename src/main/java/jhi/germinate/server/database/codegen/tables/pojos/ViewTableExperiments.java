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
public class ViewTableExperiments implements Serializable {

    private static final long serialVersionUID = 1233385240;

    private Integer   experimentId;
    private String    experimentName;
    private String    experimentDescription;
    private Date      experimentDate;
    private Timestamp createdOn;
    private Long      genotypeCount;
    private Long      trialsCount;
    private Long      alleleFreqCount;
    private Long      climateCount;
    private Long      compoundCount;

    public ViewTableExperiments() {}

    public ViewTableExperiments(ViewTableExperiments value) {
        this.experimentId = value.experimentId;
        this.experimentName = value.experimentName;
        this.experimentDescription = value.experimentDescription;
        this.experimentDate = value.experimentDate;
        this.createdOn = value.createdOn;
        this.genotypeCount = value.genotypeCount;
        this.trialsCount = value.trialsCount;
        this.alleleFreqCount = value.alleleFreqCount;
        this.climateCount = value.climateCount;
        this.compoundCount = value.compoundCount;
    }

    public ViewTableExperiments(
        Integer   experimentId,
        String    experimentName,
        String    experimentDescription,
        Date      experimentDate,
        Timestamp createdOn,
        Long      genotypeCount,
        Long      trialsCount,
        Long      alleleFreqCount,
        Long      climateCount,
        Long      compoundCount
    ) {
        this.experimentId = experimentId;
        this.experimentName = experimentName;
        this.experimentDescription = experimentDescription;
        this.experimentDate = experimentDate;
        this.createdOn = createdOn;
        this.genotypeCount = genotypeCount;
        this.trialsCount = trialsCount;
        this.alleleFreqCount = alleleFreqCount;
        this.climateCount = climateCount;
        this.compoundCount = compoundCount;
    }

    public Integer getExperimentId() {
        return this.experimentId;
    }

    public void setExperimentId(Integer experimentId) {
        this.experimentId = experimentId;
    }

    public String getExperimentName() {
        return this.experimentName;
    }

    public void setExperimentName(String experimentName) {
        this.experimentName = experimentName;
    }

    public String getExperimentDescription() {
        return this.experimentDescription;
    }

    public void setExperimentDescription(String experimentDescription) {
        this.experimentDescription = experimentDescription;
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

    public Long getGenotypeCount() {
        return this.genotypeCount;
    }

    public void setGenotypeCount(Long genotypeCount) {
        this.genotypeCount = genotypeCount;
    }

    public Long getTrialsCount() {
        return this.trialsCount;
    }

    public void setTrialsCount(Long trialsCount) {
        this.trialsCount = trialsCount;
    }

    public Long getAlleleFreqCount() {
        return this.alleleFreqCount;
    }

    public void setAlleleFreqCount(Long alleleFreqCount) {
        this.alleleFreqCount = alleleFreqCount;
    }

    public Long getClimateCount() {
        return this.climateCount;
    }

    public void setClimateCount(Long climateCount) {
        this.climateCount = climateCount;
    }

    public Long getCompoundCount() {
        return this.compoundCount;
    }

    public void setCompoundCount(Long compoundCount) {
        this.compoundCount = compoundCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTableExperiments (");

        sb.append(experimentId);
        sb.append(", ").append(experimentName);
        sb.append(", ").append(experimentDescription);
        sb.append(", ").append(experimentDate);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(genotypeCount);
        sb.append(", ").append(trialsCount);
        sb.append(", ").append(alleleFreqCount);
        sb.append(", ").append(climateCount);
        sb.append(", ").append(compoundCount);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
