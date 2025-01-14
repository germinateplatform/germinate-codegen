/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewStatsCountryRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row3;
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
public class ViewStatsCountry extends TableImpl<ViewStatsCountryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.view_stats_country</code>
     */
    public static final ViewStatsCountry VIEW_STATS_COUNTRY = new ViewStatsCountry();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewStatsCountryRecord> getRecordType() {
        return ViewStatsCountryRecord.class;
    }

    /**
     * The column <code>germinate_db.view_stats_country.country</code>.
     */
    public final TableField<ViewStatsCountryRecord, String> COUNTRY = createField(DSL.name("country"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>germinate_db.view_stats_country.code</code>.
     */
    public final TableField<ViewStatsCountryRecord, String> CODE = createField(DSL.name("code"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>germinate_db.view_stats_country.count</code>.
     */
    public final TableField<ViewStatsCountryRecord, Long> COUNT = createField(DSL.name("count"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "");

    private ViewStatsCountry(Name alias, Table<ViewStatsCountryRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewStatsCountry(Name alias, Table<ViewStatsCountryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_stats_country` as select ifnull(`germinate_template_4_25_01_14`.`countries`.`country_name`,'UNKNOWN COUNTRY ORIGIN') AS `country`,ifnull(`germinate_template_4_25_01_14`.`countries`.`country_code3`,'UNK') AS `code`,count(1) AS `count` from ((`germinate_template_4_25_01_14`.`germinatebase` left join `germinate_template_4_25_01_14`.`locations` on((`germinate_template_4_25_01_14`.`germinatebase`.`location_id` = `germinate_template_4_25_01_14`.`locations`.`id`))) left join `germinate_template_4_25_01_14`.`countries` on((`germinate_template_4_25_01_14`.`countries`.`id` = `germinate_template_4_25_01_14`.`locations`.`country_id`))) where (`germinate_template_4_25_01_14`.`germinatebase`.`entitytype_id` = 1) group by `germinate_template_4_25_01_14`.`countries`.`id` order by count(1) desc"));
    }

    /**
     * Create an aliased <code>germinate_db.view_stats_country</code> table
     * reference
     */
    public ViewStatsCountry(String alias) {
        this(DSL.name(alias), VIEW_STATS_COUNTRY);
    }

    /**
     * Create an aliased <code>germinate_db.view_stats_country</code> table
     * reference
     */
    public ViewStatsCountry(Name alias) {
        this(alias, VIEW_STATS_COUNTRY);
    }

    /**
     * Create a <code>germinate_db.view_stats_country</code> table reference
     */
    public ViewStatsCountry() {
        this(DSL.name("view_stats_country"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewStatsCountry as(String alias) {
        return new ViewStatsCountry(DSL.name(alias), this);
    }

    @Override
    public ViewStatsCountry as(Name alias) {
        return new ViewStatsCountry(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewStatsCountry rename(String name) {
        return new ViewStatsCountry(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewStatsCountry rename(Name name) {
        return new ViewStatsCountry(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
    // @formatter:on
}
