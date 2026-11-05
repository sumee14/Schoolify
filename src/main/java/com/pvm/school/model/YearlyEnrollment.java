package com.pvm.school.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity 
public class YearlyEnrollment {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long yearlyEnrollmentId;

    @ManyToOne
    @JoinColumn(name = "studentId")
    private StudentMaster studentMaster;
    
    @ManyToOne
    @JoinColumn(name = "classSectionId")
    private ClassSection classSection;
    
    @ManyToOne
    @JoinColumn(name = "sessionId")
    private Session session;

    private String rollNo;
    private LocalDate admissionDate;
    private String status;
    public YearlyEnrollment() {
    }
    public YearlyEnrollment(Long yearlyEnrollmentId, StudentMaster studentMaster, ClassSection classSection,
            Session session, String rollNo, LocalDate admissionDate, String status) {
        this.yearlyEnrollmentId = yearlyEnrollmentId;
        this.studentMaster = studentMaster;
        this.classSection = classSection;
        this.session = session;
        this.rollNo = rollNo;
        this.admissionDate = admissionDate;
        this.status = status;
    }
    public Long getYearlyEnrollmentId() {
        return yearlyEnrollmentId;
    }
    public void setYearlyEnrollmentId(Long yearlyEnrollmentId) {
        this.yearlyEnrollmentId = yearlyEnrollmentId;
    }
    public StudentMaster getStudentMaster() {
        return studentMaster;
    }
    public void setStudentMaster(StudentMaster studentMaster) {
        this.studentMaster = studentMaster;
    }
    public ClassSection getClassSection() {
        return classSection;
    }
    public void setClassSection(ClassSection classSection) {
        this.classSection = classSection;
    }
    public Session getSession() {
        return session;
    }
    public void setSession(Session session) {
        this.session = session;
    }
    public String getRollNo() {
        return rollNo;
    }
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    public LocalDate getAdmissionDate() {
        return admissionDate;
    }
    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
}
