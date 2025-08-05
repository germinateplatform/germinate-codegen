package jhi.germinate.server.database.pojo;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class TaxonCount
{
	private List<LevelCount> genus;
	private List<LevelCount> species;
	private List<LevelCount> subtaxa;

	@NoArgsConstructor
	@Getter
	@Setter
	@Accessors(chain = true)
	public static class LevelCount
	{
		private String  taxonomy;
		private Integer count;
	}
}
