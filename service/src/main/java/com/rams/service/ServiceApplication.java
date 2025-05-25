package com.rams.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.rams.service.entity")
@EnableJpaRepositories(basePackages = "com.rams.service.repository")
public class ServiceApplication extends SpringBootServletInitializer{
 @Override
 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	 return application.sources(ServiceApplication.class);
 }
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}

}
