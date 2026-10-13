package com.example.SpringMVCDemo.repository;
import com.example.SpringMVCDemo.entity.Student;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    private Map<Long, Student> studentDB ;

    public StudentRepository() {
        this.studentDB = new HashMap<>();
    }

    public StudentRepository(Map<Long, Student> studentDB) {
        this.studentDB = studentDB;
    }
    public Student save(Student student) {
        studentDB.put(student.getId(), student);
        return student;
    }
    public Student findById(Long id) {
        return studentDB.get(id);
    }
    public List<Student> findAll() {
        return new ArrayList<>(studentDB.values());
    }
}
