package com.example.SpringMVCDemo.service;
import com.example.SpringMVCDemo.repository.StudentRepository;
import com.example.SpringMVCDemo.entity.Student;
import java.util.List;

import org.springframework.stereotype.Service;

@Service 
public class StudentService {
    private  StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
