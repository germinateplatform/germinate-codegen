package jhi.germinate.server.database.binding;

import com.google.gson.Gson;
import jhi.germinate.server.database.pojo.ImageTag;
import org.jooq.*;
import org.jooq.conf.ParamType;
import org.jooq.impl.DSL;

import java.sql.*;
import java.util.Objects;

/**
 * @author Sebastian Raubach
 */
public class ImageTagBinding implements Binding<Object, ImageTag[]>
{
	@Override
	public Converter<Object, ImageTag[]> converter()
	{
		Gson gson = new Gson();
		return new Converter<>()
		{
			@Override
			public ImageTag[] from(Object o)
			{
				return o == null ? null : gson.fromJson(Objects.toString(o), ImageTag[].class);
			}

			@Override
			public Object to(ImageTag[] o)
			{
				return o == null ? null : gson.toJson(o);
			}

			@Override
			public Class<Object> fromType()
			{
				return Object.class;
			}

			@Override
			public Class<ImageTag[]> toType()
			{
				return ImageTag[].class;
			}
		};
	}

	@Override
	public void sql(BindingSQLContext<ImageTag[]> ctx)
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
	public void register(BindingRegisterContext<ImageTag[]> ctx)
		throws SQLException
	{
		ctx.statement().registerOutParameter(ctx.index(), Types.VARCHAR);
	}

	@Override
	public void set(BindingSetStatementContext<ImageTag[]> ctx)
		throws SQLException
	{
		ctx.statement().setString(ctx.index(), Objects.toString(ctx.convert(converter()).value(), null));
	}

	@Override
	public void set(BindingSetSQLOutputContext<ImageTag[]> ctx)
		throws SQLException
	{
		throw new SQLFeatureNotSupportedException();
	}

	@Override
	public void get(BindingGetResultSetContext<ImageTag[]> ctx)
		throws SQLException
	{
		ctx.convert(converter()).value(ctx.resultSet().getString(ctx.index()));
	}

	@Override
	public void get(BindingGetStatementContext<ImageTag[]> ctx)
		throws SQLException
	{
		ctx.convert(converter()).value(ctx.statement().getString(ctx.index()));
	}

	@Override
	public void get(BindingGetSQLInputContext<ImageTag[]> ctx)
		throws SQLException
	{
		throw new SQLFeatureNotSupportedException();
	}
}
