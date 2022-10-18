package zajavka.projects.black_jack;

import java.util.List;
import java.util.Optional;

public class CroupierImpl extends PlayerUtility{

    private Deck deck;
    private final Player human;
    private Game game;

    public CroupierImpl(Deck deck, Player human) {
        this.deck = deck;
        this.human = human;
    }

    public Card dealCard(){
        Optional<Card> card = deck.getCard();
        if (card.isPresent()){
            return card.get();
        }
        deck = new Deck();
        return dealCard();
    }

    public void playGame(){
        game = new Game(this, human);
    }

    @Override
    public String toString() {
        return "Croupier";
    }

    public void showSelfCards() {
        storedCards.showAllFaces();
    }
}
