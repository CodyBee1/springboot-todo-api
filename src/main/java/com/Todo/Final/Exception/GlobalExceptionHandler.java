package com.Todo.Final.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
     @ExceptionHandler(TodoNotFoundException.class)
     public ResponseEntity<ErrorResponse> handleNotFound(TodoNotFoundException ex) {
         ErrorResponse errorResponse = new ErrorResponse();
         errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
         errorResponse.setMessage(ex.getMessage());
         errorResponse.setTimestamp(System.currentTimeMillis());
         return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
     }
}
