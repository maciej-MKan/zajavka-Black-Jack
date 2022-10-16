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
        human.takeCard(croupier.dealCard());
        human.takeCard(croupier.dealCard());
        croupier.takeCard(croupier.dealCard());
        croupier.takeCard(croupier.dealCard());
        playGame();
    }

    private void playGame(){

        playingTable.showTurnState(croupier, human);
        countService.checkOverTwenty(human);
        if (askingService.humanTakeNextCard(human)){
            playGame();
        }
        askingService.croupierTakeNextCard(croupier);
        playingTable.showSummary(croupier, human, countService.checkWinner(croupier, human));

    }
}
