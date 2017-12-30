package com.springboot.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import com.springboot.dao.InsertDao;

@Repository
@Qualifier("insertDao")
public class InsertDaoImpl implements InsertDao {

	@Autowired
	MongoTemplate mongoTemplate;

	public Boolean insertDocument(String document) {

		boolean flag = false;
		
		DBObject dbObject = (DBObject) JSON.parse(document);
		
		if (dbObject != null) {
			DBCollection collection = mongoTemplate.getCollection("address");
			collection.insert(dbObject);
			flag = true;
		}
		return flag;
	}

}
