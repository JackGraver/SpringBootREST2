package com.example.demo.controller;

import com.example.demo.models.Student;
import com.example.demo.service.StudentService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {
    
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/info")
    public String getAllStudents(Model model) {
        model.addAttribute("students", service.getAllStudents());
        return "studentinformation";
    }

    @PostMapping("/create")
    public String createStudent(@RequestParam(value = "firstname", required = false) String firstname, 
                                @RequestParam(value = "lastname", required = false) String lastname,
                                @RequestParam(value = "gpa", required = false) double gpa,
                                Model model) {

        Student newStudent = service.createStudent(firstname, lastname, gpa);
        model.addAttribute("newStudent", newStudent);
        model.addAttribute("students", service.getAllStudents());
        return "studentinformation";
    }

    @PostMapping("/delete")
    public String deleteDelete(@RequestParam(value = "id", required = true) int studentId, Model model) {
        service.deleteStudent(studentId);
        model.addAttribute("message", "Student Deleted");
        model.addAttribute("students", service.getAllStudents());
        return "studentinformation";
    }
}