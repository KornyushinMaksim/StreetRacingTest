package org.maks.model.car;

public class Engine {
    private String name;
    private int power;

//    private int nominalPower;
    private int wear;

    public Engine() {
        this.name = "2jz-ge";
        this.power = 220;
        this.wear = 0;
//        this.nominalPower = this.power;
    }

    public Engine(String name, int power, int wear) {
        this.name = name;
        this.power = power;
        this.wear = wear;
//        this.nominalPower = power;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getPower() {
        return power;
    }

//    public void setPower(int power) {
//        this.power = power;
//    }

    public int getWear() {
        return wear;
    }

    public void setWear(int wear) {
        this.wear = wear;
    }

//    public int getNominalPower() {
//        return nominalPower;
//    }
//
//    public void setNominalPower(int nominalPower) {
//        this.nominalPower = nominalPower;
//    }



    public int wearEngine(){
        int res = this.power - wear;
        this.wear += this.power / 10;
        return res;
    }
}
