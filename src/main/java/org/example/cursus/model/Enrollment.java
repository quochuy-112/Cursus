package org.example.cursus.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long enrollmentId;

    private LocalDate enrollmentDate;

    private String status;

    private int progress;

    private LocalDate completedDate;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "userId")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "courseId")
    private Course course;
}
