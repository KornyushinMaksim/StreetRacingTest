package org.maks.model.car;
import org.maks.model.parts.Parts;

public class Engine extends Parts {
    private int power;

    public Engine(){
        super("1ft-gt", 4500, 1);
        this.power = 203;
    }

    public Engine(String name, int cash, int wear, int power) {
        super(name, cash, wear);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
