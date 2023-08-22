package com.example.schoolmanagementsystem.Class;

import jakarta.persistence.*;

@Entity(name = "Class")
@Table(name = "class")
public class Class {
    @Id
    @SequenceGenerator(name = "class_sequence", sequenceName = "class_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "class_sequence")
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "max_capacity")
    private Integer max_capacity;
    @Column(name = "current_capacity")
    private Integer current_capacity;
    @Column(name = "room_number")
    private Integer room_number;

    public Class(String name, Integer max_capacity, Integer current_capacity, Integer room_number) {
        this.name = name;
        this.max_capacity = max_capacity;
        this.current_capacity = current_capacity;
        this.room_number = room_number;
    }

    public Class() {

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

    public Integer getMax_capacity() {
        return max_capacity;
    }

    public void setMax_capacity(Integer max_capacity) {
        this.max_capacity = max_capacity;
    }

    public Integer getCurrent_capacity() {
        return current_capacity;
    }

    public void setCurrent_capacity(Integer current_capacity) {
        this.current_capacity = current_capacity;
    }

    public Integer getRoom_number() {
        return room_number;
    }

    public void setRoom_number(Integer room_number) {
        this.room_number = room_number;
    }
}
