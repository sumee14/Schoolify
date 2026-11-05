package com.pvm.school.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pvm.school.model.StudentMaster;
import com.pvm.school.repository.StudentRepository;
import com.pvm.school.service.StudentMasterService;

@Service
public class StudentServiceImpl implements StudentMasterService {

    @Autowired
    private StudentRepository studentRepository;

    // 1. Save Student
    @Override
    public StudentMaster saveStudent(StudentMaster student) {

        if (studentRepository.existsByAdmissionNo(student.getAdmissionNo())) {
            throw new RuntimeException("Admission number already exists!");
        }

        return studentRepository.save(student);
    }

    // 2. Get All Students
    @Override
    public List<StudentMaster> getAllStudents() {
        return studentRepository.findAll();
    }

    // 3. Get Student By ID
    @Override
    public StudentMaster getStudentById(Long id) {

        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(
                        "Student not found with ID: " + id));
    }

    // 4. Get Student By Admission Number
    @Override
    public StudentMaster getStudentByAdmissionNo(String admissionNo) {

        StudentMaster student = studentRepository.findByAdmissionNo(admissionNo);

        if (student == null) {
            throw new RuntimeException(
                    "Student not found with Admission No: " + admissionNo);
        }

        return student;
    }

    // 5. Update Student
    @Override
    public StudentMaster updateStudent(Long id, StudentMaster student) {

        StudentMaster existingStudent = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(
                        "Student not found with ID: " + id));

        // Check duplicate admission number
        if (!existingStudent.getAdmissionNo().equals(student.getAdmissionNo())
                && studentRepository.existsByAdmissionNo(student.getAdmissionNo())) {

            throw new RuntimeException("Admission number already exists!");
        }

        existingStudent.setAdmissionNo(student.getAdmissionNo());
        existingStudent.setName(student.getName());
        existingStudent.setGender(student.getGender());
        existingStudent.setBirthDate(student.getBirthDate());
        existingStudent.setAdmissionDate(student.getAdmissionDate());
        existingStudent.setReligion(student.getReligion());
        existingStudent.setCaste(student.getCaste());
        existingStudent.setCategory(student.getCategory());
        existingStudent.setAdhaarNo(student.getAdhaarNo());
        existingStudent.setStatus(student.getStatus());

        return studentRepository.save(existingStudent);
    }

    // 6. Delete Student
    @Override
    public void deleteStudent(Long id) {

        StudentMaster student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(
                        "Student not found with ID: " + id));

        studentRepository.delete(student);
    }
}