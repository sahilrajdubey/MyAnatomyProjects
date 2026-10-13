package com.example.service;

import org.springframework.stereotype.Service;
import com.example.dto.Student;

@Service 
public class StudentService {

    public String createStudent(Student student) {
        System.out.println("Creating student: " + student.getName() + ", Email: " + student.getEmail());
        return "Student created successfully!";

    }
    
}
