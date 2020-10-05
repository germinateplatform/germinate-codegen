package jhi.germinate.server.database.pojo;

import java.util.Arrays;

public class TraitCategory
{
	private String[] categories;

	public String[] getCategories()
	{
		return categories;
	}

	public void setCategories(String[] categories)
	{
		this.categories = categories;
	}

	@Override
	public String toString()
	{
		return "TraitCategory{" +
			"categories=" + Arrays.toString(categories) +
			'}';
	}
}
