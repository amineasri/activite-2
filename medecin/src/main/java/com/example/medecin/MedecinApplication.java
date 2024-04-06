package com.example.medecin;

import com.example.medecin.entities.Medecin;
import com.example.medecin.entities.Patient;
import com.example.medecin.repo.MedecinRepo;
import com.example.medecin.repo.PatientRepo;
import com.example.medecin.service.IHopitalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class MedecinApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedecinApplication.class, args);
    }
    @Bean
    CommandLineRunner start(IHopitalService iHopitalService){

        return args -> {
            iHopitalService.savePatient(new Patient(null,"SOUFIANE",new Date(),false,null));
            iHopitalService.saveMedecin(new Medecin(null,"merouane","aaa@gmail.com","generaliste",null));

        };

    }

}
