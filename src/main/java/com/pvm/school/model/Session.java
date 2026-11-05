package com.pvm.school.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Session{
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sessionId;
    private String sessionYear;
    private LocalDate startDate;
    private LocalDate endDate;
    private Boolean isCurrent;
    public Session() {
    }
    public Session(Long sessionId, String sessionYear, LocalDate startDate, LocalDate endDate, Boolean isCurrent) {
        this.sessionId = sessionId;
        this.sessionYear = sessionYear;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isCurrent = isCurrent;
    }
    public Long getSessionId() {
        return sessionId;
    }
    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }
    public String getSessionYear() {
        return sessionYear;
    }
    public void setSessionYear(String sessionYear) {
        this.sessionYear = sessionYear;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    public Boolean getIsCurrent() {
        return isCurrent;
    }
    public void setIsCurrent(Boolean isCurrent) {
        this.isCurrent = isCurrent;
    }
    
}
