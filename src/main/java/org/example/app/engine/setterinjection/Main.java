package org.example.app.engine.setterinjection;

import org.example.app.engine.DieselEngine;
import org.example.app.engine.Engine;
import org.example.app.engine.PetrolEngine;

public class Main
{
    public static void main(String[] args) {
        Car car1=new Car();
        Engine engine1=new DieselEngine();
        car1.setEngine(engine1);

        Car car2=new Car();
        Engine engine2=new PetrolEngine();
        car2.setEngine(engine2);

        car1.drive();
        car2.drive();
    }
}
