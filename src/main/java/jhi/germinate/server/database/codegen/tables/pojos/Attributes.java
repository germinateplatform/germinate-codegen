/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.enums.AttributesDatatype;


import lombok.*;
import lombok.experimental.Accessors;

// @formatter:off
/**
 * Describes attributes. Attributes are bits of information that can be joined
 * to, for example, a germinatebase entry. These are bits of data that while
 * important do not warrant adding additional columns in the other tables.
 * Examples would be using this to define ecotypes for germinatebase entries.
 */
@Getter
@Setter
@Accessors(chain = true)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Attributes implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer            id;
    private String             name;
    private String             description;
    private AttributesDatatype datatype;
    private String             targetTable;
    private Timestamp          createdOn;
    private Timestamp          updatedOn;

    public Attributes() {}

    public Attributes(Attributes value) {
        this.id = value.id;
        this.name = value.name;
        this.description = value.description;
        this.datatype = value.datatype;
        this.targetTable = value.targetTable;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Attributes(
        Integer            id,
        String             name,
        String             description,
        AttributesDatatype datatype,
        String             targetTable,
        Timestamp          createdOn,
        Timestamp          updatedOn
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.datatype = datatype;
        this.targetTable = targetTable;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Attributes (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(description);
        sb.append(", ").append(datatype);
        sb.append(", ").append(targetTable);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
