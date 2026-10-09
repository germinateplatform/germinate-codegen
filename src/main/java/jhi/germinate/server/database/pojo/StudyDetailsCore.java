package jhi.germinate.server.database.pojo;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class StudyDetailsCore
{
	private Date   studyStartDate;
	private Date   studyEndDate;
	private String experimentDesignType;
	private String experimentDesignDescription;
	private String experimentDesignMap;
	private String observationUnitDescription;
	private String growthFacilityDescription;
	private String growthFacilityType;
	private String culturalPractice;
}
