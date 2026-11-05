package com.pvm.school.service;

import java.util.List;
import com.pvm.school.model.Guardian;

public interface GuardianService {

    Guardian saveGuardian(Guardian guardian);

    List<Guardian> getAllGuardians();

    Guardian getGuardianById(Long id);

    Guardian updateGuardian(Long id, Guardian guardian);

    void deleteGuardian(Long id);
}