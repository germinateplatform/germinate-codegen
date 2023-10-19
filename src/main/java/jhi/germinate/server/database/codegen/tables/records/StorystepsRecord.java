/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.tables.Storysteps;
import jhi.germinate.server.database.pojo.StoryStepConfig;

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
public class StorystepsRecord extends UpdatableRecordImpl<StorystepsRecord> implements Record9<Integer, Integer, Integer, StoryStepConfig, String, String, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>germinate_db.storysteps.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.storysteps.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.storysteps.story_id</code>.
     */
    public void setStoryId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.storysteps.story_id</code>.
     */
    public Integer getStoryId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>germinate_db.storysteps.story_index</code>.
     */
    public void setStoryIndex(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_db.storysteps.story_index</code>.
     */
    public Integer getStoryIndex() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>germinate_db.storysteps.page_config</code>.
     */
    public void setPageConfig(StoryStepConfig value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_db.storysteps.page_config</code>.
     */
    public StoryStepConfig getPageConfig() {
        return (StoryStepConfig) get(3);
    }

    /**
     * Setter for <code>germinate_db.storysteps.name</code>.
     */
    public void setName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.storysteps.name</code>.
     */
    public String getName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>germinate_db.storysteps.description</code>.
     */
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.storysteps.description</code>.
     */
    public String getDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>germinate_db.storysteps.image_id</code>.
     */
    public void setImageId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_db.storysteps.image_id</code>.
     */
    public Integer getImageId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>germinate_db.storysteps.created_on</code>.
     */
    public void setCreatedOn(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_db.storysteps.created_on</code>.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>germinate_db.storysteps.updated_on</code>.
     */
    public void setUpdatedOn(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_db.storysteps.updated_on</code>.
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
    public Row9<Integer, Integer, Integer, StoryStepConfig, String, String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Integer, Integer, Integer, StoryStepConfig, String, String, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Storysteps.STORYSTEPS.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Storysteps.STORYSTEPS.STORY_ID;
    }

    @Override
    public Field<Integer> field3() {
        return Storysteps.STORYSTEPS.STORY_INDEX;
    }

    @Override
    public Field<StoryStepConfig> field4() {
        return Storysteps.STORYSTEPS.PAGE_CONFIG;
    }

    @Override
    public Field<String> field5() {
        return Storysteps.STORYSTEPS.NAME;
    }

    @Override
    public Field<String> field6() {
        return Storysteps.STORYSTEPS.DESCRIPTION;
    }

    @Override
    public Field<Integer> field7() {
        return Storysteps.STORYSTEPS.IMAGE_ID;
    }

    @Override
    public Field<Timestamp> field8() {
        return Storysteps.STORYSTEPS.CREATED_ON;
    }

    @Override
    public Field<Timestamp> field9() {
        return Storysteps.STORYSTEPS.UPDATED_ON;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getStoryId();
    }

    @Override
    public Integer component3() {
        return getStoryIndex();
    }

    @Override
    public StoryStepConfig component4() {
        return getPageConfig();
    }

    @Override
    public String component5() {
        return getName();
    }

    @Override
    public String component6() {
        return getDescription();
    }

    @Override
    public Integer component7() {
        return getImageId();
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
    public Integer value2() {
        return getStoryId();
    }

    @Override
    public Integer value3() {
        return getStoryIndex();
    }

    @Override
    public StoryStepConfig value4() {
        return getPageConfig();
    }

    @Override
    public String value5() {
        return getName();
    }

    @Override
    public String value6() {
        return getDescription();
    }

    @Override
    public Integer value7() {
        return getImageId();
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
    public StorystepsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public StorystepsRecord value2(Integer value) {
        setStoryId(value);
        return this;
    }

    @Override
    public StorystepsRecord value3(Integer value) {
        setStoryIndex(value);
        return this;
    }

    @Override
    public StorystepsRecord value4(StoryStepConfig value) {
        setPageConfig(value);
        return this;
    }

    @Override
    public StorystepsRecord value5(String value) {
        setName(value);
        return this;
    }

    @Override
    public StorystepsRecord value6(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public StorystepsRecord value7(Integer value) {
        setImageId(value);
        return this;
    }

    @Override
    public StorystepsRecord value8(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public StorystepsRecord value9(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    @Override
    public StorystepsRecord values(Integer value1, Integer value2, Integer value3, StoryStepConfig value4, String value5, String value6, Integer value7, Timestamp value8, Timestamp value9) {
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
     * Create a detached StorystepsRecord
     */
    public StorystepsRecord() {
        super(Storysteps.STORYSTEPS);
    }

    /**
     * Create a detached, initialised StorystepsRecord
     */
    public StorystepsRecord(Integer id, Integer storyId, Integer storyIndex, StoryStepConfig pageConfig, String name, String description, Integer imageId, Timestamp createdOn, Timestamp updatedOn) {
        super(Storysteps.STORYSTEPS);

        setId(id);
        setStoryId(storyId);
        setStoryIndex(storyIndex);
        setPageConfig(pageConfig);
        setName(name);
        setDescription(description);
        setImageId(imageId);
        setCreatedOn(createdOn);
        setUpdatedOn(updatedOn);
    }

    /**
     * Create a detached, initialised StorystepsRecord
     */
    public StorystepsRecord(jhi.germinate.server.database.codegen.tables.pojos.Storysteps value) {
        super(Storysteps.STORYSTEPS);

        if (value != null) {
            setId(value.getId());
            setStoryId(value.getStoryId());
            setStoryIndex(value.getStoryIndex());
            setPageConfig(value.getPageConfig());
            setName(value.getName());
            setDescription(value.getDescription());
            setImageId(value.getImageId());
            setCreatedOn(value.getCreatedOn());
            setUpdatedOn(value.getUpdatedOn());
        }
    }
    // @formatter:on
}