package Controller;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import Model.BasicObjects.*;
import java.util.Base64;
/**
 * Clase para encriptar diferentes datos de la tarjeta
 */
public abstract class Encryption {

    public static String Emperador(String numeroDeTarjeta) {
        String numeroDeTarjetaEncriptado = ""; 
        for (char c : numeroDeTarjeta.toCharArray()) {
            numeroDeTarjetaEncriptado += (char) (c + 1);
        }
        System.out.println(numeroDeTarjetaEncriptado);
        return numeroDeTarjetaEncriptado;
    }

    public static String MD5(Card Tarjeta) throws NoSuchAlgorithmException {
        String AllInfoString = Tarjeta.toString();
        try {
            /*
             * Agarra todo los datos de la tarjeta, luego deeso los tranforma en bytes (8
             * bits de info per char)
             * Luego se usa el algoritmo MD5 para encriptar los bytes (El cual Java ya tiene
             * LMAO)
             * Luego Parsea los bytes en un String Y listo :D
             * 
             */
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hashBytes = md.digest(AllInfoString.getBytes("UTF-8"));
            String base64Hash = Base64.getEncoder().encodeToString(hashBytes);
            for (char c : base64Hash.toCharArray()) {
                if (c == '/' || c == '+' || c == '=' || c == '\\')
                    base64Hash = base64Hash.replace(c, '0');
            }
            return base64Hash;
            
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return AllInfoString;
    }
}
