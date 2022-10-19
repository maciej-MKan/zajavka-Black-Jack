package zajavka.projects.black_jack.service;

import zajavka.projects.black_jack.model.Card;
import zajavka.projects.black_jack.model.StorageCards;

import java.util.List;

public abstract class PlayerUtility implements Player {

    protected final StorageCards storedCards = new StorageCards();
    @Override
    public List<Card> showCards() {
        return storedCards.getCards();
    }

    @Override
    public void takeCard(Card card){
        storedCards.addCard(card);
    }
}
