package com.cgi.uswest.chimpls.placements;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.cgi.uswest.chimpls.placements.objects.Episode;


@Configuration
public class RestConfiguration extends RepositoryRestConfigurerAdapter {

   @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Episode.class);
    }
	
}