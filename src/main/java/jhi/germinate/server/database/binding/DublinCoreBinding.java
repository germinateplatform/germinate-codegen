package jhi.germinate.server.database.binding;

import com.google.gson.*;
import jhi.germinate.server.database.pojo.DublinCore;
import org.jooq.*;
import org.jooq.conf.ParamType;
import org.jooq.impl.DSL;

import java.sql.*;
import java.util.Objects;

/**
 * @author Sebastian Raubach
 */
public class DublinCoreBinding implements Binding<JSON, DublinCore>
{
	@Override
	public Converter<JSON, DublinCore> converter()
	{
		Gson gson = new Gson();
		return new Converter<>()
		{
			@Override
			public DublinCore from(JSON o)
			{
				return o == null ? null : gson.fromJson(Objects.toString(o), DublinCore.class);
			}

			@Override
			public JSON to(DublinCore dublinCore)
			{
				return dublinCore == null ? null : JSON.json(gson.toJson(dublinCore));
			}

			@Override
			public Class<JSON> fromType()
			{
				return JSON.class;
			}

			@Override
			public Class<DublinCore> toType()
			{
				return DublinCore.class;
			}
		};
	}

	@Override
	public void sql(BindingSQLContext<DublinCore> ctx)
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
	public void register(BindingRegisterContext<DublinCore> ctx)
		throws SQLException
	{
		ctx.statement().registerOutParameter(ctx.index(), Types.VARCHAR);
	}

	@Override
	public void set(BindingSetStatementContext<DublinCore> ctx)
		throws SQLException
	{
		ctx.statement().setString(ctx.index(), Objects.toString(ctx.convert(converter()).value(), null));
	}

	@Override
	public void set(BindingSetSQLOutputContext<DublinCore> ctx)
		throws SQLException
	{
		throw new SQLFeatureNotSupportedException();
	}

	@Override
	public void get(BindingGetResultSetContext<DublinCore> ctx)
		throws SQLException
	{
		ctx.convert(converter()).value(JSON.json(ctx.resultSet().getString(ctx.index())));
	}

	@Override
	public void get(BindingGetStatementContext<DublinCore> ctx)
		throws SQLException
	{
		ctx.convert(converter()).value(JSON.json(ctx.statement().getString(ctx.index())));
	}

	@Override
	public void get(BindingGetSQLInputContext<DublinCore> ctx)
		throws SQLException
	{
		throw new SQLFeatureNotSupportedException();
	}
}
