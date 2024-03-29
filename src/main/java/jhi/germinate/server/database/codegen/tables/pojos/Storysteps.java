/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import jhi.germinate.server.database.pojo.StoryStepConfig;


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
public class Storysteps implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer         id;
    private Integer         storyId;
    private Integer         storyIndex;
    private StoryStepConfig pageConfig;
    private String          name;
    private String          description;
    private Integer         imageId;
    private Timestamp       createdOn;
    private Timestamp       updatedOn;

    public Storysteps() {}

    public Storysteps(Storysteps value) {
        this.id = value.id;
        this.storyId = value.storyId;
        this.storyIndex = value.storyIndex;
        this.pageConfig = value.pageConfig;
        this.name = value.name;
        this.description = value.description;
        this.imageId = value.imageId;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Storysteps(
        Integer         id,
        Integer         storyId,
        Integer         storyIndex,
        StoryStepConfig pageConfig,
        String          name,
        String          description,
        Integer         imageId,
        Timestamp       createdOn,
        Timestamp       updatedOn
    ) {
        this.id = id;
        this.storyId = storyId;
        this.storyIndex = storyIndex;
        this.pageConfig = pageConfig;
        this.name = name;
        this.description = description;
        this.imageId = imageId;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Storysteps (");

        sb.append(id);
        sb.append(", ").append(storyId);
        sb.append(", ").append(storyIndex);
        sb.append(", ").append(pageConfig);
        sb.append(", ").append(name);
        sb.append(", ").append(description);
        sb.append(", ").append(imageId);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
