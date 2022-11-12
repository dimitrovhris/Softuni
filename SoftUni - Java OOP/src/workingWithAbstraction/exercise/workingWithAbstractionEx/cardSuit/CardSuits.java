package workingWithAbstraction.exercise.workingWithAbstractionEx.cardSuit;

public enum CardSuits {
    CLUBS(0, "CLUBS"),
    DIAMONDS(1, "DIAMONDS"),
    HEARTS(2, "HEARTS"),
    SPADES(3, "SPADES");
    ;
    private int value;
    private String name;

    CardSuits(int value, String name) {
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
