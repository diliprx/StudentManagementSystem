package com.example.StudentManagementSystem.service;
import com.example.StudentManagementSystem.model.Student;
import com.example.StudentManagementSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {


private final StudentRepository studentRepository;


@Autowired
public StudentServiceImpl(StudentRepository studentRepository) {
this.studentRepository = studentRepository;
}


@Override
public Student createStudent(Student student) {
// Optional: check for duplicate email
studentRepository.findByEmail(student.getEmail()).ifPresent(s -> {
throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Email already in use");
});
return studentRepository.save(student);
}


@Override
public List<Student> getAllStudents() {
return studentRepository.findAll();
}


@Override
public Student getStudentById(Long id) {
return studentRepository.findById(id)
.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Student not found with id " + id));
}


@Override
public Student updateStudent(Long id, Student studentDetails) {
Student student = getStudentById(id);
student.setFirstName(studentDetails.getFirstName());
student.setLastName(studentDetails.getLastName());
student.setEmail(studentDetails.getEmail());
student.setSemester(studentDetails.getSemester());
return studentRepository.save(student);
}


@Override
public void deleteStudent(Long id) {
Student student = getStudentById(id);
studentRepository.delete(student);
}
}