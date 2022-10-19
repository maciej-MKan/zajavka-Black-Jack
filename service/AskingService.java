package zajavka.projects.black_jack.service;

public interface AskingService {
    boolean humanTakeNextCard();

    boolean croupierTakeNextCard(CroupierImpl croupier);
}
