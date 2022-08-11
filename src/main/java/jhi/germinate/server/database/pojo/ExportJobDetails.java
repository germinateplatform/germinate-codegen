package jhi.germinate.server.database.pojo;

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


	public String getBaseFolder()
	{
		return baseFolder;
	}

	public ExportJobDetails setBaseFolder(String baseFolder)
	{
		this.baseFolder = baseFolder;
		return this;
	}

	public Integer[] getxIds()
	{
		return xIds;
	}

	public ExportJobDetails setxIds(Integer[] xIds)
	{
		this.xIds = xIds;
		return this;
	}

	public Integer[] getxGroupIds()
	{
		return xGroupIds;
	}

	public ExportJobDetails setxGroupIds(Integer[] xGroupIds)
	{
		this.xGroupIds = xGroupIds;
		return this;
	}

	public Integer[] getyIds()
	{
		return yIds;
	}

	public ExportJobDetails setyIds(Integer[] yIds)
	{
		this.yIds = yIds;
		return this;
	}

	public Integer[] getyGroupIds()
	{
		return yGroupIds;
	}

	public ExportJobDetails setyGroupIds(Integer[] yGroupIds)
	{
		this.yGroupIds = yGroupIds;
		return this;
	}

	public AdditionalExportFormat[] getFileTypes()
	{
		return fileTypes;
	}

	public ExportJobDetails setFileTypes(AdditionalExportFormat[] fileTypes)
	{
		this.fileTypes = fileTypes;
		return this;
	}

	public Integer getSubsetId()
	{
		return subsetId;
	}

	public ExportJobDetails setSubsetId(Integer subsetId)
	{
		this.subsetId = subsetId;
		return this;
	}

	public String getFileHeaders()
	{
		return fileHeaders;
	}

	public ExportJobDetails setFileHeaders(String fileHeaders)
	{
		this.fileHeaders = fileHeaders;
		return this;
	}

	public BinningConfig getBinningConfig()
	{
		return binningConfig;
	}

	public ExportJobDetails setBinningConfig(BinningConfig binningConfig)
	{
		this.binningConfig = binningConfig;
		return this;
	}

	public String[] getExportParams()
	{
		return exportParams;
	}

	public ExportJobDetails setExportParams(String[] exportParams)
	{
		this.exportParams = exportParams;
		return this;
	}
}
