package zajavka.projects.black_jack.model.data;

public enum Colors {
    DIAMONDS('♦'),
    CLUBS('♣'),
    SPADES('♠'),
    HEARTS('♥'),
    ;
    private final char symbol;
    Colors(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return String.valueOf(this.symbol);
    }
}
