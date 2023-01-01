package com.joyful.java.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.joyful.java.mongodb")
public class MongodbApplication {

	public static void main(String[] args) {
		run(MongodbApplication.class, args);
	}

}
