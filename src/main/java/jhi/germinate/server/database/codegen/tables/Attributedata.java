/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.AttributedataRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


// @formatter:off
/**
 * Defines attributes data. Attributes which are defined in attributes can have
 * values associated with them. Data which does not warrant new column in the
 * germinatebase table can be added here. Examples include small amounts of data
 * defining germplasm which only exists for a small sub-group of the total
 * database.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Attributedata extends TableImpl<AttributedataRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.attributedata</code>
     */
    public static final Attributedata ATTRIBUTEDATA = new Attributedata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AttributedataRecord> getRecordType() {
        return AttributedataRecord.class;
    }

    /**
     * The column <code>germinate_db.attributedata.id</code>. Primary id for
     * this table. This uniquely identifies the row.
     */
    public final TableField<AttributedataRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.attributedata.attribute_id</code>. Foreign
     * key to attributes (attributes.id).
     */
    public final TableField<AttributedataRecord, Integer> ATTRIBUTE_ID = createField(DSL.name("attribute_id"), SQLDataType.INTEGER.nullable(false), this, "Foreign key to attributes (attributes.id).");

    /**
     * The column <code>germinate_db.attributedata.foreign_id</code>. Foreign
     * key to germinatebase (germinatebase.id).
     */
    public final TableField<AttributedataRecord, Integer> FOREIGN_ID = createField(DSL.name("foreign_id"), SQLDataType.INTEGER.nullable(false), this, "Foreign key to germinatebase (germinatebase.id).");

    /**
     * The column <code>germinate_db.attributedata.value</code>. The value of
     * the attribute.
     */
    public final TableField<AttributedataRecord, String> VALUE = createField(DSL.name("value"), SQLDataType.CLOB.nullable(false), this, "The value of the attribute.");

    /**
     * The column <code>germinate_db.attributedata.created_on</code>. When the
     * record was created.
     */
    public final TableField<AttributedataRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.attributedata.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public final TableField<AttributedataRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private Attributedata(Name alias, Table<AttributedataRecord> aliased) {
        this(alias, aliased, null);
    }

    private Attributedata(Name alias, Table<AttributedataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Defines attributes data. Attributes which are defined in attributes can have values associated with them. Data which does not warrant new column in the germinatebase table can be added here. Examples include small amounts of data defining germplasm which only exists for a small sub-group of the total database."), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.attributedata</code> table reference
     */
    public Attributedata(String alias) {
        this(DSL.name(alias), ATTRIBUTEDATA);
    }

    /**
     * Create an aliased <code>germinate_db.attributedata</code> table reference
     */
    public Attributedata(Name alias) {
        this(alias, ATTRIBUTEDATA);
    }

    /**
     * Create a <code>germinate_db.attributedata</code> table reference
     */
    public Attributedata() {
        this(DSL.name("attributedata"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<AttributedataRecord, Integer> getIdentity() {
        return (Identity<AttributedataRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<AttributedataRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Attributedata.ATTRIBUTEDATA, DSL.name("KEY_attributedata_PRIMARY"), new TableField[] { Attributedata.ATTRIBUTEDATA.ID }, true);
    }

    @Override
    public Attributedata as(String alias) {
        return new Attributedata(DSL.name(alias), this);
    }

    @Override
    public Attributedata as(Name alias) {
        return new Attributedata(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Attributedata rename(String name) {
        return new Attributedata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Attributedata rename(Name name) {
        return new Attributedata(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
    // @formatter:on
}
