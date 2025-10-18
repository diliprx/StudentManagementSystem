package com.example.StudentManagementSystem.controller;


import com.example.StudentManagementSystem.model.Student;
import com.example.StudentManagementSystem.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.net.URI;
import java.util.List;

@RestController
class HomeController {

    @GetMapping("/")
    public String home() {
        return "✅ Student Management System API is running. Use /students endpoints.";
    }
}
    @RestController
@RequestMapping("/students")
public class StudentController {


private final StudentService studentService;


@Autowired
public StudentController(StudentService studentService) {
this.studentService = studentService;
}


@PostMapping
public ResponseEntity<Student> createStudent(@Valid @RequestBody Student student) {
Student created = studentService.createStudent(student);
return ResponseEntity.created(URI.create("/students/" + created.getId())).body(created);
}


@GetMapping
public List<Student> getAllStudents() {
return studentService.getAllStudents();
}


@GetMapping("/{id}")
public Student getStudentById(@PathVariable Long id) {
return studentService.getStudentById(id);
}


@PutMapping("/{id}")
public Student updateStudent(@PathVariable Long id, @Valid @RequestBody Student student) {
return studentService.updateStudent(id, student);
}


@DeleteMapping("/{id}")
public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
studentService.deleteStudent(id);
return ResponseEntity.noContent().build();
}
}