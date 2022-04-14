package com.spring.project.todoapp.todoapp.home;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {
    @RequestMapping(value = "/")
    public String greeting(){
        return "Welcome Hero In your frist Spring boot project";
    }

    @GetMapping(value = "/{name}")
    public String greetingWithName(@PathVariable String name){
        return String.format("Welcome %s in your Springboot Project", name);
    }
}
