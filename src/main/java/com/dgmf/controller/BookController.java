package com.dgmf.controller;

import com.dgmf.dto.RequestBookDTO;
import com.dgmf.dto.ResponseBookDTO;
import com.dgmf.entity.Book;
import com.dgmf.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/books")
public class BookController {
    private final BookService bookService;

    // Creates a Book
    @PostMapping
    public Book createBook(@RequestBody RequestBookDTO requestBookDTO) {
        return bookService.createBook(requestBookDTO);
    }

    // Get all the Books
    @GetMapping
    public List<ResponseBookDTO> getAllBooks() {
        return bookService.getAllBooks();
    }

    // Get a single Book
    @GetMapping("/{id}")
    public ResponseBookDTO getBook(@PathVariable("id") Long id) {
        return bookService.getBook(id);
    }
}
