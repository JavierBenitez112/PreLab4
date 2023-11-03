package Controller;

import java.security.NoSuchAlgorithmException;

import javax.xml.parsers.ParserConfigurationException;

import Model.BasicObjects.*;

public interface ProcessManager {
    public default void Processing(Card card) throws ParserConfigurationException, NoSuchAlgorithmException {
        System.out.println("Save");
    }
}
