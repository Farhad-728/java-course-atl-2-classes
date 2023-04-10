package az.atlacademy.lesson13;

public class ShapeApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Square square = new Square();
        call(rectangle);
        call(circle);
        call(square);
    }
    private static void call(Shape shape) {
        shape.print();
    }
}
