package Model.FileManagers;

import Model.BasicObjects.Card;

public interface IFile {
    public void Save(Card card, String HASH);   

}