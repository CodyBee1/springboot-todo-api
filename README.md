# 📝 Todo API — Spring Boot

A production-style **RESTful Todo API** built with **Spring Boot**, following a clean layered architecture and best practices for error handling and validation.

---

## 🚀 Overview

This project demonstrates how to design a scalable backend using:

* Controller → Service → Repository pattern
* Centralized exception handling
* Input validation and clean API responses

---

## ✨ Features

* CRUD operations for Todos
* Service layer for business logic
* Custom exception handling
* Input validation
* RESTful API design

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* H2 Database
* Maven

---

## 📡 API

| Method | Endpoint      | Description     |
| ------ | ------------- | --------------- |
| GET    | `/todos`      | Fetch all todos |
| GET    | `/todos/{id}` | Fetch by ID     |
| POST   | `/todos`      | Create todo     |
| PUT    | `/todos/{id}` | Update todo     |
| DELETE | `/todos/{id}` | Delete todo     |

---

## 📥 Example Request

```json
{
  "name": "Learn Spring Boot",
  "completed": false
}
```

---

## 📤 Example Response

```json
{
  "id": 1,
  "name": "Learn Spring Boot",
  "completed": false
}
```

---

## ⚠️ Error Handling

Standardized error response:

```json
{
  "status": 404,
  "message": "Todo not found",
  "timestamp": 1710000000
}
```

---

## ▶️ Run Locally

```bash
git clone https://github.com/CodyBee1/springboot-todo-api.git
cd springboot-todo-api
mvn spring-boot:run
```

Access:

```
http://localhost:8080/todos
```

---

## 👨‍💻 Author

Adnan Qamar
