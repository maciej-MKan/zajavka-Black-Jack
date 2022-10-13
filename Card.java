package zajavka.projects.black_jack;

import java.util.Objects;

public class Card {

    private final Colors color;
    private final Figures figure;

    public Card(Colors color, Figures figure) {
        this.color = color;
        this.figure = figure;
    }

    @Override
    public String toString() {
        return figure + " of " + color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return color.equals(card.color) && figure.equals(card.figure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
