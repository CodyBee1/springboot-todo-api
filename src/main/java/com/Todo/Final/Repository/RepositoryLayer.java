package com.Todo.Final.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Todo.Final.Model.TodoEntity;

public interface RepositoryLayer extends JpaRepository<TodoEntity, Long>{

}
