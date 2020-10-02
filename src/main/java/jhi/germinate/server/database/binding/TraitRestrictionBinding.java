package jhi.germinate.server.database.binding;

import com.google.gson.Gson;
import jhi.germinate.server.database.pojo.TraitRestrictions;
import org.jooq.*;
import org.jooq.conf.ParamType;
import org.jooq.impl.DSL;

import java.sql.*;
import java.util.Objects;

/**
 * @author Sebastian Raubach
 */
public class TraitRestrictionBinding implements Binding<Object, TraitRestrictions>
{
	@Override
	public Converter<Object, TraitRestrictions> converter()
	{
		Gson gson = new Gson();
		return new Converter<>()
		{
			@Override
			public TraitRestrictions from(Object o)
			{
				return o == null ? null : gson.fromJson(Objects.toString(o), TraitRestrictions.class);
			}

			@Override
			public Object to(TraitRestrictions traitRestrictions)
			{
				return traitRestrictions == null ? null : gson.toJson(traitRestrictions);
			}

			@Override
			public Class<Object> fromType()
			{
				return Object.class;
			}

			@Override
			public Class<TraitRestrictions> toType()
			{
				return TraitRestrictions.class;
			}
		};
	}

	@Override
	public void sql(BindingSQLContext<TraitRestrictions> ctx)
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
	public void register(BindingRegisterContext<TraitRestrictions> ctx)
		throws SQLException
	{
		ctx.statement().registerOutParameter(ctx.index(), Types.VARCHAR);
	}

	@Override
	public void set(BindingSetStatementContext<TraitRestrictions> ctx)
		throws SQLException
	{
		ctx.statement().setString(ctx.index(), Objects.toString(ctx.convert(converter()).value(), null));
	}

	@Override
	public void set(BindingSetSQLOutputContext<TraitRestrictions> ctx)
		throws SQLException
	{
		throw new SQLFeatureNotSupportedException();
	}

	@Override
	public void get(BindingGetResultSetContext<TraitRestrictions> ctx)
		throws SQLException
	{
		ctx.convert(converter()).value(ctx.resultSet().getString(ctx.index()));
	}

	@Override
	public void get(BindingGetStatementContext<TraitRestrictions> ctx)
		throws SQLException
	{
		ctx.convert(converter()).value(ctx.statement().getString(ctx.index()));
	}

	@Override
	public void get(BindingGetSQLInputContext<TraitRestrictions> ctx)
		throws SQLException
	{
		throw new SQLFeatureNotSupportedException();
	}
}
