/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.tables.Fileresources;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FileresourcesRecord extends UpdatableRecordImpl<FileresourcesRecord> implements Record9<Integer, String, String, String, Long, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>germinate_db.fileresources.id</code>. The primary id.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.fileresources.id</code>. The primary id.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.fileresources.name</code>. The name of the
     * file resource.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.fileresources.name</code>. The name of the
     * file resource.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_db.fileresources.path</code>. The file name of
     * the actual data file.
     */
    public void setPath(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.fileresources.path</code>. The file name of
     * the actual data file.
     */
    public String getPath() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_db.fileresources.description</code>. A
     * description of the file contents.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.fileresources.description</code>. A
     * description of the file contents.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>germinate_db.fileresources.filesize</code>. The file
     * size in bytes.
     */
    public void setFilesize(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.fileresources.filesize</code>. The file
     * size in bytes.
     */
    public Long getFilesize() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>germinate_db.fileresources.fileresourcetype_id</code>.
     * Foreign key to fileresourcetypes.
     */
    public void setFileresourcetypeId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.fileresources.fileresourcetype_id</code>.
     * Foreign key to fileresourcetypes.
     */
    public Integer getFileresourcetypeId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>germinate_db.fileresources.project_id</code>.
     */
    public void setProjectId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_db.fileresources.project_id</code>.
     */
    public Integer getProjectId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>germinate_db.fileresources.created_on</code>. When this
     * record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_db.fileresources.created_on</code>. When this
     * record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>germinate_db.fileresources.updated_on</code>. When this
     * record was last updated.
     */
    public void setUpdatedOn(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_db.fileresources.updated_on</code>. When this
     * record was last updated.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, String, String, Long, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Integer, String, String, String, Long, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Fileresources.FILERESOURCES.ID;
    }

    @Override
    public Field<String> field2() {
        return Fileresources.FILERESOURCES.NAME;
    }

    @Override
    public Field<String> field3() {
        return Fileresources.FILERESOURCES.PATH;
    }

    @Override
    public Field<String> field4() {
        return Fileresources.FILERESOURCES.DESCRIPTION;
    }

    @Override
    public Field<Long> field5() {
        return Fileresources.FILERESOURCES.FILESIZE;
    }

    @Override
    public Field<Integer> field6() {
        return Fileresources.FILERESOURCES.FILERESOURCETYPE_ID;
    }

    @Override
    public Field<Integer> field7() {
        return Fileresources.FILERESOURCES.PROJECT_ID;
    }

    @Override
    public Field<Timestamp> field8() {
        return Fileresources.FILERESOURCES.CREATED_ON;
    }

    @Override
    public Field<Timestamp> field9() {
        return Fileresources.FILERESOURCES.UPDATED_ON;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getPath();
    }

    @Override
    public String component4() {
        return getDescription();
    }

    @Override
    public Long component5() {
        return getFilesize();
    }

    @Override
    public Integer component6() {
        return getFileresourcetypeId();
    }

    @Override
    public Integer component7() {
        return getProjectId();
    }

    @Override
    public Timestamp component8() {
        return getCreatedOn();
    }

    @Override
    public Timestamp component9() {
        return getUpdatedOn();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getPath();
    }

    @Override
    public String value4() {
        return getDescription();
    }

    @Override
    public Long value5() {
        return getFilesize();
    }

    @Override
    public Integer value6() {
        return getFileresourcetypeId();
    }

    @Override
    public Integer value7() {
        return getProjectId();
    }

    @Override
    public Timestamp value8() {
        return getCreatedOn();
    }

    @Override
    public Timestamp value9() {
        return getUpdatedOn();
    }

    @Override
    public FileresourcesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public FileresourcesRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public FileresourcesRecord value3(String value) {
        setPath(value);
        return this;
    }

    @Override
    public FileresourcesRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public FileresourcesRecord value5(Long value) {
        setFilesize(value);
        return this;
    }

    @Override
    public FileresourcesRecord value6(Integer value) {
        setFileresourcetypeId(value);
        return this;
    }

    @Override
    public FileresourcesRecord value7(Integer value) {
        setProjectId(value);
        return this;
    }

    @Override
    public FileresourcesRecord value8(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public FileresourcesRecord value9(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    @Override
    public FileresourcesRecord values(Integer value1, String value2, String value3, String value4, Long value5, Integer value6, Integer value7, Timestamp value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FileresourcesRecord
     */
    public FileresourcesRecord() {
        super(Fileresources.FILERESOURCES);
    }

    /**
     * Create a detached, initialised FileresourcesRecord
     */
    public FileresourcesRecord(Integer id, String name, String path, String description, Long filesize, Integer fileresourcetypeId, Integer projectId, Timestamp createdOn, Timestamp updatedOn) {
        super(Fileresources.FILERESOURCES);

        setId(id);
        setName(name);
        setPath(path);
        setDescription(description);
        setFilesize(filesize);
        setFileresourcetypeId(fileresourcetypeId);
        setProjectId(projectId);
        setCreatedOn(createdOn);
        setUpdatedOn(updatedOn);
    }

    /**
     * Create a detached, initialised FileresourcesRecord
     */
    public FileresourcesRecord(jhi.germinate.server.database.codegen.tables.pojos.Fileresources value) {
        super(Fileresources.FILERESOURCES);

        if (value != null) {
            setId(value.getId());
            setName(value.getName());
            setPath(value.getPath());
            setDescription(value.getDescription());
            setFilesize(value.getFilesize());
            setFileresourcetypeId(value.getFileresourcetypeId());
            setProjectId(value.getProjectId());
            setCreatedOn(value.getCreatedOn());
            setUpdatedOn(value.getUpdatedOn());
        }
    }
    // @formatter:on
}
