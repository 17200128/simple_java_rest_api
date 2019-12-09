package com.ibsu.demo.Services;

import com.ibsu.demo.Repositories.DepartmentRepository;
import com.ibsu.demo.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getall(){
        return departmentRepository.findAll();
    }
    public Department getOne(Long departmentID) {
        return departmentRepository.findById(departmentID).orElse(null);
    }

}
