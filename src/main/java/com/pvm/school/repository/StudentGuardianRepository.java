package com.pvm.school.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pvm.school.model.StudentGuardian;

@Repository
public interface StudentGuardianRepository extends JpaRepository<StudentGuardian, Long> {

    // Find all guardians associated with a student
    List<StudentGuardian> findByStudentMaster_StudentId(Long studentId);

    // Find all students associated with a guardian
    List<StudentGuardian> findByGuardian_GuardianId(Long guardianId);

}