package jhi.germinate.server.database.pojo;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class StoryRequirements
{
	private Set<Integer> datasetIds;
	private Set<Integer> groupIds;
}
