package com.example.helloevent.model;

import jakarta.persistence.*;
import jdk.jfr.EventType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(nullable = false, unique = true)
    private String email;
    private String password;
    @OneToMany(mappedBy = "user")
    List<Booking> bookings;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;
}
