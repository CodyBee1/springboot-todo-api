# 📝 Todo REST API — Spring Boot

A production-style **RESTful Todo API** built with **Spring Boot, Spring Data JPA, and H2 Database**.
This project demonstrates clean backend design, proper API structuring, and database integration using modern Java frameworks.

---

## 📖 Overview

This application provides a simple yet scalable backend service to manage Todo items.
It follows REST principles and uses **JPA for persistence**, making it easy to extend with real databases like PostgreSQL or MySQL.

---

## ✨ Key Features

* Full **CRUD operations** (Create, Read, Update, Delete)
* RESTful API design using standard HTTP methods
* **Spring Data JPA** for database interaction
* In-memory **H2 database** for quick testing
* Clean and modular project structure
* JSON-based request and response handling

---

## 🧰 Tech Stack

| Layer       | Technology      |
| ----------- | --------------- |
| Language    | Java 17+        |
| Framework   | Spring Boot     |
| Web Layer   | Spring Web      |
| Persistence | Spring Data JPA |
| Database    | H2 (in-memory)  |
| Build Tool  | Maven           |

---

## 📁 Project Structure

```id="ps1x02"
src/main/java/com/Todo/Final
│
├── controller    # Handles HTTP requests (REST endpoints)
├── model         # JPA Entity classes
├── repository    # Data access layer (JpaRepository)
└── FinalApplication.java  # Entry point
```

---

## 🔗 API Endpoints

| Method | Endpoint        | Description             |
| ------ | --------------- | ----------------------- |
| GET    | `/todos`        | Retrieve all todos      |
| GET    | `/todos/{id}`   | Retrieve todo by ID     |
| POST   | `/todos`        | Create a new todo       |
| PUT    | `/todos/{id}`   | Update an existing todo |
| DELETE | `/todos/{id}`   | Delete a todo           |
| GET    | `/todos/search` | Filter by status        |

---

## 📌 Sample API Usage

### ➕ Create Todo

**POST** `/todos`

```json id="3k19fz"
{
  "title": "Learn Spring Boot",
  "completed": false
}
```

---

### 📥 Response

```json id="82hd3s"
{
  "id": 1,
  "title": "Learn Spring Boot",
  "completed": false
}
```

---

## 🗄️ H2 Database Console

Access the in-memory database UI:

```id="0k2zjp"
http://localhost:8080/h2-console
```

### Configuration

| Property | Value                |
| -------- | -------------------- |
| JDBC URL | `jdbc:h2:mem:testdb` |
| Username | `sa`                 |
| Password | *(empty)*            |

---

## ▶️ Running the Application

### 1. Clone Repository

```bash id="o9x3sd"
git clone https://github.com/CodyBee1/springboot-todo-api.git
cd springboot-todo-api
```

### 2. Run Application

```bash id="1n8fdp"
./mvnw spring-boot:run
```

### 3. Access API

```id="4zsk91"
http://localhost:8080/todos
```

---

## 🧠 Concepts Demonstrated

* REST API design with Spring Boot
* Dependency Injection & Auto Configuration
* JPA Entity Mapping and ORM
* Repository abstraction with Spring Data
* HTTP request handling and response structure

---

## 🚀 Roadmap / Improvements

* Introduce **Service Layer** (clean architecture)
* Add **DTO pattern** for better API design
* Implement **Validation** (`@Valid`)
* Add **Global Exception Handling**
* Integrate **Swagger/OpenAPI documentation**
* Replace H2 with **PostgreSQL**
* Add **Authentication (JWT / Spring Security)**

---

## 👨‍💻 Author

**Adnan Qamar**

---
