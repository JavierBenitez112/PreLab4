package Model.FileManagers;
import java.io.FileWriter;
import java.io.IOException;


import javax.xml.parsers.ParserConfigurationException;

import Model.BasicObjects.Card;

public class CSVManager implements IFile {
    @Override
    public void Save(Card card, String HASH) throws  ParserConfigurationException {
        String filePath = "Aqui pones la ruta peter no me la se perdon XDDD";

        try (FileWriter writer = new FileWriter(filePath)) {
    
            writer.append("usuario,id,public_key,monto,cuotas,número_de_tarjeta,fecha_de_vencimiento,código_CVV\n");

            writer.append(card.Usuario).append(",");
            writer.append(String.valueOf(card.ID)).append(",");
            writer.append(card.PublicKey).append(",");
            writer.append(String.valueOf(card.Monto)).append(",");
            writer.append(String.valueOf(card.Cuotas)).append(",");
            writer.append(String.valueOf(card.NumeroDeTarjeta)).append(",");
            writer.append(String.valueOf(card.FechaDeVencimiento)).append(",");
            writer.append(String.valueOf(card.CodigoCVV)).append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
