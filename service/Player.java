package zajavka.projects.black_jack.service;

import zajavka.projects.black_jack.model.Card;

import java.util.List;

public interface Player {

    void takeCard(Card card);

    List<Card> showCards();

}
