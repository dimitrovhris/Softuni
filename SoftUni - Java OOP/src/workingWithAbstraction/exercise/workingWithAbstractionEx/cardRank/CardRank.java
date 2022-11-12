package workingWithAbstraction.exercise.workingWithAbstractionEx.cardRank;

public enum CardRank {
    ACE(0, "ACE"),
    TWO(1, "TWO"),
    THREE(2, "THREE"),
    FOUR(3, "FOUR"),
    FIVE(4, "FIVE"),
    SIX(5, "SIX"),
    SEVEN(6, "SEVEN"),
    EIGHT(7, "EIGHT"),
    NINE(8, "NINE"),
    TEN(9, "TEN"),
    JACK(10, "JACK"),
    QUEEN(11, "QUEEN"),
    KING(12, "KING");

    private int value;
    private String name;

    CardRank(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
