package jhi.germinate.server.database.pojo;

public class TraitRestrictions
{
	private TraitCategory[] categories;
	private Double min;
	private Double max;

	public TraitCategory[] getCategories()
	{
		return categories;
	}

	public void setCategories(TraitCategory[] categories)
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
}
