package com.dockerSpring.car;

public class ElectricEngine implements Engine {

    @Override
    public String start() {
        return "Electric Engine started.";
    }
}
