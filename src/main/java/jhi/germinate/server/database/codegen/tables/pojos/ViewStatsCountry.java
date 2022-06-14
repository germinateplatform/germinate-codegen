/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;


// @formatter:off
/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewStatsCountry implements Serializable {

    private static final long serialVersionUID = 1L;

    private String country;
    private String code;
    private Long   count;

    public ViewStatsCountry() {}

    public ViewStatsCountry(ViewStatsCountry value) {
        this.country = value.country;
        this.code = value.code;
        this.count = value.count;
    }

    public ViewStatsCountry(
        String country,
        String code,
        Long   count
    ) {
        this.country = country;
        this.code = code;
        this.count = count;
    }

    /**
     * Getter for <code>germinate_db.view_stats_country.country</code>.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for <code>germinate_db.view_stats_country.country</code>.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Getter for <code>germinate_db.view_stats_country.code</code>.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>germinate_db.view_stats_country.code</code>.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for <code>germinate_db.view_stats_country.count</code>.
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * Setter for <code>germinate_db.view_stats_country.count</code>.
     */
    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewStatsCountry (");

        sb.append(country);
        sb.append(", ").append(code);
        sb.append(", ").append(count);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
