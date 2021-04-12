package com.school.demo.repository;

import com.school.demo.models.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Integer> {
    
}
