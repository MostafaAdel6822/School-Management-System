package com.example.schoolmanagementsystem.Subject;

import jakarta.persistence.*;

@Entity(name = "Subject")
@Table(
        name = "subject"
)
public class Subject {
    @Id
    @SequenceGenerator(name="school_sequence",sequenceName = "school_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "school_sequence")
    @Column(name = "id", updatable = false)
    private Long id;
    @Column(name="name", nullable = false)
    private String name;
    @Column(name="code", nullable = false)
    private String code;
    @Column(name="department")
    private String department;
}
