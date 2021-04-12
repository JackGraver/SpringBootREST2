package com.school.demo.service;

import com.school.demo.models.Staff;
import com.school.demo.repository.StaffRepository;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
    
    private final StaffRepository repository;

    public LoginService(StaffRepository repository) {
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
