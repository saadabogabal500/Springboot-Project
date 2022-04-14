package com.spring.project.todoapp.todoapp.todolist;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Document
public class Todo {
    @Id
    private String id;
    
    @NotNull(message = "title is required")
    @Size(min= 3 , message = "title must be at least 3")
    private String title;

    @NotNull(message = "description is required")
    @Size(min= 3 , message = "title must be at least 3")
    private String description;
    private LocalDateTime timestamp;
    
    public Todo() {
        this.timestamp = java.time.LocalDateTime.now();

    }

    public Todo(String id, String title, String description ) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.timestamp = java.time.LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
