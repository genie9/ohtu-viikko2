package ohtu.kivipaperisakset;

public class PeliTehdas {
    public static KPSPelaajaVsPelaaja ihmispelaajat(){
        return new KPSPelaajaVsPelaaja();
    }
    
    public static KPSTekoaly tekoalypelaaja(){
        return new KPSTekoaly(new Tekoaly());
    }
    
    public static KPSParempiTekoaly perempialypelaaja() {
        return new KPSParempiTekoaly(new TekoalyParannettu(20));
    }
}
