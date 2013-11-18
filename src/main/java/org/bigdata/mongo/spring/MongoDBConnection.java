package org.bigdata.mongo.spring;

import java.net.UnknownHostException;
import java.util.Set;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.Mongo;

/**
 * @author ghstreddy
 *
 */
public class MongoDBConnection {

	/**
	 * @param args
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException {
		Mongo server = new Mongo("localhost.localdomain",27017);
		System.out.println(server.debugString());
		System.out.println(server.getAddress());
		MongoOperations operation = new MongoTemplate(server, "spring");
		Set<String> collections = operation.getCollectionNames();
		for(String name : collections){
			System.out.println("Collection : " + name);
		}
	}

}
