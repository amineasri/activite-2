package com.example.medecin.repo;

import com.example.medecin.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient,Long> {
    Patient findByNom(String name);
}
