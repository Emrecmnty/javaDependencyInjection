package com.dockerSpring.pizza;

public class Main {
    public static void main(String[] args) {
        Souce souce = new TomatoSouce();
        Hamur hamur = new İnceHamur();

        CookedPizza cookedPizza = new CookedPizza(souce,hamur);
    }
}