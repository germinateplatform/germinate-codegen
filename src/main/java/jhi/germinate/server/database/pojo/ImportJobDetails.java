package jhi.germinate.server.database.pojo;

public class ImportJobDetails
{
	private String  baseFolder;
	private String  dataFilename;
	private Boolean deleteOnFail;
	private Integer targetDatasetId;
	private RunType runType;

	public String getBaseFolder()
	{
		return baseFolder;
	}

	public String getDataFilename()
	{
		return dataFilename;
	}

	public ImportJobDetails setDataFilename(String dataFilename)
	{
		this.dataFilename = dataFilename;
		return this;
	}

	public ImportJobDetails setBaseFolder(String baseFolder)
	{
		this.baseFolder = baseFolder;


		return this;
	}

	public Boolean getDeleteOnFail()
	{
		return deleteOnFail;
	}

	public ImportJobDetails setDeleteOnFail(Boolean deleteOnFail)
	{
		this.deleteOnFail = deleteOnFail;
		return this;
	}

	public RunType getRunType()
	{
		return runType;
	}

	public ImportJobDetails setRunType(RunType runType)
	{
		this.runType = runType;
		return this;
	}

	public Integer getTargetDatasetId()
	{
		return targetDatasetId;
	}

	public ImportJobDetails setTargetDatasetId(Integer targetDatasetId)
	{
		this.targetDatasetId = targetDatasetId;
		return this;
	}
}
