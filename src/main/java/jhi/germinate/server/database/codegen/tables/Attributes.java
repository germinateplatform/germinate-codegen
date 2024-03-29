/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.enums.AttributesDatatype;
import jhi.germinate.server.database.codegen.tables.records.AttributesRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Row7;
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
 * Describes attributes. Attributes are bits of information that can be joined
 * to, for example, a germinatebase entry. These are bits of data that while
 * important do not warrant adding additional columns in the other tables.
 * Examples would be using this to define ecotypes for germinatebase entries.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Attributes extends TableImpl<AttributesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db.attributes</code>
     */
    public static final Attributes ATTRIBUTES = new Attributes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AttributesRecord> getRecordType() {
        return AttributesRecord.class;
    }

    /**
     * The column <code>germinate_db.attributes.id</code>. Primary id for this
     * table. This uniquely identifies the row.
     */
    public final TableField<AttributesRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_db.attributes.name</code>. Defines the name of
     * the attribute.
     */
    public final TableField<AttributesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "Defines the name of the attribute.");

    /**
     * The column <code>germinate_db.attributes.description</code>. Describes
     * the attribute. This should expand on the name to make it clear what the
     * attribute actually is.
     */
    public final TableField<AttributesRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(255), this, "Describes the attribute. This should expand on the name to make it clear what the attribute actually is.");

    /**
     * The column <code>germinate_db.attributes.datatype</code>. Defines the
     * data type of the attribute. This can be of numeric, text, date or
     * categorical types.
     */
    public final TableField<AttributesRecord, AttributesDatatype> DATATYPE = createField(DSL.name("datatype"), SQLDataType.VARCHAR(11).nullable(false).defaultValue(DSL.inline("text", SQLDataType.VARCHAR)).asEnumDataType(jhi.germinate.server.database.codegen.enums.AttributesDatatype.class), this, "Defines the data type of the attribute. This can be of numeric, text, date or categorical types.");

    /**
     * The column <code>germinate_db.attributes.target_table</code>.
     */
    public final TableField<AttributesRecord, String> TARGET_TABLE = createField(DSL.name("target_table"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.inline("germinatebase", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>germinate_db.attributes.created_on</code>. When the
     * record was created.
     */
    public final TableField<AttributesRecord, Timestamp> CREATED_ON = createField(DSL.name("created_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_db.attributes.updated_on</code>. When the
     * record was updated. This may be different from the created on date if
     * subsequent changes have been made to the underlying record.
     */
    public final TableField<AttributesRecord, Timestamp> UPDATED_ON = createField(DSL.name("updated_on"), SQLDataType.TIMESTAMP(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    private Attributes(Name alias, Table<AttributesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Attributes(Name alias, Table<AttributesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Describes attributes. Attributes are bits of information that can be joined to, for example, a germinatebase entry. These are bits of data that while important do not warrant adding additional columns in the other tables. Examples would be using this to define ecotypes for germinatebase entries."), TableOptions.table());
    }

    /**
     * Create an aliased <code>germinate_db.attributes</code> table reference
     */
    public Attributes(String alias) {
        this(DSL.name(alias), ATTRIBUTES);
    }

    /**
     * Create an aliased <code>germinate_db.attributes</code> table reference
     */
    public Attributes(Name alias) {
        this(alias, ATTRIBUTES);
    }

    /**
     * Create a <code>germinate_db.attributes</code> table reference
     */
    public Attributes() {
        this(DSL.name("attributes"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : GerminateDb.GERMINATE_DB;
    }

    @Override
    public Identity<AttributesRecord, Integer> getIdentity() {
        return (Identity<AttributesRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<AttributesRecord> getPrimaryKey() {
        return Internal.createUniqueKey(Attributes.ATTRIBUTES, DSL.name("KEY_attributes_PRIMARY"), new TableField[] { Attributes.ATTRIBUTES.ID }, true);
    }

    @Override
    public Attributes as(String alias) {
        return new Attributes(DSL.name(alias), this);
    }

    @Override
    public Attributes as(Name alias) {
        return new Attributes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Attributes rename(String name) {
        return new Attributes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Attributes rename(Name name) {
        return new Attributes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, String, String, AttributesDatatype, String, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
    // @formatter:on
}
