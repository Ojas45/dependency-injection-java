package org.example.app.engine.FieldInjection;

import org.example.app.engine.DieselEngine;
import org.example.app.engine.Engine;

public class Main {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.engine=new DieselEngine();
        car1.drive();
    }
}
