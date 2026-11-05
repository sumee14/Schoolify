package com.pvm.school.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity 
public class ClassSection {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY) 
    private Long classSectionId;
    @ManyToOne
    @JoinColumn(name = "classId")
    private StudentClass studentClass;
    @ManyToOne
    @JoinColumn(name = "sectionId")
    private Section section;
    @ManyToOne
    @JoinColumn(name = "sessionId")
    private Session session;
    @ManyToOne
    @JoinColumn(name = "staffId")
    private Staff staff;
    private String capacity;
    private String status;
    public ClassSection() {
    }
    public ClassSection(Long classSectionId, StudentClass studentClass, Section section,
            Session session, Staff staff, String capacity, String status) {
        this.classSectionId = classSectionId;
        this.studentClass = studentClass;
        this.section = section;
        this.session = session;
        this.staff = staff;
        this.capacity = capacity;
        this.status = status;
    }
    public Long getClassSectionId() {
        return classSectionId;
    }
    public void setClassSectionId(Long classSectionId) {
        this.classSectionId = classSectionId;
    }
    public StudentClass getStudentClass() {
        return studentClass;
    }
    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }
    public Section getSection() {
        return section;
    }
    public void setSection(Section section) {
        this.section = section;
    }
    public Session getSession() {
        return session;
    }
    public void setSession(Session session) {
        this.session = session;
    }
    public Staff getStaff() {
        return staff;
    }
    public void setStaff(Staff staff) {
        this.staff = staff;
    }
    public String getCapacity() {
        return capacity;
    }
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
