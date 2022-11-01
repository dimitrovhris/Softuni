public class Box {
    private double length;
    private double width;
    private double height;

    Box(double length, double width, double height){
        setLength(length);
        setWidth(width);
        setHeight(height);
    }
    private void setLength(double length){
        checkIfNumberIsPositive(length, "Length");
        this.length = length;
    }
    private void setWidth(double width){
        if(width <= 0){
            checkIfNumberIsPositive(width, "Width");
        }
        this.width = width;
    }
    private void setHeight(double height){
        checkIfNumberIsPositive(height, "Height");
        this.height = height;
    }
    private void checkIfNumberIsPositive(double number, String pattern){
        if(number <= 0){
            throw new IllegalArgumentException(pattern + " cannot be zero or negative.");
        }
    }
    public double calculateSurfaceArea(){
        return (2 * length * width) + (2 * length * height) + (2 * width * height);
    }
    public double calculateLateralSurfaceArea(){
        return (2 * length * height) + (2 * width * height);
    }
    public double calculateVolume(){
        return length * width * height;
    }

}
