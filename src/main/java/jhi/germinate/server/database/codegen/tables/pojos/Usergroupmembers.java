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
public class Usergroupmembers implements Serializable {

    private static final long serialVersionUID = -1954561632;

    private Integer   id;
    private Integer   userId;
    private Integer   usergroupId;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Usergroupmembers() {}

    public Usergroupmembers(Usergroupmembers value) {
        this.id = value.id;
        this.userId = value.userId;
        this.usergroupId = value.usergroupId;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Usergroupmembers(
        Integer   id,
        Integer   userId,
        Integer   usergroupId,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.userId = userId;
        this.usergroupId = usergroupId;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUsergroupId() {
        return this.usergroupId;
    }

    public void setUsergroupId(Integer usergroupId) {
        this.usergroupId = usergroupId;
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
        StringBuilder sb = new StringBuilder("Usergroupmembers (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(usergroupId);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
