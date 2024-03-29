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
 * VIEW
 */
@Getter
@Setter
@Accessors(chain = true)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableUsergroups implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer   userGroupId;
    private String    userGroupName;
    private String    userGroupDescription;
    private Timestamp createdOn;
    private Long      count;

    public ViewTableUsergroups() {}

    public ViewTableUsergroups(ViewTableUsergroups value) {
        this.userGroupId = value.userGroupId;
        this.userGroupName = value.userGroupName;
        this.userGroupDescription = value.userGroupDescription;
        this.createdOn = value.createdOn;
        this.count = value.count;
    }

    public ViewTableUsergroups(
        Integer   userGroupId,
        String    userGroupName,
        String    userGroupDescription,
        Timestamp createdOn,
        Long      count
    ) {
        this.userGroupId = userGroupId;
        this.userGroupName = userGroupName;
        this.userGroupDescription = userGroupDescription;
        this.createdOn = createdOn;
        this.count = count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTableUsergroups (");

        sb.append(userGroupId);
        sb.append(", ").append(userGroupName);
        sb.append(", ").append(userGroupDescription);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(count);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
