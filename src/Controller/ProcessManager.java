package Controller;

import Model.BasicObjects.*;

public abstract class ProcessManager {
    public static void Visa(Card Tarjeta){
        throw new UnsupportedOperationException("Falta Poner Visa Process"); 
    }
    public static void MasterCard(Card Tarjeta){
        throw new UnsupportedOperationException("Falta Poner MasterCard Process");
    }
    public static void AmericanExpress(Card Tarjeta){
        throw new UnsupportedOperationException("Falta Poner AmericanExpress Process");
    }

}
