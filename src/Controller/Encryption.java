package Controller;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import Model.BasicObjects.*;
import javax.xml.datatype.DatatypeFactory;
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
            byte[] AllInfoByte = AllInfoString.getBytes("UTF-8");
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(AllInfoByte);
            String HashString = DatatypeFactory.newInstance().newDataType("xs:hexBinary").newInstance(hash).toString();
            return HashString;
            
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return AllInfoString;
    }
}
