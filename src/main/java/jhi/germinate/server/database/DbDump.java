package jhi.germinate.server.database;

import com.smattme.MysqlExportService;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class DbDump
{
	public static void main(String[] args)
			throws Exception
	{
		if (args.length < 6)
		{
			System.err.println("Usage: DbDump <host> <port> <database> <user> <password> <germinateSourceDirectory>");
			System.exit(1);
		}

		String host = args[0];
		String port = args[1];
		String database = args[2];
		String user = args[3];
		String password = args[4];
		String germinateSourceDirectory = args[5];

		Properties properties = new Properties();
		properties.setProperty(MysqlExportService.DB_NAME, database);
		properties.setProperty(MysqlExportService.DB_USERNAME, user);
		properties.setProperty(MysqlExportService.DB_PASSWORD, password);
		properties.setProperty(MysqlExportService.DB_HOST, host);
		properties.setProperty(MysqlExportService.DB_PORT, port);
		properties.setProperty(MysqlExportService.JDBC_DRIVER_NAME, "com.mysql.cj.jdbc.Driver");
		properties.setProperty(MysqlExportService.ADD_IF_NOT_EXISTS, "true");
		properties.setProperty(MysqlExportService.TEMP_DIR, new File("build/tmp/dbdump").getPath());

		MysqlExportService exportService = new MysqlExportService(properties);
		exportService.export();

		String sql = stripViews(exportService.getGeneratedSql());

		File out = new File(germinateSourceDirectory, "src/main/resources/jhi/germinate/server/util/database/init/db_setup.sql");
		out.getParentFile().mkdirs();
		try (FileWriter writer = new FileWriter(out))
		{
			writer.write(sql);
		}

		System.out.println("Database dump written to " + out.getAbsolutePath());
	}

	private static String stripViews(String sql) {
		Matcher nameMatcher = Pattern.compile("view dump\\s*:\\s*(\\S+)").matcher(sql);
		Set<String> viewNames = new LinkedHashSet<>();
		while (nameMatcher.find()) {
			viewNames.add(nameMatcher.group(1).trim());
		}

		List<String> sortedViews = new ArrayList<>(viewNames);
		sortedViews.sort((a, b) -> b.length() - a.length());

		for (String view : sortedViews) {
			String quoted = Pattern.quote(view);
			// require the name to be followed by end-of-line so "foo" can't
			// accidentally match inside the marker for "foo_template"
			String pattern = "(?is)--\\s*start\\s+view dump\\s*:\\s*" + quoted + "\\s*\\r?\\n"
					+ ".*?"
					+ "--\\s*end\\s+view dump\\s*:\\s*" + quoted + "\\s*\\r?\\n";
			sql = sql.replaceAll(pattern, "");
		}

		sql = sql.replaceAll("(?m)^--\\s*$\\n?", ""); // strip now-empty "--" comment lines
		sql = sql.replaceAll("\\n{3,}", "\n\n");        // collapse extra blank lines

		return sql;
	}
}