package zajavka.projects.black_jack;

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
