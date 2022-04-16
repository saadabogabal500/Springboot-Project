package com.spring.project.todoapp.todoapp.todolist;

import com.spring.project.todoapp.todoapp.error.ConflictException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

import javax.validation.Valid;

import com.spring.project.todoapp.todoapp.error.NotFoundException;

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
        try{
           return todoRepository.findById(id).get();
        }catch(NoSuchElementException ex){
            throw new NotFoundException(String.format("This id :{ %s} is not found in your Database", id));
        }
    }

    public Todo save(@Valid Todo todo){
        if(todoRepository.findByTitle(todo.getTitle()) != null){
            throw new ConflictException("Anther record with same title exists");
        }
        return todoRepository.insert(todo);
    }

    public void delete(String id){
        todoRepository.deleteById(id);
    }

}
