package com.pvm.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pvm.school.dto.StudentGuardianRequest;
import com.pvm.school.model.StudentGuardian;
import com.pvm.school.service.StudentGuardianService;

@RestController
@RequestMapping("/api/student-guardians")
public class StudentGuardianController {

    @Autowired
    private StudentGuardianService studentGuardianService;

    // 1. Assign Guardian to Student
    @PostMapping
    public ResponseEntity<StudentGuardian> saveStudentGuardian(
            @RequestBody StudentGuardianRequest request) {

        StudentGuardian savedMapping =
                studentGuardianService.saveStudentGuardian(request);

        return new ResponseEntity<>(savedMapping, HttpStatus.CREATED);
    }

    // 2. Get All Student-Guardian Mappings
    @GetMapping
    public ResponseEntity<List<StudentGuardian>> getAllStudentGuardians() {

        return ResponseEntity.ok(
                studentGuardianService.getAllStudentGuardians());
    }

    // 3. Get Mapping By ID
    @GetMapping("/{id}")
    public ResponseEntity<StudentGuardian> getStudentGuardianById(
            @PathVariable Long id) {

        return ResponseEntity.ok(
                studentGuardianService.getStudentGuardianById(id));
    }

    // 4. Get Guardians By Student ID
    @GetMapping("/student/{studentId}")
    public ResponseEntity<List<StudentGuardian>> getGuardiansByStudentId(
            @PathVariable Long studentId) {

        return ResponseEntity.ok(
                studentGuardianService.getGuardiansByStudentId(studentId));
    }

    // 5. Get Students By Guardian ID
    @GetMapping("/guardian/{guardianId}")
    public ResponseEntity<List<StudentGuardian>> getStudentsByGuardianId(
            @PathVariable Long guardianId) {

        return ResponseEntity.ok(
                studentGuardianService.getStudentsByGuardianId(guardianId));
    }

    // 6. Update Student-Guardian Mapping
    @PutMapping("/{id}")
    public ResponseEntity<StudentGuardian> updateStudentGuardian(
            @PathVariable Long id,
            @RequestBody StudentGuardianRequest request) {

        StudentGuardian updatedMapping =
                studentGuardianService.updateStudentGuardian(id, request);

        return ResponseEntity.ok(updatedMapping);
    }

    // 7. Delete Student-Guardian Mapping
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudentGuardian(
            @PathVariable Long id) {

        studentGuardianService.deleteStudentGuardian(id);

        return ResponseEntity.noContent().build();
    }
}