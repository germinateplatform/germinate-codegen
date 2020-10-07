package jhi.germinate.server.database.pojo;

import java.util.Arrays;

public class TraitRestrictions
{
	private String[][] categories;
	private Double     min;
	private Double     max;

	public String[][] getCategories()
	{
		return categories;
	}

	public void setCategories(String[][] categories)
	{
		this.categories = categories;
	}

	public Double getMin()
	{
		return min;
	}

	public void setMin(Double min)
	{
		this.min = min;
	}

	public Double getMax()
	{
		return max;
	}

	public void setMax(Double max)
	{
		this.max = max;
	}

	@Override
	public String toString()
	{
		return "TraitRestrictions{" +
			"categories=" + Arrays.toString(categories) +
			", min=" + min +
			", max=" + max +
			'}';
	}
}
