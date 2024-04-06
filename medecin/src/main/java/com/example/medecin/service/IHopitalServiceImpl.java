package com.example.medecin.service;

import com.example.medecin.entities.Consultation;
import com.example.medecin.entities.Medecin;
import com.example.medecin.entities.Patient;
import com.example.medecin.entities.RDV;
import com.example.medecin.repo.ConsultationRepo;
import com.example.medecin.repo.MedecinRepo;
import com.example.medecin.repo.PatientRepo;
import com.example.medecin.repo.RdvRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class IHopitalServiceImpl implements IHopitalService {
    private PatientRepo patientRepo;
    private MedecinRepo medecinRepo;
    private RdvRepo rdvRepo;
    private ConsultationRepo consultationRepo;

    public IHopitalServiceImpl(PatientRepo patientRepo, MedecinRepo medecinRepo, RdvRepo rdvRepo, ConsultationRepo consultationRepo) {
        this.patientRepo = patientRepo;
        this.medecinRepo = medecinRepo;
        this.rdvRepo = rdvRepo;
        this.consultationRepo = consultationRepo;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepo.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepo.save(medecin);
    }

    @Override
    public RDV saveRdv(RDV rdv) {
        return rdvRepo.save(rdv);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepo.save(consultation);
    }
}
