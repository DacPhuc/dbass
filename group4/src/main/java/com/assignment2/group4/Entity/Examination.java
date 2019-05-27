package com.assignment2.group4.Entity;

import java.util.Date;

public class Examination {
    private Doctor doctor;
    private Outpatient outpatient;
    private String ExID;
    private Date ExDate;
    private double ExFee;
    private String ExDiagnosis;
    private Date ExSencondExaminationDate;

    public Examination(Doctor doctor, Outpatient outpatient, Date exDate, double exFee, String exDiagnosis, Date exSencondExaminationDate) {
        this.doctor = doctor;
        this.outpatient = outpatient;
        ExDate = exDate;
        ExFee = exFee;
        ExDiagnosis = exDiagnosis;
        ExSencondExaminationDate = exSencondExaminationDate;
    }

    public Examination() {
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Outpatient getOutpatient() {
        return outpatient;
    }

    public void setOutpatient(Outpatient outpatient) {
        this.outpatient = outpatient;
    }

    public String getExID() {
        return ExID;
    }

    public void setExID(String exID) {
        ExID = exID;
    }

    public Date getExDate() {
        return ExDate;
    }

    public void setExDate(Date exDate) {
        ExDate = exDate;
    }

    public double getExFee() {
        return ExFee;
    }

    public void setExFee(double exFee) {
        ExFee = exFee;
    }

    public String getExDiagnosis() {
        return ExDiagnosis;
    }

    public void setExDiagnosis(String exDiagnosis) {
        ExDiagnosis = exDiagnosis;
    }

    public Date getExSencondExaminationDate() {
        return ExSencondExaminationDate;
    }

    public void setExSencondExaminationDate(Date exSencondExaminationDate) {
        ExSencondExaminationDate = exSencondExaminationDate;
    }
}
