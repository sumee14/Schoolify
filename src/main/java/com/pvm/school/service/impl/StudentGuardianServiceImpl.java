package com.pvm.school.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pvm.school.dto.StudentGuardianRequest;
import com.pvm.school.model.Guardian;
import com.pvm.school.model.StudentGuardian;
import com.pvm.school.model.StudentMaster;
import com.pvm.school.repository.GuardianRepository;
import com.pvm.school.repository.StudentGuardianRepository;
import com.pvm.school.repository.StudentRepository;
import com.pvm.school.service.StudentGuardianService;

@Service
public class StudentGuardianServiceImpl implements StudentGuardianService {

    @Autowired
    private StudentGuardianRepository studentGuardianRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private GuardianRepository guardianRepository;

    // 1. Assign Guardian to Student
    @Override
    public StudentGuardian saveStudentGuardian(StudentGuardianRequest request) {

        StudentMaster studentMaster = studentRepository.findById(request.getStudentId())
                .orElseThrow(() -> new RuntimeException("Student not found"));

        Guardian guardian = guardianRepository.findById(request.getGuardianId())
                .orElseThrow(() -> new RuntimeException("Guardian not found"));

        StudentGuardian studentGuardian = new StudentGuardian();

        studentGuardian.setStudentMaster(studentMaster);
        studentGuardian.setGuardian(guardian);
        studentGuardian.setRelationship(request.getRelationship());
        studentGuardian.setGuardianType(request.getGuardianType());
        studentGuardian.setIsPrimary(request.getIsPrimary());

        return studentGuardianRepository.save(studentGuardian);
    }

    // 2. Get All Student-Guardian Mappings
    @Override
    public List<StudentGuardian> getAllStudentGuardians() {
        return studentGuardianRepository.findAll();
    }

    // 3. Get Mapping By ID
    @Override
    public StudentGuardian getStudentGuardianById(Long id) {

        return studentGuardianRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student Guardian mapping not found"));
    }

    // 4. Get All Guardians of a Student
    @Override
    public List<StudentGuardian> getGuardiansByStudentId(Long studentId) {

        return studentGuardianRepository.findByStudentMaster_StudentId(studentId);
    }

    // 5. Get All Students of a Guardian
    @Override
    public List<StudentGuardian> getStudentsByGuardianId(Long guardianId) {

        return studentGuardianRepository.findByGuardian_GuardianId(guardianId);
    }

    // 6. Update Student-Guardian Mapping
    @Override
    public StudentGuardian updateStudentGuardian(Long id, StudentGuardianRequest request) {

        StudentGuardian existingMapping = studentGuardianRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Mapping not found"));

        StudentMaster studentMaster = studentRepository.findById(request.getStudentId())
                .orElseThrow(() -> new RuntimeException("Student not found"));

        Guardian guardian = guardianRepository.findById(request.getGuardianId())
                .orElseThrow(() -> new RuntimeException("Guardian not found"));

        existingMapping.setStudentMaster(studentMaster);
        existingMapping.setGuardian(guardian);
        existingMapping.setRelationship(request.getRelationship());
        existingMapping.setGuardianType(request.getGuardianType());
        existingMapping.setIsPrimary(request.getIsPrimary());

        return studentGuardianRepository.save(existingMapping);
    }

    // 7. Delete Student-Guardian Mapping
    @Override
    public void deleteStudentGuardian(Long id) {

        StudentGuardian existingMapping = studentGuardianRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Mapping not found"));

        studentGuardianRepository.delete(existingMapping);
    }
}