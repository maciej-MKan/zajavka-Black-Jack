package zajavka.projects.black_jack;

public class CountServiceImpl implements CountService {
    @Override
    public void checkOverTwenty(Player player) throws Exception {
        int points = calculatePoints(player);
        String name = String.valueOf(player);

        if (points == 21){
            throw new Exception("Black Jack! " + name + " won");
        }
        if (points > 21){
            throw new Exception(name + " are over 21");
        }
    }

    @Override
    public Player checkWinner(Player croupier, Player human) {
        int humanPoints = withMaxPointsProtector(calculatePoints(human));
        int croupierPoints = withMaxPointsProtector(calculatePoints(croupier));

        return humanPoints >= croupierPoints ? human : croupier;
    }

    private static int calculatePoints(Player player) {
        int points = 0;
        for (Card card : player.showCards()) {
            points += card.getValue();
        }
        return points;
    }

    private static int withMaxPointsProtector(int points){
        return points < 22 ? points : 0;
    }
    @Override
    public int getPointsSum(Player player){
        return calculatePoints(player);
    }
}
