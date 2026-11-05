package com.pvm.school.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class StudentMaster {
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String admissionNo;
    private String name;
    private String gender;
    private LocalDate birthDate;
    private LocalDate admissionDate;
    private String religion;
    private String caste;
    private String category;
    private String adhaarNo;
    private String status;
    public StudentMaster() {
    }
    public StudentMaster(Long studentId, String admissionNo, String name, String gender, LocalDate birthDate,
            LocalDate admissionDate, String religion, String caste, String category, String adhaarNo, String status) {
        this.studentId = studentId;
        this.admissionNo = admissionNo;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.admissionDate = admissionDate;
        this.religion = religion;
        this.caste = caste;
        this.category = category;
        this.adhaarNo = adhaarNo;
        this.status = status;
    }
    public Long getStudentId() {
        return studentId;
    }
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
    public String getAdmissionNo() {
        return admissionNo;
    }
    public void setAdmissionNo(String admissionNo) {
        this.admissionNo = admissionNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public LocalDate getAdmissionDate() {
        return admissionDate;
    }
    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }
    public String getReligion() {
        return religion;
    }
    public void setReligion(String religion) {
        this.religion = religion;
    }
    public String getCaste() {
        return caste;
    }
    public void setCaste(String caste) {
        this.caste = caste;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getAdhaarNo() {
        return adhaarNo;
    }
    public void setAdhaarNo(String adhaarNo) {
        this.adhaarNo = adhaarNo;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

}
