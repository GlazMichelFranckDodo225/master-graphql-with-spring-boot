package com.dgmf.service;

import com.dgmf.dto.RequestBookDTO;
import com.dgmf.dto.ResponseBookDTO;
import com.dgmf.entity.Book;

import java.util.List;

public interface BookService {
    // Creates a Book
    Book createBook(RequestBookDTO book);
    // Get all the Books
    List<ResponseBookDTO> getAllBooks();
    // Get a single Book
    ResponseBookDTO getBook(Long id);
}
