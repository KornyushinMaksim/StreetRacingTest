package org.maks.model.car;

public class Transmissoin {
    private String brend;
    private int wear;       //износ
    private int index;

    public Transmissoin() {
        this.brend = "Apexi";
        this.wear = 1;
        this.index = 100;
    }

    public Transmissoin(String brend, int wear, int index) {
        this.brend = brend;
        this.wear = wear;
        this.index = index;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public int getWear() {
        return wear;
    }

    public void setWear(int wear) {
        this.wear = wear;
    }
}
