package jhi.germinate.server.database.pojo;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class TaxonomyProviderInfo
{
	private String providerName;
	private String providerHomepage;
	private String providerPlaceholder;
	private String externalId;
}
