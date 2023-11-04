package Controller;

import Model.BasicObjects.Card;
import Controller.CardProcess.*;

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
    public static void Filtering(Card Tarjeta){
        int value = Integer.parseInt(Tarjeta.NumeroDeTarjeta.substring(0, 1));
        switch (value) {
            case VISA:
                Visa visa = new Visa();
                try {
                    visa.Processing(Tarjeta);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case MASTERCARD:
                MasterCard MasterCard = new MasterCard();
                try {
                    MasterCard.Processing(Tarjeta);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case AMERICANEXPRESS:
                American AmericanExpress = new American();
                try {
                    AmericanExpress.Processing(Tarjeta);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            default:
                break;
        }


    }
}
