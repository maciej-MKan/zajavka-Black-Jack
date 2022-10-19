package zajavka.projects.black_jack;

public class Game {

    private final CroupierImpl croupier;
    private final Player human;
    private final PlayingTable playingTable = new PlayingTableImpl();
    private final CountService countService = new CountServiceImpl();
    private final AskingService askingService = new AskingServiceImpl();

    public Game(CroupierImpl croupier, Player human) {
        this.croupier = croupier;
        this.human = human;
    }

    public void startGame() {
        human.takeCard(croupier.dealCard());
        human.takeCard(croupier.dealCard());
        croupier.takeCard(croupier.dealCard().withHideFace());
        croupier.takeCard(croupier.dealCard());
        playGame();
    }

    private void playGame() {

        playingTable.showTurnState(croupier, human);
        croupier.showSelfCards();
        try {
            while (askingService.humanTakeNextCard()) {
                human.takeCard(croupier.dealCard());
                playingTable.showTurnState(human);
                countService.checkOverTwenty(human);
            }
            while (askingService.croupierTakeNextCard(croupier)) {
                croupier.takeCard(croupier.dealCard());
                countService.checkOverTwenty(croupier);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println();
        }
        playingTable.showSummary(croupier, human, countService.checkWinner(croupier, human));

    }
}
