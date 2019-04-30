package com.example.Company_data.repositories;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Company_data.model.Company;

public interface Company_repositorie  extends MongoRepository<Company, String>{
	Company findBy_id(ObjectId _id);
	
}