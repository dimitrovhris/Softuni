package polymorphism.lab;

public class Rectangle implements Shape{
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * height + 2 * width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }
}
