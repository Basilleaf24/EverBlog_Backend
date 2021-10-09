package com.example.demo.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.example.demo.model.Blog;
import com.example.demo.service.IBlogService;

@RestController
public class BlogController {
	
	@Autowired
	private IBlogService blogService;
	
	@GetMapping("/all")
	public List<Blog> getAllBlogs()
	{
		return blogService.findAll();//calling methods from BlogService.java
	}
	
	@GetMapping("/title/{title}")
	public List<Blog> getBlogsByTitle(@PathVariable String title)
	{
		return blogService.findByTitle(title);//calling methods from BlogService.java
	}
	
	@GetMapping("/id/{id}")
	public Blog getBlogsById(@PathVariable String id)
	{
		return blogService.findById(id);//calling methods from BlogService.java
	}
	
	@PostMapping("/create")
	public Blog create(@RequestBody Blog blog)
	{
		blog.setBlogId(UUID.randomUUID().toString());//UUID is universal unique id, (IMPORTANT:setBlogId is not shown in video)
		return blogService.create(blog);//calling methods from BlogService.java
	}
	
	@PutMapping("/update")
	public Blog update(@RequestBody Blog blog)
	{		
		return blogService.update(blog);//calling methods from BlogService.java
	}

	@DeleteMapping("delete/{id}")
	@ResponseStatus(HttpStatus.OK)//HttpStatus tells whether the object is deleted or not
	public void deleteById(@PathVariable String id)
	{
		blogService.delete(id);//calling methods from BlogService.java
	}
}
