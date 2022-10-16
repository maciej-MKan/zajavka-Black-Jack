package zajavka.projects.black_jack;

import zajavka.projects.projectCalculator.model.StorageCards;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public interface Player {

    void takeCard(Card card);

    List<Card> showCards();

}
