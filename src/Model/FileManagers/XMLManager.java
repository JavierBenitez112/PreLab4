package Model.FileManagers;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.dom.DOMSource;
import java.io.File;
import Model.BasicObjects.Card;

public class XMLManager implements IFile {
    @Override
    public void Save(Card card, String HASH) throws ParserConfigurationException {
        
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
        Document document = documentBuilder.newDocument();

    
        Element comercioElement = document.createElement("comercio");
        document.appendChild(comercioElement);

    
        createXmlElement(document, comercioElement, "usuario", card.Usuario);
        createXmlElement(document, comercioElement, "id", String.valueOf(card.ID));
        createXmlElement(document, comercioElement, "public_key", card.PublicKey);
        createXmlElement(document, comercioElement, "monto", String.valueOf(card.Monto));


        
        createXmlElement(document, comercioElement, "cuotas", String.valueOf(card.Cuotas));
        

        createXmlElement(document, comercioElement, "número_de_tarjeta", String.valueOf(card.NumeroDeTarjeta));
        createXmlElement(document, comercioElement, "fecha_de_vencimiento", String.valueOf(card.FechaDeVencimiento));
        createXmlElement(document, comercioElement, "código_CVV", String.valueOf(card.CodigoCVV));


        try {
            // Create a file XML
            saveXmlToFile(document, "src/DB/" + HASH + ".xml");
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }

    private void createXmlElement(Document document, Element parentElement, String tagName, String textContent) {
        Element element = document.createElement(tagName);
        Text text = document.createTextNode(textContent);
        element.appendChild(text);
        parentElement.appendChild(element);
    }

    private void saveXmlToFile(Document document, String filePath) throws Exception {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(document);
        String absolutePath = new File(filePath).getAbsolutePath();
        StreamResult result = new StreamResult(new File(absolutePath));
        transformer.transform(source, result);
    }
}
