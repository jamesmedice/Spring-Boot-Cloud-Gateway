package com.medici.services.director.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.medici.services.director.model.Director;
import com.medici.services.director.repository.DirectorRepository;

@Configuration
@EntityScan(basePackageClasses = { Director.class })
@EnableMongoRepositories(basePackageClasses = { DirectorRepository.class })
@EnableAutoConfiguration
public class AutoConfiguration {

}
