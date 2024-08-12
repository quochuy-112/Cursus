package org.example.cursus.model;

import jakarta.persistence.*;
import org.example.cursus.enums.PaymentMethod;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table
public class Payout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long payoutId;

    private BigDecimal amount;

    private LocalDate payDate;

    private String status;

    private PaymentMethod paymentMethod;

    @ManyToOne
    @JoinColumn(name = "instructor_id", referencedColumnName = "userId")
    private Instructor instructor;
}
