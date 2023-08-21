package com.dgmf.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class RequestBookDTO {
    private String title;
    private String description;
    private String author;
    private double price;
    private int pages;
}
