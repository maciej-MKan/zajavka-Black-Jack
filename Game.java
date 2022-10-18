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
        croupier.takeCard(croupier.dealCard().withHideFace());
        croupier.takeCard(croupier.dealCard());
        playGame();
    }

    private void playGame(){

        playingTable.showTurnState(croupier, human);
        try {
            while(askingService.humanTakeNextCard(human)){
                human.takeCard(croupier.dealCard());
                playingTable.showTurnState(human);
                countService.checkOverTwenty(human);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        croupier.showSelfCards();
        askingService.croupierTakeNextCard(croupier);
        playingTable.showSummary(croupier, human, countService.checkWinner(croupier, human));

    }
}
