package zajavka.projects.black_jack;

public class Test {

    public static void main(String[] args) {
        Deck deck = Deck.getShuffledDeck();
        Player human = new HumanPlayerImpl();
        CroupierImpl croupier = new CroupierImpl(deck, human);

        croupier.playGame();
    }
}
