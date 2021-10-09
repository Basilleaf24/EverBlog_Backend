package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Blog;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends MongoRepository<Blog, String>{//String is used as primary key id is String
	
	@Query("{'title':?0}")//?0 is replaced by query parameter what we will be passing in findByTitle
	public List<Blog> findByTitle(String title);
	
}
