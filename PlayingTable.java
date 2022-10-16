package zajavka.projects.black_jack;

public interface PlayingTable {

    void showTurnState(Player croupier, Player human);

    void showSummary(Player croupier, Player human, Player checkWinner);
}
