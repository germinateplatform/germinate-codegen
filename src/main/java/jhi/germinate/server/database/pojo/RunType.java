package jhi.germinate.server.database.pojo;

public enum RunType
{
	CHECK,
	IMPORT,
	CHECK_AND_IMPORT;

	private RunType()
	{
	}

	public boolean includesCheck()
	{
		return this == CHECK || this == CHECK_AND_IMPORT;
	}

	public boolean includesImport()
	{
		return this == IMPORT || this == CHECK_AND_IMPORT;
	}

	public static RunType getType(String input)
	{
		try
		{
			return valueOf(input);
		}
		catch (Exception var2)
		{
			return CHECK;
		}
	}
}