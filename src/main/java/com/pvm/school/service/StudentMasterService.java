package com.pvm.school.service;

import java.util.List;

import com.pvm.school.model.StudentMaster;

public interface StudentMasterService {

    // Register new student
    StudentMaster saveStudent(StudentMaster student);

    // Get all students
    List<StudentMaster> getAllStudents();

    // Get student by ID
    StudentMaster getStudentById(Long id);

    // Get student by admission number
    StudentMaster getStudentByAdmissionNo(String admissionNo);

    // Update student details
    StudentMaster updateStudent(Long id, StudentMaster student);

    // Delete student
    void deleteStudent(Long id);
}