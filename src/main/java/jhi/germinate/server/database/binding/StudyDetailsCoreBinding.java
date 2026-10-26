package jhi.germinate.server.database.binding;

import com.google.gson.*;
import jhi.germinate.server.database.pojo.StudyDetailsCore;
import org.jooq.*;
import org.jooq.conf.ParamType;
import org.jooq.impl.DSL;

import java.sql.*;
import java.util.Objects;

/**
 * @author Sebastian Raubach
 */
public class StudyDetailsCoreBinding implements Binding<JSON, StudyDetailsCore>
{
	@Override
	public Converter<JSON, StudyDetailsCore> converter()
	{
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
		return new Converter<>()
		{
			@Override
			public StudyDetailsCore from(JSON o)
			{
				return o == null ? null : gson.fromJson(Objects.toString(o), StudyDetailsCore.class);
			}

			@Override
			public JSON to(StudyDetailsCore importJobDetails)
			{
				return importJobDetails == null ? null : JSON.json(gson.toJson(importJobDetails));
			}

			@Override
			public Class<JSON> fromType()
			{
				return JSON.class;
			}

			@Override
			public Class<StudyDetailsCore> toType()
			{
				return StudyDetailsCore.class;
			}
		};
	}

	@Override
	public void sql(BindingSQLContext<StudyDetailsCore> ctx)
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
	public void register(BindingRegisterContext<StudyDetailsCore> ctx)
		throws SQLException
	{
		ctx.statement().registerOutParameter(ctx.index(), Types.VARCHAR);
	}

	@Override
	public void set(BindingSetStatementContext<StudyDetailsCore> ctx)
		throws SQLException
	{
		ctx.statement().setString(ctx.index(), Objects.toString(ctx.convert(converter()).value(), null));
	}

	@Override
	public void set(BindingSetSQLOutputContext<StudyDetailsCore> ctx)
		throws SQLException
	{
		throw new SQLFeatureNotSupportedException();
	}

	@Override
	public void get(BindingGetResultSetContext<StudyDetailsCore> ctx)
		throws SQLException
	{
		ctx.convert(converter()).value(JSON.json(ctx.resultSet().getString(ctx.index())));
	}

	@Override
	public void get(BindingGetStatementContext<StudyDetailsCore> ctx)
		throws SQLException
	{
		ctx.convert(converter()).value(JSON.json(ctx.statement().getString(ctx.index())));
	}

	@Override
	public void get(BindingGetSQLInputContext<StudyDetailsCore> ctx)
		throws SQLException
	{
		throw new SQLFeatureNotSupportedException();
	}
}
