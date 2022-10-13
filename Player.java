package zajavka.projects.black_jack;

import java.util.LinkedList;
import java.util.List;

public abstract class Player {

    protected final List<Card> storedCards;

    protected Player(Deck deck) {
        this.storedCards = playFirstTurn(deck);
    }

    private List<Card> playFirstTurn(Deck deck) {
        List<Card> tmp = new LinkedList<>();

        for (int i = 0; i < 2; i++) {
            tmp.add(deck.dealCard().get());
        }
        return tmp;
    }

    protected void drawCard(Deck deck) {

        storedCards.add(deck.dealCard().get());
    }

    public abstract void playTurn();

    public abstract List<Card> showCards(Boolean finalTurn);

}
