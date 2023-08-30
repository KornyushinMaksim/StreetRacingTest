package org.maks.model.car;

public class Suspension {
    private String name;
    private int hard;
    private int wear;


    public Suspension() {
        this.name = "Tein";
        this.hard = 6;
        this.wear = 1;
    }

    public Suspension(String name, int hard, int wear, int index) {
        this.name = name;
        this.hard = hard;
        this.wear = wear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHard() {
        return hard;
    }

    public void setHard(int hard) {
        this.hard = hard;
    }

    public int getWear() {
        return wear;
    }

    public void setWear(int wear) {
        this.wear = wear;
    }
}
