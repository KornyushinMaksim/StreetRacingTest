package org.maks.model.parts;

abstract public class Parts {
    protected String name;
    protected int cash;
    protected int wear;

    public Parts(String name, int cash, int wear) {
        this.name = name;
        this.cash = cash;
        this.wear = wear;
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

    public int getStateParts() {
        return wear;
    }

    public void setStateParts(int stateParts) {
        this.wear = stateParts;
    }

    @Override
    public String toString() {
        return "\nname = " + name +
                "; cash=" + cash +
                "; nwear=" + wear;
    }
}
