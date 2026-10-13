package com.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.service.StudentService;
import org.springframework.http.ResponseEntity;
import com.example.dto.Student;


@RestController 
@RequestMapping ("api/students")
public class StudentController {

    private StudentService studentService;
    StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    
    @PostMapping 
    public ResponseEntity<String> createStudent(@RequestBody Student student) {
        studentService.createStudent(student);
        return ResponseEntity.ok("Student created successfully!");
    }
}
