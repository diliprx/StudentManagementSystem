package com.example.StudentManagementSystem.service;


// Ensure the Student class exists at the specified package and is spelled correctly
import com.example.StudentManagementSystem.model.Student;


import java.util.List;


public interface StudentService {
Student createStudent(Student student);
List<Student> getAllStudents();
Student getStudentById(Long id);
Student updateStudent(Long id, Student student);
void deleteStudent(Long id);
}