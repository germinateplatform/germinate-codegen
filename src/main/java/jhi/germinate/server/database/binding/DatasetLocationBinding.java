package jhi.germinate.server.database.binding;

import com.google.gson.*;
import jhi.germinate.server.database.codegen.tables.pojos.ViewTableLocations;
import org.jooq.*;
import org.jooq.conf.ParamType;
import org.jooq.impl.DSL;

import java.sql.*;
import java.util.Objects;

/**
 * @author Sebastian Raubach
 */
public class DatasetLocationBinding implements Binding<Object, ViewTableLocations[]>
{
	@Override
	public Converter<Object, ViewTableLocations[]> converter()
	{
		Gson gson = new Gson();
		return new Converter<>()
		{
			@Override
			public ViewTableLocations[] from(Object o)
			{
				return o == null ? null : gson.fromJson(Objects.toString(o), ViewTableLocations[].class);
			}

			@Override
			public Object to(ViewTableLocations[] o)
			{
				return o == null ? null : gson.toJson(o);
			}

			@Override
			public Class<Object> fromType()
			{
				return Object.class;
			}

			@Override
			public Class<ViewTableLocations[]> toType()
			{
				return ViewTableLocations[].class;
			}
		};
	}

	@Override
	public void sql(BindingSQLContext<ViewTableLocations[]> ctx)
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
	public void register(BindingRegisterContext<ViewTableLocations[]> ctx)
		throws SQLException
	{
		ctx.statement().registerOutParameter(ctx.index(), Types.VARCHAR);
	}

	@Override
	public void set(BindingSetStatementContext<ViewTableLocations[]> ctx)
		throws SQLException
	{
		ctx.statement().setString(ctx.index(), Objects.toString(ctx.convert(converter()).value(), null));
	}

	@Override
	public void set(BindingSetSQLOutputContext<ViewTableLocations[]> ctx)
		throws SQLException
	{
		throw new SQLFeatureNotSupportedException();
	}

	@Override
	public void get(BindingGetResultSetContext<ViewTableLocations[]> ctx)
		throws SQLException
	{
		ctx.convert(converter()).value(ctx.resultSet().getString(ctx.index()));
	}

	@Override
	public void get(BindingGetStatementContext<ViewTableLocations[]> ctx)
		throws SQLException
	{
		ctx.convert(converter()).value(ctx.statement().getString(ctx.index()));
	}

	@Override
	public void get(BindingGetSQLInputContext<ViewTableLocations[]> ctx)
		throws SQLException
	{
		throw new SQLFeatureNotSupportedException();
	}
}
