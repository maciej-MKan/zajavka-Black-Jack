package zajavka.projects.black_jack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Optional;

public class Deck {

    private final LinkedList<Card> cards = new LinkedList<>();

    private Deck() {
        Figures[] figures = Figures.values();
        for (Figures figure : figures) {
            Colors[] colors = Colors.values();
            for (Colors color : colors) {
                cards.add(new Card(color, figure));
            }
        }
    }

    @Override
    public String toString() {
        return "Deck{" + cards + '}';
    }

    public int getCountOfCards() {
        return cards.size();
    }

    public static Deck getShuffledDeck(){
        Deck deck = new Deck();
        Collections.shuffle(deck.cards);
        return deck;
    }

    public Optional<Card> getCard(){
        if (cards.size() > 0){

            return Optional.of(cards.remove());
        }
        return Optional.empty();
    }
}
