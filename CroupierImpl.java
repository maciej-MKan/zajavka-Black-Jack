package zajavka.projects.black_jack;

import java.util.Optional;

public class CroupierImpl extends PlayerUtility {

    private final Game game;
    private Deck deck;

    public CroupierImpl(Deck deck, Player human) {
        this.deck = deck;
        this.game = new Game(this, human);
    }

    public Card dealCard() {
        Optional<Card> card = deck.getCard();
        if (card.isPresent()) {
            return card.get();
        }
        deck = Deck.getShuffledDeck();
        return dealCard();
    }

    @Override
    public String toString() {
        return "Croupier";
    }

    public void playGame() {
        game.startGame();
    }

    public void showSelfCards() {
        storedCards.showAllFaces();
    }

    public boolean hitCardDecision(){
       return new CountServiceImpl().getPointsSum(this) < 17;
    }
}
