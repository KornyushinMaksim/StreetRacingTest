package org.maks.model.car;

import org.maks.model.driver.Driver;

public class Car {
    private Engine engine;
    private Transmissoin transmission;
    private Suspension suspension;
    private Wheel wheel;
    private Body body;
    private Driver driver;


    public Car() {
//        this.engine = engine;
//        this.transmission = transmission;
//        this.suspension = suspension;
//        this.wheel = wheel;
//        this.body = body;
//        this.driver = driver;

    }

    public Car(Engine engine, Transmissoin transmission, Suspension suspension, Wheel wheel, Body body, Driver driver) {
        this.engine = engine;
        this.transmission = transmission;
        this.suspension = suspension;
        this.wheel = wheel;
        this.body = body;
        this.driver = driver;
    }
}
