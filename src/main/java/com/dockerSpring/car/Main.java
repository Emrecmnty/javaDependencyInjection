package com.dockerSpring.car;

public class Main {
    public static void main(String[] args) {

        Engine engine = new ElectricEngine();
        Car car = new AutoCar(engine);
        car.drive();
    }
}

