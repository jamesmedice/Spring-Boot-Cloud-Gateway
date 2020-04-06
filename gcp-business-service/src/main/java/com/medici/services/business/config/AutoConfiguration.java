package com.medici.services.business.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.medici.services.business.model.Business;
import com.medici.services.business.repository.BusinessRepository;

@Configuration
@EntityScan(basePackageClasses = { Business.class })
@EnableMongoRepositories(basePackageClasses = { BusinessRepository.class })
@EnableAutoConfiguration
public class AutoConfiguration {

}
