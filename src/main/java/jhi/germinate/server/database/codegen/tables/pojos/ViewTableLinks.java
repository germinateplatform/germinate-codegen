/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;


// @formatter:off
/**
 * VIEW
 */
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

    /**
     * Getter for <code>germinate_db.view_table_links.link_id</code>. Primary id
     * for this table. This uniquely identifies the row.
     */
    public Integer getLinkId() {
        return this.linkId;
    }

    /**
     * Setter for <code>germinate_db.view_table_links.link_id</code>. Primary id
     * for this table. This uniquely identifies the row.
     */
    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    /**
     * Getter for <code>germinate_db.view_table_links.link_description</code>. A
     * description of the link.
     */
    public String getLinkDescription() {
        return this.linkDescription;
    }

    /**
     * Setter for <code>germinate_db.view_table_links.link_description</code>. A
     * description of the link.
     */
    public void setLinkDescription(String linkDescription) {
        this.linkDescription = linkDescription;
    }

    /**
     * Getter for <code>germinate_db.view_table_links.link_visibility</code>.
     * Determines if the link is visible or not: {0, 1}
     */
    public Boolean getLinkVisibility() {
        return this.linkVisibility;
    }

    /**
     * Setter for <code>germinate_db.view_table_links.link_visibility</code>.
     * Determines if the link is visible or not: {0, 1}
     */
    public void setLinkVisibility(Boolean linkVisibility) {
        this.linkVisibility = linkVisibility;
    }

    /**
     * Getter for <code>germinate_db.view_table_links.linktype_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public Integer getLinktypeId() {
        return this.linktypeId;
    }

    /**
     * Setter for <code>germinate_db.view_table_links.linktype_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public void setLinktypeId(Integer linktypeId) {
        this.linktypeId = linktypeId;
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_links.linktype_description</code>. A
     * description of the link.
     */
    public String getLinktypeDescription() {
        return this.linktypeDescription;
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_links.linktype_description</code>. A
     * description of the link.
     */
    public void setLinktypeDescription(String linktypeDescription) {
        this.linktypeDescription = linktypeDescription;
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_links.linktype_target_table</code>. This is
     * the table that the link links to.
     */
    public String getLinktypeTargetTable() {
        return this.linktypeTargetTable;
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_links.linktype_target_table</code>. This is
     * the table that the link links to.
     */
    public void setLinktypeTargetTable(String linktypeTargetTable) {
        this.linktypeTargetTable = linktypeTargetTable;
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_links.linktype_target_column</code>. This
     * is the column that is used to generate the link.
     */
    public String getLinktypeTargetColumn() {
        return this.linktypeTargetColumn;
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_links.linktype_target_column</code>. This
     * is the column that is used to generate the link.
     */
    public void setLinktypeTargetColumn(String linktypeTargetColumn) {
        this.linktypeTargetColumn = linktypeTargetColumn;
    }

    /**
     * Getter for <code>germinate_db.view_table_links.link_foreign_id</code>.
     */
    public Integer getLinkForeignId() {
        return this.linkForeignId;
    }

    /**
     * Setter for <code>germinate_db.view_table_links.link_foreign_id</code>.
     */
    public void setLinkForeignId(Integer linkForeignId) {
        this.linkForeignId = linkForeignId;
    }

    /**
     * Getter for <code>germinate_db.view_table_links.hyperlink</code>. The
     * actual hyperlink.
     */
    public String getHyperlink() {
        return this.hyperlink;
    }

    /**
     * Setter for <code>germinate_db.view_table_links.hyperlink</code>. The
     * actual hyperlink.
     */
    public void setHyperlink(String hyperlink) {
        this.hyperlink = hyperlink;
    }

    /**
     * Getter for <code>germinate_db.view_table_links.placeholder</code>. The
     * part of the link that will be replaced by the value of the target column.
     */
    public String getPlaceholder() {
        return this.placeholder;
    }

    /**
     * Setter for <code>germinate_db.view_table_links.placeholder</code>. The
     * part of the link that will be replaced by the value of the target column.
     */
    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    /**
     * Getter for <code>germinate_db.view_table_links.updated_on</code>. When
     * the record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return this.updatedOn;
    }

    /**
     * Setter for <code>germinate_db.view_table_links.updated_on</code>. When
     * the record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp updatedOn) {
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
