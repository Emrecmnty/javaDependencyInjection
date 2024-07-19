package com.dockerSpring.Bılgısayar;

import com.dockerSpring.pizza.*;

public class Main {
    public static void main(String[] args) {
       Kasa kasa = new Kasa();
       Amd amd = new Amd();
       AmdRyzen amdRyzen = new AmdRyzen();
       Hdd hdd = new Hdd();
       Nvidia nvidia = new Nvidia();
       Ssd ssd = new Ssd();
       Intel intel = new Intel();
       kasa.setHafıza(ssd);
       kasa.SetEkrankartı(nvidia);
       kasa.setIslemcı(amd);

    }
}