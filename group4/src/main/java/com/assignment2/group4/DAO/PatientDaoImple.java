package com.assignment2.group4.DAO;

import com.assignment2.group4.Entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PatientDaoImple implements PatientDAO{

    @Autowired
    JdbcTemplate jdbcTemplate;

    class PatientMap implements RowMapper<Patient>{
        @Override
        public Patient mapRow(ResultSet resultSet, int i) throws SQLException {
            Patient patient = new Patient();
            patient.setPID(resultSet.getString("PID"));
            patient.setPPhone(resultSet.getString("PPHONE"));
            patient.setPDoB(resultSet.getDate("PDOB"));
            patient.setPAddress(resultSet.getString("PADDRESS"));
            patient.setPLName(resultSet.getString("PLNAME"));
            patient.setPFName(resultSet.getString("PFNAME"));
            patient.setPGender(resultSet.getString("PGENDER"));
            return patient;
        }
    }


    @Override
    public List<Patient> getAllPatient() {
        return jdbcTemplate.query("select * from patient", new PatientMap());
    }

}
