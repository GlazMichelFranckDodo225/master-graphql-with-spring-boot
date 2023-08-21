package com.dgmf.service.impl;

import com.dgmf.dto.RequestBookDTO;
import com.dgmf.dto.ResponseBookDTO;
import com.dgmf.entity.Book;
import com.dgmf.repository.BookRepository;
import com.dgmf.service.BookService;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;

    @Override
    public Book createBook(RequestBookDTO requestBookDTO) {
        Book book = Book.builder()
                .title(requestBookDTO.getTitle())
                .description(requestBookDTO.getDescription())
                .author(requestBookDTO.getAuthor())
                .price(requestBookDTO.getPrice())
                .pages(requestBookDTO.getPages())
                .build();

        bookRepository.save(book);

        return book;
    }

    @Override
    public List<ResponseBookDTO> getAllBooks() {
        return null;
    }

    @Override
    public ResponseBookDTO getBook(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Book Not Found")
        );

        ResponseBookDTO responseBookDTO = ResponseBookDTO.builder()
                .id(book.getId())
                .title(book.getTitle())
                .description(book.getDescription())
                .author(book.getAuthor())
                .price(book.getPrice())
                .pages(book.getPages())
                .dateCreated(book.getDateCreated())
                .build();

        return responseBookDTO;
    }
}
