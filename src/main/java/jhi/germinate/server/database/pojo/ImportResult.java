package jhi.germinate.server.database.pojo;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
@ToString
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

	public enum StatusType
	{
		WARNING,
		ERROR
	}
}