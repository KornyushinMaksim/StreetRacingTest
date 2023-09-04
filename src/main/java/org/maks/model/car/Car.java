package org.maks.model.car;
import org.maks.model.parts.Parts;

public class Car {
    Parts[] car;
    private String name;

    public Car() {
        car = new Parts[5];
        car[0] = new Body();
        car[1] = new Engine();
        car[2] = new Suspension();
        car[3] = new Transmissoin();
        car[4] = new Wheel();
    }

    public Car(Parts[] car, String name) {
        this.car = car;
        this.name = name;
    }
}
