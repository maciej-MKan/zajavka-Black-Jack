package zajavka.projects.black_jack;

import zajavka.projects.projectCalculator.model.StorageCards;

import java.util.List;
import java.util.Optional;

public class CroupierImpl implements Player{

    private Deck deck;
    private final Player human;
    private Game game;
    private final StorageCards storedCards = new StorageCards();

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

    @Override
    public void takeCard(Card card){
        storedCards.addCard(card);
    }

    @Override
    public List<Card> showCards(){
        if (storedCards.countOfCards < 3){
            return storedCards.getCards(false);
        }
        return storedCards.getCards(true);
    }

    public void playGame(){
        game = new Game(this, human);
    }
}
