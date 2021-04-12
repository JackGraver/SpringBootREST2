package com.school.demo.controller;

import com.school.demo.service.CourseService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/course")
public class CourseController {

    private final CourseService service;

    public CourseController(CourseService service) {
         this.service = service;
    }

    @GetMapping("/info")
    public String getCourseInformation(Model model) {
        model.addAttribute("courses", service.getCourseInformation());
        return "courseinformation";
    } 
    
    @PostMapping("/create")
    public String createCourse(@RequestParam(value = "courseName", required = false) String courseName, 
                              @RequestParam(value = "courseDescription", required = false) String courseDescription,
                              Model model) {
                        
        model.addAttribute("newCourse", service.createCourse(courseName, courseDescription));
        model.addAttribute("courses", service.getCourseInformation());
        return "courseinformation";
    }

    @PostMapping("/delete")
    public String deleteCourse(@RequestParam(value = "courseId", required = true) int courseId, Model model) {
        service.deleteCourse(courseId);
        model.addAttribute("message", "Course Deleted");
        model.addAttribute("courses", service.getCourseInformation());
        return "courseinformation";
    }
}
