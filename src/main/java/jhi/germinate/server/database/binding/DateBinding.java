package jhi.germinate.server.database.binding;

import org.jooq.*;
import org.jooq.conf.ParamType;
import org.jooq.impl.DSL;

import java.sql.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * @author Sebastian Raubach
 */
public class DateBinding implements Binding<LocalDate, Date>
{
	private static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	@Override
	public Converter<LocalDate, Date> converter()
	{
		return new Converter<>()
		{
			@Override
			public Date from(LocalDate o)
			{
				return o == null ? null : new Date(Date.from(o.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()).getTime());
			}

			@Override
			public LocalDate to(Date o)
			{
				return o == null ? null : LocalDate.ofInstant(o.toInstant(), ZoneId.systemDefault());
			}

			@Override
			public Class<LocalDate> fromType()
			{
				return LocalDate.class;
			}

			@Override
			public Class<Date> toType()
			{
				return Date.class;
			}
		};
	}

	@Override
	public void sql(BindingSQLContext<Date> ctx)
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
	public void register(BindingRegisterContext<Date> ctx)
		throws SQLException
	{
		ctx.statement().registerOutParameter(ctx.index(), Types.VARCHAR);
	}

	@Override
	public void set(BindingSetStatementContext<Date> ctx)
		throws SQLException
	{
		ctx.statement().setString(ctx.index(), ctx.convert(converter()).value().format(FORMATTER));
	}

	@Override
	public void set(BindingSetSQLOutputContext<Date> ctx)
		throws SQLException
	{
		throw new SQLFeatureNotSupportedException();
	}

	@Override
	public void get(BindingGetResultSetContext<Date> ctx)
		throws SQLException
	{
		ctx.convert(converter()).value(LocalDate.parse(ctx.resultSet().getString(ctx.index()), FORMATTER));
	}

	@Override
	public void get(BindingGetStatementContext<Date> ctx)
		throws SQLException
	{
		ctx.convert(converter()).value(LocalDate.parse(ctx.statement().getString(ctx.index()), FORMATTER));
	}

	@Override
	public void get(BindingGetSQLInputContext<Date> ctx)
		throws SQLException
	{
		throw new SQLFeatureNotSupportedException();
	}
}
