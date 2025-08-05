package jhi.germinate.server.database.pojo;

import jhi.germinate.server.database.codegen.enums.GermplasminstitutionsType;
import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class GermplasmInstitution
{
	private Integer                   id;
	private String                    name;
	private String                    code;
	private GermplasminstitutionsType type;
}
