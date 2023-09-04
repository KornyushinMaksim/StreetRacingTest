package org.maks.model.car;
import org.maks.model.parts.Parts;

import java.util.Arrays;

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
        this.name = "subaru";
    }

    public Car(Body body, Engine engine, Suspension suspension, Transmissoin transmissoin, Wheel wheel, String name) {
        car = new Parts[5];
        car[0] =body;
        car[1] = engine;
        car[2] = suspension;
        car[3] = transmissoin;
        car[4] = wheel;
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nname car = " + name + Arrays.toString(car);
    }
}
