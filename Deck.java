package zajavka.projects.black_jack;

import java.util.LinkedList;
import java.util.Optional;

public class Deck {

    private final LinkedList<Card> cards = new LinkedList<>();

    public Deck() {
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

    public Optional<Card> dealCard(){
        if (cards.size() > 0){

            return Optional.of(cards.remove());
        }
        return Optional.empty();
    }
}
