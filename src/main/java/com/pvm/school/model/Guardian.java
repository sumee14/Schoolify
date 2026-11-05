package com.pvm.school.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Guardian {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long guardianId;
    private String guardianName;
    private String gender;
    private String mobileNo;
    private String alternateMobileNo;
    private String occupation;
    private String address;
    private String city;
    private String adhaarNo;
    private String status;
    public Guardian() {
    }
    public Guardian(Long guardianId, String guardianName, String gender, String mobileNo, String alternateMobileNo,
            String occupation, String address, String city, String adhaarNo, String status) {
        this.guardianId = guardianId;
        this.guardianName = guardianName;
        this.gender = gender;
        this.mobileNo = mobileNo;
        this.alternateMobileNo = alternateMobileNo;
        this.occupation = occupation;
        this.address = address;
        this.city = city;
        this.adhaarNo = adhaarNo;
        this.status = status;
    }
    public Long getGuardianId() {
        return guardianId;
    }
    public void setGuardianId(Long guardianId) {
        this.guardianId = guardianId;
    }
    public String getGuardianName() {
        return guardianName;
    }
    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public String getAlternateMobileNo() {
        return alternateMobileNo;
    }
    public void setAlternateMobileNo(String alternateMobileNo) {
        this.alternateMobileNo = alternateMobileNo;
    }
    public String getOccupation() {
        return occupation;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
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
