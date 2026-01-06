package org.example.app.engine.constructorinjection;

import org.example.app.engine.Engine;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive(){
        engine.start();
        System.out.println("Car is ready to drive....");
    }
}
