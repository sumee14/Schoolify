package com.pvm.school.service;

import java.util.List;

import com.pvm.school.dto.StudentGuardianRequest;
import com.pvm.school.model.StudentGuardian;

public interface StudentGuardianService {

    // 1. Assign Guardian to Student
    StudentGuardian saveStudentGuardian(StudentGuardianRequest request);

    // 2. Get All Student-Guardian Mappings
    List<StudentGuardian> getAllStudentGuardians();

    // 3. Get Mapping By ID
    StudentGuardian getStudentGuardianById(Long id);

    // 4. Get All Guardians of a Student
    List<StudentGuardian> getGuardiansByStudentId(Long studentId);

    // 5. Get All Students of a Guardian
    List<StudentGuardian> getStudentsByGuardianId(Long guardianId);

    // 6. Update Student-Guardian Mapping
    StudentGuardian updateStudentGuardian(Long id, StudentGuardianRequest request);

    // 7. Delete Student-Guardian Mapping
    void deleteStudentGuardian(Long id);
}