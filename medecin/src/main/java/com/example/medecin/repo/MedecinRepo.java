package com.example.medecin.repo;

import com.example.medecin.entities.Medecin;
import com.example.medecin.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepo extends JpaRepository<Medecin,Long> {
Medecin findByNom(String nom);
}
