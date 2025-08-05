package jhi.germinate.server.database.pojo;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.Arrays;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
@ToString
public class TraitRestrictions
{
	private String[][] categories;
	private Double     min;
	private Double     max;
}
