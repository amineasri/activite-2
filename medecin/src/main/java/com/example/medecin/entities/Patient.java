package com.example.medecin.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Patient {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String nom;

 @Temporal(TemporalType.DATE)
 private Date naissance;

 private boolean malade;

 @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY)
 private Collection<RDV> rdvs;

 public Patient(Long id, String nom, Date naissance, boolean malade, Collection<RDV> rdvs) {
  this.id = id;
  this.nom = nom;
  this.naissance = naissance;
  this.malade = malade;
  this.rdvs = rdvs;
 }
}
