package jhi.germinate.server.database.pojo;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ExportJobDetails
{
	private String                   baseFolder;
	private Integer[]                xIds;
	private Integer[]                xGroupIds;
	private Integer[]                yIds;
	private Integer[]                yGroupIds;
	private AdditionalExportFormat[] fileTypes;
	private Integer                  subsetId;
	private String                   fileHeaders;
	private BinningConfig            binningConfig;
	private String[]                 exportParams;
}
