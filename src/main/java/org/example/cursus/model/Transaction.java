package org.example.cursus.model;

import jakarta.persistence.*;
import org.example.cursus.enums.PaymentMethod;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    private PaymentMethod paymentMethod;

    private LocalDate transactionDate;

    private BigDecimal totalAmount;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "userId")
    private Student student;

    @OneToMany(mappedBy = "transaction", cascade = CascadeType.ALL)
    private Set<TransactionItem> transactionItems;
}
