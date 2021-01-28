package jhi.germinate.server.database.pojo;

public class DbObjectCount
{
	private String key;
	private int count = 0;

	public String getKey()
	{
		return key;
	}

	public void setKey(String key)
	{
		this.key = key;
	}

	public int getCount()
	{
		return count;
	}

	public void setCount(int count)
	{
		this.count = count;
	}
}
