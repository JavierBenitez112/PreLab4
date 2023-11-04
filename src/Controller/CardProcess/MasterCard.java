package Controller.CardProcess;

import Controller.ProcessManager;
import Model.BasicObjects.Card;
import Model.FileManagers.JsonManager;

import java.security.NoSuchAlgorithmException;

import Controller.Encryption;

public class MasterCard implements ProcessManager{
    
    @Override
    public void Processing(Card card) throws NoSuchAlgorithmException {
        JsonManager json = new JsonManager();
        card.NumeroDeTarjeta = Encryption.Emperador(card.NumeroDeTarjeta);
        json.Save(card, Encryption.MD5(card));
    }
    
}