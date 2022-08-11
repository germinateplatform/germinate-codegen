package jhi.germinate.server.database.binding;

import com.google.gson.Gson;
import jhi.germinate.server.database.pojo.ImportJobDetails;
import org.jooq.*;
import org.jooq.conf.ParamType;
import org.jooq.impl.DSL;

import java.sql.*;
import java.util.Objects;

/**
 * @author Sebastian Raubach
 */
public class ImportJobDetailsBinding implements Binding<JSON, ImportJobDetails>
{
	@Override
	public Converter<JSON, ImportJobDetails> converter()
	{
		Gson gson = new Gson();
		return new Converter<>()
		{
			@Override
			public ImportJobDetails from(JSON o)
			{
				return o == null ? null : gson.fromJson(Objects.toString(o), ImportJobDetails.class);
			}

			@Override
			public JSON to(ImportJobDetails importJobDetails)
			{
				return importJobDetails == null ? null : JSON.json(gson.toJson(importJobDetails));
			}

			@Override
			public Class<JSON> fromType()
			{
				return JSON.class;
			}

			@Override
			public Class<ImportJobDetails> toType()
			{
				return ImportJobDetails.class;
			}
		};
	}

	@Override
	public void sql(BindingSQLContext<ImportJobDetails> ctx)
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
	public void register(BindingRegisterContext<ImportJobDetails> ctx)
		throws SQLException
	{
		ctx.statement().registerOutParameter(ctx.index(), Types.VARCHAR);
	}

	@Override
	public void set(BindingSetStatementContext<ImportJobDetails> ctx)
		throws SQLException
	{
		ctx.statement().setString(ctx.index(), Objects.toString(ctx.convert(converter()).value(), null));
	}

	@Override
	public void set(BindingSetSQLOutputContext<ImportJobDetails> ctx)
		throws SQLException
	{
		throw new SQLFeatureNotSupportedException();
	}

	@Override
	public void get(BindingGetResultSetContext<ImportJobDetails> ctx)
		throws SQLException
	{
		ctx.convert(converter()).value(JSON.json(ctx.resultSet().getString(ctx.index())));
	}

	@Override
	public void get(BindingGetStatementContext<ImportJobDetails> ctx)
		throws SQLException
	{
		ctx.convert(converter()).value(JSON.json(ctx.statement().getString(ctx.index())));
	}

	@Override
	public void get(BindingGetSQLInputContext<ImportJobDetails> ctx)
		throws SQLException
	{
		throw new SQLFeatureNotSupportedException();
	}
}
