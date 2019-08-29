package com.magic.tower.game.mdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.convert.MongoConverter;

import com.mongodb.DB;
import com.mongodb.MongoClient;

@Configuration
@PropertySource("classpath:magic-tower-mdb.properties")
public abstract class MDBConfiguration {

	@Autowired
	protected MongoClient mongo;
	@Autowired
	protected MongoConverter mappingMongoConverter;

	@SuppressWarnings("deprecation")
	protected DB createMongoDB(String database) {
		return mongo.getDB(database);
	}

	protected MongoDbFactory createMongoDbFactory(String database) {
		return new SimpleMongoDbFactory(mongo, database);
	}

}
