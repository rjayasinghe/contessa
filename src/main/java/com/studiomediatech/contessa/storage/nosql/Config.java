package com.studiomediatech.contessa.storage.nosql;

import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration("NOSQL")
@EnableMongoRepositories(basePackageClasses = ContessaNoSql.class)
@Import(
    {
        MongoAutoConfiguration.class, // NOSONAR
        MongoDataAutoConfiguration.class // NOSONAR
    }
)
public class Config {

    // OK
}
