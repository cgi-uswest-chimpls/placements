package com.cgi.uswest.chimpls.placements.objects;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestResource(collectionResourceRel = "episodes", path = "episodes")
public interface EpisodeRepository extends PagingAndSortingRepository<Episode, UUID> {

	Episode findEpisodeByIdepsd(@Param("idepsd") String idepsd);
	
	Set<Episode> findAllByIdprvdorg(@Param("idprvdorg") String idprvdorg);
	
	Set<Episode> findAllByIdprsnOrderByDtbgnDesc(@Param("idprsn") String idprsn);
}
