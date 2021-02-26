package com.assist.java.multitenancy.service.database;

import com.assist.java.multitenancy.utils.ConnectionStorage;
import com.mongodb.ConnectionString;
import com.mongodb.client.MongoDatabase;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

import java.util.Objects;

public class DatabaseConfiguration extends SimpleMongoClientDatabaseFactory {

  public DatabaseConfiguration(ConnectionString connectionString) {
    super(connectionString);
  }

  @Override
  protected MongoDatabase doGetMongoDatabase(String dbName) {

    ConnectionString connectionString = new ConnectionString(ConnectionStorage.getConnection());
    return super.doGetMongoDatabase(Objects.requireNonNull(connectionString.getDatabase()));
  }
}
