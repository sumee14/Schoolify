package com.pvm.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pvm.school.model.StudentMaster;

@Repository
public interface StudentRepository extends JpaRepository<StudentMaster, Long> {

    boolean existsByAdmissionNo(String admissionNo);

    StudentMaster findByAdmissionNo(String admissionNo);

}