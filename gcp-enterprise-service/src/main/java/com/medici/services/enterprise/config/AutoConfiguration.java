package com.medici.services.enterprise.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.medici.services.enterprise.model.Enterprise;
import com.medici.services.enterprise.repository.EnterpriseRepository;

@Configuration
@EntityScan(basePackageClasses = { Enterprise.class })
@EnableMongoRepositories(basePackageClasses = { EnterpriseRepository.class })
@EnableAutoConfiguration
public class AutoConfiguration {

}
