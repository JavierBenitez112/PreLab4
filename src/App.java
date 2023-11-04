import Controller.CardProcess.*;
import Model.BasicObjects.*;
import Controller.*;


public class App {
    public static void main(String[] args) throws Exception {
        Card visaCard = new Card("Pedro", 932, "42", 10, 20, "4234910293924242", 123, 32 / 32, 324);
        CardFiltering.Filtering(visaCard);

    }
}
