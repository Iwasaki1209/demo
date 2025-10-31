package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Entity
public class User {

    private Long id;

    private String username;

    private String password;
}
