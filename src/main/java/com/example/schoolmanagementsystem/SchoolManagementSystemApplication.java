package com.example.schoolmanagementsystem;

import com.example.schoolmanagementsystem.Class.Class;
import com.example.schoolmanagementsystem.Class.ClassRepository;
import com.example.schoolmanagementsystem.School.School;
import com.example.schoolmanagementsystem.School.SchoolRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SchoolManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagementSystemApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(SchoolRepository schoolRepository, ClassRepository classRepository){
		return args -> {
			School school = new School("ais",9);
			schoolRepository.save(school);
			Class aClass = new Class("1",100,25, 1);
			classRepository.save(aClass);

		};

	}

}
