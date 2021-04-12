package com.example.demo.service;

import java.util.List;

import com.example.demo.models.Student;
import com.example.demo.repository.StudentRepository;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }
    
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student getStudentById(int id) {
        return repository.getOne(id);
    }

    public Student createStudent(String firstname, String lastname, double gpa) {
        Student newStudent = new Student(0, firstname, lastname, gpa);
        return repository.save(newStudent);
    }

    public void deleteStudent(int studentId) {
        repository.deleteById(studentId);
    }
}
