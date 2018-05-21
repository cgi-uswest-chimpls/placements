package com.cgi.uswest.chimpls.placements;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PlacementsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlacementsApplication.class, args);
	}
}
