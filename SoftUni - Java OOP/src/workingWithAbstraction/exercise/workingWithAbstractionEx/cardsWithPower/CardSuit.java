package workingWithAbstraction.exercise.workingWithAbstractionEx.cardsWithPower;

    public enum CardSuit {
        CLUBS(0, "CLUBS"),
        DIAMONDS(13, "DIAMONDS"),
        HEARTS(26, "HEARTS"),
        SPADES(39, "SPADES");

        private int value;
        private String name;

        CardSuit(int value, String name) {
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
