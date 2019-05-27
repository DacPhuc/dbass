package com.assignment2.group4.DAO;


import com.assignment2.group4.Entity.Outpatient;
import com.assignment2.group4.Entity.Patient;

import java.util.List;

public interface PatientDAO {
    List<Patient> getAllPatient();
}
