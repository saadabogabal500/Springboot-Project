package com.spring.crud.project.crud.todos;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<Todo , String>{
    
}
