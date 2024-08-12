package org.example.cursus.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;

    private int quantity;

    @OneToOne
    @JoinColumn(name = "student_id", referencedColumnName = "userId")
    private Student student;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    private Set<CartItem> cartItems;
}
