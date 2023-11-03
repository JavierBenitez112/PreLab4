package Model.FileManagers;

import javax.xml.parsers.ParserConfigurationException;

import Model.BasicObjects.Card;

public interface IFile {
    public void Save(Card card, String HASH) throws ParserConfigurationException;
}