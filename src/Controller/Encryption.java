package Controller;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import Model.BasicObjects.*;

public abstract class Encryption {

    public static String Emperador(int Numero) {
        String numeroDeTarjeta = Integer.toString(Numero).substring(0, 1);
        String numeroDeTarjetaEncriptado = "";
        for (int i = 0; i < numeroDeTarjeta.length(); i++) {
            numeroDeTarjetaEncriptado += numeroDeTarjeta.charAt(i) + 1;
        }
        return numeroDeTarjetaEncriptado;
    }

    public static String MD5(Card Tarjeta) throws NoSuchAlgorithmException {
        // TODO: Parsearlas cosas cuando se termine la clase Card
        String AllInfoString = "";
        try {
            /*
             * Agarra todo los datos de la tarjeta, luego deeso los tranforma en bytes (8
             * bits de info per char)
             * Luego se usa el algoritmo MD5 para encriptar los bytes (El cual Java ya tiene
             * LMAO)
             * Luego Parsea los bytes en un String Y listo :D
             * 
             */
            byte[] AllInfoByte = AllInfoString.getBytes("UTF-8");
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(AllInfoByte);
            String HashString = new String(hash, "UTF-8");
            return HashString;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return AllInfoString;
    }
}
