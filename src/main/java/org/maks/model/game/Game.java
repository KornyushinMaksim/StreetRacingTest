package org.maks.model.game;

import org.maks.model.car.Car;
import org.maks.model.parts.Parts;

public class Game {
    Parts wear;
    public String startGame(Car obj1, Car obj2){
        String str = "Winner car - ";
        if (obj1.allIndexCar() > obj2.allIndexCar()){
            str += obj1.toStringWinner();
        } else if (obj1.allIndexCar() == obj2.allIndexCar()){
            str = "НИЧЬЯ";
        }else {
            str += obj2.toStringWinner();
        }
//        float tmp = wear.getWear();
//        tmp += 0.1;
//        wear.setWear(tmp);
        return str;
    }
}
