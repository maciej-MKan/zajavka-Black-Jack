package zajavka.projects.black_jack.model;

import zajavka.projects.black_jack.model.data.Colors;
import zajavka.projects.black_jack.model.data.Figures;

import java.util.Objects;

public class Card {

    private boolean showFace = true;
    private final Colors color;
    private final Figures figure;

    private final int value;

    public Card(Colors color, Figures figure) {
        this.color = color;
        this.figure = figure;
        this.value = figure.getValue();
    }

    public Card withShowFace(){
        showFace = true;
        return this;
    }

    public Card withHideFace(){
        showFace = false;
        return this;
    }

    public int getValue() {
        return value;
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
