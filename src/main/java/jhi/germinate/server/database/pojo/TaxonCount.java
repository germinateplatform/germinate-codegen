package jhi.germinate.server.database.pojo;

import java.util.List;

public class TaxonCount
{
	private List<LevelCount> genus;
	private List<LevelCount> species;
	private List<LevelCount> subtaxa;

	public List<LevelCount> getGenus()
	{
		return genus;
	}

	public void setGenus(List<LevelCount> genus)
	{
		this.genus = genus;
	}

	public List<LevelCount> getSpecies()
	{
		return species;
	}

	public void setSpecies(List<LevelCount> species)
	{
		this.species = species;
	}

	public List<LevelCount> getSubtaxa()
	{
		return subtaxa;
	}

	public void setSubtaxa(List<LevelCount> subtaxa)
	{
		this.subtaxa = subtaxa;
	}

	public static class LevelCount
	{
		private String  taxonomy;
		private Integer count;

		public String getTaxonomy()
		{
			return taxonomy;
		}

		public void setTaxonomy(String taxonomy)
		{
			this.taxonomy = taxonomy;
		}

		public Integer getCount()
		{
			return count;
		}

		public void setCount(Integer count)
		{
			this.count = count;
		}
	}
}
