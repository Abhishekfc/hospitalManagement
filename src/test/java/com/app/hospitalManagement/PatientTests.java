package com.app.hospitalManagement;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

import com.app.hospitalManagement.entity.Patient;
import com.app.hospitalManagement.repository.PatientRepository;

@SpringBootTest
public class PatientTests {

    @Autowired
    private  PatientRepository patientRepository ;

    @Test
    public void testPatientRepository(){
        List<Patient> patientList = patientRepository.findAll();
        System.out.println(patientList);
    }
    
}
