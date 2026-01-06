package org.example.app.engine.constructorinjection;

import org.example.app.engine.DieselEngine;
import org.example.app.engine.HybridEngine;
import org.example.app.engine.PetrolEngine;

public class Main {
    public static void main(String[] args) {
        Car car1= new Car(new PetrolEngine());
        car1.drive();

        Car car2=new Car(new DieselEngine());
        car2.drive();

        Car car3=new Car(new HybridEngine());
        car3.drive();
    }
}
