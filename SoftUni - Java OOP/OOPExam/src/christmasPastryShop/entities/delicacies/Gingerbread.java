package christmasPastryShop.entities.delicacies;

public class Gingerbread extends BaseDelicacy{
    private static final double PORTION = 200;
    public Gingerbread(String name, double price) {
        super(name, PORTION, price);
    }
}
