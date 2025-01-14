/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.enums.PhenotypesDatatype;
import jhi.germinate.server.database.pojo.TraitRestrictions;


import lombok.*;
import lombok.experimental.Accessors;

// @formatter:off
/**
 * Defines phenoytpes which are held in Germinate.
 */
@Getter
@Setter
@Accessors(chain = true)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Phenotypes implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer            id;
    private String             name;
    private String             shortName;
    private String             description;
    private PhenotypesDatatype datatype;
    private TraitRestrictions  restrictions;
    private Integer            unitId;
    private Integer            categoryId;
    private Timestamp          createdOn;
    private Timestamp          updatedOn;

    public Phenotypes() {}

    public Phenotypes(Phenotypes value) {
        this.id = value.id;
        this.name = value.name;
        this.shortName = value.shortName;
        this.description = value.description;
        this.datatype = value.datatype;
        this.restrictions = value.restrictions;
        this.unitId = value.unitId;
        this.categoryId = value.categoryId;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Phenotypes(
        Integer            id,
        String             name,
        String             shortName,
        String             description,
        PhenotypesDatatype datatype,
        TraitRestrictions  restrictions,
        Integer            unitId,
        Integer            categoryId,
        Timestamp          createdOn,
        Timestamp          updatedOn
    ) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.description = description;
        this.datatype = datatype;
        this.restrictions = restrictions;
        this.unitId = unitId;
        this.categoryId = categoryId;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Phenotypes (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(shortName);
        sb.append(", ").append(description);
        sb.append(", ").append(datatype);
        sb.append(", ").append(restrictions);
        sb.append(", ").append(unitId);
        sb.append(", ").append(categoryId);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
