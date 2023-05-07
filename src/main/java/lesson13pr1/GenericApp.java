package lesson13pr1;

public class GenericApp {
    public static void main(String[] args) {
        Box<Integer> resultBox = generateRand();
        System.out.println(resultBox);
    }

    public static Box<Integer> generateRand() {
        int num = (int) (Math.random() * 101);
        boolean isEven = num % 2 == 0;
        return new Box<>(isEven, num);
    }
}
