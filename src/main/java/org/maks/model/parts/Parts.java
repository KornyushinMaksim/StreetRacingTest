package org.maks.model.parts;

abstract public class Parts {
    protected String name;
    protected int cash;
    protected float wear;

    public Parts(String name, int cash) {
        this.name = name;
        this.cash = cash;
        this.wear = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public float getWear() {
        return wear;
    }

    public void setWear(float wear) {
        this.wear = wear;
    }

    public float resParts() {
        return 0f;
    }
}
