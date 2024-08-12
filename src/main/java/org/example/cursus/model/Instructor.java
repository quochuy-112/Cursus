package org.example.cursus.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table
@PrimaryKeyJoinColumn
public class Instructor extends User{
    private String experience;

    private BigDecimal account_balance;

    @OneToMany(mappedBy = "instructor", cascade = CascadeType.ALL)
    private Set<Course> courses;

    @OneToMany(mappedBy = "instructor", cascade = CascadeType.ALL)
    private Set<Payout> payouts;
}
