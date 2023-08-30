package org.maks.model.car;

public class Wheel {
    private String name;
    private int level;
    private int wear;
    private int index;

    public Wheel() {
        this.name = "Continentale";
        this.level = 2;
        this.wear = 1;
        this.index = 100;
    }

    public Wheel(String name, int level, int wear, int index) {
        this.name = name;
        this.level = level;
        this.wear = wear;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getWear() {
        return wear;
    }

    public void setWear(int wear) {
        this.wear = wear;
    }
}
