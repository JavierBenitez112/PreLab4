package Testing;

import Model.BasicObjects.Card;
import Model.FileManagers.JsonManager;
import Model.FileManagers.CSVManager;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;

import javax.xml.parsers.ParserConfigurationException;

public class ModelTest {

    @Test
    public void testJsonManager() {
        // Crea una instancia de JsonManager
        JsonManager jsonManager = new JsonManager();

        // Crea una instancia de Card para probar
        Card cardToSave = new Card("Usuario1", 1, "PublicKey1", 100.0, 3, "123456789", 123, 1225, 456);

        // Nombre del archivo donde se guardará el objeto
        String filename = "card";

        String FilePath = "src/Model/DB/MasterCard/card.json";

        // Prueba la función Save
        jsonManager.Save(cardToSave, filename);

        // Prueba la función Load
        Card loadedCard = jsonManager.Load(FilePath);

        // Asegúrate de que el objeto cargado no sea nulo
        assertNotNull(loadedCard);

        // Comprueba que los atributos del objeto cargado sean iguales a los del objeto original
        assertEquals(cardToSave.Usuario, loadedCard.Usuario);
        assertEquals(cardToSave.ID, loadedCard.ID);
        assertEquals(cardToSave.PublicKey, loadedCard.PublicKey);
        assertEquals(cardToSave.Monto, loadedCard.Monto, 0.001);  // Utiliza delta para comparar valores double
        assertEquals(cardToSave.Cuotas, loadedCard.Cuotas);
        assertEquals(cardToSave.NumeroDeTarjeta, loadedCard.NumeroDeTarjeta);
        assertEquals(cardToSave.CodigoDeSeguridad, loadedCard.CodigoDeSeguridad);
        assertEquals(cardToSave.FechaDeVencimiento, loadedCard.FechaDeVencimiento);
        assertEquals(cardToSave.CodigoCVV, loadedCard.CodigoCVV);
    }

    @Test
    public void TestCsvManager() throws ParserConfigurationException{
        // Crea una instancia de CsvManager
        CSVManager csvManager = new CSVManager();

        // Crea una instancia de Card para probar
        Card cardToSave = new Card("Usuario1", 1, "PublicKey1", 100.0, 3, "123456789", 123, 1225, 456);

        // Nombre del archivo donde se guardará el objeto
        String filename = "card";

        String filePath = "src/Model/DB/American.csv";

        // Prueba la función Save
        csvManager.Save(cardToSave, "CartaDePrueba");

        File file = new File(filePath);
            if (file.exists()) {
                System.out.println("The file exists at: " + file.getAbsolutePath());
            } else {
                System.out.println("The file does not exist at: " + file.getAbsolutePath());
            }
            assertTrue("El archivo XML debería existir", file.exists());

    }
}
