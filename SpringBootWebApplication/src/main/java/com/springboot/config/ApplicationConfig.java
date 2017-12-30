package com.springboot.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

@Configuration
@ComponentScan("com.jarvis")
public class ApplicationConfig {

	@SuppressWarnings("deprecation")
	@Bean
	public MongoDbFactory mongoDbFactory() throws Exception {

		MongoClient mongoClient = new MongoClient("localhost", 27017);
		UserCredentials userCredentials = new UserCredentials("", "");
		System.out.println("mongoclient...");
		return new SimpleMongoDbFactory(mongoClient, "json", userCredentials);

	}

	@Bean
	public MongoTemplate mongoTemplate() throws Exception{
		
		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
		
		return mongoTemplate;
		
	}
	
}
