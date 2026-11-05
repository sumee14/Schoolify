package com.pvm.school.model;


import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Staff {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long staffId;
    private String employeeCode;
    private String staffName;
    private String gender;
    private LocalDate dob;
    private LocalDate joiningDate;
    private String mobileNo;
    private String email;
    private String designation;
    private String qualification;
    private String employmentType;
    private String status;
    public Staff() {
    }
    public Staff(Long staffId, String employeeCode, String staffName, String gender, LocalDate dob,
            LocalDate joiningDate, String mobileNo, String email, String designation, String qualification,
            String employmentType, String status) {
        this.staffId = staffId;
        this.employeeCode = employeeCode;
        this.staffName = staffName;
        this.gender = gender;
        this.dob = dob;
        this.joiningDate = joiningDate;
        this.mobileNo = mobileNo;
        this.email = email;
        this.designation = designation;
        this.qualification = qualification;
        this.employmentType = employmentType;
        this.status = status;
    }
    public Long getStaffId() {
        return staffId;
    }
    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }
    public String getEmployeeCode() {
        return employeeCode;
    }
    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }
    public String getStaffName() {
        return staffName;
    }
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public LocalDate getJoiningDate() {
        return joiningDate;
    }
    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }
    public String getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getQualification() {
        return qualification;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    public String getEmploymentType() {
        return employmentType;
    }
    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
    



}
