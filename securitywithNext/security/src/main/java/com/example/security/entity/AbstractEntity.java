package com.example.security.entity;

import jakarta.persistence.*;
import lombok.Data;

@MappedSuperclass
@Data
public class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
