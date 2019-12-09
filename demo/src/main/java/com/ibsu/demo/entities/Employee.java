package com.ibsu.demo.entities;



import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "EMPLOYEES")
public class Employee {
    @Id
    @Column(name="EMPLOYEE_ID")
    private long employeeID;
    @Column(name="FIRST_NAME")
    private String employeeName;
    @Column(name="LAST_NAME")
    private String employeeLastname;
    @Column(name="HIRE_DATE")
    private Date HD;
    @Column(name="SALARY")
    private long Salary;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEPARTMENT_ID")
    private Department department;

    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeLastname() {
        return employeeLastname;
    }

    public void setEmployeeLastname(String employeeLastname) {
        this.employeeLastname = employeeLastname;
    }

    public Date getHD() {
        return HD;
    }

    public void setHD(Date HD) {
        this.HD = HD;
    }

    public long getSalary() {
        return Salary;
    }

    public void setSalary(long salary) {
        Salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
