package Testing;

import static org.junit.Assert.assertEquals;

import Controller.CardFiltering;
import Model.BasicObjects.Card;
import Controller.Encryption;
import org.junit.Test;
import java.io.FileReader;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class ControllerTest {

    @Test
    public void testFilteringVisa() throws NoSuchAlgorithmException {
        Card visaCard = new Card("Pedro", 932, "42", 10, 20, "4234910293924242", 123, 32 / 32, 324);
        CardFiltering.Filtering(visaCard);

        // // Check if theres an XML file with the hash of the card on the src/Model/DB folder

        // try (FileReader fileReader = new FileReader("src/Model/DB/" + Encryption.MD5(visaCard) + ".xml")) {
        //     // If the file exists, the test is successful
        //     assertEquals(true, true);
        // } catch (IOException e) {
        //     // If the file doesn't exist, the test fails
        //     assertEquals(true, false);
        // }


    }

    @Test
    public void testFilteringMasterCard() {
        // Create a MasterCard test case and test the filtering process
        Card masterCard = new Card("Pedro", 932, "42", 10, 20, "4234910293924242", 123, 32 / 32, 324);
        // Your test logic here
        CardFiltering.Filtering(masterCard);

        
    }

    @Test
    public void testFilteringAmerican() {
        // Create an American Express test case and test the filtering process
        Card americanCard = new Card("Pedro", 932, "42", 10, 20, "4234910293924242", 123, 32 / 32, 324);

        // Your test logic here
        CardFiltering.Filtering(americanCard);

    }

    @Test
    public void TestEncryption() throws NoSuchAlgorithmException {
        Card visaCard = new Card("Pedro", 932, "42", 10, 20, "4234910293924242", 123, 32 / 32, 324);
        assertEquals("45",Encryption.Emperador("34") );
        assertEquals("54",Encryption.MD5(visaCard));
    }
}
