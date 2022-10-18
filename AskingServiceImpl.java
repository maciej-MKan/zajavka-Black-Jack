package zajavka.projects.black_jack;

import java.util.Scanner;

public class AskingServiceImpl implements AskingService {
    @Override
    public boolean humanTakeNextCard(Player human) {

        Scanner choice = new Scanner(System.in);
        System.out.println("Do you hit? (y/n) ");
        return switch (choice.nextLine().toLowerCase()) {
            case "y" -> true;
            case "n" -> false;
            default -> askAgain(human);
        };
    }

    private boolean askAgain(Player human) {
        System.out.println("Choice not match");
        System.out.println("Try again");
        return humanTakeNextCard(human);
    }

    @Override
    public void croupierTakeNextCard(CroupierImpl croupier) {

    }
}
