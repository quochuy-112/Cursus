package org.example.cursus.model;

import jakarta.persistence.*;

@Entity
@Table
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reportId;

    private String reportContents;

    @ManyToOne
    @JoinColumn(name = "studentId", referencedColumnName = "userId")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "courseId", referencedColumnName = "courseId")
    private Course course;
}
