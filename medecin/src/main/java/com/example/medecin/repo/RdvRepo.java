package com.example.medecin.repo;

import com.example.medecin.entities.Patient;
import com.example.medecin.entities.RDV;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RdvRepo extends JpaRepository< RDV,Long> {
}
