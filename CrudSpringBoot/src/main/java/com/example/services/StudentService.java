package com.example.services;


import org.springframework.stereotype.Service;
import com.example.entity.Student;
import com.example.repository.StudentRepository;
import java.util.List;

@Service 

public class StudentService {

    private StudentRepository studentRepository;
    //Dependency Injection
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    //End Point Listen /app/student POST
   public Student createStudent(Student student) {
       System.out.println("inside service");
       Student savedStudent = studentRepository.save(student);
       System.out.println("exiting service");
       return savedStudent;
    }

    public Student getStudent(Long id) {
        return studentRepository.findById(id).orElse(null);
    }
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    public Boolean deleteStudent(Long id) {
        Boolean existingStudent = studentRepository.existsById(id);
        if (!existingStudent) {
            return false;
        }
        else {
            studentRepository.deleteById(id);
            return true;
        } 
    }
    public Boolean deleteAll(){
        studentRepository.deleteAll();
        return true;
    }
    
}
