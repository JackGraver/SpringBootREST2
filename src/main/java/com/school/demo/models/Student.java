package com.school.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
    
    @Id
    @Column(name = "studentid")
    private int studentId;

    @Column(name="firstname")
    private String firstname;

    @Column(name="lastname")
    private String lastname;

    @Column(name = "gpa")
    private double gpa;

    public Student() {}

    public Student(int studentId, String firstname, String lastname, double gpa) {
        this.studentId = studentId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gpa = gpa;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstName) {
        this.firstname = firstName;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastName) {
        this.lastname = lastName;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
