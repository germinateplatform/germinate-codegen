package jhi.germinate.server.database.binding;

import com.google.gson.Gson;
import jhi.germinate.server.database.pojo.GermplasmInstitution;
import org.jooq.*;
import org.jooq.conf.ParamType;
import org.jooq.impl.DSL;

import java.sql.*;
import java.util.Objects;

/**
 * @author Sebastian Raubach
 */
public class GermplasmInstitutionBinding implements Binding<JSON, GermplasmInstitution[]>
{
	@Override
	public Converter<JSON, GermplasmInstitution[]> converter()
	{
		Gson gson = new Gson();
		return new Converter<>()
		{
			@Override
			public GermplasmInstitution[] from(JSON o)
			{
				return o == null ? null : gson.fromJson(Objects.toString(o), GermplasmInstitution[].class);
			}

			@Override
			public JSON to(GermplasmInstitution[] o)
			{
				return o == null ? null : JSON.json(gson.toJson(o));
			}

			@Override
			public Class<JSON> fromType()
			{
				return JSON.class;
			}

			@Override
			public Class<GermplasmInstitution[]> toType()
			{
				return GermplasmInstitution[].class;
			}
		};
	}

	@Override
	public void sql(BindingSQLContext<GermplasmInstitution[]> ctx)
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
	public void register(BindingRegisterContext<GermplasmInstitution[]> ctx)
		throws SQLException
	{
		ctx.statement().registerOutParameter(ctx.index(), Types.VARCHAR);
	}

	@Override
	public void set(BindingSetStatementContext<GermplasmInstitution[]> ctx)
		throws SQLException
	{
		ctx.statement().setString(ctx.index(), Objects.toString(ctx.convert(converter()).value(), null));
	}

	@Override
	public void set(BindingSetSQLOutputContext<GermplasmInstitution[]> ctx)
		throws SQLException
	{
		throw new SQLFeatureNotSupportedException();
	}

	@Override
	public void get(BindingGetResultSetContext<GermplasmInstitution[]> ctx)
		throws SQLException
	{
		ctx.convert(converter()).value(JSON.json(ctx.resultSet().getString(ctx.index())));
	}

	@Override
	public void get(BindingGetStatementContext<GermplasmInstitution[]> ctx)
		throws SQLException
	{
		ctx.convert(converter()).value(JSON.json(ctx.statement().getString(ctx.index())));
	}

	@Override
	public void get(BindingGetSQLInputContext<GermplasmInstitution[]> ctx)
		throws SQLException
	{
		throw new SQLFeatureNotSupportedException();
	}
}
