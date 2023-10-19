package jhi.germinate.server.database.pojo;

import lombok.*;
import lombok.experimental.Accessors;

import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ViewTableMarkers
{
	private Integer   markerId;
	private String    markerName;
	private String    markerType;
	private String[]  markerSynonyms;
	private Timestamp createdOn;
	private Timestamp updatedOn;
}
