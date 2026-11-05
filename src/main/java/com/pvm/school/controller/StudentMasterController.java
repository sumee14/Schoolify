package com.pvm.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pvm.school.model.StudentMaster;
import com.pvm.school.service.StudentMasterService;

@RestController
@RequestMapping("/api/students")
public class StudentMasterController {

    @Autowired
    private StudentMasterService studentMasterService;

    // 1. Save StudentMaster
    @PostMapping
    public ResponseEntity<StudentMaster> saveStudentMaster(
            @RequestBody StudentMaster studentMaster) {

        StudentMaster savedStudentMaster =
                studentMasterService.saveStudent(studentMaster);

        return new ResponseEntity<>(
                savedStudentMaster, HttpStatus.CREATED);
    }

    // 2. Get All StudentMasters
    @GetMapping
    public ResponseEntity<List<StudentMaster>> getAllStudentMasters() {

        return ResponseEntity.ok(
                studentMasterService.getAllStudents());
    }

    // 3. Get StudentMaster By ID
    @GetMapping("/{id}")
    public ResponseEntity<StudentMaster> getStudentMasterById(
            @PathVariable Long id) {

        return ResponseEntity.ok(
                studentMasterService.getStudentById(id));
    }

    // 4. Get StudentMaster By Admission Number
    @GetMapping("/admission/{admissionNo}")
    public ResponseEntity<StudentMaster> getStudentMasterByAdmissionNo(
            @PathVariable String admissionNo) {

        return ResponseEntity.ok(
                studentMasterService.getStudentByAdmissionNo(admissionNo));
    }

    // 5. Update StudentMaster
    @PutMapping("/{id}")
    public ResponseEntity<StudentMaster> updateStudentMaster(
            @PathVariable Long id,
            @RequestBody StudentMaster studentMaster) {

        StudentMaster updatedStudentMaster =
                studentMasterService.updateStudent(id, studentMaster);

        return ResponseEntity.ok(updatedStudentMaster);
    }

    // 6. Delete StudentMaster
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudentMaster(
            @PathVariable Long id) {

        studentMasterService.deleteStudent(id);

        return ResponseEntity.noContent().build();
    }
}