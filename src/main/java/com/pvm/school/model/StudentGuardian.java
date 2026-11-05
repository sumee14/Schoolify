package com.pvm.school.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity 
public class StudentGuardian {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentGuardianId;
    
    @ManyToOne
    @JoinColumn(name = "studentId")
    private StudentMaster studentMaster;

    @ManyToOne
    @JoinColumn(name = "guardianId")
    private Guardian guardian;

    private String relationship;
    private String guardianType;
    private String isPrimary;
    public StudentGuardian() {
    }
    public StudentGuardian(Long studentGuardianId, StudentMaster studentMaster, Guardian guardian, String relationship,
            String guardianType, String isPrimary) {
        this.studentGuardianId = studentGuardianId;
        this.studentMaster = studentMaster;
        this.guardian = guardian;
        this.relationship = relationship;
        this.guardianType = guardianType;
        this.isPrimary = isPrimary;
    }
    public Long getStudentGuardianId() {
        return studentGuardianId;
    }
    public void setStudentGuardianId(Long studentGuardianId) {
        this.studentGuardianId = studentGuardianId;
    }
    public StudentMaster getStudentMaster() {
        return studentMaster;
    }
    public void setStudentMaster(StudentMaster studentMaster) {
        this.studentMaster = studentMaster;
    }
    public Guardian getGuardian() {
        return guardian;
    }
    public void setGuardian(Guardian guardian) {
        this.guardian = guardian;
    }
    public String getRelationship() {
        return relationship;
    }
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
    public String getGuardianType() {
        return guardianType;
    }
    public void setGuardianType(String guardianType) {
        this.guardianType = guardianType;
    }
    public String getIsPrimary() {
        return isPrimary;
    }
    public void setIsPrimary(String isPrimary) {
        this.isPrimary = isPrimary;
    }


}
