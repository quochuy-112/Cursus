package org.example.cursus.model;

import jakarta.persistence.*;
import org.example.cursus.enums.Role;

import java.util.Set;

@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String fullName;

    private String address;

    private Long phoneNumber;

    private String gender;

    private boolean isBlocked;

    private boolean isAuthenticated;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Account account;
}
