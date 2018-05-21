package com.cgi.uswest.chimpls.placements.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.uswest.chimpls.placements.objects.Episode;
import com.cgi.uswest.chimpls.placements.objects.EpisodeRepository;

@RefreshScope
@RestController
public class PlacementsApplicationController {

	  @Autowired
	  private EpisodeRepository repository;
	
	  @RequestMapping("/episode/{idepsd}")
	   public Episode findOne(@PathVariable("idepsd") String idepsd) {
	       return repository.findEpisodeByIdepsd(idepsd);
	   }
	  
	  //@RequestMapping("/episodesByProvider/{idprvdorg}") 
	
}
