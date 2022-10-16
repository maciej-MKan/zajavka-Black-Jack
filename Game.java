package zajavka.projects.black_jack;

public class Game {

    private final CroupierImpl croupier;
    private final Player human;
    public Game(CroupierImpl croupier, Player human) {
        this.croupier = croupier;
        this.human = human;
        human.takeCard(croupier.dealCard());
        human.takeCard(croupier.dealCard());
        croupier.takeCard(croupier.dealCard());
        croupier.takeCard(croupier.dealCard());
    }

    private void playTurn(){

    }
}
