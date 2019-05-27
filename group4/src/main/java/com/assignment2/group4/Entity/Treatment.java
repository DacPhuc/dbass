package com.assignment2.group4.Entity;

import java.util.Date;

public class Treatment {
    private Doctor doctor;
    private Inpatient inpatient;
    private String TrID;
    private Date TrStart;
    private Date TrEnd;
    private String TrResult;

    public Treatment(Doctor doctor, Inpatient inpatient, String trID, Date trStart, Date trEnd, String trResult) {
        this.doctor = doctor;
        this.inpatient = inpatient;
        TrID = trID;
        TrStart = trStart;
        TrEnd = trEnd;
        TrResult = trResult;
    }

    public Treatment() {
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Inpatient getInpatient() {
        return inpatient;
    }

    public void setInpatient(Inpatient inpatient) {
        this.inpatient = inpatient;
    }

    public String getTrID() {
        return TrID;
    }

    public void setTrID(String trID) {
        TrID = trID;
    }

    public Date getTrStart() {
        return TrStart;
    }

    public void setTrStart(Date trStart) {
        TrStart = trStart;
    }

    public Date getTrEnd() {
        return TrEnd;
    }

    public void setTrEnd(Date trEnd) {
        TrEnd = trEnd;
    }

    public String getTrResult() {
        return TrResult;
    }

    public void setTrResult(String trResult) {
        TrResult = trResult;
    }
}
