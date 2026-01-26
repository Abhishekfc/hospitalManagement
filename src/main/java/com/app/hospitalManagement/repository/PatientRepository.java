package com.app.hospitalManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.hospitalManagement.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
  