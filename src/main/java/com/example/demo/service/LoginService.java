package com.example.demo.service;

import com.example.demo.models.Staff;
import com.example.demo.repository.StaffRepostory;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
    
    private final StaffRepostory repository;

    public LoginService(StaffRepostory repository) {
        this.repository = repository;
    }
    
    public boolean login(int id, String password) {
        Staff staff = repository.findById(id).orElse(null);
        if(staff != null) {
            if (staff.getPassword().equals(password)) {
                return true;
            }
           return false;
        }
        return false;
    }
}
