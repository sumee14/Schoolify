package com.pvm.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pvm.school.model.Guardian;
import com.pvm.school.service.GuardianService;

@RestController
@RequestMapping("/api/guardians")
public class GuardianController {

    @Autowired
    private GuardianService guardianService;

    // 1. Save Guardian
    @PostMapping
    public ResponseEntity<Guardian> saveGuardian(@RequestBody Guardian guardian) {
        Guardian savedGuardian = guardianService.saveGuardian(guardian);
        return new ResponseEntity<>(savedGuardian, HttpStatus.CREATED);
    }

    // 2. Get All Guardians
    @GetMapping
    public ResponseEntity<List<Guardian>> getAllGuardians() {
        return ResponseEntity.ok(guardianService.getAllGuardians());
    }

    // 3. Get Guardian By ID
    @GetMapping("/{id}")
    public ResponseEntity<Guardian> getGuardianById(@PathVariable Long id) {
        return ResponseEntity.ok(guardianService.getGuardianById(id));
    }

    // 4. Update Guardian
    @PutMapping("/{id}")
    public ResponseEntity<Guardian> updateGuardian(
            @PathVariable Long id,
            @RequestBody Guardian guardian) {

        Guardian updatedGuardian = guardianService.updateGuardian(id, guardian);
        return ResponseEntity.ok(updatedGuardian);
    }

    // 5. Delete Guardian
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGuardian(@PathVariable Long id) {
        guardianService.deleteGuardian(id);
        return ResponseEntity.noContent().build();
    }
}