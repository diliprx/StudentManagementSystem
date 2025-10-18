# Student Management System (Spring Boot CRUD + REST API)

A simple **Student Management System** built using **Spring Boot**, **Spring Data JPA**, and **RESTful APIs**. This project allows you to perform **CRUD operations** on student records and serves as a base for relational database management in Java applications.

---

## Table of Contents

1. [Overview](#overview)  
2. [Features](#features)  
3. [Prerequisites](#prerequisites)  
4. [Installation](#installation)  
5. [Running the Application](#running-the-application)  
6. [API Endpoints](#api-endpoints)  
7. [Project Structure](#project-structure)  
8. [Technologies Used](#technologies-used)  
9. [Future Enhancements](#future-enhancements)  
10. [License](#license)  

---

## Overview

This project demonstrates the use of **Spring Boot** and **Spring Data JPA** to implement a **RESTful API** for managing student records. Users can:

- Add new students  
- View all students  
- Retrieve student details by ID  
- Update existing student information  
- Delete students  

The project follows **RESTful principles**, making it easy to integrate with frontend applications or mobile clients.

---

## Features

- **Create** a new student  
- **Read** student(s) information  
- **Update** student details  
- **Delete** student records  
- **RESTful API** endpoints for easy access  
- **In-memory H2 database** (default) for quick testing  
- Optionally configurable **MySQL/PostgreSQL** database  

---

## Prerequisites

Before running this project, ensure you have the following installed:

- **Java JDK 17+**  
- **Maven 3.6+**  
- **IDE** (e.g., IntelliJ, Eclipse)  
- **Postman or curl** for API testing  

---

## Installation

1. **Clone the repository:**

```
cmd
git clone https://github.com/yourusername/student-management-system.git
cd student-management-system
```
Build the project using Maven:
``` bash
mvn clean install
```

# Configure database (optional):
By default, the project uses H2 in-memory database. To use MySQL/PostgreSQL, update the application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

# Running the Application

You can run the application using Maven:

mvn spring-boot:run


Or by running the main class from your IDE:

com.example.studentmanagement.StudentManagementApplication

# The application will start on:

http://localhost:8080

| Method | Endpoint         | Description            | Request Body Example                                                  |
| ------ | ---------------- | ---------------------- | --------------------------------------------------------------------- |
| POST   | `/students`      | Add new student        | `{ "name": "John Doe", "email": "john@example.com", "course": "CS" }` |
| GET    | `/students`      | Get all students       | N/A                                                                   |
| GET    | `/students/{id}` | Get student by ID      | N/A                                                                   |
| PUT    | `/students/{id}` | Update student details | `{ "name": "Jane Doe", "email": "jane@example.com", "course": "IT" }` |
| DELETE | `/students/{id}` | Delete student         | N/A                                                                   |

```
student-management-system/
│
├── src/main/java/com/example/studentmanagement/
│   ├── controller/      # REST controllers
│   ├── model/           # Entity classes
│   ├── repository/      # JPA repositories
│   ├── service/         # Business logic (optional)
│   └── StudentManagementApplication.java  # Main class
│
├── src/main/resources/
│   ├── application.properties  # Configuration
│   └── data.sql                # Sample data (optional)
│
├── pom.xml                 # Maven dependencies
└── README.md

```
# Technologies Used

- **Java 17+**

- **Spring Boot**

- **Spring Data JPA**

- **H2 Database (default) / MySQL / PostgreSQL**

- **Maven**

- **RESTful API**

# Future Enhancements

1. Add pagination and sorting

2. Integrate Swagger UI for API documentation

3. Implement authentication & authorization

4. Use DTOs for better API response management

5. Add unit and integration tests

## License

This project is open-source and available under the MIT License.

# Sample Output
<img width="1913" height="965" alt="image" src="https://github.com/user-attachments/assets/e847df29-74ae-4f16-a971-15921b87030a" />

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/725626cd-8fec-4383-aff8-32c6197ce276" />


<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/96c2f977-d7fd-46fa-8b0b-c92e5eebc721" />





