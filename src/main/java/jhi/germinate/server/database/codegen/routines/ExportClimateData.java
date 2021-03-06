/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen.routines;


import javax.annotation.Generated;

import jhi.germinate.server.database.codegen.GerminateDb;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;


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
public class ExportClimateData extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1959534517;

    /**
     * The parameter <code>germinate_db.export_climate_data.groupIds</code>.
     */
    public static final Parameter<String> GROUPIDS = Internal.createParameter("groupIds", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>germinate_db.export_climate_data.markedIds</code>.
     */
    public static final Parameter<String> MARKEDIDS = Internal.createParameter("markedIds", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>germinate_db.export_climate_data.datasetIds</code>.
     */
    public static final Parameter<String> DATASETIDS = Internal.createParameter("datasetIds", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>germinate_db.export_climate_data.climateIds</code>.
     */
    public static final Parameter<String> CLIMATEIDS = Internal.createParameter("climateIds", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public ExportClimateData() {
        super("export_climate_data", GerminateDb.GERMINATE_DB);

        addInParameter(GROUPIDS);
        addInParameter(MARKEDIDS);
        addInParameter(DATASETIDS);
        addInParameter(CLIMATEIDS);
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
     * Set the <code>climateIds</code> parameter IN value to the routine
     */
    public void setClimateids(String value) {
        setValue(CLIMATEIDS, value);
    }
}
