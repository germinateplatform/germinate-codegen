package jhi.germinate.server.database.binding;

import com.google.gson.Gson;
import jhi.germinate.server.database.pojo.StoryStepConfig;
import org.jooq.*;
import org.jooq.conf.ParamType;
import org.jooq.impl.DSL;

import java.sql.*;
import java.util.Objects;

/**
 * @author Sebastian Raubach
 */
public class StoryStepConfigBinding implements Binding<JSON, StoryStepConfig>
{
	@Override
	public Converter<JSON, StoryStepConfig> converter()
	{
		Gson gson = new Gson();
		return new Converter<>()
		{
			@Override
			public StoryStepConfig from(JSON o)
			{
				return o == null ? null : gson.fromJson(Objects.toString(o), StoryStepConfig.class);
			}

			@Override
			public JSON to(StoryStepConfig exportJobDetails)
			{
				return exportJobDetails == null ? null : JSON.json(gson.toJson(exportJobDetails));
			}

			@Override
			public Class<JSON> fromType()
			{
				return JSON.class;
			}

			@Override
			public Class<StoryStepConfig> toType()
			{
				return StoryStepConfig.class;
			}
		};
	}

	@Override
	public void sql(BindingSQLContext<StoryStepConfig> ctx)
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
	public void register(BindingRegisterContext<StoryStepConfig> ctx)
		throws SQLException
	{
		ctx.statement().registerOutParameter(ctx.index(), Types.VARCHAR);
	}

	@Override
	public void set(BindingSetStatementContext<StoryStepConfig> ctx)
		throws SQLException
	{
		ctx.statement().setString(ctx.index(), Objects.toString(ctx.convert(converter()).value(), null));
	}

	@Override
	public void set(BindingSetSQLOutputContext<StoryStepConfig> ctx)
		throws SQLException
	{
		throw new SQLFeatureNotSupportedException();
	}

	@Override
	public void get(BindingGetResultSetContext<StoryStepConfig> ctx)
		throws SQLException
	{
		ctx.convert(converter()).value(JSON.json(ctx.resultSet().getString(ctx.index())));
	}

	@Override
	public void get(BindingGetStatementContext<StoryStepConfig> ctx)
		throws SQLException
	{
		ctx.convert(converter()).value(JSON.json(ctx.statement().getString(ctx.index())));
	}

	@Override
	public void get(BindingGetSQLInputContext<StoryStepConfig> ctx)
		throws SQLException
	{
		throw new SQLFeatureNotSupportedException();
	}
}
