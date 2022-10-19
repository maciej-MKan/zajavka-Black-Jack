package zajavka.projects.black_jack;

import zajavka.projects.black_jack.model.Deck;
import zajavka.projects.black_jack.service.*;

public class Casino {
    public static final PlayingTable playingTable = new PlayingTableImpl();
    private static final AskingService askingService = new AskingServiceImpl();

    public static void main(String[] args) {
        Deck deck = Deck.getShuffledDeck();

        playingTable.showWelcome();
        do {
            Player human = new HumanPlayerImpl();
            CroupierImpl croupier = new CroupierImpl(deck, human);
            croupier.playGame();
        } while (askingService.playAgain());
    }
}
