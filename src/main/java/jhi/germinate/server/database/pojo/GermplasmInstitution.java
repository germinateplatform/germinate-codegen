package jhi.germinate.server.database.pojo;

import jhi.germinate.server.database.codegen.enums.GermplasminstitutionsType;

public class GermplasmInstitution
{
	private Integer                   id;
	private String                    name;
	private String                    code;
	private GermplasminstitutionsType type;

	public Integer getId()
	{
		return id;
	}

	public GermplasmInstitution setId(Integer id)
	{
		this.id = id;
		return this;
	}

	public String getName()
	{
		return name;
	}

	public GermplasmInstitution setName(String name)
	{
		this.name = name;
		return this;
	}

	public String getCode()
	{
		return code;
	}

	public GermplasmInstitution setCode(String code)
	{
		this.code = code;
		return this;
	}

	public GermplasminstitutionsType getType()
	{
		return type;
	}

	public GermplasmInstitution setType(GermplasminstitutionsType type)
	{
		this.type = type;
		return this;
	}
}
