/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.enums.UserfeedbackFeedbackType;
import jhi.germinate.server.database.codegen.enums.UserfeedbackSeverity;


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
public class Userfeedback implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer                  id;
    private String                   content;
    private byte[]                   image;
    private String                   pageUrl;
    private Integer                  userId;
    private String                   contactEmail;
    private UserfeedbackFeedbackType feedbackType;
    private UserfeedbackSeverity     severity;
    private Boolean                  isNew;
    private Timestamp                createdOn;
    private Timestamp                updatedOn;

    public Userfeedback() {}

    public Userfeedback(Userfeedback value) {
        this.id = value.id;
        this.content = value.content;
        this.image = value.image;
        this.pageUrl = value.pageUrl;
        this.userId = value.userId;
        this.contactEmail = value.contactEmail;
        this.feedbackType = value.feedbackType;
        this.severity = value.severity;
        this.isNew = value.isNew;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Userfeedback(
        Integer                  id,
        String                   content,
        byte[]                   image,
        String                   pageUrl,
        Integer                  userId,
        String                   contactEmail,
        UserfeedbackFeedbackType feedbackType,
        UserfeedbackSeverity     severity,
        Boolean                  isNew,
        Timestamp                createdOn,
        Timestamp                updatedOn
    ) {
        this.id = id;
        this.content = content;
        this.image = image;
        this.pageUrl = pageUrl;
        this.userId = userId;
        this.contactEmail = contactEmail;
        this.feedbackType = feedbackType;
        this.severity = severity;
        this.isNew = isNew;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Userfeedback (");

        sb.append(id);
        sb.append(", ").append(content);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(pageUrl);
        sb.append(", ").append(userId);
        sb.append(", ").append(contactEmail);
        sb.append(", ").append(feedbackType);
        sb.append(", ").append(severity);
        sb.append(", ").append(isNew);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
