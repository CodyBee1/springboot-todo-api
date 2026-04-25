package com.Todo.Final.Controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Todo.Final.Model.TodoEntity;
import com.Todo.Final.Repository.RepositoryLayer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
// import com.Todo.Final.Exception.ResourceNotFoundException;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private final RepositoryLayer repositoryLayer;

    public TodoController(RepositoryLayer repositoryLayer) {
        this.repositoryLayer = repositoryLayer;
    }

    @GetMapping
    public List<TodoEntity> getAllTodos() {
        return repositoryLayer.findAll();
    }

    @GetMapping("/{id}")
    public TodoEntity getTodoById(@PathVariable Long id) {
        return repositoryLayer.findById(id).orElseThrow(() -> new RuntimeException("Todo not found with id " + id));
    }

    @PostMapping
    public TodoEntity createTodo(@RequestBody TodoEntity todo) {
        return repositoryLayer.save(todo);
    }

    @PutMapping("/{id}")
    public TodoEntity updateTodo(@PathVariable Long id, @RequestBody TodoEntity updatedTodo) {
        TodoEntity existingTodo = repositoryLayer.findById(id).orElseThrow(() -> new RuntimeException("Todo not found with id " + id));
        existingTodo.setName(updatedTodo.getName());
        existingTodo.setCompleted(updatedTodo.isCompleted());
        return repositoryLayer.save(existingTodo);
    }
}
