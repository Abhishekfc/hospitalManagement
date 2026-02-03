package com.app.hospitalManagement;

import com.app.hospitalManagement.dto.BloodGroupCountResponseEntity;
import com.app.hospitalManagement.entity.type.BloodGroupType;
import com.app.hospitalManagement.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import com.app.hospitalManagement.entity.Patient;
import com.app.hospitalManagement.repository.PatientRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

@SpringBootTest
public class PatientTests {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;

    @Test
    public void testPatientRepository() {
        List<Patient> patientList = patientRepository.findAllPatientWithAppointment();
        System.out.println(patientList);

    }

    @Test
    public void testTransactionMethods() {
//        Patient patient = patientService.getPatientById(1L);


//        Patient patient = patientRepository.findByName("Abhishek Sharma");

//        List<Patient> patientList = patientRepository.findByBirthDateOrEmail(LocalDate.of(2004,8,6), "diya@gmail.com");


//        List<Patient> patientList = patientRepository.findByBornAfterDate(LocalDate.of(2003, 8, 7));

        Page<Patient> patientList = patientRepository.findAllPatients(PageRequest.of(0, 2, Sort.by("name")));

        for (Patient patient : patientList) {
            System.out.println(patient);
        }

//        List<Object[]> bloodGroupList = patientRepository.countEachBloodGroupType();
//
//        for(Object[] objects: bloodGroupList){
//            System.out.println(objects[0] + " " + objects[1]);
//        }

//        int rowsUpdated = patientRepository.updateNameWithId("Riya Bansal", 3L);
//        System.out.println(rowsUpdated);

//        List<BloodGroupCountResponseEntity> bloodGroupList = patientRepository.countEachBloodGroupType();
//        for (BloodGroupCountResponseEntity bloodGroupCountResponse : bloodGroupList) {
//            System.out.println(bloodGroupCountResponse);
//        }


    }

}
