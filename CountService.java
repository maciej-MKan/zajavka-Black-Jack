package zajavka.projects.black_jack;

public interface CountService {
    void checkOverTwenty(Player human) throws Exception;

    Player checkWinner(Player croupier, Player human);
}
