/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.records;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.tables.ViewTableStories;
import jhi.germinate.server.database.codegen.tables.pojos.Storysteps;
import jhi.germinate.server.database.pojo.StoryRequirements;

import org.jooq.Field;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.TableRecordImpl;


// @formatter:off
/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableStoriesRecord extends TableRecordImpl<ViewTableStoriesRecord> implements Record14<Integer, String, String, StoryRequirements, Integer, String, Boolean, Boolean, Integer, Integer, String, Storysteps[], Timestamp, Timestamp> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>germinate_db.view_table_stories.story_id</code>.
     */
    public void setStoryId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_stories.story_id</code>.
     */
    public Integer getStoryId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_db.view_table_stories.story_name</code>.
     */
    public void setStoryName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_stories.story_name</code>.
     */
    public String getStoryName() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_stories.story_description</code>.
     */
    public void setStoryDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_stories.story_description</code>.
     */
    public String getStoryDescription() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>germinate_db.view_table_stories.story_requirements</code>.
     */
    public void setStoryRequirements(StoryRequirements value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>germinate_db.view_table_stories.story_requirements</code>.
     */
    public StoryRequirements getStoryRequirements() {
        return (StoryRequirements) get(3);
    }

    /**
     * Setter for <code>germinate_db.view_table_stories.story_image_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public void setStoryImageId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_stories.story_image_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public Integer getStoryImageId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>germinate_db.view_table_stories.story_image_name</code>.
     * The file system path to the image.
     */
    public void setStoryImageName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_stories.story_image_name</code>.
     * The file system path to the image.
     */
    public String getStoryImageName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>germinate_db.view_table_stories.story_featured</code>.
     */
    public void setStoryFeatured(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_stories.story_featured</code>.
     */
    public Boolean getStoryFeatured() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>germinate_db.view_table_stories.story_visibility</code>.
     */
    public void setStoryVisibility(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_stories.story_visibility</code>.
     */
    public Boolean getStoryVisibility() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>germinate_db.view_table_stories.story_user_id</code>.
     */
    public void setStoryUserId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_stories.story_user_id</code>.
     */
    public Integer getStoryUserId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>germinate_db.view_table_stories.publication_id</code>.
     */
    public void setPublicationId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_stories.publication_id</code>.
     */
    public Integer getPublicationId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>germinate_db.view_table_stories.publication_doi</code>.
     */
    public void setPublicationDoi(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_stories.publication_doi</code>.
     */
    public String getPublicationDoi() {
        return (String) get(10);
    }

    /**
     * Setter for <code>germinate_db.view_table_stories.story_steps</code>.
     */
    public void setStorySteps(Storysteps[] value) {
        set(11, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_stories.story_steps</code>.
     */
    public Storysteps[] getStorySteps() {
        return (Storysteps[]) get(11);
    }

    /**
     * Setter for <code>germinate_db.view_table_stories.story_created_on</code>.
     */
    public void setStoryCreatedOn(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_stories.story_created_on</code>.
     */
    public Timestamp getStoryCreatedOn() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>germinate_db.view_table_stories.story_updated_on</code>.
     */
    public void setStoryUpdatedOn(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>germinate_db.view_table_stories.story_updated_on</code>.
     */
    public Timestamp getStoryUpdatedOn() {
        return (Timestamp) get(13);
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<Integer, String, String, StoryRequirements, Integer, String, Boolean, Boolean, Integer, Integer, String, Storysteps[], Timestamp, Timestamp> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<Integer, String, String, StoryRequirements, Integer, String, Boolean, Boolean, Integer, Integer, String, Storysteps[], Timestamp, Timestamp> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ViewTableStories.VIEW_TABLE_STORIES.STORY_ID;
    }

    @Override
    public Field<String> field2() {
        return ViewTableStories.VIEW_TABLE_STORIES.STORY_NAME;
    }

    @Override
    public Field<String> field3() {
        return ViewTableStories.VIEW_TABLE_STORIES.STORY_DESCRIPTION;
    }

    @Override
    public Field<StoryRequirements> field4() {
        return ViewTableStories.VIEW_TABLE_STORIES.STORY_REQUIREMENTS;
    }

    @Override
    public Field<Integer> field5() {
        return ViewTableStories.VIEW_TABLE_STORIES.STORY_IMAGE_ID;
    }

    @Override
    public Field<String> field6() {
        return ViewTableStories.VIEW_TABLE_STORIES.STORY_IMAGE_NAME;
    }

    @Override
    public Field<Boolean> field7() {
        return ViewTableStories.VIEW_TABLE_STORIES.STORY_FEATURED;
    }

    @Override
    public Field<Boolean> field8() {
        return ViewTableStories.VIEW_TABLE_STORIES.STORY_VISIBILITY;
    }

    @Override
    public Field<Integer> field9() {
        return ViewTableStories.VIEW_TABLE_STORIES.STORY_USER_ID;
    }

    @Override
    public Field<Integer> field10() {
        return ViewTableStories.VIEW_TABLE_STORIES.PUBLICATION_ID;
    }

    @Override
    public Field<String> field11() {
        return ViewTableStories.VIEW_TABLE_STORIES.PUBLICATION_DOI;
    }

    @Override
    public Field<Storysteps[]> field12() {
        return ViewTableStories.VIEW_TABLE_STORIES.STORY_STEPS;
    }

    @Override
    public Field<Timestamp> field13() {
        return ViewTableStories.VIEW_TABLE_STORIES.STORY_CREATED_ON;
    }

    @Override
    public Field<Timestamp> field14() {
        return ViewTableStories.VIEW_TABLE_STORIES.STORY_UPDATED_ON;
    }

    @Override
    public Integer component1() {
        return getStoryId();
    }

    @Override
    public String component2() {
        return getStoryName();
    }

    @Override
    public String component3() {
        return getStoryDescription();
    }

    @Override
    public StoryRequirements component4() {
        return getStoryRequirements();
    }

    @Override
    public Integer component5() {
        return getStoryImageId();
    }

    @Override
    public String component6() {
        return getStoryImageName();
    }

    @Override
    public Boolean component7() {
        return getStoryFeatured();
    }

    @Override
    public Boolean component8() {
        return getStoryVisibility();
    }

    @Override
    public Integer component9() {
        return getStoryUserId();
    }

    @Override
    public Integer component10() {
        return getPublicationId();
    }

    @Override
    public String component11() {
        return getPublicationDoi();
    }

    @Override
    public Storysteps[] component12() {
        return getStorySteps();
    }

    @Override
    public Timestamp component13() {
        return getStoryCreatedOn();
    }

    @Override
    public Timestamp component14() {
        return getStoryUpdatedOn();
    }

    @Override
    public Integer value1() {
        return getStoryId();
    }

    @Override
    public String value2() {
        return getStoryName();
    }

    @Override
    public String value3() {
        return getStoryDescription();
    }

    @Override
    public StoryRequirements value4() {
        return getStoryRequirements();
    }

    @Override
    public Integer value5() {
        return getStoryImageId();
    }

    @Override
    public String value6() {
        return getStoryImageName();
    }

    @Override
    public Boolean value7() {
        return getStoryFeatured();
    }

    @Override
    public Boolean value8() {
        return getStoryVisibility();
    }

    @Override
    public Integer value9() {
        return getStoryUserId();
    }

    @Override
    public Integer value10() {
        return getPublicationId();
    }

    @Override
    public String value11() {
        return getPublicationDoi();
    }

    @Override
    public Storysteps[] value12() {
        return getStorySteps();
    }

    @Override
    public Timestamp value13() {
        return getStoryCreatedOn();
    }

    @Override
    public Timestamp value14() {
        return getStoryUpdatedOn();
    }

    @Override
    public ViewTableStoriesRecord value1(Integer value) {
        setStoryId(value);
        return this;
    }

    @Override
    public ViewTableStoriesRecord value2(String value) {
        setStoryName(value);
        return this;
    }

    @Override
    public ViewTableStoriesRecord value3(String value) {
        setStoryDescription(value);
        return this;
    }

    @Override
    public ViewTableStoriesRecord value4(StoryRequirements value) {
        setStoryRequirements(value);
        return this;
    }

    @Override
    public ViewTableStoriesRecord value5(Integer value) {
        setStoryImageId(value);
        return this;
    }

    @Override
    public ViewTableStoriesRecord value6(String value) {
        setStoryImageName(value);
        return this;
    }

    @Override
    public ViewTableStoriesRecord value7(Boolean value) {
        setStoryFeatured(value);
        return this;
    }

    @Override
    public ViewTableStoriesRecord value8(Boolean value) {
        setStoryVisibility(value);
        return this;
    }

    @Override
    public ViewTableStoriesRecord value9(Integer value) {
        setStoryUserId(value);
        return this;
    }

    @Override
    public ViewTableStoriesRecord value10(Integer value) {
        setPublicationId(value);
        return this;
    }

    @Override
    public ViewTableStoriesRecord value11(String value) {
        setPublicationDoi(value);
        return this;
    }

    @Override
    public ViewTableStoriesRecord value12(Storysteps[] value) {
        setStorySteps(value);
        return this;
    }

    @Override
    public ViewTableStoriesRecord value13(Timestamp value) {
        setStoryCreatedOn(value);
        return this;
    }

    @Override
    public ViewTableStoriesRecord value14(Timestamp value) {
        setStoryUpdatedOn(value);
        return this;
    }

    @Override
    public ViewTableStoriesRecord values(Integer value1, String value2, String value3, StoryRequirements value4, Integer value5, String value6, Boolean value7, Boolean value8, Integer value9, Integer value10, String value11, Storysteps[] value12, Timestamp value13, Timestamp value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewTableStoriesRecord
     */
    public ViewTableStoriesRecord() {
        super(ViewTableStories.VIEW_TABLE_STORIES);
    }

    /**
     * Create a detached, initialised ViewTableStoriesRecord
     */
    public ViewTableStoriesRecord(Integer storyId, String storyName, String storyDescription, StoryRequirements storyRequirements, Integer storyImageId, String storyImageName, Boolean storyFeatured, Boolean storyVisibility, Integer storyUserId, Integer publicationId, String publicationDoi, Storysteps[] storySteps, Timestamp storyCreatedOn, Timestamp storyUpdatedOn) {
        super(ViewTableStories.VIEW_TABLE_STORIES);

        setStoryId(storyId);
        setStoryName(storyName);
        setStoryDescription(storyDescription);
        setStoryRequirements(storyRequirements);
        setStoryImageId(storyImageId);
        setStoryImageName(storyImageName);
        setStoryFeatured(storyFeatured);
        setStoryVisibility(storyVisibility);
        setStoryUserId(storyUserId);
        setPublicationId(publicationId);
        setPublicationDoi(publicationDoi);
        setStorySteps(storySteps);
        setStoryCreatedOn(storyCreatedOn);
        setStoryUpdatedOn(storyUpdatedOn);
    }

    /**
     * Create a detached, initialised ViewTableStoriesRecord
     */
    public ViewTableStoriesRecord(jhi.germinate.server.database.codegen.tables.pojos.ViewTableStories value) {
        super(ViewTableStories.VIEW_TABLE_STORIES);

        if (value != null) {
            setStoryId(value.getStoryId());
            setStoryName(value.getStoryName());
            setStoryDescription(value.getStoryDescription());
            setStoryRequirements(value.getStoryRequirements());
            setStoryImageId(value.getStoryImageId());
            setStoryImageName(value.getStoryImageName());
            setStoryFeatured(value.getStoryFeatured());
            setStoryVisibility(value.getStoryVisibility());
            setStoryUserId(value.getStoryUserId());
            setPublicationId(value.getPublicationId());
            setPublicationDoi(value.getPublicationDoi());
            setStorySteps(value.getStorySteps());
            setStoryCreatedOn(value.getStoryCreatedOn());
            setStoryUpdatedOn(value.getStoryUpdatedOn());
        }
    }
    // @formatter:on
}