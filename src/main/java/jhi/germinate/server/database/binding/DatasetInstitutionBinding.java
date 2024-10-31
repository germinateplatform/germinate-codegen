package jhi.germinate.server.database.binding;

import com.google.gson.Gson;
import jhi.germinate.server.database.codegen.tables.pojos.ViewTableInstitutions;
import org.jooq.*;
import org.jooq.conf.ParamType;
import org.jooq.impl.DSL;

import java.sql.*;
import java.util.Objects;

/**
 * @author Sebastian Raubach
 */
public class DatasetInstitutionBinding implements Binding<JSON, ViewTableInstitutions[]>
{
	@Override
	public Converter<JSON, ViewTableInstitutions[]> converter()
	{
		Gson gson = new Gson();
		return new Converter<>()
		{
			@Override
			public ViewTableInstitutions[] from(JSON o)
			{
				return o == null ? null : gson.fromJson(Objects.toString(o), ViewTableInstitutions[].class);
			}

			@Override
			public JSON to(ViewTableInstitutions[] o)
			{
				return o == null ? null : JSON.json(gson.toJson(o));
			}

			@Override
			public Class<JSON> fromType()
			{
				return JSON.class;
			}

			@Override
			public Class<ViewTableInstitutions[]> toType()
			{
				return ViewTableInstitutions[].class;
			}
		};
	}

	@Override
	public void sql(BindingSQLContext<ViewTableInstitutions[]> ctx)
		throws SQLException
	{
		// Depending on how you generate your SQL, you may need to explicitly distinguish
		// between jOOQ generating bind variables or inlined literals.
		if (ctx.render().paramType() == ParamType.INLINED)
			ctx.render().visit(DSL.inline(ctx.convert(converter()).value())).sql("");
		else
			ctx.render().sql("?");
	}

	@Override
	public void register(BindingRegisterContext<ViewTableInstitutions[]> ctx)
		throws SQLException
	{
		ctx.statement().registerOutParameter(ctx.index(), Types.VARCHAR);
	}

	@Override
	public void set(BindingSetStatementContext<ViewTableInstitutions[]> ctx)
		throws SQLException
	{
		ctx.statement().setString(ctx.index(), Objects.toString(ctx.convert(converter()).value(), null));
	}

	@Override
	public void set(BindingSetSQLOutputContext<ViewTableInstitutions[]> ctx)
		throws SQLException
	{
		throw new SQLFeatureNotSupportedException();
	}

	@Override
	public void get(BindingGetResultSetContext<ViewTableInstitutions[]> ctx)
		throws SQLException
	{
		ctx.convert(converter()).value(JSON.json(ctx.resultSet().getString(ctx.index())));
	}

	@Override
	public void get(BindingGetStatementContext<ViewTableInstitutions[]> ctx)
		throws SQLException
	{
		ctx.convert(converter()).value(JSON.json(ctx.statement().getString(ctx.index())));
	}

	@Override
	public void get(BindingGetSQLInputContext<ViewTableInstitutions[]> ctx)
		throws SQLException
	{
		throw new SQLFeatureNotSupportedException();
	}
}
