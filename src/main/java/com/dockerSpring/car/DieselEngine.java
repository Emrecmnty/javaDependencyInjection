package com.dockerSpring.car;

public class DieselEngine implements Engine{
    @Override
    public String start() {
        return "Diesel Engine started.";
    }
}
