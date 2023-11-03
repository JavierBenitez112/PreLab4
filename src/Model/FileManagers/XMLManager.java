package Model.FileManagers;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import Model.BasicObjects.Card;


public abstract class XMLManager implements IFile {
    @Override 
    public void Save(Card card, String HASH) { 
    File archivo = new File();
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
    Document document = documentBuilder.parse(archivo);
    NodeList Tarjeta = document.getElementsByTagName("empleado");
    }
}
