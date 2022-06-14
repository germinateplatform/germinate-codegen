/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.routines;


import jhi.germinate.server.database.codegen.GerminateDb;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExportTraitCategorical extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>germinate_db.export_trait_categorical.groupIds</code>.
     */
    public static final Parameter<String> GROUPIDS = Internal.createParameter("groupIds", SQLDataType.CLOB, false, false);

    /**
     * The parameter
     * <code>germinate_db.export_trait_categorical.markedIds</code>.
     */
    public static final Parameter<String> MARKEDIDS = Internal.createParameter("markedIds", SQLDataType.CLOB, false, false);

    /**
     * The parameter
     * <code>germinate_db.export_trait_categorical.datasetIds</code>.
     */
    public static final Parameter<String> DATASETIDS = Internal.createParameter("datasetIds", SQLDataType.CLOB, false, false);

    /**
     * The parameter
     * <code>germinate_db.export_trait_categorical.traitIds</code>.
     */
    public static final Parameter<String> TRAITIDS = Internal.createParameter("traitIds", SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public ExportTraitCategorical() {
        super("export_trait_categorical", GerminateDb.GERMINATE_DB);

        addInParameter(GROUPIDS);
        addInParameter(MARKEDIDS);
        addInParameter(DATASETIDS);
        addInParameter(TRAITIDS);
    }

    /**
     * Set the <code>groupIds</code> parameter IN value to the routine
     */
    public void setGroupids(String value) {
        setValue(GROUPIDS, value);
    }

    /**
     * Set the <code>markedIds</code> parameter IN value to the routine
     */
    public void setMarkedids(String value) {
        setValue(MARKEDIDS, value);
    }

    /**
     * Set the <code>datasetIds</code> parameter IN value to the routine
     */
    public void setDatasetids(String value) {
        setValue(DATASETIDS, value);
    }

    /**
     * Set the <code>traitIds</code> parameter IN value to the routine
     */
    public void setTraitids(String value) {
        setValue(TRAITIDS, value);
    }
}
