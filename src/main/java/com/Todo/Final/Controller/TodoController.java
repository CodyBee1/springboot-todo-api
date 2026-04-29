package com.Todo.Final.Controller;

import java.util.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Todo.Final.Model.TodoEntity;
import com.Todo.Final.Repository.RepositoryLayer;
import com.Todo.Final.Service.TodoService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.Todo.Final.Service.TodoService;
// import com.Todo.Final.Exception.ResourceNotFoundException;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private final TodoService service;

    public TodoController(TodoService service){
        this.service = service;
    }

    // GET ALL → 200
    @GetMapping
    public ResponseEntity<List<TodoEntity>> getAllTodos() {
        return ResponseEntity.ok(service.getAllTodos());
    }

    // GET BY ID → 200 / 404
    @GetMapping("/{id}")
    public ResponseEntity<TodoEntity> getTodoById(@PathVariable Long id) {
        TodoEntity todo = service.getTodoById(id);
        return ResponseEntity.ok(todo);
    }

    // CREATE → 201 / 400
    @PostMapping
    public ResponseEntity<TodoEntity> createTodo(@RequestBody TodoEntity todo) {
        TodoEntity savedTodo = service.createTodo(todo);
        return ResponseEntity.status(201).body(savedTodo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TodoEntity> updateTodo(@PathVariable Long id, @RequestBody TodoEntity updated) {
        TodoEntity updatedTodo = service.updateTodo(id, updated);
        return ResponseEntity.ok(updatedTodo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTodo(@PathVariable Long id) {
        service.deleteTodo(id);
        return ResponseEntity.ok("Deleted successfully");
    }
}
