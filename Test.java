package zajavka.projects.black_jack;

import zajavka.projects.black_jack.model.Deck;
import zajavka.projects.black_jack.service.CroupierImpl;
import zajavka.projects.black_jack.service.HumanPlayerImpl;
import zajavka.projects.black_jack.service.Player;

public class Test {

    public static void main(String[] args) {
        Deck deck = Deck.getShuffledDeck();
        Player human = new HumanPlayerImpl();
        CroupierImpl croupier = new CroupierImpl(deck, human);

        croupier.playGame();
    }
}
