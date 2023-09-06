package org.maks;

import org.maks.model.car.Body;
import org.maks.model.car.Car;
import org.maks.model.game.Game;
import org.maks.model.parts.FabricaCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        FabricaCar fabricaCar = new FabricaCar();
        fabricaCar.toyota();
        Game game = new Game();
        System.out.println(game.startGame(fabricaCar.toyota(), car));

    }
}
