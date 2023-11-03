package Controller;

import Model.BasicObjects.*;


public abstract class CardFiltering {
    /*
     * Variables para poder comparar primer numero de la tarjeta
     */
    final static int VISA = 4;
    final static int MASTERCARD = 5;
    final static int AMERICANEXPRESS = 3;



    /*
     * Metodo para filtrar el tipo de tarjeta
     * @param Tarjeta Tarjeta a filtrar
     * @return void
     */
    public void Filtering(Card Tarjeta){
        String numeroDeTarjeta = Integer.toString(Tarjeta.NumeroDeTarjeta);
        int value = Integer.parseInt(numeroDeTarjeta.substring(0, 1));
        switch (value) {
            case VISA:
                throw new UnsupportedOperationException("Falta Poner Visa Process");
            // break;
            case MASTERCARD:
                throw new UnsupportedOperationException("Falta Poner MasterCard Process");
            // break;
            case AMERICANEXPRESS:
                throw new UnsupportedOperationException("Falta Poner AmericanExpress Process");
            // break;
            default:
                break;
        }
    }
}
