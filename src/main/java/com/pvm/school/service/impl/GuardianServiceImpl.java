package com.pvm.school.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pvm.school.model.Guardian;
import com.pvm.school.repository.GuardianRepository;
import com.pvm.school.service.GuardianService;

@Service
public class GuardianServiceImpl implements GuardianService {

    @Autowired
    private GuardianRepository guardianRepository;

    // Save Guardian
    @Override
    public Guardian saveGuardian(Guardian guardian) {
        return guardianRepository.save(guardian);
    }

    // Get All Guardians
    @Override
    public List<Guardian> getAllGuardians() {
        return guardianRepository.findAll();
    }

    // Get Guardian By ID
    @Override
    public Guardian getGuardianById(Long id) {
        return guardianRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Guardian not found with ID: " + id));
    }

    // Update Guardian
    @Override
    public Guardian updateGuardian(Long id, Guardian guardian) {

        Guardian existingGuardian = guardianRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Guardian not found with ID: " + id));

        existingGuardian.setGuardianName(guardian.getGuardianName());
        existingGuardian.setGender(guardian.getGender());
        existingGuardian.setMobileNo(guardian.getMobileNo());
        existingGuardian.setAlternateMobileNo(guardian.getAlternateMobileNo());
        existingGuardian.setOccupation(guardian.getOccupation());
        existingGuardian.setAddress(guardian.getAddress());
        existingGuardian.setCity(guardian.getCity());
        existingGuardian.setAdhaarNo(guardian.getAdhaarNo());
        existingGuardian.setStatus(guardian.getStatus());

        return guardianRepository.save(existingGuardian);
    }

    // Delete Guardian
    @Override
    public void deleteGuardian(Long id) {

        Guardian existingGuardian = guardianRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Guardian not found with ID: " + id));

        guardianRepository.delete(existingGuardian);
    }
}