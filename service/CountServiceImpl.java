package zajavka.projects.black_jack.service;

import zajavka.projects.black_jack.model.Card;

import java.util.List;
import java.util.stream.Collectors;

public class CountServiceImpl implements CountService {
    private static int calculatePoints(Player player) {
        int points = 0;
        List<Card> cardList = player.showCards();

        List<Card> aces = cardList
                .stream()
                .filter(card -> String.valueOf(card).contains("AS"))
                .collect(Collectors.toList());

        if (aces.size() == cardList.size()){
            return 21;
        }

        List<Card> nonAces = cardList
                .stream()
                .filter(card -> !String.valueOf(card).contains("AS"))
                .collect(Collectors.toList());

        for (Card card : nonAces) {
            points += card.getValue();
        }
        for (int i = aces.size(); i > 0; i--) {
            points += (points + i - 1) < 11 ? 11 : 1;
        }
        return points;
    }

    private static int withMaxPointsProtector(int points) {
        return points < 22 ? points : 0;
    }

    @Override
    public void checkOverTwenty(Player player) throws Exception {
        int points = calculatePoints(player);
        String name = String.valueOf(player);

        if (points == 21) {
            throw new Exception("Black Jack! " + name + " won");
        }
        if (points > 21) {
            throw new Exception(name + " are over 21");
        }
    }

    @Override
    public Player checkWinner(Player croupier, Player human) {
        int humanPoints = withMaxPointsProtector(calculatePoints(human));
        int croupierPoints = withMaxPointsProtector(calculatePoints(croupier));

        return humanPoints >= croupierPoints ? human : croupier;
    }

    @Override
    public int getPointsSum(Player player) {
        return calculatePoints(player);
    }
}
