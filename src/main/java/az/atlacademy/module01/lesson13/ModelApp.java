package az.atlacademy.module01.lesson13;

public class ModelApp {
    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        Opel opel = new Opel();
        go(bmw);
        go(opel);
    }
    private static void go(Car car) {
        car.start();
    }
}
