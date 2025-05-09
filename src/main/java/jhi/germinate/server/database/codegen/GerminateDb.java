/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.codegen;


import java.util.Arrays;
import java.util.List;

import jhi.germinate.server.database.codegen.tables.Attributedata;
import jhi.germinate.server.database.codegen.tables.Attributes;
import jhi.germinate.server.database.codegen.tables.Biologicalstatus;
import jhi.germinate.server.database.codegen.tables.Climatedata;
import jhi.germinate.server.database.codegen.tables.Climates;
import jhi.germinate.server.database.codegen.tables.Collaborators;
import jhi.germinate.server.database.codegen.tables.Collectingsources;
import jhi.germinate.server.database.codegen.tables.Comments;
import jhi.germinate.server.database.codegen.tables.Commenttypes;
import jhi.germinate.server.database.codegen.tables.Countries;
import jhi.germinate.server.database.codegen.tables.DataExportJobs;
import jhi.germinate.server.database.codegen.tables.DataImportJobs;
import jhi.germinate.server.database.codegen.tables.Datasetaccesslogs;
import jhi.germinate.server.database.codegen.tables.Datasetcollaborators;
import jhi.germinate.server.database.codegen.tables.Datasetfileresources;
import jhi.germinate.server.database.codegen.tables.Datasetlocations;
import jhi.germinate.server.database.codegen.tables.Datasetmembers;
import jhi.germinate.server.database.codegen.tables.Datasetmembertypes;
import jhi.germinate.server.database.codegen.tables.Datasetmeta;
import jhi.germinate.server.database.codegen.tables.Datasetpermissions;
import jhi.germinate.server.database.codegen.tables.Datasets;
import jhi.germinate.server.database.codegen.tables.Datasetstates;
import jhi.germinate.server.database.codegen.tables.Datasettypes;
import jhi.germinate.server.database.codegen.tables.Datawarnings;
import jhi.germinate.server.database.codegen.tables.Entitytypes;
import jhi.germinate.server.database.codegen.tables.Experiments;
import jhi.germinate.server.database.codegen.tables.Fileresources;
import jhi.germinate.server.database.codegen.tables.Fileresourcetypes;
import jhi.germinate.server.database.codegen.tables.Germinatebase;
import jhi.germinate.server.database.codegen.tables.Germplasmdatawarnings;
import jhi.germinate.server.database.codegen.tables.Germplasminstitutions;
import jhi.germinate.server.database.codegen.tables.Groupmembers;
import jhi.germinate.server.database.codegen.tables.Groups;
import jhi.germinate.server.database.codegen.tables.Grouptypes;
import jhi.germinate.server.database.codegen.tables.ImageToTags;
import jhi.germinate.server.database.codegen.tables.Images;
import jhi.germinate.server.database.codegen.tables.Imagetags;
import jhi.germinate.server.database.codegen.tables.Imagetypes;
import jhi.germinate.server.database.codegen.tables.Institutions;
import jhi.germinate.server.database.codegen.tables.Licensedata;
import jhi.germinate.server.database.codegen.tables.Licenselogs;
import jhi.germinate.server.database.codegen.tables.Licenses;
import jhi.germinate.server.database.codegen.tables.Links;
import jhi.germinate.server.database.codegen.tables.Linktypes;
import jhi.germinate.server.database.codegen.tables.Locales;
import jhi.germinate.server.database.codegen.tables.Locations;
import jhi.germinate.server.database.codegen.tables.Locationtypes;
import jhi.germinate.server.database.codegen.tables.Mapdefinitions;
import jhi.germinate.server.database.codegen.tables.Mapfeaturetypes;
import jhi.germinate.server.database.codegen.tables.Mapoverlays;
import jhi.germinate.server.database.codegen.tables.Maps;
import jhi.germinate.server.database.codegen.tables.Markers;
import jhi.germinate.server.database.codegen.tables.Markertypes;
import jhi.germinate.server.database.codegen.tables.Mcpd;
import jhi.germinate.server.database.codegen.tables.Mlsstatus;
import jhi.germinate.server.database.codegen.tables.News;
import jhi.germinate.server.database.codegen.tables.Newstypes;
import jhi.germinate.server.database.codegen.tables.Pedigreedefinitions;
import jhi.germinate.server.database.codegen.tables.Pedigreedescriptions;
import jhi.germinate.server.database.codegen.tables.Pedigreenotations;
import jhi.germinate.server.database.codegen.tables.Pedigrees;
import jhi.germinate.server.database.codegen.tables.Phenotypecategories;
import jhi.germinate.server.database.codegen.tables.Phenotypedata;
import jhi.germinate.server.database.codegen.tables.Phenotypes;
import jhi.germinate.server.database.codegen.tables.Projectcollaborators;
import jhi.germinate.server.database.codegen.tables.Projectgroups;
import jhi.germinate.server.database.codegen.tables.Projectpublications;
import jhi.germinate.server.database.codegen.tables.Projects;
import jhi.germinate.server.database.codegen.tables.Publicationdata;
import jhi.germinate.server.database.codegen.tables.Publications;
import jhi.germinate.server.database.codegen.tables.SchemaVersion;
import jhi.germinate.server.database.codegen.tables.Stories;
import jhi.germinate.server.database.codegen.tables.Storysteps;
import jhi.germinate.server.database.codegen.tables.Synonyms;
import jhi.germinate.server.database.codegen.tables.Synonymtypes;
import jhi.germinate.server.database.codegen.tables.Taxonomies;
import jhi.germinate.server.database.codegen.tables.Treatments;
import jhi.germinate.server.database.codegen.tables.Trialseries;
import jhi.germinate.server.database.codegen.tables.Trialsetup;
import jhi.germinate.server.database.codegen.tables.Units;
import jhi.germinate.server.database.codegen.tables.Userfeedback;
import jhi.germinate.server.database.codegen.tables.Usergroupmembers;
import jhi.germinate.server.database.codegen.tables.Usergroups;
import jhi.germinate.server.database.codegen.tables.ViewStatsBiologicalstatus;
import jhi.germinate.server.database.codegen.tables.ViewStatsCountry;
import jhi.germinate.server.database.codegen.tables.ViewStatsPdci;
import jhi.germinate.server.database.codegen.tables.ViewStatsTaxonomy;
import jhi.germinate.server.database.codegen.tables.ViewTableClimateData;
import jhi.germinate.server.database.codegen.tables.ViewTableClimates;
import jhi.germinate.server.database.codegen.tables.ViewTableCollaborators;
import jhi.germinate.server.database.codegen.tables.ViewTableComments;
import jhi.germinate.server.database.codegen.tables.ViewTableDatasetAttributes;
import jhi.germinate.server.database.codegen.tables.ViewTableDatasets;
import jhi.germinate.server.database.codegen.tables.ViewTableEntities;
import jhi.germinate.server.database.codegen.tables.ViewTableFileresources;
import jhi.germinate.server.database.codegen.tables.ViewTableFileresourcetypes;
import jhi.germinate.server.database.codegen.tables.ViewTableGermplasmAttributes;
import jhi.germinate.server.database.codegen.tables.ViewTableGermplasmDeprecated;
import jhi.germinate.server.database.codegen.tables.ViewTableGroups;
import jhi.germinate.server.database.codegen.tables.ViewTableImages;
import jhi.germinate.server.database.codegen.tables.ViewTableImportJobs;
import jhi.germinate.server.database.codegen.tables.ViewTableInstitutionDatasets;
import jhi.germinate.server.database.codegen.tables.ViewTableInstitutions;
import jhi.germinate.server.database.codegen.tables.ViewTableLicenseDefinitions;
import jhi.germinate.server.database.codegen.tables.ViewTableLicenses;
import jhi.germinate.server.database.codegen.tables.ViewTableLinks;
import jhi.germinate.server.database.codegen.tables.ViewTableLocations;
import jhi.germinate.server.database.codegen.tables.ViewTableMapoverlays;
import jhi.germinate.server.database.codegen.tables.ViewTableMaps;
import jhi.germinate.server.database.codegen.tables.ViewTableNews;
import jhi.germinate.server.database.codegen.tables.ViewTablePedigreedefinitions;
import jhi.germinate.server.database.codegen.tables.ViewTablePedigrees;
import jhi.germinate.server.database.codegen.tables.ViewTableProjects;
import jhi.germinate.server.database.codegen.tables.ViewTablePublications;
import jhi.germinate.server.database.codegen.tables.ViewTableStories;
import jhi.germinate.server.database.codegen.tables.ViewTableTraitAttributes;
import jhi.germinate.server.database.codegen.tables.ViewTableTraits;
import jhi.germinate.server.database.codegen.tables.ViewTableUsergroups;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


// @formatter:off
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GerminateDb extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>germinate_db</code>
     */
    public static final GerminateDb GERMINATE_DB = new GerminateDb();

    /**
     * No further instances allowed
     */
    private GerminateDb() {
        super("germinate_db", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Attributedata.ATTRIBUTEDATA,
            Attributes.ATTRIBUTES,
            Biologicalstatus.BIOLOGICALSTATUS,
            Climatedata.CLIMATEDATA,
            Climates.CLIMATES,
            Collaborators.COLLABORATORS,
            Collectingsources.COLLECTINGSOURCES,
            Comments.COMMENTS,
            Commenttypes.COMMENTTYPES,
            Countries.COUNTRIES,
            DataExportJobs.DATA_EXPORT_JOBS,
            DataImportJobs.DATA_IMPORT_JOBS,
            Datasetaccesslogs.DATASETACCESSLOGS,
            Datasetcollaborators.DATASETCOLLABORATORS,
            Datasetfileresources.DATASETFILERESOURCES,
            Datasetlocations.DATASETLOCATIONS,
            Datasetmembers.DATASETMEMBERS,
            Datasetmembertypes.DATASETMEMBERTYPES,
            Datasetmeta.DATASETMETA,
            Datasetpermissions.DATASETPERMISSIONS,
            Datasets.DATASETS,
            Datasetstates.DATASETSTATES,
            Datasettypes.DATASETTYPES,
            Datawarnings.DATAWARNINGS,
            Entitytypes.ENTITYTYPES,
            Experiments.EXPERIMENTS,
            Fileresources.FILERESOURCES,
            Fileresourcetypes.FILERESOURCETYPES,
            Germinatebase.GERMINATEBASE,
            Germplasmdatawarnings.GERMPLASMDATAWARNINGS,
            Germplasminstitutions.GERMPLASMINSTITUTIONS,
            Groupmembers.GROUPMEMBERS,
            Groups.GROUPS,
            Grouptypes.GROUPTYPES,
            ImageToTags.IMAGE_TO_TAGS,
            Images.IMAGES,
            Imagetags.IMAGETAGS,
            Imagetypes.IMAGETYPES,
            Institutions.INSTITUTIONS,
            Licensedata.LICENSEDATA,
            Licenselogs.LICENSELOGS,
            Licenses.LICENSES,
            Links.LINKS,
            Linktypes.LINKTYPES,
            Locales.LOCALES,
            Locations.LOCATIONS,
            Locationtypes.LOCATIONTYPES,
            Mapdefinitions.MAPDEFINITIONS,
            Mapfeaturetypes.MAPFEATURETYPES,
            Mapoverlays.MAPOVERLAYS,
            Maps.MAPS,
            Markers.MARKERS,
            Markertypes.MARKERTYPES,
            Mcpd.MCPD,
            Mlsstatus.MLSSTATUS,
            News.NEWS,
            Newstypes.NEWSTYPES,
            Pedigreedefinitions.PEDIGREEDEFINITIONS,
            Pedigreedescriptions.PEDIGREEDESCRIPTIONS,
            Pedigreenotations.PEDIGREENOTATIONS,
            Pedigrees.PEDIGREES,
            Phenotypecategories.PHENOTYPECATEGORIES,
            Phenotypedata.PHENOTYPEDATA,
            Phenotypes.PHENOTYPES,
            Projectcollaborators.PROJECTCOLLABORATORS,
            Projectgroups.PROJECTGROUPS,
            Projectpublications.PROJECTPUBLICATIONS,
            Projects.PROJECTS,
            Publicationdata.PUBLICATIONDATA,
            Publications.PUBLICATIONS,
            SchemaVersion.SCHEMA_VERSION,
            Stories.STORIES,
            Storysteps.STORYSTEPS,
            Synonyms.SYNONYMS,
            Synonymtypes.SYNONYMTYPES,
            Taxonomies.TAXONOMIES,
            Treatments.TREATMENTS,
            Trialseries.TRIALSERIES,
            Trialsetup.TRIALSETUP,
            Units.UNITS,
            Userfeedback.USERFEEDBACK,
            Usergroupmembers.USERGROUPMEMBERS,
            Usergroups.USERGROUPS,
            ViewStatsBiologicalstatus.VIEW_STATS_BIOLOGICALSTATUS,
            ViewStatsCountry.VIEW_STATS_COUNTRY,
            ViewStatsPdci.VIEW_STATS_PDCI,
            ViewStatsTaxonomy.VIEW_STATS_TAXONOMY,
            ViewTableClimateData.VIEW_TABLE_CLIMATE_DATA,
            ViewTableClimates.VIEW_TABLE_CLIMATES,
            ViewTableCollaborators.VIEW_TABLE_COLLABORATORS,
            ViewTableComments.VIEW_TABLE_COMMENTS,
            ViewTableDatasetAttributes.VIEW_TABLE_DATASET_ATTRIBUTES,
            ViewTableDatasets.VIEW_TABLE_DATASETS,
            ViewTableEntities.VIEW_TABLE_ENTITIES,
            ViewTableFileresources.VIEW_TABLE_FILERESOURCES,
            ViewTableFileresourcetypes.VIEW_TABLE_FILERESOURCETYPES,
            ViewTableGermplasmAttributes.VIEW_TABLE_GERMPLASM_ATTRIBUTES,
            ViewTableGermplasmDeprecated.VIEW_TABLE_GERMPLASM_DEPRECATED,
            ViewTableGroups.VIEW_TABLE_GROUPS,
            ViewTableImages.VIEW_TABLE_IMAGES,
            ViewTableImportJobs.VIEW_TABLE_IMPORT_JOBS,
            ViewTableInstitutionDatasets.VIEW_TABLE_INSTITUTION_DATASETS,
            ViewTableInstitutions.VIEW_TABLE_INSTITUTIONS,
            ViewTableLicenseDefinitions.VIEW_TABLE_LICENSE_DEFINITIONS,
            ViewTableLicenses.VIEW_TABLE_LICENSES,
            ViewTableLinks.VIEW_TABLE_LINKS,
            ViewTableLocations.VIEW_TABLE_LOCATIONS,
            ViewTableMapoverlays.VIEW_TABLE_MAPOVERLAYS,
            ViewTableMaps.VIEW_TABLE_MAPS,
            ViewTableNews.VIEW_TABLE_NEWS,
            ViewTablePedigreedefinitions.VIEW_TABLE_PEDIGREEDEFINITIONS,
            ViewTablePedigrees.VIEW_TABLE_PEDIGREES,
            ViewTableProjects.VIEW_TABLE_PROJECTS,
            ViewTablePublications.VIEW_TABLE_PUBLICATIONS,
            ViewTableStories.VIEW_TABLE_STORIES,
            ViewTableTraitAttributes.VIEW_TABLE_TRAIT_ATTRIBUTES,
            ViewTableTraits.VIEW_TABLE_TRAITS,
            ViewTableUsergroups.VIEW_TABLE_USERGROUPS
        );
    }
    // @formatter:on
}
