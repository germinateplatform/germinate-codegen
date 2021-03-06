/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


// @formatter:off
/**
 * The 'units' table holds descriptions of the various units that are used 
 * in the Germinate database. Examples of these would include International 
 * System of Units (SI) base units: kilogram, meter, second, ampere, kelvin, 
 * candela and mole but can include any units that are required.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Units implements Serializable {

    private static final long serialVersionUID = -1978667379;

    private Integer   id;
    private String    unitName;
    private String    unitAbbreviation;
    private String    unitDescription;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Units() {}

    public Units(Units value) {
        this.id = value.id;
        this.unitName = value.unitName;
        this.unitAbbreviation = value.unitAbbreviation;
        this.unitDescription = value.unitDescription;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Units(
        Integer   id,
        String    unitName,
        String    unitAbbreviation,
        String    unitDescription,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.unitName = unitName;
        this.unitAbbreviation = unitAbbreviation;
        this.unitDescription = unitDescription;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnitName() {
        return this.unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitAbbreviation() {
        return this.unitAbbreviation;
    }

    public void setUnitAbbreviation(String unitAbbreviation) {
        this.unitAbbreviation = unitAbbreviation;
    }

    public String getUnitDescription() {
        return this.unitDescription;
    }

    public void setUnitDescription(String unitDescription) {
        this.unitDescription = unitDescription;
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
        StringBuilder sb = new StringBuilder("Units (");

        sb.append(id);
        sb.append(", ").append(unitName);
        sb.append(", ").append(unitAbbreviation);
        sb.append(", ").append(unitDescription);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
