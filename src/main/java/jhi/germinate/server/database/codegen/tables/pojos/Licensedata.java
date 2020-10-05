/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
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
public class Licensedata implements Serializable {

    private static final long serialVersionUID = -1602852867;

    private Integer   id;
    private Integer   licenseId;
    private Integer   localeId;
    private String    content;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Licensedata() {}

    public Licensedata(Licensedata value) {
        this.id = value.id;
        this.licenseId = value.licenseId;
        this.localeId = value.localeId;
        this.content = value.content;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Licensedata(
        Integer   id,
        Integer   licenseId,
        Integer   localeId,
        String    content,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.licenseId = licenseId;
        this.localeId = localeId;
        this.content = content;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLicenseId() {
        return this.licenseId;
    }

    public void setLicenseId(Integer licenseId) {
        this.licenseId = licenseId;
    }

    public Integer getLocaleId() {
        return this.localeId;
    }

    public void setLocaleId(Integer localeId) {
        this.localeId = localeId;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
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
        StringBuilder sb = new StringBuilder("Licensedata (");

        sb.append(id);
        sb.append(", ").append(licenseId);
        sb.append(", ").append(localeId);
        sb.append(", ").append(content);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}