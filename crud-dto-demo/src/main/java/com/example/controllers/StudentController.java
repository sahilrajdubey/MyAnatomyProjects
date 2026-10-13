package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.entity.Student;
import com.example.services.StudentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PatchMapping;
import com.example.dto.StudentRequestDto;
import com.example.dto.StudentResponseDto;
import org.springframework.web.bind.annotation.DeleteMapping;


@RestController 
@RequestMapping ("/api")
public class StudentController {

    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/submitstudent")
    public ResponseEntity<StudentResponseDto> createStudent(
        @Valid @RequestBody StudentRequestDto studentrequestDto) {
        StudentResponseDto createdStudent = studentService.createStudent(studentrequestDto);
        return ResponseEntity.status(201).body(createdStudent);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<StudentResponseDto> getStudentById(@PathVariable Long id) {
        StudentResponseDto student = studentService.getStudentById(id);
        return ResponseEntity.ok(student);
    }
    
    @PatchMapping("/student/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student) {
        Student updatedStudent = studentService.updateStudent(id, student);
        if (updatedStudent != null) {
            return ResponseEntity.ok(updatedStudent);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }
}
