package com.app.hospitalManagement.entity;

import java.time.LocalDate;

import lombok.ToString;
import org.springframework.data.jpa.repository.QueryRewriter.IdentityQueryRewriter;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@ToString
public class Patient {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ToString.Exclude
    private LocalDate birthDate;
    private String email;
    private String gender;


}
