package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Blog;
import com.example.demo.repository.BlogRepository;

//service layer will delegate to the repository, repository will be autowired in service class

@Service
public class BlogService implements IBlogService{

	
	@Autowired
	private BlogRepository blogRepository;
	
	@Override
	public Blog create(Blog blog) {
		return blogRepository.save(blog);//service delegate mongodb method
	}

	@Override
	public List<Blog> findByTitle(String title) {
		return blogRepository.findByTitle(title);//service delegate mongodb method
	}
	
	@Override
	public Blog findById(String id) {
		return blogRepository.findById(id).get();//service delegate mongodb method
	}

	@Override
	public List<Blog> findAll() {
		return blogRepository.findAll();//service delegate mongodb method
	}

	@Override
	public void delete(String id) {
		blogRepository.deleteById(id);//service delegate mongodb method
		
	}

	@Override
	public Blog update(Blog blog) {
		return blogRepository.save(blog);//service delegate mongodb method
	}
	

}
