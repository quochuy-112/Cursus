package org.example.cursus.model;

import jakarta.persistence.*;

@Entity
@Table
public class SubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subCategoryId;

    @Column(unique=true)
    private String subCategoryName;

    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "categoryId")
    private Category category;
}
