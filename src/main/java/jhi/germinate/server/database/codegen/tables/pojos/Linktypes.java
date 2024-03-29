/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;


import lombok.*;
import lombok.experimental.Accessors;

// @formatter:off
/**
 * The link type determines which database table and column are used to
 * construct the final
 * link. The ”placeholder” in the link (from the links table) will be replaced
 * by the value of the
 * ”target column” in the ”target table”
 */
@Getter
@Setter
@Accessors(chain = true)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Linktypes implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer   id;
    private String    description;
    private String    targetTable;
    private String    targetColumn;
    private String    placeholder;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Linktypes() {}

    public Linktypes(Linktypes value) {
        this.id = value.id;
        this.description = value.description;
        this.targetTable = value.targetTable;
        this.targetColumn = value.targetColumn;
        this.placeholder = value.placeholder;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Linktypes(
        Integer   id,
        String    description,
        String    targetTable,
        String    targetColumn,
        String    placeholder,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.description = description;
        this.targetTable = targetTable;
        this.targetColumn = targetColumn;
        this.placeholder = placeholder;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Linktypes (");

        sb.append(id);
        sb.append(", ").append(description);
        sb.append(", ").append(targetTable);
        sb.append(", ").append(targetColumn);
        sb.append(", ").append(placeholder);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
