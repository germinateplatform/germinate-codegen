/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.ViewStatsBiologicalstatusRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row2;
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
public class ViewStatsBiologicalstatus extends TableImpl<ViewStatsBiologicalstatusRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>germinate_db.view_stats_biologicalstatus</code>
     */
    public static final ViewStatsBiologicalstatus VIEW_STATS_BIOLOGICALSTATUS = new ViewStatsBiologicalstatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewStatsBiologicalstatusRecord> getRecordType() {
        return ViewStatsBiologicalstatusRecord.class;
    }

    /**
     * The column
     * <code>germinate_db.view_stats_biologicalstatus.biologicalstatus</code>.
     */
    public final TableField<ViewStatsBiologicalstatusRecord, String> BIOLOGICALSTATUS = createField(DSL.name("biologicalstatus"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>germinate_db.view_stats_biologicalstatus.count</code>.
     */
    public final TableField<ViewStatsBiologicalstatusRecord, Long> COUNT = createField(DSL.name("count"), SQLDataType.BIGINT, this, "");

    private ViewStatsBiologicalstatus(Name alias, Table<ViewStatsBiologicalstatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewStatsBiologicalstatus(Name alias, Table<ViewStatsBiologicalstatusRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `view_stats_biologicalstatus` as select substring_index(`germinate_template_4_22_10_03`.`biologicalstatus`.`sampstat`,' (',1) AS `biologicalstatus`,(select count(1) from `germinate_template_4_22_10_03`.`mcpd` where (`germinate_template_4_22_10_03`.`mcpd`.`sampstat` = `germinate_template_4_22_10_03`.`biologicalstatus`.`id`)) AS `count` from `germinate_template_4_22_10_03`.`biologicalstatus` order by `count` desc"));
    }

    /**
     * Create an aliased <code>germinate_db.view_stats_biologicalstatus</code>
     * table reference
     */
    public ViewStatsBiologicalstatus(String alias) {
        this(DSL.name(alias), VIEW_STATS_BIOLOGICALSTATUS);
    }

    /**
     * Create an aliased <code>germinate_db.view_stats_biologicalstatus</code>
     * table reference
     */
    public ViewStatsBiologicalstatus(Name alias) {
        this(alias, VIEW_STATS_BIOLOGICALSTATUS);
    }

    /**
     * Create a <code>germinate_db.view_stats_biologicalstatus</code> table
     * reference
     */
    public ViewStatsBiologicalstatus() {
        this(DSL.name("view_stats_biologicalstatus"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public ViewStatsBiologicalstatus as(String alias) {
        return new ViewStatsBiologicalstatus(DSL.name(alias), this);
    }

    @Override
    public ViewStatsBiologicalstatus as(Name alias) {
        return new ViewStatsBiologicalstatus(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewStatsBiologicalstatus rename(String name) {
        return new ViewStatsBiologicalstatus(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewStatsBiologicalstatus rename(Name name) {
        return new ViewStatsBiologicalstatus(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
    // @formatter:on
}
