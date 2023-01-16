package com.leonardooliveira.courseproject.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.leonardooliveira.courseproject.domain.Post;

public interface PostRepository extends MongoRepository<Post, Serializable> {
	
	@Query("{ 'title' : { $regex: ?0, $options: 'i' } }")
	List<Post> findByTitle(String text);
	
	List<Post> findByTitleContainingIgnoreCase(String text);
}
