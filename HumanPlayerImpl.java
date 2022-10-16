package zajavka.projects.black_jack;

import zajavka.projects.projectCalculator.model.StorageCards;

import java.util.List;

public class HumanPlayerImpl implements Player {

    private final StorageCards storedCards = new StorageCards();

    @Override
    public void takeCard(Card card) {
        storedCards.addCard(card);
    }

    @Override
    public List<Card> showCards() {
        return storedCards.getCards(true);
    }
}
