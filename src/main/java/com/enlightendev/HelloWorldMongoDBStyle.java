package com.enlightendev;

import com.mongodb.*;

import java.net.UnknownHostException;

/**
 * Test mongo db driver
 */
public class HelloWorldMongoDBStyle {

    public static void main(String[] args) throws UnknownHostException {

        //find a single document from a collection

        //client: logical connection to a mongo cluster
        MongoClient client = new MongoClient(new ServerAddress("localhost", 27017));

        //the respective DB
        DB database = client.getDB("course");

        //the collection
        DBCollection collection = database.getCollection("hello");

        //the specific document
        DBObject document = collection.findOne();

        System.out.println(document);

    }
}

