package com.example.medecin.repo;

import com.example.medecin.entities.Consultation;
import com.example.medecin.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepo extends JpaRepository<Consultation,Long> {
}
