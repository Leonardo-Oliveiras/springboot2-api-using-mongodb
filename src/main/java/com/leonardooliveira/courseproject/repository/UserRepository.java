package com.leonardooliveira.courseproject.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.leonardooliveira.courseproject.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, Serializable> {

}
