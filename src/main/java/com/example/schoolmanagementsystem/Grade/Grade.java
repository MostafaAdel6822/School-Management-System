package com.example.schoolmanagementsystem.Grade;

import jakarta.persistence.*;

@Entity(name = "Grade")
@Table(
        name = "grade"
)
public class Grade {
    @Id
    @SequenceGenerator(name = "grade_sequence", sequenceName = "grade_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "grade_sequence")
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name="level", nullable = false)
    private Integer level;
    @Column(name="num_of_classes")
    private Integer num_of_classes;

    public Grade(Integer level, Integer num_of_classes) {
        this.level = level;
        this.num_of_classes = num_of_classes;
    }

    public Grade() {
        
    }

    public Long getId() {
        return id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getNum_of_classes() {
        return num_of_classes;
    }

    public void setNum_of_classes(Integer num_of_classes) {
        this.num_of_classes = num_of_classes;
    }
}
