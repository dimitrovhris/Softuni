package catHouse.entities.cat;

public class LonghairCat extends BaseCat{
    private static final int KILOGRAMS = 9;

    public LonghairCat(String name, String breed, double price) {
        super(name, breed, price);
        kilograms = KILOGRAMS;
    }

    @Override
    public void eating() {
        kilograms += 3;
    }
}
