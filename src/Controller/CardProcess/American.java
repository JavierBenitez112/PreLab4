package Controller.CardProcess;

import java.security.NoSuchAlgorithmException;

import javax.xml.parsers.ParserConfigurationException;

import Controller.ProcessManager;
import Model.BasicObjects.Card;
import Model.FileManagers.CSVManager;
import Controller.Encryption;
public class American implements ProcessManager {
   
    @Override
    public void Processing(Card card) throws ParserConfigurationException, NoSuchAlgorithmException {
        CSVManager csv = new CSVManager();
        card.Monto = card.Monto + (card.Monto * 0.07);
        if (card.Cuotas > 1) {
            card.Monto = card.Monto + (card.Monto * 0.15);
        }
        csv.Save(card, Encryption.MD5(card));
    }

}