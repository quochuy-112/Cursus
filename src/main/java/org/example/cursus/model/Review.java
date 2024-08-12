package org.example.cursus.model;

import jakarta.persistence.*;

@Entity
@Table
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    private String comment;

    private int rating;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "userId")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "courseId")
    private Course course;
}
