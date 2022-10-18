package zajavka.projects.black_jack;

import java.util.List;

public interface Player {

    void takeCard(Card card);

    List<Card> showCards();

}
