package workingWithAbstraction.hotelReservation;

public enum Season {
    SPRING("Spring", 2),
    SUMMER("Summer", 4),
    WINTER("Winter", 3),
    AUTUMN("Autumn", 1);
    private String name;
    private int coefficient;

    Season(String name, int coefficient){
        this.name = name;
        this.coefficient = coefficient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }
}
