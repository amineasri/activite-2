package com.example.medecin.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class RDV {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Date date;
    @Enumerated(EnumType.STRING)
    private  StatusRDV statusRDV;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private  Medecin medecin;
    @OneToOne(mappedBy = "rdv",fetch = FetchType.LAZY)
    private  Consultation consultation;
}
