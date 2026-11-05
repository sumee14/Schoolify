package com.pvm.school.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class StudentClass {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)     
    private Long studentClassId;
    private String studentClassName;
    private String numericOrder;
    private String status;
    public StudentClass() {
    }
    public StudentClass(Long studentClassId, String studentClassName, String numericOrder, String status) {
        this.studentClassId = studentClassId;
        this.studentClassName = studentClassName;
        this.numericOrder = numericOrder;
        this.status = status;
    }
    public Long getStudentClassId() {
        return studentClassId;
    }
    public void setStudentClassId(Long studentClassId) {
        this.studentClassId = studentClassId;
    }
    public String getStudentClassName() {
        return studentClassName;
    }
    public void setStudentClassName(String studentClassName) {
        this.studentClassName = studentClassName;
    }
    public String getNumericOrder() {
        return numericOrder;
    }
    public void setNumericOrder(String numericOrder) {
        this.numericOrder = numericOrder;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    } 
    


}
