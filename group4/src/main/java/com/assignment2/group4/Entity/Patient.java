package com.assignment2.group4.Entity;

import java.util.Date;

public class Patient {
    private String PID;
    private String PFName;
    private String PLName;
    private Date PDoB;
    private String PGender;
    private String PPhone;
    private String PAddress;

    public Patient(String PFName, String PLName, Date PDoB, String PGender, String PPhone, String PAddress) {
        this.PFName = PFName;
        this.PLName = PLName;
        this.PDoB = PDoB;
        this.PGender = PGender;
        this.PPhone = PPhone;
        this.PAddress = PAddress;
    }

    public Patient() {
    }

    public String getPID() {
        return PID;
    }

    public void setPID(String PID) {
        this.PID = PID;
    }

    public String getPFName() {
        return PFName;
    }

    public void setPFName(String PFName) {
        this.PFName = PFName;
    }

    public String getPLName() {
        return PLName;
    }

    public void setPLName(String PLName) {
        this.PLName = PLName;
    }

    public Date getPDoB() {
        return PDoB;
    }

    public void setPDoB(Date PDoB) {
        this.PDoB = PDoB;
    }

    public String getPGender() {
        return PGender;
    }

    public void setPGender(String PGender) {
        this.PGender = PGender;
    }

    public String getPPhone() {
        return PPhone;
    }

    public void setPPhone(String PPhone) {
        this.PPhone = PPhone;
    }

    public String getPAddress() {
        return PAddress;
    }

    public void setPAddress(String PAddress) {
        this.PAddress = PAddress;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "PID='" + PID + '\'' +
                ", PFName='" + PFName + '\'' +
                ", PLName='" + PLName + '\'' +
                ", PDoB=" + PDoB +
                ", PGender='" + PGender + '\'' +
                ", PPhone='" + PPhone + '\'' +
                ", PAddress='" + PAddress + '\'' +
                '}';
    }
}
