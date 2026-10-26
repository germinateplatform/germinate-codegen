package jhi.germinate.server.database.pojo;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class OntologyInfo
{
	private Integer ontologyId;
	private String  ontologyPuid;
}
