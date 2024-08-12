package org.example.cursus.model;

import jakarta.persistence.*;
import org.example.cursus.enums.CourseTier;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;

    private String courseName;

    private String description;

    private String thumbnailUrl;

    private double rating;

    private String requirements;

    @Enumerated(EnumType.STRING)
    private CourseTier courseTier;

    private BigDecimal price;

    private int discount;

    private boolean isBlocked;

    private String status;

    @ManyToOne
    @JoinColumn(name = "instructor_id", referencedColumnName = "userId")
    private Instructor instructor;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private Set<CartItem> cartItems;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private Set<TransactionItem> transactionItems;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private Set<Enrollment> enrollments;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private Set<Review> reviews;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private Set<Report> reports;
}
