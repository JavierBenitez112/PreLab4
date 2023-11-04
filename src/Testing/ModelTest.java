package Testing;

import Model.BasicObjects.Card;
import Model.FileManagers.JsonManager;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ModelTest {

    @Test
    public void testJsonManager() {
        // Crea una instancia de JsonManager
        JsonManager jsonManager = new JsonManager();

        // Crea una instancia de Card para probar
        Card cardToSave = new Card("Usuario1", 1, "PublicKey1", 100.0, 3, 123456789, 123, 1225, 456);

        // Nombre del archivo donde se guardará el objeto
        String filename = "card.json";

        // Prueba la función Save
        jsonManager.Save(cardToSave, filename);

        // Prueba la función Load
        Card loadedCard = jsonManager.Load(filename);

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
}
