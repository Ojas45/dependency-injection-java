package org.example.app.engine.FieldInjection;

import org.example.app.engine.Engine;

public class Car {
    Engine engine;
    public void drive(){
        engine.start();
        System.out.println("Car is ready to drive.....");
    }
}
