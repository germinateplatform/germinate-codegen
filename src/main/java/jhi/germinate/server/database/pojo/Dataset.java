package jhi.germinate.server.database.pojo;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Dataset
{
	private Integer datasetId;
	private String  datasetName;
	private String  datasetType;
	private Short   datasetIsExternal;
}
