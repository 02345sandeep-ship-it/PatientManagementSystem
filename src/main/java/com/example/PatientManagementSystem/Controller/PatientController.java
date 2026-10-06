package com.example.PatientManagementSystem.Controller;


import com.example.PatientManagementSystem.Entity.PatientEntity;
import com.example.PatientManagementSystem.Service.PatientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/patient")
public class PatientController {

    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping("/create")
    public ResponseEntity <PatientEntity> creatPatient(@RequestBody PatientEntity patientEntity)
    {
        PatientEntity createdPatient=patientService.createPatient(patientEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPatient);
    }


}
