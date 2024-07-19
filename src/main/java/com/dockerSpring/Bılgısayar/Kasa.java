package com.dockerSpring.Bılgısayar;

public class Kasa implements Bİlgisayar {
    private EkranKartı ekranKartı;
    private Hafıza hafıza;
    private Islemcı islemcı;

    public void SetEkrankartı (EkranKartı ekranKartı){

        this.ekranKartı=ekranKartı;
        ekranKartı.KartSec();
    }

    public void setHafıza(Hafıza hafıza) {

        this.hafıza = hafıza;
        hafıza.HafızaSec();
    }

    public void setIslemcı(Islemcı islemcı) {
        this.islemcı = islemcı;
        islemcı.IslemciSec();
    }

    @Override
    public Void BilgisayarıCalıstır() {
        System.out.println("Çalıştı");
        return null;
    }
}
