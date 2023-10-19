package jhi.germinate.server.database.pojo;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ViewTableMapdefinitions
{
	private Integer  markerId;
	private String   markerName;
	private String[] synonyms;
	private String   mapFeatureType;
	private Integer  mapId;
	private Integer  userId;
	private Boolean  visibility;
	private String   mapName;
	private String   chromosome;
	private Double   position;
}
