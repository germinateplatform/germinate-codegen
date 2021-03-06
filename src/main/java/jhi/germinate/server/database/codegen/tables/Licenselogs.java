/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.GerminateDb;
import jhi.germinate.server.database.codegen.tables.records.LicenselogsRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.TableImpl;


// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Licenselogs extends TableImpl<LicenselogsRecord> {

    private static final long serialVersionUID = -24183779;

    /**
     * The reference instance of <code>germinate_db.licenselogs</code>
     */
    public static final Licenselogs LICENSELOGS = new Licenselogs();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LicenselogsRecord> getRecordType() {
        return LicenselogsRecord.class;
    }

    /**
     * The column <code>germinate_db.licenselogs.id</code>.
     */
    public final TableField<LicenselogsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>germinate_db.licenselogs.license_id</code>.
     */
    public final TableField<LicenselogsRecord, Integer> LICENSE_ID = createField("license_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_db.licenselogs.user_id</code>.
     */
    public final TableField<LicenselogsRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_db.licenselogs.accepted_on</code>.
     */
    public final TableField<LicenselogsRecord, Timestamp> ACCEPTED_ON = createField("accepted_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>germinate_db.licenselogs</code> table reference
     */
    public Licenselogs() {
        this(DSL.name("licenselogs"), null);
    }

    /**
     * Create an aliased <code>germinate_db.licenselogs</code> table reference
     */
    public Licenselogs(String alias) {
        this(DSL.name(alias), LICENSELOGS);
    }

    /**
     * Create an aliased <code>germinate_db.licenselogs</code> table reference
     */
    public Licenselogs(Name alias) {
        this(alias, LICENSELOGS);
    }

    private Licenselogs(Name alias, Table<LicenselogsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Licenselogs(Name alias, Table<LicenselogsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return GerminateDb.GERMINATE_DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LicenselogsRecord, Integer> getIdentity() {
        return Internal.createIdentity(jhi.germinate.server.database.codegen.tables.Licenselogs.LICENSELOGS, jhi.germinate.server.database.codegen.tables.Licenselogs.LICENSELOGS.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LicenselogsRecord> getPrimaryKey() {
        return Internal.createUniqueKey(jhi.germinate.server.database.codegen.tables.Licenselogs.LICENSELOGS, "KEY_licenselogs_PRIMARY", jhi.germinate.server.database.codegen.tables.Licenselogs.LICENSELOGS.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LicenselogsRecord>> getKeys() {
        return Arrays.<UniqueKey<LicenselogsRecord>>asList(
              Internal.createUniqueKey(jhi.germinate.server.database.codegen.tables.Licenselogs.LICENSELOGS, "KEY_licenselogs_PRIMARY", jhi.germinate.server.database.codegen.tables.Licenselogs.LICENSELOGS.ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Licenselogs as(String alias) {
        return new Licenselogs(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Licenselogs as(Name alias) {
        return new Licenselogs(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Licenselogs rename(String name) {
        return new Licenselogs(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Licenselogs rename(Name name) {
        return new Licenselogs(name, null);
    }
// @formatter:on
}
