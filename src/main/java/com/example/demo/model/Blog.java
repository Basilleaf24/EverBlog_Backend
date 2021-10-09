package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection="Blog")//tells mongodb that there is a collection in database called Blog
public class Blog {

	@Id
	private String blogId;//primary key in mongodb
	private String title;
	private String content;
	public void setBlogId(String id) {//method is not shown in video
		this.blogId=id;
		
	}
}
