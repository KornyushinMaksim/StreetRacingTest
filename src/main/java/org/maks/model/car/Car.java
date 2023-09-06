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

    public float allIndexCar(){
        float res = 0;
        res += this.car[1].resParts();
        res += this.car[2].resParts();
        res += this.car[3].resParts();
        res += this.car[4].resParts();
        return res -= car[0].resParts();
    }

    @Override
    public String toString() {
        return  "\n name car =" + name + Arrays.toString(car) ;
    }

    public String toStringWinner(){
        return name;
    }
}
