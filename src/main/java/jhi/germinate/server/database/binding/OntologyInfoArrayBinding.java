package jhi.germinate.server.database.binding;

import com.google.gson.Gson;
import jhi.germinate.server.database.pojo.OntologyInfo;
import org.jooq.*;
import org.jooq.conf.ParamType;
import org.jooq.impl.DSL;

import java.sql.*;
import java.util.Objects;

/**
 * @author Sebastian Raubach
 */
public class OntologyInfoArrayBinding implements Binding<JSON, OntologyInfo[]>
{
	@Override
	public Converter<JSON, OntologyInfo[]> converter()
	{
		Gson gson = new Gson();
		return new Converter<>()
		{
			@Override
			public OntologyInfo[] from(JSON o)
			{
				return o == null ? null : gson.fromJson(Objects.toString(o), OntologyInfo[].class);
			}

			@Override
			public JSON to(OntologyInfo[] o)
			{
				return o == null ? null : JSON.json(gson.toJson(o));
			}

			@Override
			public Class<JSON> fromType()
			{
				return JSON.class;
			}

			@Override
			public Class<OntologyInfo[]> toType()
			{
				return OntologyInfo[].class;
			}
		};
	}

	@Override
	public void sql(BindingSQLContext<OntologyInfo[]> ctx)
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
	public void register(BindingRegisterContext<OntologyInfo[]> ctx)
		throws SQLException
	{
		ctx.statement().registerOutParameter(ctx.index(), Types.VARCHAR);
	}

	@Override
	public void set(BindingSetStatementContext<OntologyInfo[]> ctx)
		throws SQLException
	{
		ctx.statement().setString(ctx.index(), Objects.toString(ctx.convert(converter()).value(), null));
	}

	@Override
	public void set(BindingSetSQLOutputContext<OntologyInfo[]> ctx)
		throws SQLException
	{
		throw new SQLFeatureNotSupportedException();
	}

	@Override
	public void get(BindingGetResultSetContext<OntologyInfo[]> ctx)
		throws SQLException
	{
		ctx.convert(converter()).value(JSON.json(ctx.resultSet().getString(ctx.index())));
	}

	@Override
	public void get(BindingGetStatementContext<OntologyInfo[]> ctx)
		throws SQLException
	{
		ctx.convert(converter()).value(JSON.json(ctx.statement().getString(ctx.index())));
	}

	@Override
	public void get(BindingGetSQLInputContext<OntologyInfo[]> ctx)
		throws SQLException
	{
		throw new SQLFeatureNotSupportedException();
	}
}
