/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import jhi.germinate.server.database.binding.IntArrayBinding;
import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewTableInstitutionDatasetsRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row16;
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
public class ViewTableInstitutionDatasets extends TableImpl<ViewTableInstitutionDatasetsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>germinate_db.view_table_institution_datasets</code>
     */
    public static final ViewTableInstitutionDatasets VIEW_TABLE_INSTITUTION_DATASETS = new ViewTableInstitutionDatasets();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableInstitutionDatasetsRecord> getRecordType() {
        return ViewTableInstitutionDatasetsRecord.class;
    }

    /**
     * The column
     * <code>germinate_db.view_table_institution_datasets.institution_id</code>.
     * Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<ViewTableInstitutionDatasetsRecord, Integer> INSTITUTION_ID = createField(DSL.name("institution_id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column
     * <code>germinate_db.view_table_institution_datasets.institution_code</code>.
     * If there is a defined ISO code for the institute this should be used
     * here.
     */
    public final TableField<ViewTableInstitutionDatasetsRecord, String> INSTITUTION_CODE = createField(DSL.name("institution_code"), SQLDataType.VARCHAR(255), this, "If there is a defined ISO code for the institute this should be used here.");

    /**
     * The column
     * <code>germinate_db.view_table_institution_datasets.institution_name</code>.
     * The institute name.
     */
    public final TableField<ViewTableInstitutionDatasetsRecord, String> INSTITUTION_NAME = createField(DSL.name("institution_name"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "The institute name.");

    /**
     * The column
     * <code>germinate_db.view_table_institution_datasets.institution_acronym</code>.
     * If there is an acronym for the institute.
     */
    public final TableField<ViewTableInstitutionDatasetsRecord, String> INSTITUTION_ACRONYM = createField(DSL.name("institution_acronym"), SQLDataType.VARCHAR(20), this, "If there is an acronym for the institute.");

    /**
     * The column
     * <code>germinate_db.view_table_institution_datasets.country_name</code>.
     * Country name.
     */
    public final TableField<ViewTableInstitutionDatasetsRecord, String> COUNTRY_NAME = createField(DSL.name("country_name"), SQLDataType.VARCHAR(255).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "Country name.");

    /**
     * The column
     * <code>germinate_db.view_table_institution_datasets.country_code2</code>.
     * ISO 2 Code for country.
     */
    public final TableField<ViewTableInstitutionDatasetsRecord, String> COUNTRY_CODE2 = createField(DSL.name("country_code2"), SQLDataType.CHAR(2).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "ISO 2 Code for country.");

    /**
     * The column
     * <code>germinate_db.view_table_institution_datasets.country_code3</code>.
     * ISO 3 Code for country.
     */
    public final TableField<ViewTableInstitutionDatasetsRecord, String> COUNTRY_CODE3 = createField(DSL.name("country_code3"), SQLDataType.CHAR(3).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "ISO 3 Code for country.");

    /**
     * The column
     * <code>germinate_db.view_table_institution_datasets.institution_contact</code>.
     * The contact at the institute which should be used for correspondence.
     */
    public final TableField<ViewTableInstitutionDatasetsRecord, String> INSTITUTION_CONTACT = createField(DSL.name("institution_contact"), SQLDataType.VARCHAR(255), this, "The contact at the institute which should be used for correspondence.");

    /**
     * The column
     * <code>germinate_db.view_table_institution_datasets.institution_phone</code>.
     * The telephone number for the institute.
     */
    public final TableField<ViewTableInstitutionDatasetsRecord, String> INSTITUTION_PHONE = createField(DSL.name("institution_phone"), SQLDataType.VARCHAR(255), this, "The telephone number for the institute.");

    /**
     * The column
     * <code>germinate_db.view_table_institution_datasets.institution_email</code>.
     * The email address to contact the institute.
     */
    public final TableField<ViewTableInstitutionDatasetsRecord, String> INSTITUTION_EMAIL = createField(DSL.name("institution_email"), SQLDataType.VARCHAR(255), this, "The email address to contact the institute.");

    /**
     * The column
     * <code>germinate_db.view_table_institution_datasets.institution_address</code>.
     * The postal address of the institute.
     */
    public final TableField<ViewTableInstitutionDatasetsRecord, String> INSTITUTION_ADDRESS = createField(DSL.name("institution_address"), SQLDataType.CLOB, this, "The postal address of the institute.");

    /**
     * The column
     * <code>germinate_db.view_table_institution_datasets.all_dataset_ids</code>.
     */
    public final TableField<ViewTableInstitutionDatasetsRecord, Integer[]> ALL_DATASET_IDS = createField(DSL.name("all_dataset_ids"), SQLDataType.JSON, this, "", new IntArrayBinding());

    /**
     * The column
     * <code>germinate_db.view_table_institution_datasets.trials_dataset_ids</code>.
     */
    public final TableField<ViewTableInstitutionDatasetsRecord, Integer[]> TRIALS_DATASET_IDS = createField(DSL.name("trials_dataset_ids"), SQLDataType.JSON, this, "", new IntArrayBinding());

    /**
     * The column
     * <code>germinate_db.view_table_institution_datasets.genotype_dataset_ids</code>.
     */
    public final TableField<ViewTableInstitutionDatasetsRecord, Integer[]> GENOTYPE_DATASET_IDS = createField(DSL.name("genotype_dataset_ids"), SQLDataType.JSON, this, "", new IntArrayBinding());

    /**
     * The column
     * <code>germinate_db.view_table_institution_datasets.climate_dataset_ids</code>.
     */
    public final TableField<ViewTableInstitutionDatasetsRecord, Integer[]> CLIMATE_DATASET_IDS = createField(DSL.name("climate_dataset_ids"), SQLDataType.JSON, this, "", new IntArrayBinding());

    /**
     * The column
     * <code>germinate_db.view_table_institution_datasets.pedigree_dataset_ids</code>.
     */
    public final TableField<ViewTableInstitutionDatasetsRecord, Integer[]> PEDIGREE_DATASET_IDS = createField(DSL.name("pedigree_dataset_ids"), SQLDataType.JSON, this, "", new IntArrayBinding());

    private ViewTableInstitutionDatasets(Name alias, Table<ViewTableInstitutionDatasetsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableInstitutionDatasets(Name alias, Table<ViewTableInstitutionDatasetsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_table_institution_datasets` as select `germinate_template_4_25_03_05`.`institutions`.`id` AS `institution_id`,`germinate_template_4_25_03_05`.`institutions`.`code` AS `institution_code`,`germinate_template_4_25_03_05`.`institutions`.`name` AS `institution_name`,`germinate_template_4_25_03_05`.`institutions`.`acronym` AS `institution_acronym`,`germinate_template_4_25_03_05`.`countries`.`country_name` AS `country_name`,`germinate_template_4_25_03_05`.`countries`.`country_code2` AS `country_code2`,`germinate_template_4_25_03_05`.`countries`.`country_code3` AS `country_code3`,`germinate_template_4_25_03_05`.`institutions`.`contact` AS `institution_contact`,`germinate_template_4_25_03_05`.`institutions`.`phone` AS `institution_phone`,`germinate_template_4_25_03_05`.`institutions`.`email` AS `institution_email`,`germinate_template_4_25_03_05`.`institutions`.`address` AS `institution_address`,(select json_arrayagg(`d`.`id`) from `germinate_template_4_25_03_05`.`datasets` `d` where exists(select 1 from (`germinate_template_4_25_03_05`.`datasetcollaborators` `dc` left join `germinate_template_4_25_03_05`.`collaborators` `c` on((`c`.`id` = `dc`.`collaborator_id`))) where ((`dc`.`dataset_id` = `d`.`id`) and (`c`.`institution_id` = `germinate_template_4_25_03_05`.`institutions`.`id`)))) AS `all_dataset_ids`,(select json_arrayagg(`d`.`id`) from `germinate_template_4_25_03_05`.`datasets` `d` where (exists(select 1 from (`germinate_template_4_25_03_05`.`datasetcollaborators` `dc` left join `germinate_template_4_25_03_05`.`collaborators` `c` on((`c`.`id` = `dc`.`collaborator_id`))) where ((`dc`.`dataset_id` = `d`.`id`) and (`c`.`institution_id` = `germinate_template_4_25_03_05`.`institutions`.`id`))) and (`d`.`datasettype_id` = 3))) AS `trials_dataset_ids`,(select json_arrayagg(`d`.`id`) from `germinate_template_4_25_03_05`.`datasets` `d` where (exists(select 1 from (`germinate_template_4_25_03_05`.`datasetcollaborators` `dc` left join `germinate_template_4_25_03_05`.`collaborators` `c` on((`c`.`id` = `dc`.`collaborator_id`))) where ((`dc`.`dataset_id` = `d`.`id`) and (`c`.`institution_id` = `germinate_template_4_25_03_05`.`institutions`.`id`))) and (`d`.`datasettype_id` = 1))) AS `genotype_dataset_ids`,(select json_arrayagg(`d`.`id`) from `germinate_template_4_25_03_05`.`datasets` `d` where (exists(select 1 from (`germinate_template_4_25_03_05`.`datasetcollaborators` `dc` left join `germinate_template_4_25_03_05`.`collaborators` `c` on((`c`.`id` = `dc`.`collaborator_id`))) where ((`dc`.`dataset_id` = `d`.`id`) and (`c`.`institution_id` = `germinate_template_4_25_03_05`.`institutions`.`id`))) and (`d`.`datasettype_id` = 5))) AS `climate_dataset_ids`,(select json_arrayagg(`d`.`id`) from `germinate_template_4_25_03_05`.`datasets` `d` where (exists(select 1 from (`germinate_template_4_25_03_05`.`datasetcollaborators` `dc` left join `germinate_template_4_25_03_05`.`collaborators` `c` on((`c`.`id` = `dc`.`collaborator_id`))) where ((`dc`.`dataset_id` = `d`.`id`) and (`c`.`institution_id` = `germinate_template_4_25_03_05`.`institutions`.`id`))) and (`d`.`datasettype_id` = 7))) AS `pedigree_dataset_ids` from (`germinate_template_4_25_03_05`.`institutions` left join `germinate_template_4_25_03_05`.`countries` on((`germinate_template_4_25_03_05`.`countries`.`id` = `germinate_template_4_25_03_05`.`institutions`.`country_id`))) having (`all_dataset_ids` is not null)"));
    }

    /**
     * Create an aliased
     * <code>germinate_db.view_table_institution_datasets</code> table reference
     */
    public ViewTableInstitutionDatasets(String alias) {
        this(DSL.name(alias), VIEW_TABLE_INSTITUTION_DATASETS);
    }

    /**
     * Create an aliased
     * <code>germinate_db.view_table_institution_datasets</code> table reference
     */
    public ViewTableInstitutionDatasets(Name alias) {
        this(alias, VIEW_TABLE_INSTITUTION_DATASETS);
    }

    /**
     * Create a <code>germinate_db.view_table_institution_datasets</code> table
     * reference
     */
    public ViewTableInstitutionDatasets() {
        this(DSL.name("view_table_institution_datasets"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewTableInstitutionDatasets as(String alias) {
        return new ViewTableInstitutionDatasets(DSL.name(alias), this);
    }

    @Override
    public ViewTableInstitutionDatasets as(Name alias) {
        return new ViewTableInstitutionDatasets(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableInstitutionDatasets rename(String name) {
        return new ViewTableInstitutionDatasets(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableInstitutionDatasets rename(Name name) {
        return new ViewTableInstitutionDatasets(name, null);
    }

    // -------------------------------------------------------------------------
    // Row16 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row16<Integer, String, String, String, String, String, String, String, String, String, String, Integer[], Integer[], Integer[], Integer[], Integer[]> fieldsRow() {
        return (Row16) super.fieldsRow();
    }
    // @formatter:on
}
