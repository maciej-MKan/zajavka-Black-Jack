package zajavka.projects.black_jack.model;

import java.util.ArrayList;
import java.util.List;

public class StorageCards {
    private final List<Card> storage = new ArrayList<>();
    public Integer countOfCards;

    public void addCard(Card card) {
        storage.add(card);
        countOfCards = storage.size();
    }

    public List<Card> getCards() {

        return List.copyOf(storage);
    }

    public void showAllFaces() {
        storage.forEach(Card::withShowFace);
    }
}
