package com.medici.services.director;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class DirectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DirectorApplication.class, args);
	}

}
