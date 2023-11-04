package Controller.CardProcess;

import Controller.ProcessManager;
import Model.BasicObjects.Card;

public class American implements ProcessManager {
   
    @Override
    public void Processing(Card card) {
        System.out.println("American");
    }

}