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
 * This class is generated by jOOQ.
 */
@Getter
@Setter
@Accessors(chain = true)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Fileresources implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer   id;
    private String    name;
    private String    path;
    private String    description;
    private Long      filesize;
    private Integer   fileresourcetypeId;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Fileresources() {}

    public Fileresources(Fileresources value) {
        this.id = value.id;
        this.name = value.name;
        this.path = value.path;
        this.description = value.description;
        this.filesize = value.filesize;
        this.fileresourcetypeId = value.fileresourcetypeId;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Fileresources(
        Integer   id,
        String    name,
        String    path,
        String    description,
        Long      filesize,
        Integer   fileresourcetypeId,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.description = description;
        this.filesize = filesize;
        this.fileresourcetypeId = fileresourcetypeId;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Fileresources (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(path);
        sb.append(", ").append(description);
        sb.append(", ").append(filesize);
        sb.append(", ").append(fileresourcetypeId);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
