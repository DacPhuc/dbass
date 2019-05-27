package com.assignment2.group4.Entity;

public class Department {
    private int DID;
    private String DTitle;
    private Employee employee;

    public Department() {
    }

    public Department(int DID, String DTitle, Employee employee) {
        this.DID = DID;
        this.DTitle = DTitle;
        this.employee = employee;
    }

    public int getDID() {
        return DID;
    }

    public void setDID(int DID) {
        this.DID = DID;
    }

    public String getDTitle() {
        return DTitle;
    }

    public void setDTitle(String DTitle) {
        this.DTitle = DTitle;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Department{" +
                "DID=" + DID +
                ", DTitle='" + DTitle + '\'' +
                ", employee=" + employee +
                '}';
    }
}
