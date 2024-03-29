/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.MapfeaturetypesRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Row4;
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
 * Defines features which can exist on maps. In general this will be the marker
 * type but it can also be used to identify QTL regions.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Mapfeaturetypes extends TableImpl<MapfeaturetypesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.mapfeaturetypes</code>
     */
    public static final Mapfeaturetypes MAPFEATURETYPES = new Mapfeaturetypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MapfeaturetypesRecord> getRecordType() {
        return MapfeaturetypesRecord.class;
    }

    /**
     * The column <code>germinate_db.mapfeaturetypes.id</code>. Primary id for
     * this table. This uniquely identifies the row.
     */
    public final TableField<MapfeaturetypesRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.mapfeaturetypes.description</code>.
     * Description of the feature type. This could include a definition of the
     * marker type such as 'SNP', 'KASP' or 'AFLP'.
     */
    public final TableField<MapfeaturetypesRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(255), this, "Description of the feature type. This could include a definition of the marker type such as 'SNP', 'KASP' or 'AFLP'.");

    /**
     * The column <code>germinate_db.mapfeaturetypes.created_on</code>. When the
     * record was created.
     */
    public final TableField<MapfeaturetypesRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.mapfeaturetypes.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public final TableField<MapfeaturetypesRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private Mapfeaturetypes(Name alias, Table<MapfeaturetypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Mapfeaturetypes(Name alias, Table<MapfeaturetypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Defines features which can exist on maps. In general this will be the marker type but it can also be used to identify QTL regions."), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.mapfeaturetypes</code> table
     * reference
     */
    public Mapfeaturetypes(String alias) {
        this(DSL.name(alias), MAPFEATURETYPES);
    }

    /**
     * Create an aliased <code>germinate_db.mapfeaturetypes</code> table
     * reference
     */
    public Mapfeaturetypes(Name alias) {
        this(alias, MAPFEATURETYPES);
    }

    /**
     * Create a <code>germinate_db.mapfeaturetypes</code> table reference
     */
    public Mapfeaturetypes() {
        this(DSL.name("mapfeaturetypes"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<MapfeaturetypesRecord, Integer> getIdentity() {
        return (Identity<MapfeaturetypesRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<MapfeaturetypesRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Mapfeaturetypes.MAPFEATURETYPES, DSL.name("KEY_mapfeaturetypes_PRIMARY"), new TableField[] { Mapfeaturetypes.MAPFEATURETYPES.ID }, true);
    }

    @Override
    public Mapfeaturetypes as(String alias) {
        return new Mapfeaturetypes(DSL.name(alias), this);
    }

    @Override
    public Mapfeaturetypes as(Name alias) {
        return new Mapfeaturetypes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Mapfeaturetypes rename(String name) {
        return new Mapfeaturetypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Mapfeaturetypes rename(Name name) {
        return new Mapfeaturetypes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
    // @formatter:on
}
