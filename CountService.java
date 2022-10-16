package zajavka.projects.black_jack;

public interface CountService {
    void checkOverTwenty(Player human);

    Player checkWinner(Player croupier, Player human);
}
