package com.library.librarymanagement.exercise2.service;

import com.library.librarymanagement.exercise2.repository.BookRepository;

public class BookService {

    private BookRepository repository;

    // Setter Injection
    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    public void addBook() {
        repository.saveBook();
    }
}