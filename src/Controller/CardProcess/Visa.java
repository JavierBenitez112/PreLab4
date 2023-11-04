package Controller.CardProcess;

import java.security.NoSuchAlgorithmException;

import javax.xml.parsers.ParserConfigurationException;

import Controller.Encryption;
import Controller.ProcessManager;
import Model.BasicObjects.Card;
import Model.FileManagers.XMLManager;
import Controller.CardProcess.*;


public class Visa implements ProcessManager{
    
    @Override
    public void Processing(Card card) throws ParserConfigurationException, NoSuchAlgorithmException {
        XMLManager xml = new XMLManager();
        card.Monto = card.Monto + (card.Monto * 0.05) - (card.Monto * 0.12);
        xml.Save(card,Encryption.MD5(card));
    }
    
}