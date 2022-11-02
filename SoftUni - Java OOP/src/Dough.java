import java.util.List;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    private static final List<String> flourTypes = List.of("White", "Wholegrain" , "Crispy", "Chewy", "Homemade");
    Dough(String flourType, String bakingTechnique, double weight){
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }
    private void setFlourType(String flourType){
        checkDoughType(flourType);
        this.flourType = flourType;
    }
    private void setBakingTechnique(String bakingTechnique){
        checkDoughType(bakingTechnique);
        this.bakingTechnique = bakingTechnique;
    }
    private void checkDoughType(String type){
        if(!flourTypes.contains(type)){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }
    private void setWeight(double weight){
        if(weight < 1 || weight > 200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }
    public double calculateCalories(){
        double flourTypeModifier = 0;
        double techniqueModifier = 0;
        switch (flourType){
            case "White":
                flourTypeModifier = 1.5;
                break;
            case "Wholegrain":
                break;
        }
        switch (bakingTechnique){
            case "Crispy":
                techniqueModifier = 0.9;
                break;
            case "Chewy":
                techniqueModifier = 1.1;
                break;
            case "Homemade":
                break;
        }
        return 2 * weight * flourTypeModifier * techniqueModifier;
    }
}
