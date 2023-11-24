package com.example.StudentProject;

public class User {
    private String SName;

    private int SmathM;
    private int SchemM;
    private int SphyM;
    private double percent;
    private long SId;

    public long getSId() {
        return SId;
    }

    public void setSId(long SId) {
        this.SId = SId;
    }

    public User(String SName, int smathM, int schemM, int sphyM, long SId) {
        this.SName = SName;
        this.SmathM = smathM;
        this.SchemM = schemM;
        this.SphyM = sphyM;
        this.percent=(double)(this.SchemM+this.SmathM+this.SphyM)/3.00;
        this.SId=SId;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public int getSmathM() {
        return SmathM;
    }

    public void setSmathM(int smathM) {
        SmathM = smathM;
    }

    public int getSchemM() {
        return SchemM;
    }

    public void setSchemM(int schemM) {
        SchemM = schemM;
    }

    public int getSphyM() {
        return SphyM;
    }

    public void setSphyM(int sphyM) {
        SphyM = sphyM;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "User{" +
                "SName='" + SName + '\'' +
                ", SmathM=" + SmathM +
                ", SchemM=" + SchemM +
                ", SphyM=" + SphyM +
                ", percent=" + percent +
                '}';
    }
}
