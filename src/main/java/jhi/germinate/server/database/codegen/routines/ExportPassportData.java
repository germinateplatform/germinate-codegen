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
public class ExportPassportData extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>germinate_db.export_passport_data.germplasmIds</code>.
     */
    public static final Parameter<String> GERMPLASMIDS = Internal.createParameter("germplasmIds", SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>germinate_db.export_passport_data.groupIds</code>.
     */
    public static final Parameter<String> GROUPIDS = Internal.createParameter("groupIds", SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public ExportPassportData() {
        super("export_passport_data", GerminateDb.GERMINATE_DB);

        addInParameter(GERMPLASMIDS);
        addInParameter(GROUPIDS);
    }

    /**
     * Set the <code>germplasmIds</code> parameter IN value to the routine
     */
    public void setGermplasmids(String value) {
        setValue(GERMPLASMIDS, value);
    }

    /**
     * Set the <code>groupIds</code> parameter IN value to the routine
     */
    public void setGroupids(String value) {
        setValue(GROUPIDS, value);
    }
}
