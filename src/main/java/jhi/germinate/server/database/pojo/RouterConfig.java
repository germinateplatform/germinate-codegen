package jhi.germinate.server.database.pojo;

import com.google.gson.JsonElement;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class RouterConfig
{
	private String                   name;
	private Map<String, JsonElement> query;
	private Map<String, String>      params;
}
