package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;


@Configuration
public class MongoConfiguration extends AbstractMongoClientConfiguration{//overriding autoconfiguration
	
	@Value("${port}")
	private String port;//reading from application.properties
	
	@Value("${dbname}")
	private String dbname;//reading from application.properties
	
	@Override
	protected String getDatabaseName()
	{
		return dbname;
	}
	
	@Override
	public MongoClient mongoClient()//overriding mongoclient method
	{
		return MongoClients.create();//connecting with mongodb
	}
	
	@Override
	public MongoTemplate mongoTemplate(MongoDatabaseFactory databaseFactory, MappingMongoConverter converter)//overriding mongotemplate method
	{
		return new MongoTemplate(mongoClient(), getDatabaseName());
	}
}
