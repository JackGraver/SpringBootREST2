package com.school.demo.service;

import java.util.List;

import com.school.demo.models.Course;
import com.school.demo.repository.CourseRepository;

import org.springframework.stereotype.Service;

@Service
public class CourseService {
    
    private final CourseRepository repository;

    public CourseService(CourseRepository repository) {
        this.repository = repository;
    }

    public List<Course> getCourseInformation() {
        return repository.findAll();
    }

    public Course createCourse(String courseName, String courseDescription) {
        Course newCourse = new Course(0, courseName, courseDescription);
        return repository.save(newCourse);
    }

    public void deleteCourse(int courseId) {
        repository.deleteById(courseId);
    }
    
}
