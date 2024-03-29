/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


// @formatter:off
/**
 * Determines the css property of the news item image.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum ViewTableNewsNewsImageFit implements EnumType {

    contain("contain"),

    cover("cover");

    private final String literal;

    private ViewTableNewsNewsImageFit(String literal) {
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
        return "view_table_news_news_image_fit";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static ViewTableNewsNewsImageFit lookupLiteral(String literal) {
        return EnumType.lookupLiteral(ViewTableNewsNewsImageFit.class, literal);
    }
    // @formatter:on
}
