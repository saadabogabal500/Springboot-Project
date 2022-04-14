package com.spring.project.todoapp.todoapp.todolist;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;


@RestController
@RequestMapping(value = "/api/v1/todos")
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping(value = { "", "/" })
    public ResponseEntity<List<Todo>> getAllTodos() {
        List<Todo> result = todoService.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable String id) {
        Todo result = todoService.getById(id);
        return new ResponseEntity<Todo>(result, HttpStatus.OK);
    }

    @PostMapping(value = { "", "/" })
    public ResponseEntity<Todo> creatNewTodo(@Valid @RequestBody Todo todo) {
        Todo result = todoService.save(todo);
       return new ResponseEntity<Todo>( result , HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String id) {
        todoService.delete(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

}
