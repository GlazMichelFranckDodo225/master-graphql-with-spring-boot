package com.dgmf.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class ResponseBookDTO {
    private Long id;
    private String title;
    private String description;
    private String author;
    private double price;
    private int pages;
    private LocalDateTime dateCreated;
}
