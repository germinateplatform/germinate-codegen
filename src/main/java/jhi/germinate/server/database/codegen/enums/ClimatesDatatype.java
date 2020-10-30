/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.enums;


import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


// @formatter:off
/**
 * Defines the data type of the climate. This can be of numeric, text, date 
 * or categorical types.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum ClimatesDatatype implements EnumType {

    categorical("categorical"),

    numeric("numeric"),

    text("text"),

    date("date");

    private final String literal;

    private ClimatesDatatype(String literal) {
        this.literal = literal;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return "climates_datatype";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
// @formatter:on
}
