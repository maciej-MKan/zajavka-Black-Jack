package zajavka.projects.black_jack;

public interface AskingService {
    boolean humanTakeNextCard(Player human);

    void croupierTakeNextCard(CroupierImpl croupier);
}
