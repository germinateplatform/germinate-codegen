/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.binding.IntArrayBinding;
import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewTablePublicationsRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row11;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


// @formatter:off
/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTablePublications extends TableImpl<ViewTablePublicationsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>germinate_db.view_table_publications</code>
     */
    public static final ViewTablePublications VIEW_TABLE_PUBLICATIONS = new ViewTablePublications();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTablePublicationsRecord> getRecordType() {
        return ViewTablePublicationsRecord.class;
    }

    /**
     * The column
     * <code>germinate_db.view_table_publications.publication_id</code>.
     */
    public final TableField<ViewTablePublicationsRecord, Integer> PUBLICATION_ID = createField(DSL.name("publication_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>germinate_db.view_table_publications.publication_doi</code>.
     */
    public final TableField<ViewTablePublicationsRecord, String> PUBLICATION_DOI = createField(DSL.name("publication_doi"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column
     * <code>germinate_db.view_table_publications.publication_fallback_cache</code>.
     */
    public final TableField<ViewTablePublicationsRecord, String> PUBLICATION_FALLBACK_CACHE = createField(DSL.name("publication_fallback_cache"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>germinate_db.view_table_publications.is_database_pub</code>.
     */
    public final TableField<ViewTablePublicationsRecord, Integer> IS_DATABASE_PUB = createField(DSL.name("is_database_pub"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>germinate_db.view_table_publications.dataset_ids</code>.
     */
    public final TableField<ViewTablePublicationsRecord, Integer[]> DATASET_IDS = createField(DSL.name("dataset_ids"), SQLDataType.JSON, this, "", new IntArrayBinding());

    /**
     * The column
     * <code>germinate_db.view_table_publications.germplasm_ids</code>.
     */
    public final TableField<ViewTablePublicationsRecord, Integer[]> GERMPLASM_IDS = createField(DSL.name("germplasm_ids"), SQLDataType.JSON, this, "", new IntArrayBinding());

    /**
     * The column <code>germinate_db.view_table_publications.group_ids</code>.
     */
    public final TableField<ViewTablePublicationsRecord, Integer[]> GROUP_IDS = createField(DSL.name("group_ids"), SQLDataType.JSON, this, "", new IntArrayBinding());

    /**
     * The column
     * <code>germinate_db.view_table_publications.experiment_ids</code>.
     */
    public final TableField<ViewTablePublicationsRecord, Integer[]> EXPERIMENT_IDS = createField(DSL.name("experiment_ids"), SQLDataType.JSON, this, "", new IntArrayBinding());

    /**
     * The column <code>germinate_db.view_table_publications.project_ids</code>.
     */
    public final TableField<ViewTablePublicationsRecord, Integer[]> PROJECT_IDS = createField(DSL.name("project_ids"), SQLDataType.JSON, this, "", new IntArrayBinding());

    /**
     * The column <code>germinate_db.view_table_publications.created_on</code>.
     */
    public final TableField<ViewTablePublicationsRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).nullable(false).defaultValue(DSL.inline("0000-00-00 00:00:00", SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>germinate_db.view_table_publications.updated_on</code>.
     */
    public final TableField<ViewTablePublicationsRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).nullable(false).defaultValue(DSL.inline("0000-00-00 00:00:00", SQLDataType.TIMESTAMP)), this, "");

    private ViewTablePublications(Name alias, Table<ViewTablePublicationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTablePublications(Name alias, Table<ViewTablePublicationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_publications` as select `germinate_template_4_24_09_27`.`publications`.`id` AS `publication_id`,`germinate_template_4_24_09_27`.`publications`.`doi` AS `publication_doi`,`germinate_template_4_24_09_27`.`publications`.`fallback_cache` AS `publication_fallback_cache`,(select TRUE from `germinate_template_4_24_09_27`.`publicationdata` where ((`germinate_template_4_24_09_27`.`publicationdata`.`reference_type` = 'database') and (`germinate_template_4_24_09_27`.`publicationdata`.`publication_id` = `germinate_template_4_24_09_27`.`publications`.`id`))) AS `is_database_pub`,(select json_arrayagg(`germinate_template_4_24_09_27`.`publicationdata`.`foreign_id`) from `germinate_template_4_24_09_27`.`publicationdata` where ((`germinate_template_4_24_09_27`.`publicationdata`.`reference_type` = 'dataset') and (`germinate_template_4_24_09_27`.`publicationdata`.`publication_id` = `germinate_template_4_24_09_27`.`publications`.`id`)) group by `germinate_template_4_24_09_27`.`publicationdata`.`publication_id`) AS `dataset_ids`,(select json_arrayagg(`germinate_template_4_24_09_27`.`publicationdata`.`foreign_id`) from `germinate_template_4_24_09_27`.`publicationdata` where ((`germinate_template_4_24_09_27`.`publicationdata`.`reference_type` = 'germplasm') and (`germinate_template_4_24_09_27`.`publicationdata`.`publication_id` = `germinate_template_4_24_09_27`.`publications`.`id`)) group by `germinate_template_4_24_09_27`.`publicationdata`.`publication_id`) AS `germplasm_ids`,(select json_arrayagg(`germinate_template_4_24_09_27`.`publicationdata`.`foreign_id`) from `germinate_template_4_24_09_27`.`publicationdata` where ((`germinate_template_4_24_09_27`.`publicationdata`.`reference_type` = 'group') and (`germinate_template_4_24_09_27`.`publicationdata`.`publication_id` = `germinate_template_4_24_09_27`.`publications`.`id`)) group by `germinate_template_4_24_09_27`.`publicationdata`.`publication_id`) AS `group_ids`,(select json_arrayagg(`germinate_template_4_24_09_27`.`publicationdata`.`foreign_id`) from `germinate_template_4_24_09_27`.`publicationdata` where ((`germinate_template_4_24_09_27`.`publicationdata`.`reference_type` = 'experiment') and (`germinate_template_4_24_09_27`.`publicationdata`.`publication_id` = `germinate_template_4_24_09_27`.`publications`.`id`)) group by `germinate_template_4_24_09_27`.`publicationdata`.`publication_id`) AS `experiment_ids`,(select json_arrayagg(`germinate_template_4_24_09_27`.`projectpublications`.`project_id`) from `germinate_template_4_24_09_27`.`projectpublications` where (`germinate_template_4_24_09_27`.`projectpublications`.`publication_id` = `germinate_template_4_24_09_27`.`publications`.`id`) group by `germinate_template_4_24_09_27`.`projectpublications`.`publication_id`) AS `project_ids`,`germinate_template_4_24_09_27`.`publications`.`created_on` AS `created_on`,`germinate_template_4_24_09_27`.`publications`.`updated_on` AS `updated_on` from `germinate_template_4_24_09_27`.`publications`"));
    }

    /**
     * Create an aliased <code>germinate_db.view_table_publications</code> table
     * reference
     */
    public ViewTablePublications(String alias) {
        this(DSL.name(alias), VIEW_TABLE_PUBLICATIONS);
    }

    /**
     * Create an aliased <code>germinate_db.view_table_publications</code> table
     * reference
     */
    public ViewTablePublications(Name alias) {
        this(alias, VIEW_TABLE_PUBLICATIONS);
    }

    /**
     * Create a <code>germinate_db.view_table_publications</code> table
     * reference
     */
    public ViewTablePublications() {
        this(DSL.name("view_table_publications"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTablePublications as(String alias) {
        return new ViewTablePublications(DSL.name(alias), this);
    }

    @Override
    public ViewTablePublications as(Name alias) {
        return new ViewTablePublications(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTablePublications rename(String name) {
        return new ViewTablePublications(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTablePublications rename(Name name) {
        return new ViewTablePublications(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, String, String, Integer, Integer[], Integer[], Integer[], Integer[], Integer[], Timestamp, Timestamp> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
    // @formatter:on
}
