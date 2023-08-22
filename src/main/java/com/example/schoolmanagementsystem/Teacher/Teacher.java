package com.example.schoolmanagementsystem.Teacher;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "Teacher")
@Table(
        name = "teacher"
)
public class Teacher {
    @Id
    @SequenceGenerator(name="school_sequence",sequenceName = "school_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "school_sequence")
    @Column(name = "id", updatable = false)
    private Long id;
    @Column(name="name", nullable = false)
    private String name;
    @Column(name="address")
    private String address;
    @Column(name="date_of_birth")
    private Date date_of_birth;
    @Column(name="hired_date")
    private Date hired_date;
    @Column(name="email", nullable = false)
    private String email;



}
