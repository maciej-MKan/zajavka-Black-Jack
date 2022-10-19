package zajavka.projects.black_jack;

public interface AskingService {
    boolean humanTakeNextCard();

    boolean croupierTakeNextCard(CroupierImpl croupier);
}
