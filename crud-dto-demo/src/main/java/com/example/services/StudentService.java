package com.example.services;

import org.springframework.stereotype.Service;
import com.example.repository.StudentRepository;
import com.example.entity.Student;
import com.example.dto.StudentRequestDto;
import com.example.dto.StudentResponseDto;
import java.time.LocalDateTime;
import com.example.exceptions.DuplicateResourceExistsException;


@Service 
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentResponseDto createStudent(StudentRequestDto studentrequestDto) {
        Student student = maptoEntity(studentrequestDto);
        if (EmailExists(student)) {
            throw new DuplicateResourceExistsException("Student with email id " + student.getEmail() + " already exists");
        }
        Student studentResp = studentRepository.save(student);
        return mapToDto(studentResp);
    }

    public StudentResponseDto getStudentById(Long id) {
        Student student = studentRepository
        .findById(id)
        .orElseThrow(() -> {
            throw new RuntimeException("Student with  id " + id + " not found");
        });
        return mapToDto(student);
    }

    public Student updateStudent(Long id, Student student) {
        Student existingStudent = studentRepository.findById(id).orElse(null);
        if (existingStudent != null) {
            existingStudent.setName(student.getName());
            existingStudent.setEmail(student.getEmail());
            return studentRepository.save(existingStudent);
        }
        return null;

    }
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    private Student maptoEntity(StudentRequestDto studentrequestDto) {
        Student student = new Student();
        student.setName(studentrequestDto.getName());
        student.setEmail(studentrequestDto.getEmail());
        //external validation can be added here if needed
        student.setIsDeleted(false);
        student.setCreatedAt(LocalDateTime.now());
        student.setUpdatedAt(LocalDateTime.now());
        return student;
    }

    private StudentResponseDto mapToDto(Student student) {
        StudentResponseDto studentResponseDto = new StudentResponseDto();
        studentResponseDto.setId(student.getId());
        studentResponseDto.setName(student.getName());
        studentResponseDto.setEmail(student.getEmail());
        studentResponseDto.setMessage("Student created successfully");
        return studentResponseDto;
    }

    private boolean EmailExists(Student student) {
        return studentRepository.existsByEmail(student.getEmail());
    }

}
