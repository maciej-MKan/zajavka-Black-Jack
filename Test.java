package zajavka.projects.black_jack;

public class Test {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Player human = new HumanPlayerImpl();
        CroupierImpl croupierImpl = new CroupierImpl(deck, human);

        croupierImpl.playGame();
        System.out.println(croupierImpl.showCards());
        croupierImpl.setCard(croupierImpl.dealCard());
        System.out.println(croupierImpl.showCards());
    }
}
