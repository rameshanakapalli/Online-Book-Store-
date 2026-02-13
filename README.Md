# Online Book Store - Backend (Java 17, Spring Boot,Spring Data JPA, Maven, MySQL, Postman)

The Online Book Store is a backend RESTful web application developed using Spring Boot and Spring Data JPA.
It provides APIs to manage books, including creating, retrieving, updating, and deleting book records.
The project demonstrates a layered architecture commonly used in real-world enterprise applications.

## Features

- RESTful API using Spring Boot
- CRUD operations for books:
  - `POST /books` → Add a book
  - `GET /books` → List all books
  - `GET /books/{id}` → View a single book
  - `PUT /books/{id}` → Update a book
  - `DELETE /books/{id}` → Delete a book
- Returns JSON responses
- Tested with Postman

## Tech Stack

- Java 17+
- Spring Boot
- Maven
- MySQL database
- Postman for API testing

## How to Run

1. Clone the repository:

```bash
git clone https://github.com/SREENU42/Online_BookStore_JavaBackend.git



2.Navigate to backend:
cd Online_BookStore_JavaBackend

3.Run using Maven:
mvn spring-boot:run

4.Test APIs using Postman:
GET http://localhost:8080/books
POST http://localhost:8080/books
PUT http://localhost:8080/books/{id}
DELETE http://localhost:8080/books/{id}



