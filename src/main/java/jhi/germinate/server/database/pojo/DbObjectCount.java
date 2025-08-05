package jhi.germinate.server.database.pojo;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class DbObjectCount
{
	private String key;
	private int count = 0;
}
