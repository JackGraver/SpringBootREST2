package com.school.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @Column(name = "courseid")
    private int courseId;

    @Column(name = "coursename")
    private String courseName;

    @Column(name = "coursedescription")
    private String courseDescription;

    public Course() {}

    public Course(int courseId, String courseName, String courseDescription) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getCourseId() {
        return this.courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseDescription() {
        return this.courseDescription;
    }
    
}
