package Model.FileManagers;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import Model.BasicObjects.Card;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonManager implements IFile {

    @Override
    public void Save(Card card, String filename) {
        JSONObject jsonCard = new JSONObject();
        jsonCard.put("Usuario", card.Usuario);
        jsonCard.put("ID", card.ID);
        jsonCard.put("PublicKey", card.PublicKey);
        jsonCard.put("Monto", card.Monto);
        jsonCard.put("Cuotas", card.Cuotas);
        jsonCard.put("NumeroDeTarjeta", card.NumeroDeTarjeta);
        jsonCard.put("CodigoDeSeguridad", card.CodigoDeSeguridad);
        jsonCard.put("FechaDeVencimiento", card.FechaDeVencimiento);
        jsonCard.put("CodigoCVV", card.CodigoCVV);

        try (FileWriter fileWriter = new FileWriter(filename)) {
            fileWriter.write(jsonCard.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        JSONObject jsonCard = new JSONObject();
        jsonCard.put("Usuario", card.Usuario);
        jsonCard.put("ID", card.ID);
        jsonCard.put("PublicKey", card.PublicKey);
        jsonCard.put("Monto", card.Monto);
        jsonCard.put("Cuotas", card.Cuotas);
        jsonCard.put("NumeroDeTarjeta", card.NumeroDeTarjeta);
        jsonCard.put("CodigoDeSeguridad", card.CodigoDeSeguridad);
        jsonCard.put("FechaDeVencimiento", card.FechaDeVencimiento);
        jsonCard.put("CodigoCVV", card.CodigoCVV);

        try (FileWriter fileWriter = new FileWriter(filename)) {
            fileWriter.write(jsonCard.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Card Load(String filename) {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader(filename));
            JSONObject jsonObject = (JSONObject) obj;

            String Usuario = (String) jsonObject.get("Usuario");
            int ID = ((Long) jsonObject.get("ID")).intValue();
            String PublicKey = (String) jsonObject.get("PublicKey");
            double Monto = (Double) jsonObject.get("Monto");
            int Cuotas = ((Long) jsonObject.get("Cuotas")).intValue();
            int NumeroDeTarjeta = ((Long) jsonObject.get("NumeroDeTarjeta")).intValue();
            int CodigoDeSeguridad = ((Long) jsonObject.get("CodigoDeSeguridad")).intValue();
            int FechaDeVencimiento = ((Long) jsonObject.get("FechaDeVencimiento")).intValue();
            int CodigoCVV = ((Long) jsonObject.get("CodigoCVV")).intValue();

            return new Card(Usuario, ID, PublicKey, Monto, Cuotas, NumeroDeTarjeta, CodigoDeSeguridad, FechaDeVencimiento, CodigoCVV);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return null;
    }
}
