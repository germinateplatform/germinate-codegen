/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


// @formatter:off
/**
 * Description of pedigrees. Pedigrees can have a description which details 
 * additional information about the pedigree, how it was constructed and who 
 * the contact is for the pedigree.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Pedigreedescriptions implements Serializable {

    private static final long serialVersionUID = 476912134;

    private Integer   id;
    private String    name;
    private String    description;
    private String    author;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Pedigreedescriptions() {}

    public Pedigreedescriptions(Pedigreedescriptions value) {
        this.id = value.id;
        this.name = value.name;
        this.description = value.description;
        this.author = value.author;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Pedigreedescriptions(
        Integer   id,
        String    name,
        String    description,
        String    author,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.author = author;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
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
        StringBuilder sb = new StringBuilder("Pedigreedescriptions (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(description);
        sb.append(", ").append(author);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}