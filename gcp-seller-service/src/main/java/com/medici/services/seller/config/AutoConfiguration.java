package com.medici.services.seller.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.medici.services.seller.model.Seller;
import com.medici.services.seller.repository.SellerRepository;

@Configuration
@EntityScan(basePackageClasses = { Seller.class })
@EnableMongoRepositories(basePackageClasses = { SellerRepository.class })
@EnableAutoConfiguration
public class AutoConfiguration {

}
