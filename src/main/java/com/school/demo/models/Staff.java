package com.school.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "staff")
public class Staff {

    @Id
    @Column(name = "staffid")
    private int staffId;

    @Column(name = "role")
    private String role;

    @Column(name = "password")
    private String password;

    public Staff() {}

    public Staff(int staffId, String role, String password) {
        this.staffId = staffId;
        this.role = role;
        this.password = password;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public int getStaffId() {
        return this.staffId;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }
}
