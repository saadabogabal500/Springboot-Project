package com.spring.project.todoapp.todoapp.todolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.validation.Valid;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

//     private List<Todo> data =new ArrayList<Todo>(Arrays.asList(
//         new Todo(1 , "Todo List1" , "myfrist todolist2"),
//         new Todo(2 , "Todo List2" , "Second todolist"),
//         new Todo(3 , "Todo List3" , "third todolist"),
//         new Todo(4 , "Todo List4" , "fourth todolist"),
//         new Todo(5 , "Todo List5" , "fifth todolist"),
//         new Todo(6 , "Todo List6" , "sixth todolist")
//   ));

    public List<Todo> findAll(){
        return todoRepository.findAll();
    }

    public Todo getById(String id) {

           return todoRepository.findById(id).get();
        
    }

    public Todo save(@Valid Todo todo){
        return todoRepository.insert(todo);
    }

    public void delete(String id){
        todoRepository.deleteById(id);
    }

}
