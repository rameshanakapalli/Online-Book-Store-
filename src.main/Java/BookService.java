package com.onlinebookstore.service;

import com.onlinebookstore.model.Book;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private List<Book> books = new ArrayList<>();

    // Optional: Add 5 sample books on startup for demo
    @PostConstruct
    public void init() {
        books.add(new Book(1L, "Java Basics", "Suganya", 500.0));
        books.add(new Book(2L, "Spring Boot Guide", "Rahul", 700.0));
        books.add(new Book(3L, "Data Structures", "Priya", 600.0));
        books.add(new Book(4L, "Algorithms in Java", "Kiran", 800.0));
        books.add(new Book(5L, "Database Essentials", "Sreenu", 550.0));
    }

    // GET all books
    public List<Book> getAllBooks() {
        return books;
    }

    // GET book by ID
    public Book getBookById(Long id) {
        return books.stream()
                .filter(b -> b.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // POST: add book
    public Book addBook(Book book) {
        books.add(book);
        System.out.println("Books in list: " + books.size()); // Debug line
        return book;
    }

    // DELETE: delete book by ID
    public void deleteBook(Long id) {
        books.removeIf(b -> b.getId().equals(id));
    }

    // PUT: update book
    public Book updateBook(Long id, Book updatedBook) {
        for (Book b : books) {
            if (b.getId().equals(id)) {
                b.setTitle(updatedBook.getTitle());
                b.setAuthor(updatedBook.getAuthor());
                b.setPrice(updatedBook.getPrice());
                return b;
            }
        }
        return null;
    }
}
