package com.ibsu.demo.Services;

import com.ibsu.demo.DTO.AddEditDepartment;
import com.ibsu.demo.Repositories.DepartmentRepository;
import com.ibsu.demo.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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

    @Transactional
    public Department addDepartment( AddEditDepartment addEditDepartment) {
        Department department = new Department();
        department.setDepartmentName(addEditDepartment.getDepartmentName());
        return departmentRepository.save(department);
    }
    @Transactional
    public Department editDepartment( AddEditDepartment addEditDepartment) throws Exception {
        Department department = departmentRepository.findById(addEditDepartment.getDepartmentId()).orElseThrow(() -> new Exception("not found"));
        department.setDepartmentName(addEditDepartment.getDepartmentName());
        return departmentRepository.save(department);

    }


}
