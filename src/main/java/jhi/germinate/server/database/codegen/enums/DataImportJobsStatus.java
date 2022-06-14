/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum DataImportJobsStatus implements EnumType {

    waiting("waiting"),

    running("running"),

    failed("failed"),

    completed("completed"),

    cancelled("cancelled");

    private final String literal;

    private DataImportJobsStatus(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return null;
    }

    @Override
    public Schema getSchema() {
        return null;
    }

    @Override
    public String getName() {
        return "data_import_jobs_status";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static DataImportJobsStatus lookupLiteral(String literal) {
        return EnumType.lookupLiteral(DataImportJobsStatus.class, literal);
    }
    // @formatter:on
}
