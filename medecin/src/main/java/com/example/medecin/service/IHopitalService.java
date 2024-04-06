package com.example.medecin.service;

import com.example.medecin.entities.Consultation;
import com.example.medecin.entities.Medecin;
import com.example.medecin.entities.Patient;
import com.example.medecin.entities.RDV;

public interface IHopitalService {
     Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RDV saveRdv(RDV rdv);
    Consultation saveConsultation(Consultation consultation);

}
