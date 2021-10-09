package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Blog;

public interface IBlogService {
	
	Blog create(Blog blog);
	
	List<Blog> findByTitle(String title);
	
	List<Blog> findAll();
	
	void delete(String id);
	
	Blog update(Blog blog);
	
	Blog findById(String id);	
	
}
