package com.medici.services.enterprise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class EnterpriseApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnterpriseApplication.class, args);
	}

}
