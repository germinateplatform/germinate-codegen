/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


// @formatter:off
/**
 * Defines the data type of the phenotype. This can be of numeric, text, date or
 * categorical types.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum ViewTableTraitsDataType implements EnumType {

    categorical("categorical"),

    numeric("numeric"),

    text("text"),

    date("date");

    private final String literal;

    private ViewTableTraitsDataType(String literal) {
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
        return "view_table_traits_data_type";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static ViewTableTraitsDataType lookupLiteral(String literal) {
        return EnumType.lookupLiteral(ViewTableTraitsDataType.class, literal);
    }
    // @formatter:on
}
