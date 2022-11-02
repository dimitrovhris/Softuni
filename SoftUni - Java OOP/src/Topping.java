import java.util.List;

public class Topping {
    private String toppingType;
    private double weight;

    private static final List<String> toppingTypes = List.of("Meat", "Veggies", "Cheese", "Sauce");
    Topping(String toppingType, double weight){
        setToppingType(toppingType);
        setWeight(toppingType, weight);
    }
    private void setToppingType(String toppingType){
        if(!toppingTypes.contains(toppingType)){
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
        }
        this.toppingType = toppingType;
    }
    private void setWeight(String toppingType, double weight){
        if(weight < 1 || weight > 50){
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", toppingType));
        }
        this.weight = weight;
    }
    public double calculateCalories(){
        double toppingModifier = 1;
        switch(toppingType){
            case "Meat":
                toppingModifier = 1.2;
                break;
            case "Veggies":
                toppingModifier = 0.8;
                break;
            case "Cheese":
                toppingModifier = 1.1;
                break;
            case "Sauce":
                toppingModifier = 0.9;
                break;
        }
        return 2 * weight * toppingModifier;
    }
}
