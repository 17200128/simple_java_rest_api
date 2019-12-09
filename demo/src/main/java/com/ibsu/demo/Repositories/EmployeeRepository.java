package com.ibsu.demo.Repositories;


import com.ibsu.demo.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
