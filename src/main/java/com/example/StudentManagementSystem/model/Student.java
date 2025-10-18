package com.example.StudentManagementSystem.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;


@Entity
@Table(name = "students")
public class Student {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


@NotBlank(message = "First name is required")
@Column(name = "first_name")
private String firstName;


@NotBlank(message = "Last name is required")
@Column(name = "last_name")
private String lastName;


@Email(message = "Email should be valid")
@NotBlank(message = "Email is required")
@Column(unique = true)
private String email;


@Min(1)
@Max(8)
private Integer semester;


public Student() { }


public Student(String firstName, String lastName, String email, Integer semester) {
this.firstName = firstName;
this.lastName = lastName;
this.email = email;
this.semester = semester;
}


// Getters and setters
public Long getId() { return id; }
public void setId(Long id) { this.id = id; }


public String getFirstName() { return firstName; }
public void setFirstName(String firstName) { this.firstName = firstName; }


public String getLastName() { return lastName; }
public void setLastName(String lastName) { this.lastName = lastName; }


public String getEmail() { return email; }
public void setEmail(String email) { this.email = email; }


public Integer getSemester() { return semester; }
public void setSemester(Integer semester) { this.semester = semester; }
}