package com.example.PatientManagementSystem.Service;

import com.example.PatientManagementSystem.Entity.PatientEntity;
import com.example.PatientManagementSystem.Repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PatientService {

    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public PatientEntity createPatient(PatientEntity patientEntity) {

        PatientEntity patientEntity1=patientRepository.save(patientEntity);
        return patientEntity1;

    }

}
