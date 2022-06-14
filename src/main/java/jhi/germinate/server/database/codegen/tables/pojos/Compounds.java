/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Compounds implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer    id;
    private String     name;
    private String     description;
    private String     molecularFormula;
    private BigDecimal monoisotopicMass;
    private BigDecimal averageMass;
    private String     compoundClass;
    private Integer    unitId;
    private Timestamp  createdOn;
    private Timestamp  updatedOn;

    public Compounds() {}

    public Compounds(Compounds value) {
        this.id = value.id;
        this.name = value.name;
        this.description = value.description;
        this.molecularFormula = value.molecularFormula;
        this.monoisotopicMass = value.monoisotopicMass;
        this.averageMass = value.averageMass;
        this.compoundClass = value.compoundClass;
        this.unitId = value.unitId;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Compounds(
        Integer    id,
        String     name,
        String     description,
        String     molecularFormula,
        BigDecimal monoisotopicMass,
        BigDecimal averageMass,
        String     compoundClass,
        Integer    unitId,
        Timestamp  createdOn,
        Timestamp  updatedOn
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.molecularFormula = molecularFormula;
        this.monoisotopicMass = monoisotopicMass;
        this.averageMass = averageMass;
        this.compoundClass = compoundClass;
        this.unitId = unitId;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    /**
     * Getter for <code>germinate_db.compounds.id</code>. Primary id for this
     * table. This uniquely identifies the row.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>germinate_db.compounds.id</code>. Primary id for this
     * table. This uniquely identifies the row.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>germinate_db.compounds.name</code>. Compound full name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>germinate_db.compounds.name</code>. Compound full name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>germinate_db.compounds.description</code>. Full
     * description of the compound. This should contain enough infomation to
     * accurately identify the compound and how it was recorded.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>germinate_db.compounds.description</code>. Full
     * description of the compound. This should contain enough infomation to
     * accurately identify the compound and how it was recorded.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for <code>germinate_db.compounds.molecular_formula</code>. The
     * molecular formula of the compound.
     */
    public String getMolecularFormula() {
        return this.molecularFormula;
    }

    /**
     * Setter for <code>germinate_db.compounds.molecular_formula</code>. The
     * molecular formula of the compound.
     */
    public void setMolecularFormula(String molecularFormula) {
        this.molecularFormula = molecularFormula;
    }

    /**
     * Getter for <code>germinate_db.compounds.monoisotopic_mass</code>. The
     * monoisotopic mass of the compound.
     */
    public BigDecimal getMonoisotopicMass() {
        return this.monoisotopicMass;
    }

    /**
     * Setter for <code>germinate_db.compounds.monoisotopic_mass</code>. The
     * monoisotopic mass of the compound.
     */
    public void setMonoisotopicMass(BigDecimal monoisotopicMass) {
        this.monoisotopicMass = monoisotopicMass;
    }

    /**
     * Getter for <code>germinate_db.compounds.average_mass</code>. The average
     * mass of the compound.
     */
    public BigDecimal getAverageMass() {
        return this.averageMass;
    }

    /**
     * Setter for <code>germinate_db.compounds.average_mass</code>. The average
     * mass of the compound.
     */
    public void setAverageMass(BigDecimal averageMass) {
        this.averageMass = averageMass;
    }

    /**
     * Getter for <code>germinate_db.compounds.compound_class</code>. A
     * classification of the compound.
     */
    public String getCompoundClass() {
        return this.compoundClass;
    }

    /**
     * Setter for <code>germinate_db.compounds.compound_class</code>. A
     * classification of the compound.
     */
    public void setCompoundClass(String compoundClass) {
        this.compoundClass = compoundClass;
    }

    /**
     * Getter for <code>germinate_db.compounds.unit_id</code>. Foreign Key to
     * units (units.id).
     */
    public Integer getUnitId() {
        return this.unitId;
    }

    /**
     * Setter for <code>germinate_db.compounds.unit_id</code>. Foreign Key to
     * units (units.id).
     */
    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    /**
     * Getter for <code>germinate_db.compounds.created_on</code>. When the
     * record was created.
     */
    public Timestamp getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Setter for <code>germinate_db.compounds.created_on</code>. When the
     * record was created.
     */
    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Getter for <code>germinate_db.compounds.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return this.updatedOn;
    }

    /**
     * Setter for <code>germinate_db.compounds.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Compounds (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(description);
        sb.append(", ").append(molecularFormula);
        sb.append(", ").append(monoisotopicMass);
        sb.append(", ").append(averageMass);
        sb.append(", ").append(compoundClass);
        sb.append(", ").append(unitId);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
