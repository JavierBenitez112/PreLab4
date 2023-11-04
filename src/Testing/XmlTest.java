package Testing;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import Model.FileManagers.XMLManager;
import Model.BasicObjects.Card;

public class XmlTest {
    private XMLManager xmlManager;
    private Card testCard;

    @Before
    public void setUp() {
        xmlManager = new XMLManager();
        testCard = new Card("UsuarioPrueba", 123, "PublicKeyPrueba", 100.0, 3, "1234567890123456", 12/25, 123, 0);
    }

    @Test
    public void testSave() {
        String filePath = "src/Model/DB/"; 

        try {
            xmlManager.Save(testCard, "HASHPrueba");

           
            File file = new File(filePath);
            if (file.exists()) {
                System.out.println("The file exists at: " + file.getAbsolutePath());
            } else {
                System.out.println("The file does not exist at: " + file.getAbsolutePath());
            }
            assertTrue("El archivo XML debería existir", file.exists());
        } catch (ParserConfigurationException e) {
            fail("Se produjo una excepción: " + e.getMessage());
        }
    }
}


