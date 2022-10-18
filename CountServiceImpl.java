package zajavka.projects.black_jack;

public class CountServiceImpl implements CountService {
    @Override
    public void checkOverTwenty(Player human) throws Exception {
        int points = 0;
        for (Card card: human.showCards()) {
            points += card.getValue();
            if (points == 20){
                throw new Exception("Black Jack! You won");
            }
            if (points > 21){
                throw new Exception("You are over 21");
            }
        }

    }

    @Override
    public Player checkWinner(Player croupier, Player human) {
        int humanPoints = 0;
        int croupierPoints = 0;
        for (Card card : human.showCards()) {
            humanPoints += card.getValue();
        }
        for (Card card : croupier.showCards()) {
            croupierPoints += card.getValue();
        }
        return humanPoints >= croupierPoints ? human : croupier;
    }
}
