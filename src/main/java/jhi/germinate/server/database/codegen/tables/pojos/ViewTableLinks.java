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
public class ViewTableLinks implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer   linkId;
    private String    linkDescription;
    private Boolean   linkVisibility;
    private Integer   linktypeId;
    private String    linktypeDescription;
    private String    linktypeTargetTable;
    private String    linktypeTargetColumn;
    private Integer   linkForeignId;
    private String    hyperlink;
    private String    placeholder;
    private Timestamp updatedOn;

    public ViewTableLinks() {}

    public ViewTableLinks(ViewTableLinks value) {
        this.linkId = value.linkId;
        this.linkDescription = value.linkDescription;
        this.linkVisibility = value.linkVisibility;
        this.linktypeId = value.linktypeId;
        this.linktypeDescription = value.linktypeDescription;
        this.linktypeTargetTable = value.linktypeTargetTable;
        this.linktypeTargetColumn = value.linktypeTargetColumn;
        this.linkForeignId = value.linkForeignId;
        this.hyperlink = value.hyperlink;
        this.placeholder = value.placeholder;
        this.updatedOn = value.updatedOn;
    }

    public ViewTableLinks(
        Integer   linkId,
        String    linkDescription,
        Boolean   linkVisibility,
        Integer   linktypeId,
        String    linktypeDescription,
        String    linktypeTargetTable,
        String    linktypeTargetColumn,
        Integer   linkForeignId,
        String    hyperlink,
        String    placeholder,
        Timestamp updatedOn
    ) {
        this.linkId = linkId;
        this.linkDescription = linkDescription;
        this.linkVisibility = linkVisibility;
        this.linktypeId = linktypeId;
        this.linktypeDescription = linktypeDescription;
        this.linktypeTargetTable = linktypeTargetTable;
        this.linktypeTargetColumn = linktypeTargetColumn;
        this.linkForeignId = linkForeignId;
        this.hyperlink = hyperlink;
        this.placeholder = placeholder;
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTableLinks (");

        sb.append(linkId);
        sb.append(", ").append(linkDescription);
        sb.append(", ").append(linkVisibility);
        sb.append(", ").append(linktypeId);
        sb.append(", ").append(linktypeDescription);
        sb.append(", ").append(linktypeTargetTable);
        sb.append(", ").append(linktypeTargetColumn);
        sb.append(", ").append(linkForeignId);
        sb.append(", ").append(hyperlink);
        sb.append(", ").append(placeholder);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
