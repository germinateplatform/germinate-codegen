/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;

import jhi.germinate.server.database.codegen.enums.ViewTablePedigreesRelationshipType;


// @formatter:off
/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTablePedigrees implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer                            parentId;
    private String                             parentGid;
    private String                             parentName;
    private Integer                            childId;
    private String                             childGid;
    private String                             childName;
    private Integer                            datasetId;
    private String                             datasetName;
    private Integer                            experimentId;
    private String                             experimentName;
    private ViewTablePedigreesRelationshipType relationshipType;
    private String                             relationshipDescription;
    private String                             pedigreeDescription;
    private String                             pedigreeAuthor;

    public ViewTablePedigrees() {}

    public ViewTablePedigrees(ViewTablePedigrees value) {
        this.parentId = value.parentId;
        this.parentGid = value.parentGid;
        this.parentName = value.parentName;
        this.childId = value.childId;
        this.childGid = value.childGid;
        this.childName = value.childName;
        this.datasetId = value.datasetId;
        this.datasetName = value.datasetName;
        this.experimentId = value.experimentId;
        this.experimentName = value.experimentName;
        this.relationshipType = value.relationshipType;
        this.relationshipDescription = value.relationshipDescription;
        this.pedigreeDescription = value.pedigreeDescription;
        this.pedigreeAuthor = value.pedigreeAuthor;
    }

    public ViewTablePedigrees(
        Integer                            parentId,
        String                             parentGid,
        String                             parentName,
        Integer                            childId,
        String                             childGid,
        String                             childName,
        Integer                            datasetId,
        String                             datasetName,
        Integer                            experimentId,
        String                             experimentName,
        ViewTablePedigreesRelationshipType relationshipType,
        String                             relationshipDescription,
        String                             pedigreeDescription,
        String                             pedigreeAuthor
    ) {
        this.parentId = parentId;
        this.parentGid = parentGid;
        this.parentName = parentName;
        this.childId = childId;
        this.childGid = childGid;
        this.childName = childName;
        this.datasetId = datasetId;
        this.datasetName = datasetName;
        this.experimentId = experimentId;
        this.experimentName = experimentName;
        this.relationshipType = relationshipType;
        this.relationshipDescription = relationshipDescription;
        this.pedigreeDescription = pedigreeDescription;
        this.pedigreeAuthor = pedigreeAuthor;
    }

    /**
     * Getter for <code>germinate_db.view_table_pedigrees.parent_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public Integer getParentId() {
        return this.parentId;
    }

    /**
     * Setter for <code>germinate_db.view_table_pedigrees.parent_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * Getter for <code>germinate_db.view_table_pedigrees.parent_gid</code>. A
     * unique identifier.
     */
    public String getParentGid() {
        return this.parentGid;
    }

    /**
     * Setter for <code>germinate_db.view_table_pedigrees.parent_gid</code>. A
     * unique identifier.
     */
    public void setParentGid(String parentGid) {
        this.parentGid = parentGid;
    }

    /**
     * Getter for <code>germinate_db.view_table_pedigrees.parent_name</code>. A
     * unique name which defines an entry in the germinatbase table.
     */
    public String getParentName() {
        return this.parentName;
    }

    /**
     * Setter for <code>germinate_db.view_table_pedigrees.parent_name</code>. A
     * unique name which defines an entry in the germinatbase table.
     */
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    /**
     * Getter for <code>germinate_db.view_table_pedigrees.child_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public Integer getChildId() {
        return this.childId;
    }

    /**
     * Setter for <code>germinate_db.view_table_pedigrees.child_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    /**
     * Getter for <code>germinate_db.view_table_pedigrees.child_gid</code>. A
     * unique identifier.
     */
    public String getChildGid() {
        return this.childGid;
    }

    /**
     * Setter for <code>germinate_db.view_table_pedigrees.child_gid</code>. A
     * unique identifier.
     */
    public void setChildGid(String childGid) {
        this.childGid = childGid;
    }

    /**
     * Getter for <code>germinate_db.view_table_pedigrees.child_name</code>. A
     * unique name which defines an entry in the germinatbase table.
     */
    public String getChildName() {
        return this.childName;
    }

    /**
     * Setter for <code>germinate_db.view_table_pedigrees.child_name</code>. A
     * unique name which defines an entry in the germinatbase table.
     */
    public void setChildName(String childName) {
        this.childName = childName;
    }

    /**
     * Getter for <code>germinate_db.view_table_pedigrees.dataset_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public Integer getDatasetId() {
        return this.datasetId;
    }

    /**
     * Setter for <code>germinate_db.view_table_pedigrees.dataset_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public void setDatasetId(Integer datasetId) {
        this.datasetId = datasetId;
    }

    /**
     * Getter for <code>germinate_db.view_table_pedigrees.dataset_name</code>.
     * Describes the dataset.
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * Setter for <code>germinate_db.view_table_pedigrees.dataset_name</code>.
     * Describes the dataset.
     */
    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * Getter for <code>germinate_db.view_table_pedigrees.experiment_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public Integer getExperimentId() {
        return this.experimentId;
    }

    /**
     * Setter for <code>germinate_db.view_table_pedigrees.experiment_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public void setExperimentId(Integer experimentId) {
        this.experimentId = experimentId;
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_pedigrees.experiment_name</code>. The name
     * of the experiment.
     */
    public String getExperimentName() {
        return this.experimentName;
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_pedigrees.experiment_name</code>. The name
     * of the experiment.
     */
    public void setExperimentName(String experimentName) {
        this.experimentName = experimentName;
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_pedigrees.relationship_type</code>. Male or
     * Female parent. Should be recorded as 'M' (male) or 'F' (female).
     */
    public ViewTablePedigreesRelationshipType getRelationshipType() {
        return this.relationshipType;
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_pedigrees.relationship_type</code>. Male or
     * Female parent. Should be recorded as 'M' (male) or 'F' (female).
     */
    public void setRelationshipType(ViewTablePedigreesRelationshipType relationshipType) {
        this.relationshipType = relationshipType;
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_pedigrees.relationship_description</code>.
     * Can be used as a meta-data field to describe the relationships if a
     * complex rellationship is required. Examples may include, 'is a complex
     * cross containing', 'F4 generation' and so on. This is used by the Helium
     * pedigree visualiztion tool.
     */
    public String getRelationshipDescription() {
        return this.relationshipDescription;
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_pedigrees.relationship_description</code>.
     * Can be used as a meta-data field to describe the relationships if a
     * complex rellationship is required. Examples may include, 'is a complex
     * cross containing', 'F4 generation' and so on. This is used by the Helium
     * pedigree visualiztion tool.
     */
    public void setRelationshipDescription(String relationshipDescription) {
        this.relationshipDescription = relationshipDescription;
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_pedigrees.pedigree_description</code>. The
     * name of the pedigree.
     */
    public String getPedigreeDescription() {
        return this.pedigreeDescription;
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_pedigrees.pedigree_description</code>. The
     * name of the pedigree.
     */
    public void setPedigreeDescription(String pedigreeDescription) {
        this.pedigreeDescription = pedigreeDescription;
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_pedigrees.pedigree_author</code>. Who is
     * responsible for the creation of the pedigree. Attribution should be
     * included in here for pedigree sources.
     */
    public String getPedigreeAuthor() {
        return this.pedigreeAuthor;
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_pedigrees.pedigree_author</code>. Who is
     * responsible for the creation of the pedigree. Attribution should be
     * included in here for pedigree sources.
     */
    public void setPedigreeAuthor(String pedigreeAuthor) {
        this.pedigreeAuthor = pedigreeAuthor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTablePedigrees (");

        sb.append(parentId);
        sb.append(", ").append(parentGid);
        sb.append(", ").append(parentName);
        sb.append(", ").append(childId);
        sb.append(", ").append(childGid);
        sb.append(", ").append(childName);
        sb.append(", ").append(datasetId);
        sb.append(", ").append(datasetName);
        sb.append(", ").append(experimentId);
        sb.append(", ").append(experimentName);
        sb.append(", ").append(relationshipType);
        sb.append(", ").append(relationshipDescription);
        sb.append(", ").append(pedigreeDescription);
        sb.append(", ").append(pedigreeAuthor);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
