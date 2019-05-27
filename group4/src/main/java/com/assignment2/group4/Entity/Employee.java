package com.assignment2.group4.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Employee {
    private String EID;
    private String EFname;
    private String ELname;
    private Date EDoB;
    private String EGender;
    private String ESpeciality;
    private String EAddress;
    private Date EStartDate;
    private Department department;
    private List<EMP_Phone> phones;

    public Employee(String EFname, String ELname, Date EDoB, String EGender, String ESpeciality, String EAddress, Date EStartDate, Department department) {
        this.EFname = EFname;
        this.ELname = ELname;
        this.EDoB = EDoB;
        this.EGender = EGender;
        this.ESpeciality = ESpeciality;
        this.EAddress = EAddress;
        this.EStartDate = EStartDate;
        this.department = department;
    }

    public Employee() {
    }

    public String getEID() {
        return EID;
    }

    public void setEID(String EID) {
        this.EID = EID;
    }

    public String getEFname() {
        return EFname;
    }

    public void setEFname(String EFname) {
        this.EFname = EFname;
    }

    public String getELname() {
        return ELname;
    }

    public void setELname(String ELname) {
        this.ELname = ELname;
    }

    public Date getEDoB() {
        return EDoB;
    }

    public void setEDoB(Date EDoB) {
        this.EDoB = EDoB;
    }

    public String getEGender() {
        return EGender;
    }

    public void setEGender(String EGender) {
        this.EGender = EGender;
    }

    public String getESpeciality() {
        return ESpeciality;
    }

    public void setESpeciality(String ESpeciality) {
        this.ESpeciality = ESpeciality;
    }

    public String getEAddress() {
        return EAddress;
    }

    public void setEAddress(String EAddress) {
        this.EAddress = EAddress;
    }

    public Date getEStartDate() {
        return EStartDate;
    }

    public void setEStartDate(Date EStartDate) {
        this.EStartDate = EStartDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<EMP_Phone> getPhones() {
        return phones;
    }

    public void addPhone(String number){
        if (phones == null){
            phones = new ArrayList<>();
        }
        EMP_Phone emp_phone = new EMP_Phone();
        emp_phone.setEmployee(this);
        emp_phone.setEPhone(number);
        phones.add(emp_phone);
    }
}
