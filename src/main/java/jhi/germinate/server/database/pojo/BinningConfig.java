package jhi.germinate.server.database.pojo;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * @author Sebastian Raubach
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class BinningConfig
{
	public static final BinningConfig DEFAULT = new BinningConfig("equal", 10, 0, 0f);

	private String  binningMethod;
	private Integer binsLeft;
	private Integer binsRight;
	private Float   splitPoint;
}
