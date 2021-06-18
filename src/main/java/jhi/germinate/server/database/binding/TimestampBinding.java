package jhi.germinate.server.database.binding;

import org.jooq.*;
import org.jooq.conf.ParamType;
import org.jooq.impl.DSL;

import java.sql.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @author Sebastian Raubach
 */
public class TimestampBinding implements Binding<LocalDateTime, Timestamp>
{
	private static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.Z");

	@Override
	public Converter<LocalDateTime, Timestamp> converter()
	{
		return new Converter<>()
		{
			@Override
			public Timestamp from(LocalDateTime o)
			{
				return o == null ? null : Timestamp.from(o.atZone(ZoneId.systemDefault()).toInstant());
			}

			@Override
			public LocalDateTime to(Timestamp o)
			{
				return o == null ? null : LocalDateTime.ofInstant(o.toInstant(), ZoneId.systemDefault());
			}

			@Override
			public Class<LocalDateTime> fromType()
			{
				return LocalDateTime.class;
			}

			@Override
			public Class<Timestamp> toType()
			{
				return Timestamp.class;
			}
		};
	}

	@Override
	public void sql(BindingSQLContext<Timestamp> ctx)
		throws SQLException
	{
		// Depending on how you generate your SQL, you may need to explicitly distinguish
		// between jOOQ generating bind variables or inlined literals.
		if (ctx.render().paramType() == ParamType.INLINED)
			ctx.render().visit(DSL.inline(ctx.convert(converter()).value())).sql("");
		else
			ctx.render().visit(DSL.sql("?"));
	}

	@Override
	public void register(BindingRegisterContext<Timestamp> ctx)
		throws SQLException
	{
		ctx.statement().registerOutParameter(ctx.index(), Types.VARCHAR);
	}

	@Override
	public void set(BindingSetStatementContext<Timestamp> ctx)
		throws SQLException
	{
		ctx.statement().setString(ctx.index(), ctx.convert(converter()).value().format(FORMATTER));
	}

	@Override
	public void set(BindingSetSQLOutputContext<Timestamp> ctx)
		throws SQLException
	{
		throw new SQLFeatureNotSupportedException();
	}

	@Override
	public void get(BindingGetResultSetContext<Timestamp> ctx)
		throws SQLException
	{
		ctx.convert(converter()).value(LocalDateTime.parse(ctx.resultSet().getString(ctx.index()), FORMATTER));
	}

	@Override
	public void get(BindingGetStatementContext<Timestamp> ctx)
		throws SQLException
	{
		ctx.convert(converter()).value(LocalDateTime.parse(ctx.statement().getString(ctx.index()), FORMATTER));
	}

	@Override
	public void get(BindingGetSQLInputContext<Timestamp> ctx)
		throws SQLException
	{
		throw new SQLFeatureNotSupportedException();
	}
}
