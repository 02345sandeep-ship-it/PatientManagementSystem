package com.example.PatientManagementSystem.Repository;

import com.example.PatientManagementSystem.Entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<PatientEntity,Long> {

}
