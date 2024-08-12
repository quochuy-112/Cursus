package org.example.cursus.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table
@PrimaryKeyJoinColumn
public class Student extends User {
    private String major;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Cart cart;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private Set<Transaction> transactions;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private Set<Enrollment> enrollments;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private Set<Review> reviews;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private Set<Report> reports;
}
