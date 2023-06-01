package az.atlacademy.module01.lesson20;

public class MyThreadApp {

    public static void main(String[] args) {
        MyThread thread = new MyThread();

        thread.run();
        thread.start();
    }
}

