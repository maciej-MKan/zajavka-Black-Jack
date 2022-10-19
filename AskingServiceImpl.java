package zajavka.projects.black_jack;

import java.util.Scanner;

public class AskingServiceImpl implements AskingService {
    @Override
    public boolean humanTakeNextCard() {

        Scanner choice = new Scanner(System.in);
        System.out.println("Do you hit? (y/n) ");
        return switch (choice.nextLine().toLowerCase()) {
            case "y" -> true;
            case "n" -> false;
            default -> askAgain();
        };
    }

    private boolean askAgain() {
        System.out.println("Choice not match");
        System.out.println("Try again");
        return humanTakeNextCard();
    }

    @Override
    public boolean croupierTakeNextCard(CroupierImpl croupier) {
        return croupier.hitCardDecision();
    }
}
