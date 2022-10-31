package jhi.germinate.server.database.pojo;

public class ImportResult
{
	private ImportStatus status;
	private int          rowIndex;
	private String       message;
	private StatusType   type;

	public ImportResult(ImportStatus status, int rowIndex, String message)
	{
		this.status = status;
		this.rowIndex = rowIndex;
		this.message = message;
		this.type = StatusType.ERROR;
	}

	public ImportResult(ImportStatus status, int rowIndex, String message, StatusType type)
	{
		this.status = status;
		this.rowIndex = rowIndex;
		this.message = message;
		this.type = type;
	}

	public ImportStatus getStatus()
	{
		return status;
	}

	public int getRowIndex()
	{
		return rowIndex;
	}

	public String getMessage()
	{
		return message;
	}

	public StatusType getType()
	{
		return type;
	}

	@Override
	public String toString()
	{
		return "ImportResult{" +
			"status=" + status +
			", rowIndex=" + rowIndex +
			", message='" + message + '\'' +
			", type=" + type +
			'}';
	}

	public enum StatusType
	{
		WARNING,
		ERROR
	}
}