package com.example.helloevent.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private int id;
    private String name;
    private String email;
    private String password;
    private Enum role;
}
