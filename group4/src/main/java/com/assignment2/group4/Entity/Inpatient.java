package com.assignment2.group4.Entity;


import java.util.Date;

public class Inpatient extends Patient{
    private Date PAdmissionDate;
    private Date PDischargeDate;
    private String PDiagnosis;
    private String PSickroom;
    private double PFee;
    private Doctor doctor;
    private Nurse nurse;

    public Inpatient(String PFName, String PLName, Date PDoB, String PGender, String PPhone, String PAddress) {
        super(PFName, PLName, PDoB, PGender, PPhone, PAddress);
    }

    public Inpatient() {
    }

    public Date getPAdmissionDate() {
        return PAdmissionDate;
    }

    public void setPAdmissionDate(Date PAdmissionDate) {
        this.PAdmissionDate = PAdmissionDate;
    }

    public Date getPDischargeDate() {
        return PDischargeDate;
    }

    public void setPDischargeDate(Date PDischargeDate) {
        this.PDischargeDate = PDischargeDate;
    }

    public String getPDiagnosis() {
        return PDiagnosis;
    }

    public void setPDiagnosis(String PDiagnosis) {
        this.PDiagnosis = PDiagnosis;
    }

    public String getPSickroom() {
        return PSickroom;
    }

    public void setPSickroom(String PSickroom) {
        this.PSickroom = PSickroom;
    }

    public double getPFee() {
        return PFee;
    }

    public void setPFee(double PFee) {
        this.PFee = PFee;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }
}
