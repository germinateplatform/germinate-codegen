package jhi.germinate.server.database.pojo;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ImportJobStats
{
	private Integer datasetId;
	private Integer germplasm;
	private Integer markers;
	private Integer images;
	private Integer traits;
	private Integer locations;
	private Integer climates;
	private Integer groups;
}
