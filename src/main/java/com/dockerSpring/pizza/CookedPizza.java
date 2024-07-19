package com.dockerSpring.pizza;

public class CookedPizza implements Pizza{
    Souce souce;
    Hamur hamur;
    public CookedPizza(Souce souce,Hamur hamur){
this.hamur=hamur;
this.souce=souce;

    }
    @Override
    public void Pisir() {
        System.out.println("pizza pişirildi");
    }
}
