package com.example.schoolmanagementsystem.School;


import jakarta.persistence.*;

@Entity(name = "School")
@Table(
        name = "school"
)
public class School {
    @Id
    @SequenceGenerator(name="school_sequence",sequenceName = "school_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "school_sequence")
    @Column(name = "id", updatable = false)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="num_of_grades")
    private Integer num_of_grades;

    public School() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum_of_grades() {
        return num_of_grades;
    }

    public void setNum_of_grades(Integer num_of_grades) {
        this.num_of_grades = num_of_grades;
    }

    public School(String name, Integer num_of_grades) {
        this.name = name;
        this.num_of_grades = num_of_grades;
    }
}
