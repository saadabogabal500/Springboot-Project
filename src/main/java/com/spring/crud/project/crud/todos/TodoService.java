package com.spring.crud.project.crud.todos;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;
@Service
public class TodoService {
    
    @Autowired
    private TodoRepository todoRepository;
    
    public List<Todo> findAll(){
        return todoRepository.findAll();
    }

    public TodoService() {
    }
    
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Todo getById(String id){
        return todoRepository.findById(id).get();
    }

    public Todo save(Todo todo){
        return todoRepository.insert(todo);
    }
    
    public void deleteTodo(String id){
         todoRepository.deleteById(id);
    }
}
