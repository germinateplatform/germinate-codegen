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
public class DublinCore
{
	private String[] title;
	private String[] creator;
	private String[] subject;
	private String[] description;
	private String[] publisher;
	private String[] contributor;
	private String[] date;
	private String[] type;
	private String[] format;
	private String[] identifier;
	private String[] source;
	private String[] language;
	private String[] relation;
	private String[] coverage;
	private String[] rights;
}
