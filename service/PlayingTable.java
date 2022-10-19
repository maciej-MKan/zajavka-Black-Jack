package zajavka.projects.black_jack.service;

public interface PlayingTable {

    void showTurnState(Player croupier, Player human);
    void showTurnState(Player player);
    void showSummary(Player croupier, Player human, Player checkWinner);
    void showException(Exception e);
}
