package com.dgmf.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Table(
        name = "tbl_book",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "title_unique", // Entity Attribute name
                        columnNames = "title" // DB Column name
                )
        }
)
public class Book {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "book_generator"
    )
    @SequenceGenerator(
            name = "book_generator",
            sequenceName = "book_sequence_name",
            allocationSize = 1
    )
    private Long id;
    @Column(name = "title", nullable = false, length = 50, unique = true)
    private String title;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "author", nullable = false, length = 50)
    private String author;
    @Column(name = "price", nullable = false)
    private double price;
    @Column(name = "pages", nullable = false)
    private int pages;
    // Hibernate will automatically take the current Timestamp of the JVM
    @CreationTimestamp
    private LocalDateTime dateCreated;
    @Column(name = "last_updated")
    // Hibernate will automatically take the current Timestamp of the JVM
    @UpdateTimestamp
    private LocalDateTime lastUpdated;
}
