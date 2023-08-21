package com.dgmf.service;

import com.dgmf.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    // Creates a Book
    Book createBook(Book book);
    // Get all the Books
    List<Book> getAllBooks();
    // Get a single Book
    Book getBook(Long id);
}
