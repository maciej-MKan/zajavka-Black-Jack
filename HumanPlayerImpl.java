package zajavka.projects.black_jack;

import java.util.List;

public class HumanPlayerImpl extends Player {

    public HumanPlayerImpl(Deck deck) {
        super(deck);
    }

    @Override
    public void playTurn() {

    }

    @Override
    public List<Card> showCards(Boolean finalTurn) {
        return storedCards;
    }

}
