package org.maks.model.car;

public class Body {
    private int massa;

    public Body() {
        this.massa = 1300;
    }

    public Body(int massa) {
        this.massa = massa;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
}
