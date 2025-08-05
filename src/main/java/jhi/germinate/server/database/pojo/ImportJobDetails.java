package jhi.germinate.server.database.pojo;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ImportJobDetails
{
	private String          baseFolder;
	private String          dataFilename;
	private Boolean         deleteOnFail;
	private Integer         targetDatasetId;
	private RunType         runType;
	private DataOrientation dataOrientation;
}
