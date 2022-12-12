package com.NeST.NestDigitalApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EmployeeReg")
public class EmployeeRegModel {
    @Id
    @GeneratedValue
    private int id;
    private int empId;
    private String name;
    private String address;
    private String email;
    private String phone;
    private String dsgn;
    private String department;
    private String salary;
    private String dob;
    private String project;
    private String username;
    private String password;

    public EmployeeRegModel() {
    }

    public EmployeeRegModel(int id, int empId, String name, String address, String email, String phone, String dsgn,
                            String department, String salary, String dob, String project, String username, String password) {
        this.id = id;
        this.empId = empId;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.dsgn = dsgn;
        this.department = department;
        this.salary = salary;
        this.dob = dob;
        this.project = project;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDsgn() {
        return dsgn;
    }

    public void setDsgn(String dsgn) {
        this.dsgn = dsgn;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
