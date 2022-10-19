package zajavka.projects.black_jack.service;

import java.util.Scanner;

public class AskingServiceImpl implements AskingService {
    @Override
    public boolean humanTakeNextCard() {

        Scanner choice = new Scanner(System.in);
        System.out.println("Do you hit? (y/n) ");
        return switch (choice.nextLine().toLowerCase()) {
            case "y" -> true;
            case "n" -> false;
            default ->  askAgain();
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

    @Override
    public boolean playAgain() {
        Scanner choice = new Scanner(System.in);
        System.out.println();
        System.out.println("Do you wont play again? (y/n) ");
        return switch (choice.nextLine().toLowerCase()) {
            case "y" -> true;
            case "n" -> false;
            default ->  playAgain();
        };
    }
}
