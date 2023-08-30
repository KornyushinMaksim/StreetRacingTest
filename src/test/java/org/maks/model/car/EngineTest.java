package org.maks.model.car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EngineTest {
    Car car = new Car();
    Engine engine = new Engine();

    @Test
    void getName() {
    }

    @Test
    void getPower() {
    }

    @Test
    void wearEngine() {
        int tmp = engine.getPower();
        assertEquals(tmp, engine.wearEngine());
        assertEquals(tmp - 22, engine.wearEngine());
        assertEquals(tmp - 44, engine.wearEngine());
    }
}