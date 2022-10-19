package zajavka.projects.black_jack.service;

public interface CountService {
    void checkOverTwenty(Player human) throws Exception;

    Player checkWinner(Player croupier, Player human);

    int getPointsSum(Player player);
}
