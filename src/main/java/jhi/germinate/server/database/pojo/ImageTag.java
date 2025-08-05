package jhi.germinate.server.database.pojo;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * @author Sebastian Raubach
 */
@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ImageTag
{
	private Integer tagId;
	private String tagName;
}
