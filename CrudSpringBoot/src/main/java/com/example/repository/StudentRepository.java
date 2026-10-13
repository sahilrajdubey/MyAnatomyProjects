package com.example.repository;

import org.springframework.stereotype.Repository;
import com.example.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface StudentRepository  extends JpaRepository<Student, Long> {
   
}
