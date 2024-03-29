/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.tables.pojos;


import java.io.Serializable;


import lombok.*;
import lombok.experimental.Accessors;

// @formatter:off
/**
 * VIEW
 */
@Getter
@Setter
@Accessors(chain = true)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewStatsPdci implements Serializable {

    private static final long serialVersionUID = 1L;

    private String bin;
    private Long   count;

    public ViewStatsPdci() {}

    public ViewStatsPdci(ViewStatsPdci value) {
        this.bin = value.bin;
        this.count = value.count;
    }

    public ViewStatsPdci(
        String bin,
        Long   count
    ) {
        this.bin = bin;
        this.count = count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewStatsPdci (");

        sb.append(bin);
        sb.append(", ").append(count);

        sb.append(")");
        return sb.toString();
    }
    // @formatter:on
}
