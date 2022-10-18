package zajavka.projects.black_jack;

public enum Figures {

    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    J(10),
    Q(10),
    K(10),
    AS(1),
    ;
    private final int value;

    Figures(int value) {
        this.value = value;
    }
}
