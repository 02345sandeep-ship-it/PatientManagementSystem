package com.example.PatientManagementSystem.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PatientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PatientId;

    private String PatientName;
    private int PatientAge;
    private String PatientGender;
    private String PatientDisease;
    private String DoctorName;

    public Long getPatientId() {
        return PatientId;
    }

    public void setPatientId(Long patientId) {
        PatientId = patientId;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String patientName) {
        PatientName = patientName;
    }

    public int getPatientAge() {
        return PatientAge;
    }

    public void setPatientAge(int patientAge) {
        PatientAge = patientAge;
    }

    public String getPatientGender() {
        return PatientGender;
    }

    public void setPatientGender(String patientGender) {
        PatientGender = patientGender;
    }

    public String getPatientDisease() {
        return PatientDisease;
    }

    public void setPatientDisease(String patientDisease) {
        PatientDisease = patientDisease;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String doctorName) {
        DoctorName = doctorName;
    }
}