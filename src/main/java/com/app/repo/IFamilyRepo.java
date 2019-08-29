package com.app.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.model.Family;

public interface IFamilyRepo extends MongoRepository<Family,String>{

	public List<Family> findBynames(String names);
	public List<Family> findBynumDocument(String numDocument);
	
}
