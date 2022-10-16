package zajavka.projects.black_jack;

import java.util.Objects;

public class Card {

    public static Card revers = new Card(null, null);

    private boolean showFace = true;
    private final Colors color;
    private final Figures figure;

    public Card(Colors color, Figures figure) {
        this.color = color;
        this.figure = figure;
    }

    public Card withShowFace(){
        showFace = true;
        return this;
    }

    public Card withHideFace(){
        showFace = false;
        return this;
    }

    @Override
    public String toString() {

        if(showFace){
            return figure + " of " + color;
        }
        return "<card>";
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
