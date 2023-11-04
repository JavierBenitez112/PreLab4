import Controller.CardProcess.*;
import Model.BasicObjects.*;
import Controller.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.util.ArrayList;
import Model.FileManagers.JsonManager;
import Controller.CardProcess.*;
public class App {

    public static void main(String[] args) throws Exception {
        ArrayList<Card> cards = new ArrayList<Card>();
        JsonManager jsonManager = new JsonManager();
        Path dir = Paths.get("src/Model/Db/CardsForSearching");
        try (Stream<Path> paths = Files.walk(dir)) {
            paths.filter(Files::isRegularFile)
                    .filter(p -> p.toString().endsWith(".json"))
                    .forEach(p -> {
                        cards.add(jsonManager.Load(p.toString()));
                    });
        }
        for (Card card : cards) {
            CardFiltering.Filtering(card);
        }
    }
}
