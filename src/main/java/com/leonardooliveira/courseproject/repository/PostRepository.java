package com.leonardooliveira.courseproject.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.leonardooliveira.courseproject.domain.Post;
import com.leonardooliveira.courseproject.domain.User;

public interface PostRepository extends MongoRepository<Post, Serializable> {

}
