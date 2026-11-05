package com.pvm.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pvm.school.model.Guardian;

@Repository
public interface GuardianRepository extends JpaRepository<Guardian, Long> {

}