package com.tancredi.app.rest.Controller;

import com.tancredi.app.rest.Model.Task;
import com.tancredi.app.rest.Repository.TodoRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {
    private TodoRepository todoRepository;

    @GetMapping(value = "/")
    public String holaMundo(){
        return "Hola mundo";
    }

    @GetMapping(value = "/tasks")
    public List<Task> getTasks(){
        return todoRepository.findAll();
    }
}
