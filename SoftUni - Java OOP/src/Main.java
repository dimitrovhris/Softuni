public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5.00, 4.00);
        Shape circle = new Circle(3.00);
        printShape(rect);
        printShape(circle);
    }
    private static void printShape(Shape shape){
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());
    }
}
