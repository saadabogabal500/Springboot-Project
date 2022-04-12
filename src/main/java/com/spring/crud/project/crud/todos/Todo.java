package com.spring.crud.project.crud.todos;

public class Todo {
    private String id;
    private String title;
    private String descriprion;

    public Todo() {
    }

    public Todo(String id, String title, String descriprion) {
        this.id = id;
        this.title = title;
        this.descriprion = descriprion;
    }

    public String getId() {
        return id;
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

    public String getDescriprion() {
        return descriprion;
    }

    public void setDescriprion(String descriprion) {
        this.descriprion = descriprion;
    }
    
    
    
}
