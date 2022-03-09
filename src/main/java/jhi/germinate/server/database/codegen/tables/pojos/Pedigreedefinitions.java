/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


// @formatter:off
/**
 * This table holds the actual pedigree definition data.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Pedigreedefinitions implements Serializable {

    private static final long serialVersionUID = -1182574195;

    private Integer   id;
    private Integer   datasetId;
    private Integer   germinatebaseId;
    private Integer   pedigreenotationId;
    private Integer   pedigreedescriptionId;
    private String    definition;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Pedigreedefinitions() {}

    public Pedigreedefinitions(Pedigreedefinitions value) {
        this.id = value.id;
        this.datasetId = value.datasetId;
        this.germinatebaseId = value.germinatebaseId;
        this.pedigreenotationId = value.pedigreenotationId;
        this.pedigreedescriptionId = value.pedigreedescriptionId;
        this.definition = value.definition;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Pedigreedefinitions(
        Integer   id,
        Integer   datasetId,
        Integer   germinatebaseId,
        Integer   pedigreenotationId,
        Integer   pedigreedescriptionId,
        String    definition,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.datasetId = datasetId;
        this.germinatebaseId = germinatebaseId;
        this.pedigreenotationId = pedigreenotationId;
        this.pedigreedescriptionId = pedigreedescriptionId;
        this.definition = definition;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDatasetId() {
        return this.datasetId;
    }

    public void setDatasetId(Integer datasetId) {
        this.datasetId = datasetId;
    }

    public Integer getGerminatebaseId() {
        return this.germinatebaseId;
    }

    public void setGerminatebaseId(Integer germinatebaseId) {
        this.germinatebaseId = germinatebaseId;
    }

    public Integer getPedigreenotationId() {
        return this.pedigreenotationId;
    }

    public void setPedigreenotationId(Integer pedigreenotationId) {
        this.pedigreenotationId = pedigreenotationId;
    }

    public Integer getPedigreedescriptionId() {
        return this.pedigreedescriptionId;
    }

    public void setPedigreedescriptionId(Integer pedigreedescriptionId) {
        this.pedigreedescriptionId = pedigreedescriptionId;
    }

    public String getDefinition() {
        return this.definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
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
        StringBuilder sb = new StringBuilder("Pedigreedefinitions (");

        sb.append(id);
        sb.append(", ").append(datasetId);
        sb.append(", ").append(germinatebaseId);
        sb.append(", ").append(pedigreenotationId);
        sb.append(", ").append(pedigreedescriptionId);
        sb.append(", ").append(definition);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
