package com.app.hospitalManagement.service;

import com.app.hospitalManagement.entity.Insurance;
import com.app.hospitalManagement.entity.Patient;
import com.app.hospitalManagement.repository.InsuranceRepository;
import com.app.hospitalManagement.repository.PatientRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InsuranceService {

    private final InsuranceRepository insuranceRepository;
    private final PatientRepository patientRepository;

    @Transactional
    public Patient assignInsuranceToPatient(Insurance insurance, Long patientId){
        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() -> new EntityNotFoundException("Patient is not found with Id " + patientId));

        patient.setInsurance(insurance);

        insurance.setPatient(patient); //bidirectional consistency maintenance

        return patient;
    }

    @Transactional
    public Patient disaccociateInsuranceFromPatient(Long patientId){
        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() -> new EntityNotFoundException("Patient is not found with Id " + patientId));

        patient.setInsurance(null);
        return patient;
    }
}
