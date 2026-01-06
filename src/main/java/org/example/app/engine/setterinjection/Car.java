package org.example.app.engine.setterinjection;

import org.example.app.engine.DieselEngine;
import org.example.app.engine.Engine;

public class Car {
    private Engine engine;



    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive(){
        engine.start();
        System.out.println("Car is ready to drive....");
        
    }
    
}
