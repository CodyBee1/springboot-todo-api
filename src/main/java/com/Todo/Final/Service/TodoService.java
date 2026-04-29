package com.Todo.Final.Service;
import java.util.*;

import org.springframework.stereotype.Service;

import com.Todo.Final.Model.TodoEntity;
import com.Todo.Final.Repository.RepositoryLayer;

class TodoNotFoundException extends RuntimeException {
    public TodoNotFoundException(String message) {
        super(message);
    }
}

@Service
public class TodoService {
    private final RepositoryLayer repositoryLayer;

    public TodoService(RepositoryLayer repositoryLayer) {
        this.repositoryLayer = repositoryLayer;
    }

    public List<TodoEntity> getAllTodos() {
        return repositoryLayer.findAll();
    }

    public TodoEntity getTodoById(Long id) {
        return repositoryLayer.findById(id).orElseThrow(() -> new RuntimeException("Todo not found with id " + id));
    }

    public TodoEntity createTodo(TodoEntity todo) {
        if(todo.getName() == null || todo.getName().isEmpty()) {
            throw new IllegalArgumentException("Todo name cannot be empty");
        }
        return repositoryLayer.save(todo);

    }

    public TodoEntity updateTodo(Long id, TodoEntity updated) {

        TodoEntity existing = repositoryLayer.findById(id)
                .orElseThrow(() -> new TodoNotFoundException("Todo with id " + id + " not found"));

        existing.setName(updated.getName());
        existing.setCompleted(updated.isCompleted());

        return repositoryLayer.save(existing);
    }

    public void deleteTodo(Long id) {

        TodoEntity existing = repositoryLayer.findById(id)
                .orElseThrow(() -> new TodoNotFoundException("Todo with id " + id + " not found"));

        repositoryLayer.delete(existing);
    }

}
