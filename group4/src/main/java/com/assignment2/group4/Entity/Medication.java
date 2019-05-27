package com.assignment2.group4.Entity;

public class Medication {
    private String MID;
    private String MName;
    private String MEffects;
    private double MPrice;

    public Medication(String MName, String MEffects, double MPrice) {
        this.MName = MName;
        this.MEffects = MEffects;
        this.MPrice = MPrice;
    }

    public Medication() {
    }

    public String getMID() {
        return MID;
    }

    public void setMID(String MID) {
        this.MID = MID;
    }

    public String getMName() {
        return MName;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public String getMEffects() {
        return MEffects;
    }

    public void setMEffects(String MEffects) {
        this.MEffects = MEffects;
    }

    public double getMPrice() {
        return MPrice;
    }

    public void setMPrice(double MPrice) {
        this.MPrice = MPrice;
    }
}
