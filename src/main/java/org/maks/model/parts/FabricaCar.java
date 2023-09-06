package org.maks.model.parts;

import org.maks.model.car.*;

public class FabricaCar {

    public Car toyota(){
        Engine engine = new Engine("1gz-ge", 5000, 280);
        Body body = new Body("jzx-101", 30000, 1700);
        Wheel wheel = new Wheel("toyo", 2500);
        Transmissoin transmissoin = new Transmissoin("apexi", 4300);
        Suspension suspension = new Suspension("tein", 3200);
        Car toyota = new Car(body, engine, suspension, transmissoin, wheel, "Toyota");
        return toyota;
    }
}
