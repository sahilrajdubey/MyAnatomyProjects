package com.example.controller;
//RESRAPI CRUD Operations for Student Entity
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import com.example.services.StudentService;
import com.example.entity.Student;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import java.util.stream.Collectors;

@Controller
@RequestMapping 
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

        @GetMapping("/")
    public String login(){
        return "login";
    }
    @GetMapping ("/register")
    public String register() {
        return "register";
    }
        @GetMapping ("/home")
        public String home() {
        return "home";
    }

    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        System.out.println("inside controller");
        student.setIsDeleted(false);
        Student createdStudent = studentService.createStudent(student);
        System.out.println("exiting controller");
        return ResponseEntity.status(HttpStatus.CREATED).body(createdStudent);
    }   
    
    //Read One Student
    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id) {
        Student student = studentService.getStudent(id);
        if (student != null && !student.getIsDeleted()) {
            return ResponseEntity.ok(student);
        } else {
            return ResponseEntity.notFound().build();   
        }
    }

    //get all students
    @GetMapping("/studentslist")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        students = students.stream().filter(s -> !s.getIsDeleted()).collect(Collectors.toList());
        return ResponseEntity.ok(students);
    }

    //Update Student
    @PostMapping("/student/update/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
        Optional<Student> existingStudent = studentService.getStudent(id) != null ? Optional.of(studentService.getStudent(id)) : Optional.empty();
        if (existingStudent.isPresent()) {
            existingStudent.get().setName(updatedStudent.getName());
            existingStudent.get().setEmail(updatedStudent.getEmail());
            existingStudent.get().setAge(updatedStudent.getAge());
            existingStudent.get().setRollno(updatedStudent.getRollno());
            existingStudent.get().setSubject(updatedStudent.getSubject());

            Student savedStudent = studentService.createStudent(existingStudent.get());
            return ResponseEntity.ok(savedStudent);
        } else {
            return ResponseEntity.notFound().build();  
        }
    }
    //Delete Student
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Boolean> deleteStudent(@PathVariable Long id) {
        Boolean isDeleted = studentService.deleteStudent(id);
        if (!isDeleted) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(true);
        }
    }
    //Delete All 
    @DeleteMapping ("/deleteAll")
    public ResponseEntity<String> deleteAllStudents() {
        studentService.deleteAll();
        return ResponseEntity.ok("All students deleted successfully.");
    }

    //Patch Mapping for Soft Delete 
    //Patch Mapping is used to update a resource partially. In this case, we are updating the isDeleted field of the Student entity to true, indicating that the student has been soft deleted. The student record will still exist in the database, but it will be marked as deleted and can be filtered out in queries if needed.
    @PatchMapping ("/softdelete/{id}")
    public ResponseEntity<Student> softDeleteStudent(@PathVariable Long id) {
        Student student = studentService.getStudent(id);
        if (student != null) {
            student.setIsDeleted(true);
            Student updatedStudent = studentService.createStudent(student);
            return ResponseEntity.ok(updatedStudent);
        } else {
            return ResponseEntity.notFound().build();
        }

    }



}
