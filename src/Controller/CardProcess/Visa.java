package Controller.CardProcess;

import javax.xml.parsers.ParserConfigurationException;

import Controller.ProcessManager;
import Model.BasicObjects.Card;
import Model.FileManagers.XMLManager;


public class Visa implements ProcessManager{
    
    @Override
    public void Processing(Card card) throws ParserConfigurationException {
        XMLManager xml = new XMLManager();
        card.Monto = card.Monto + (card.Monto * 0.05) - (card.Monto * 0.12);
        xml.Save(card, "Visa");
    }
    
}