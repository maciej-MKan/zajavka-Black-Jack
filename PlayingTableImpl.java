package zajavka.projects.black_jack;

public class PlayingTableImpl implements PlayingTable {
    @Override
    public void showTurnState(Player croupier, Player human) {
        System.out.println("Croupier have: " + croupier.showCards());
        System.out.println("Your cards: " + human.showCards());
        System.out.println();

    }

    @Override
    public void showSummary(Player croupier, Player human, Player checkWinner) {
        System.out.println("Croupier have: " + croupier.showCards());
        System.out.println("Your cards: " + human.showCards());
        System.out.println();
        System.out.println("The winner is : " + checkWinner);
    }
}