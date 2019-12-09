package com.ibsu.demo.entities;

import javax.persistence.*;

@Entity
@Table(name = "DEPARTMENTS")
public class Department {
    @Id
    @Column(name="DEPARTMENT_ID")
    private long DepartmentID;

    @Column(name="DEPARTMENT_NAME")
    private String DepartmentName;


    public long getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(long departmentID) {
        DepartmentID = departmentID;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }
}
